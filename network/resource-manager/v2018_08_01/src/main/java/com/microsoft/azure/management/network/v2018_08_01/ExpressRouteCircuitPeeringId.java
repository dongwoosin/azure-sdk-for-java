/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ExpressRoute circuit peering identifier.
 */
public class ExpressRouteCircuitPeeringId {
    /**
     * The ID of the ExpressRoute circuit peering.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the ID of the ExpressRoute circuit peering.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the ID of the ExpressRoute circuit peering.
     *
     * @param id the id value to set
     * @return the ExpressRouteCircuitPeeringId object itself.
     */
    public ExpressRouteCircuitPeeringId withId(String id) {
        this.id = id;
        return this;
    }

}
