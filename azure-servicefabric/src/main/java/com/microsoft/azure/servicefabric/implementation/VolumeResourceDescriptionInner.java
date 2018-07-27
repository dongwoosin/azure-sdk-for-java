/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric.implementation;

import com.microsoft.azure.servicefabric.VolumeProviderParametersAzureFile;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Describes a service fabric volume resource.
 */
@JsonFlatten
public class VolumeResourceDescriptionInner {
    /**
     * User readable description of the volume.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Provider of the volume.
     */
    @JsonProperty(value = "properties.provider", required = true)
    private String provider;

    /**
     * This type describes a volume provided by an Azure Files file share.
     */
    @JsonProperty(value = "properties.azureFileParameters")
    private VolumeProviderParametersAzureFile azureFileParameters;

    /**
     * Volume resource name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Creates an instance of VolumeResourceDescriptionInner class.
     * @param name volume resource name.
     */
    public VolumeResourceDescriptionInner() {
        provider = "SFAzureFile";
    }

    /**
     * Get user readable description of the volume.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set user readable description of the volume.
     *
     * @param description the description value to set
     * @return the VolumeResourceDescriptionInner object itself.
     */
    public VolumeResourceDescriptionInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get provider of the volume.
     *
     * @return the provider value
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set provider of the volume.
     *
     * @param provider the provider value to set
     * @return the VolumeResourceDescriptionInner object itself.
     */
    public VolumeResourceDescriptionInner withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get this type describes a volume provided by an Azure Files file share.
     *
     * @return the azureFileParameters value
     */
    public VolumeProviderParametersAzureFile azureFileParameters() {
        return this.azureFileParameters;
    }

    /**
     * Set this type describes a volume provided by an Azure Files file share.
     *
     * @param azureFileParameters the azureFileParameters value to set
     * @return the VolumeResourceDescriptionInner object itself.
     */
    public VolumeResourceDescriptionInner withAzureFileParameters(VolumeProviderParametersAzureFile azureFileParameters) {
        this.azureFileParameters = azureFileParameters;
        return this;
    }

    /**
     * Get volume resource name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set volume resource name.
     *
     * @param name the name value to set
     * @return the VolumeResourceDescriptionInner object itself.
     */
    public VolumeResourceDescriptionInner withName(String name) {
        this.name = name;
        return this;
    }

}