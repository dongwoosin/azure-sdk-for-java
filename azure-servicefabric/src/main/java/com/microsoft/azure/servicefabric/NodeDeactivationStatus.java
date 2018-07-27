/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for NodeDeactivationStatus.
 */
public final class NodeDeactivationStatus extends ExpandableStringEnum<NodeDeactivationStatus> {
    /** Static value None for NodeDeactivationStatus. */
    public static final NodeDeactivationStatus NONE = fromString("None");

    /** Static value SafetyCheckInProgress for NodeDeactivationStatus. */
    public static final NodeDeactivationStatus SAFETY_CHECK_IN_PROGRESS = fromString("SafetyCheckInProgress");

    /** Static value SafetyCheckComplete for NodeDeactivationStatus. */
    public static final NodeDeactivationStatus SAFETY_CHECK_COMPLETE = fromString("SafetyCheckComplete");

    /** Static value Completed for NodeDeactivationStatus. */
    public static final NodeDeactivationStatus COMPLETED = fromString("Completed");

    /**
     * Creates or finds a NodeDeactivationStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding NodeDeactivationStatus
     */
    @JsonCreator
    public static NodeDeactivationStatus fromString(String name) {
        return fromString(name, NodeDeactivationStatus.class);
    }

    /**
     * @return known NodeDeactivationStatus values
     */
    public static Collection<NodeDeactivationStatus> values() {
        return values(NodeDeactivationStatus.class);
    }
}