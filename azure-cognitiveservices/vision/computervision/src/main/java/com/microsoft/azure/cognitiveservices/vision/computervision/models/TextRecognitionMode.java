/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.computervision.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for TextRecognitionMode.
 */
public enum TextRecognitionMode {
    /** Enum value Handwritten. */
    HANDWRITTEN("Handwritten"),

    /** Enum value Printed. */
    PRINTED("Printed");

    /** The actual serialized value for a TextRecognitionMode instance. */
    private String value;

    TextRecognitionMode(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a TextRecognitionMode instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed TextRecognitionMode object, or null if unable to parse.
     */
    @JsonCreator
    public static TextRecognitionMode fromString(String value) {
        TextRecognitionMode[] items = TextRecognitionMode.values();
        for (TextRecognitionMode item : items) {
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
