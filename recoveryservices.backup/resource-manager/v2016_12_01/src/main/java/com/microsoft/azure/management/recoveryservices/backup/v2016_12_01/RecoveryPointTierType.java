/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_12_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for RecoveryPointTierType.
 */
public enum RecoveryPointTierType {
    /** Enum value Invalid. */
    INVALID("Invalid"),

    /** Enum value InstantRP. */
    INSTANT_RP("InstantRP"),

    /** Enum value HardenedRP. */
    HARDENED_RP("HardenedRP");

    /** The actual serialized value for a RecoveryPointTierType instance. */
    private String value;

    RecoveryPointTierType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a RecoveryPointTierType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed RecoveryPointTierType object, or null if unable to parse.
     */
    @JsonCreator
    public static RecoveryPointTierType fromString(String value) {
        RecoveryPointTierType[] items = RecoveryPointTierType.values();
        for (RecoveryPointTierType item : items) {
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