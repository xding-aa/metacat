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

package com.facebook.presto.spi;

import java.util.Map;

/**
 * Created by amajumdar on 2/2/15.
 */
public class ConnectorPartitionDetailImpl implements ConnectorPartitionDetail{
    private final String partitionId;
    private final TupleDomain<ColumnHandle> tupleDomain;
    private final StorageInfo storageInfo;
    private Map<String, String> metadata;
    private final AuditInfo auditInfo;

    public ConnectorPartitionDetailImpl(String partitionId,
            TupleDomain<ColumnHandle> tupleDomain, Map<String, String> metadata) {
        this(partitionId, tupleDomain, null, metadata, null);
    }

    public ConnectorPartitionDetailImpl(String partitionId,
            TupleDomain<ColumnHandle> tupleDomain, StorageInfo storageInfo, Map<String, String> metadata) {
        this(partitionId, tupleDomain, storageInfo, metadata, null);
    }

    public ConnectorPartitionDetailImpl(String partitionId,
            TupleDomain<ColumnHandle> tupleDomain, StorageInfo storageInfo, Map<String, String> metadata, AuditInfo auditInfo) {
        this.partitionId = partitionId;
        this.tupleDomain = tupleDomain;
        this.storageInfo = storageInfo;
        this.metadata = metadata;
        this.auditInfo = auditInfo!=null?auditInfo:new AuditInfo();
    }

    @Override
    public Map<String, String> getMetadata() {
        return metadata;
    }

    @Override
    public StorageInfo getStorageInfo() {
        return storageInfo;
    }

    @Override
    public String getPartitionId() {
        return partitionId;
    }

    @Override
    public TupleDomain<ColumnHandle> getTupleDomain() {
        return tupleDomain;
    }

    @Override
    public AuditInfo getAuditInfo() {
        return auditInfo;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }
}
