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

package com.netflix.metacat.s3.connector.dao;

/**
 * Created by amajumdar on 10/10/15.
 */

import com.facebook.presto.spi.Pageable;
import com.facebook.presto.spi.Sort;
import com.netflix.metacat.s3.connector.model.Partition;

import java.util.List;

/**
 * Created by amajumdar on 1/2/15.
 */
public interface PartitionDao extends BaseDao<Partition> {
    List<Partition> getPartitions( Long tableId, List<String> partitionIds, Iterable<String> partitionParts, String dateCreatedSqlCriteria, Sort sort, Pageable pageable);

    /**
     * Deletes the partitions for the given table and list of partition ids
     * @param sourceName catalog/source name
     * @param databaseName schema/database name
     * @param tableName table name
     * @param partitionIds list of partition ids
     */
    void deleteByNames(String sourceName, String databaseName, String tableName, List<String> partitionIds);

    /**
     * Returns the number of partitions for the given table.
     * @param sourceName catalog/source name
     * @param databaseName schema/database name
     * @param tableName table name
     * @return number of partitions
     */
    Integer count(String sourceName, String databaseName, String tableName);

    /**
     * Returns the list of partitions with the given uri.
     * @param uri uri path
     * @param prefixSearch true, if the given uri is partial
     * @return list of partitions
     */
    List<Partition> getByUri(String uri, boolean prefixSearch);
}
