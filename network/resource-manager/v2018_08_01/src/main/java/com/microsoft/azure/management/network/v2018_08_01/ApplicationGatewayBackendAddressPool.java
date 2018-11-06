/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_08_01;

import java.util.List;
import com.microsoft.azure.management.network.v2018_08_01.implementation.NetworkInterfaceIPConfigurationInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * Backend Address Pool of an application gateway.
 */
@JsonFlatten
public class ApplicationGatewayBackendAddressPool extends SubResource {
    /**
     * Collection of references to IPs defined in network interfaces.
     */
    @JsonProperty(value = "properties.backendIPConfigurations")
    private List<NetworkInterfaceIPConfigurationInner> backendIPConfigurations;

    /**
     * Backend addresses.
     */
    @JsonProperty(value = "properties.backendAddresses")
    private List<ApplicationGatewayBackendAddress> backendAddresses;

    /**
     * Provisioning state of the backend address pool resource. Possible values
     * are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Name of the backend address pool that is unique within an Application
     * Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Type of the resource.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get collection of references to IPs defined in network interfaces.
     *
     * @return the backendIPConfigurations value
     */
    public List<NetworkInterfaceIPConfigurationInner> backendIPConfigurations() {
        return this.backendIPConfigurations;
    }

    /**
     * Set collection of references to IPs defined in network interfaces.
     *
     * @param backendIPConfigurations the backendIPConfigurations value to set
     * @return the ApplicationGatewayBackendAddressPool object itself.
     */
    public ApplicationGatewayBackendAddressPool withBackendIPConfigurations(List<NetworkInterfaceIPConfigurationInner> backendIPConfigurations) {
        this.backendIPConfigurations = backendIPConfigurations;
        return this;
    }

    /**
     * Get backend addresses.
     *
     * @return the backendAddresses value
     */
    public List<ApplicationGatewayBackendAddress> backendAddresses() {
        return this.backendAddresses;
    }

    /**
     * Set backend addresses.
     *
     * @param backendAddresses the backendAddresses value to set
     * @return the ApplicationGatewayBackendAddressPool object itself.
     */
    public ApplicationGatewayBackendAddressPool withBackendAddresses(List<ApplicationGatewayBackendAddress> backendAddresses) {
        this.backendAddresses = backendAddresses;
        return this;
    }

    /**
     * Get provisioning state of the backend address pool resource. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set provisioning state of the backend address pool resource. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the ApplicationGatewayBackendAddressPool object itself.
     */
    public ApplicationGatewayBackendAddressPool withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get name of the backend address pool that is unique within an Application Gateway.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the backend address pool that is unique within an Application Gateway.
     *
     * @param name the name value to set
     * @return the ApplicationGatewayBackendAddressPool object itself.
     */
    public ApplicationGatewayBackendAddressPool withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set a unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set
     * @return the ApplicationGatewayBackendAddressPool object itself.
     */
    public ApplicationGatewayBackendAddressPool withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get type of the resource.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set type of the resource.
     *
     * @param type the type value to set
     * @return the ApplicationGatewayBackendAddressPool object itself.
     */
    public ApplicationGatewayBackendAddressPool withType(String type) {
        this.type = type;
        return this;
    }

}
