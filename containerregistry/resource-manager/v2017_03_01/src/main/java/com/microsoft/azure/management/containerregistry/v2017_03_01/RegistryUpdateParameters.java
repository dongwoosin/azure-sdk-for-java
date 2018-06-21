/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2017_03_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The parameters for updating a container registry.
 */
@JsonFlatten
public class RegistryUpdateParameters {
    /**
     * The tags for the container registry.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * The value that indicates whether the admin user is enabled.
     */
    @JsonProperty(value = "properties.adminUserEnabled")
    private Boolean adminUserEnabled;

    /**
     * The parameters of a storage account for the container registry. If
     * specified, the storage account must be in the same physical location as
     * the container registry.
     */
    @JsonProperty(value = "properties.storageAccount")
    private StorageAccountParameters storageAccount;

    /**
     * Get the tags for the container registry.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags for the container registry.
     *
     * @param tags the tags value to set
     * @return the RegistryUpdateParameters object itself.
     */
    public RegistryUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the value that indicates whether the admin user is enabled.
     *
     * @return the adminUserEnabled value
     */
    public Boolean adminUserEnabled() {
        return this.adminUserEnabled;
    }

    /**
     * Set the value that indicates whether the admin user is enabled.
     *
     * @param adminUserEnabled the adminUserEnabled value to set
     * @return the RegistryUpdateParameters object itself.
     */
    public RegistryUpdateParameters withAdminUserEnabled(Boolean adminUserEnabled) {
        this.adminUserEnabled = adminUserEnabled;
        return this;
    }

    /**
     * Get the parameters of a storage account for the container registry. If specified, the storage account must be in the same physical location as the container registry.
     *
     * @return the storageAccount value
     */
    public StorageAccountParameters storageAccount() {
        return this.storageAccount;
    }

    /**
     * Set the parameters of a storage account for the container registry. If specified, the storage account must be in the same physical location as the container registry.
     *
     * @param storageAccount the storageAccount value to set
     * @return the RegistryUpdateParameters object itself.
     */
    public RegistryUpdateParameters withStorageAccount(StorageAccountParameters storageAccount) {
        this.storageAccount = storageAccount;
        return this;
    }

}
