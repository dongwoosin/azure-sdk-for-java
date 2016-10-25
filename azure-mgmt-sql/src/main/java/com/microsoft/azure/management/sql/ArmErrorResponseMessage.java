/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * represents and error message.
 */
public class ArmErrorResponseMessage {
    /**
     * Contains the information about the error.
     */
    @JsonProperty(required = true)
    private ArmErrorResponseExtendedErrorInfo error;

    /**
     * Get the error value.
     *
     * @return the error value
     */
    public ArmErrorResponseExtendedErrorInfo error() {
        return this.error;
    }

    /**
     * Set the error value.
     *
     * @param error the error value to set
     * @return the ArmErrorResponseMessage object itself.
     */
    public ArmErrorResponseMessage withError(ArmErrorResponseExtendedErrorInfo error) {
        this.error = error;
        return this;
    }

}