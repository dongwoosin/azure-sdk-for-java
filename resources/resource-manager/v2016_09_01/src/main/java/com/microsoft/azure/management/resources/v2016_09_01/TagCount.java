/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2016_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Tag count.
 */
public class TagCount {
    /**
     * Type of count.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Value of count.
     */
    @JsonProperty(value = "value")
    private Integer value;

    /**
     * Get type of count.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set type of count.
     *
     * @param type the type value to set
     * @return the TagCount object itself.
     */
    public TagCount withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get value of count.
     *
     * @return the value value
     */
    public Integer value() {
        return this.value;
    }

    /**
     * Set value of count.
     *
     * @param value the value value to set
     * @return the TagCount object itself.
     */
    public TagCount withValue(Integer value) {
        this.value = value;
        return this;
    }

}
