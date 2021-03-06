/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ApplicationGatewayRedirectType.
 */
public final class ApplicationGatewayRedirectType {
    /** Static value Permanent for ApplicationGatewayRedirectType. */
    public static final ApplicationGatewayRedirectType PERMANENT = new ApplicationGatewayRedirectType("Permanent");

    /** Static value Found for ApplicationGatewayRedirectType. */
    public static final ApplicationGatewayRedirectType FOUND = new ApplicationGatewayRedirectType("Found");

    /** Static value SeeOther for ApplicationGatewayRedirectType. */
    public static final ApplicationGatewayRedirectType SEE_OTHER = new ApplicationGatewayRedirectType("SeeOther");

    /** Static value Temporary for ApplicationGatewayRedirectType. */
    public static final ApplicationGatewayRedirectType TEMPORARY = new ApplicationGatewayRedirectType("Temporary");

    private String value;

    /**
     * Creates a custom value for ApplicationGatewayRedirectType.
     * @param value the custom value
     */
    public ApplicationGatewayRedirectType(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ApplicationGatewayRedirectType)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ApplicationGatewayRedirectType rhs = (ApplicationGatewayRedirectType) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}
