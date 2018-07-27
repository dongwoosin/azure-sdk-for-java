/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The task representing the deactivation operation on the node.
 */
public class NodeDeactivationTask {
    /**
     * Identity of the task related to deactivation operation on the node.
     */
    @JsonProperty(value = "NodeDeactivationTaskId")
    private NodeDeactivationTaskId nodeDeactivationTaskId;

    /**
     * The intent or the reason for deactivating the node. Following are the
     * possible values for it. Possible values include: 'Invalid', 'Pause',
     * 'Restart', 'RemoveData', 'RemoveNode'.
     */
    @JsonProperty(value = "NodeDeactivationIntent")
    private NodeDeactivationIntent nodeDeactivationIntent;

    /**
     * Get identity of the task related to deactivation operation on the node.
     *
     * @return the nodeDeactivationTaskId value
     */
    public NodeDeactivationTaskId nodeDeactivationTaskId() {
        return this.nodeDeactivationTaskId;
    }

    /**
     * Set identity of the task related to deactivation operation on the node.
     *
     * @param nodeDeactivationTaskId the nodeDeactivationTaskId value to set
     * @return the NodeDeactivationTask object itself.
     */
    public NodeDeactivationTask withNodeDeactivationTaskId(NodeDeactivationTaskId nodeDeactivationTaskId) {
        this.nodeDeactivationTaskId = nodeDeactivationTaskId;
        return this;
    }

    /**
     * Get the intent or the reason for deactivating the node. Following are the possible values for it. Possible values include: 'Invalid', 'Pause', 'Restart', 'RemoveData', 'RemoveNode'.
     *
     * @return the nodeDeactivationIntent value
     */
    public NodeDeactivationIntent nodeDeactivationIntent() {
        return this.nodeDeactivationIntent;
    }

    /**
     * Set the intent or the reason for deactivating the node. Following are the possible values for it. Possible values include: 'Invalid', 'Pause', 'Restart', 'RemoveData', 'RemoveNode'.
     *
     * @param nodeDeactivationIntent the nodeDeactivationIntent value to set
     * @return the NodeDeactivationTask object itself.
     */
    public NodeDeactivationTask withNodeDeactivationIntent(NodeDeactivationIntent nodeDeactivationIntent) {
        this.nodeDeactivationIntent = nodeDeactivationIntent;
        return this;
    }

}