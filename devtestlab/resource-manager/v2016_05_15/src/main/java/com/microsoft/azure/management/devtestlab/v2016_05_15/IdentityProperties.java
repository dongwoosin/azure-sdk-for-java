/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2016_05_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of a managed identity.
 */
public class IdentityProperties {
    /**
     * Managed identity.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * The principal id of resource identity.
     */
    @JsonProperty(value = "principalId")
    private String principalId;

    /**
     * The tenant identifier of resource.
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /**
     * The client secret URL of the identity.
     */
    @JsonProperty(value = "clientSecretUrl")
    private String clientSecretUrl;

    /**
     * Get managed identity.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set managed identity.
     *
     * @param type the type value to set
     * @return the IdentityProperties object itself.
     */
    public IdentityProperties withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the principal id of resource identity.
     *
     * @return the principalId value
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Set the principal id of resource identity.
     *
     * @param principalId the principalId value to set
     * @return the IdentityProperties object itself.
     */
    public IdentityProperties withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * Get the tenant identifier of resource.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenant identifier of resource.
     *
     * @param tenantId the tenantId value to set
     * @return the IdentityProperties object itself.
     */
    public IdentityProperties withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the client secret URL of the identity.
     *
     * @return the clientSecretUrl value
     */
    public String clientSecretUrl() {
        return this.clientSecretUrl;
    }

    /**
     * Set the client secret URL of the identity.
     *
     * @param clientSecretUrl the clientSecretUrl value to set
     * @return the IdentityProperties object itself.
     */
    public IdentityProperties withClientSecretUrl(String clientSecretUrl) {
        this.clientSecretUrl = clientSecretUrl;
        return this;
    }

}