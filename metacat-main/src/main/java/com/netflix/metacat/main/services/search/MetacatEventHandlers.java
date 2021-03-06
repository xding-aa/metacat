/*
 * Copyright 2016 Netflix, Inc.
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *        http://www.apache.org/licenses/LICENSE-2.0
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.netflix.metacat.main.services.search;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.eventbus.Subscribe;
import com.netflix.metacat.common.MetacatContext;
import com.netflix.metacat.common.dto.DatabaseDto;
import com.netflix.metacat.common.dto.PartitionDto;
import com.netflix.metacat.common.dto.TableDto;
import com.netflix.metacat.common.json.MetacatJsonLocator;
import com.netflix.metacat.common.server.events.MetacatCreateDatabasePostEvent;
import com.netflix.metacat.common.server.events.MetacatCreateMViewPostEvent;
import com.netflix.metacat.common.server.events.MetacatCreateTablePostEvent;
import com.netflix.metacat.common.server.events.MetacatDeleteDatabasePostEvent;
import com.netflix.metacat.common.server.events.MetacatDeleteMViewPartitionPostEvent;
import com.netflix.metacat.common.server.events.MetacatDeleteMViewPostEvent;
import com.netflix.metacat.common.server.events.MetacatDeleteTablePartitionPostEvent;
import com.netflix.metacat.common.server.events.MetacatDeleteTablePostEvent;
import com.netflix.metacat.common.server.events.MetacatRenameTablePostEvent;
import com.netflix.metacat.common.server.events.MetacatSaveMViewPartitionPostEvent;
import com.netflix.metacat.common.server.events.MetacatSaveTablePartitionPostEvent;
import com.netflix.metacat.common.server.events.MetacatUpdateMViewPostEvent;
import com.netflix.metacat.common.server.events.MetacatUpdateTablePostEvent;
import com.netflix.metacat.main.services.TableService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.netflix.metacat.main.services.search.ElasticSearchDoc.Type.database;
import static com.netflix.metacat.main.services.search.ElasticSearchDoc.Type.mview;
import static com.netflix.metacat.main.services.search.ElasticSearchDoc.Type.partition;
import static com.netflix.metacat.main.services.search.ElasticSearchDoc.Type.table;

public class MetacatEventHandlers {
    private static final Logger log = LoggerFactory.getLogger(MetacatEventHandlers.class);
    private final ElasticSearchUtil es;
    private final TableService tableService;

    @Inject
    public MetacatEventHandlers(ElasticSearchUtil es, TableService tableService) {
        this.es = es;
        this.tableService = tableService;
    }

    @Subscribe
    public void metacatCreateDatabasePostEventHandler(MetacatCreateDatabasePostEvent event) {
        DatabaseDto dto = event.getDto();
        ElasticSearchDoc doc = new ElasticSearchDoc(dto.getName().toString(),dto,  event.getMetacatContext().getUserName(), false);
        es.save(database.name(),doc.getId(), doc.toJsonString());
    }

    @Subscribe
    public void metacatCreateMViewPostEventHandler(MetacatCreateMViewPostEvent event) {
        TableDto dto = event.getDto();
        ElasticSearchDoc doc = new ElasticSearchDoc(dto.getName().toString(),dto,  event.getMetacatContext().getUserName(), false);
        es.save(mview.name(), doc.getId(), doc.toJsonString());
    }

    @Subscribe
    public void metacatCreateTablePostEventHandler(MetacatCreateTablePostEvent event) {
        TableDto dto = event.getDto();
        ElasticSearchDoc doc = new ElasticSearchDoc(dto.getName().toString(),dto,  event.getMetacatContext().getUserName(), false);
        es.save(table.name(), doc.getId(), doc.toJsonString());
    }

    @Subscribe
    public void metacatDeleteDatabasePostEventHandler(MetacatDeleteDatabasePostEvent event) {
        DatabaseDto dto = event.getDto();
        es.softDelete(database.name(), dto.getName().toString(), event.getMetacatContext());
    }

    @Subscribe
    public void metacatDeleteMViewPostEventHandler(MetacatDeleteMViewPostEvent event) {
        TableDto dto = event.getDto();
        es.softDelete(mview.name(), dto.getName().toString(), event.getMetacatContext());
    }

    @Subscribe
    public void metacatDeleteTablePostEventHandler(MetacatDeleteTablePostEvent event) {
        TableDto dto = event.getDto();
        es.softDelete(table.name(), dto.getName().toString(), event.getMetacatContext());
    }

    @Subscribe
    public void metacatDeleteMViewPartitionPostEventHandler(MetacatDeleteMViewPartitionPostEvent event) {
        List<String> partitionIds = event.getPartitionIds();
        List<String> esPartitionIds = partitionIds.stream()
                .map(partitionId -> event.getName().toString() + "/" + partitionId).collect(Collectors.toList());
        es.softDelete(partition.name(), esPartitionIds, event.getMetacatContext());
    }

    @Subscribe
    public void metacatDeleteTablePartitionPostEventHandler(MetacatDeleteTablePartitionPostEvent event) {
        List<String> partitionIds = event.getPartitionIds();
        List<String> esPartitionIds = partitionIds.stream()
                .map(partitionId -> event.getName().toString() + "/" + partitionId).collect(Collectors.toList());
        es.softDelete(partition.name(), esPartitionIds, event.getMetacatContext());
    }


    @Subscribe
    public void metacatRenameTablePostEventHandler(MetacatRenameTablePostEvent event) {
        es.delete(table.name(), event.getName().toString());

        TableDto dto = event.getDto();
        ElasticSearchDoc doc = new ElasticSearchDoc(dto.getName().toString(),dto,  event.getMetacatContext().getUserName(), false);
        es.save(table.name(), doc.getId(), doc.toJsonString());
    }

    @Subscribe
    public void metacatUpdateMViewPostEventHandler(MetacatUpdateMViewPostEvent event) {
        TableDto dto = event.getDto();
        ElasticSearchDoc doc = new ElasticSearchDoc(dto.getName().toString(),dto,  event.getMetacatContext().getUserName(), false);
        es.save(mview.name(), doc.getId(), doc.toJsonString());
    }

    @Subscribe
    public void metacatUpdateTablePostEventHandler(MetacatUpdateTablePostEvent event) {
        TableDto dto = event.getDto();
        if( dto == null){
            Optional<TableDto> oDto = tableService.get(event.getName(), true);
            if( oDto.isPresent()){
                dto = oDto.get();
                event.setDto(dto);
            }
        }
        if( dto != null) {
            ElasticSearchDoc doc = new ElasticSearchDoc(dto.getName().toString(),dto,  event.getMetacatContext().getUserName(), false);
            es.save(table.name(), doc.getId(), doc.toJsonString());
            updateEntitiesWIthSameUri(table.name(), dto, event.getMetacatContext());
        }
    }

    private void updateEntitiesWIthSameUri(String metadata_type, TableDto dto, MetacatContext metacatContext) {
        List<String> ids = es.getTableIdsByUri(metadata_type, dto.getDataUri());
        ObjectNode node =  MetacatJsonLocator.INSTANCE.emptyObjectNode();
        node.put("dataMetadata", dto.getDataMetadata());
        es.updates(table.name(), ids, metacatContext, node);
    }

    @Subscribe
    public void metacatSaveMViewPartitionPostEventHandler(MetacatSaveMViewPartitionPostEvent event) {
        List<PartitionDto> partitionDtos = event.getPartitions();
        MetacatContext context = event.getMetacatContext();
        List<ElasticSearchDoc> docs = partitionDtos.stream()
                .map(dto -> new ElasticSearchDoc( dto.getName().toString(), dto, context.getUserName(), false))
                .collect(Collectors.toList());
        es.save(partition.name(), docs);
    }

    @Subscribe
    public void metacatSaveTablePartitionPostEventHandler(MetacatSaveTablePartitionPostEvent event) {
        List<PartitionDto> partitionDtos = event.getPartitions();
        MetacatContext context = event.getMetacatContext();
        List<ElasticSearchDoc> docs = partitionDtos.stream()
                .map( dto -> new ElasticSearchDoc( dto.getName().toString(), dto, context.getUserName(), false))
                .collect(Collectors.toList());
        es.save(partition.name(), docs);
    }
}
