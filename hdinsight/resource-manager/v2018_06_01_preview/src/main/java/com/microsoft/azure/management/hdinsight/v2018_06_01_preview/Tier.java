/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2018_06_01_preview;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for Tier.
 */
public enum Tier {
    /** Enum value Standard. */
    STANDARD("Standard"),

    /** Enum value Premium. */
    PREMIUM("Premium");

    /** The actual serialized value for a Tier instance. */
    private String value;

    Tier(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a Tier instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed Tier object, or null if unable to parse.
     */
    @JsonCreator
    public static Tier fromString(String value) {
        Tier[] items = Tier.values();
        for (Tier item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
