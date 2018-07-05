/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.trafficmanager.v2017_05_01.implementation;

import com.microsoft.azure.management.trafficmanager.v2017_05_01.Region;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Class representing the Geographic hierarchy used with the Geographic traffic
 * routing method.
 */
@JsonFlatten
public class TrafficManagerGeographicHierarchyInner extends ProxyResource {
    /**
     * The region at the root of the hierarchy from all the regions in the
     * hierarchy can be retrieved.
     */
    @JsonProperty(value = "properties.geographicHierarchy")
    private Region geographicHierarchy;

    /**
     * Get the region at the root of the hierarchy from all the regions in the hierarchy can be retrieved.
     *
     * @return the geographicHierarchy value
     */
    public Region geographicHierarchy() {
        return this.geographicHierarchy;
    }

    /**
     * Set the region at the root of the hierarchy from all the regions in the hierarchy can be retrieved.
     *
     * @param geographicHierarchy the geographicHierarchy value to set
     * @return the TrafficManagerGeographicHierarchyInner object itself.
     */
    public TrafficManagerGeographicHierarchyInner withGeographicHierarchy(Region geographicHierarchy) {
        this.geographicHierarchy = geographicHierarchy;
        return this;
    }

}
