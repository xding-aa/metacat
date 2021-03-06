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

package com.netflix.metacat.common.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.wordnik.swagger.annotations.ApiModelProperty;

import javax.annotation.Nonnull;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by amajumdar on 5/28/15.
 */
public class DataMetadataDto extends BaseDto implements HasDataMetadata{
    private static final long serialVersionUID = -874750260731085106L;
    private String uri;
    // Marked as transient because we serialize it manually, however as a JsonProperty because Jackson does serialize it
    @ApiModelProperty(value = "metadata")
    @JsonProperty
    private transient ObjectNode dataMetadata;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public ObjectNode getDataMetadata() {
        return dataMetadata;
    }

    public void setDataMetadata(ObjectNode dataMetadata) {
        this.dataMetadata = dataMetadata;
    }

    /**
     * @return The uri that points to the location of the external data
     * @throws IllegalStateException if this instance does not have external data
     */
    @Nonnull
    @Override
    @JsonIgnore
    public String getDataUri() {
        return uri;
    }

    /**
     * @return true if this particular instance points to external data
     */
    @Override
    public boolean isDataExternal() {
        return false;
    }

    @SuppressWarnings("EmptyMethod")
    public void setDataExternal(boolean ignored) {
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        dataMetadata = deserializeObjectNode(in);
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        serializeObjectNode(out, dataMetadata);
    }
}
