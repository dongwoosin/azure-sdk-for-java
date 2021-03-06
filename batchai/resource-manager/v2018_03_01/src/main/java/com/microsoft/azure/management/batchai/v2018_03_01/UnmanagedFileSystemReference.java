/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2018_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details of the file system to mount on the compute cluster nodes.
 */
public class UnmanagedFileSystemReference {
    /**
     * Command used to mount the unmanaged file system.
     */
    @JsonProperty(value = "mountCommand", required = true)
    private String mountCommand;

    /**
     * Specifies the relative path on the compute cluster node where the file
     * system will be mounted.
     * Note that all cluster level unmanaged file system will be mounted under
     * $AZ_BATCHAI_MOUNT_ROOT location and job level unmanaged file system will
     * be mounted under $AZ_BATCHAI_JOB_MOUNT_ROOT.
     */
    @JsonProperty(value = "relativeMountPath", required = true)
    private String relativeMountPath;

    /**
     * Get the mountCommand value.
     *
     * @return the mountCommand value
     */
    public String mountCommand() {
        return this.mountCommand;
    }

    /**
     * Set the mountCommand value.
     *
     * @param mountCommand the mountCommand value to set
     * @return the UnmanagedFileSystemReference object itself.
     */
    public UnmanagedFileSystemReference withMountCommand(String mountCommand) {
        this.mountCommand = mountCommand;
        return this;
    }

    /**
     * Get the relativeMountPath value.
     *
     * @return the relativeMountPath value
     */
    public String relativeMountPath() {
        return this.relativeMountPath;
    }

    /**
     * Set the relativeMountPath value.
     *
     * @param relativeMountPath the relativeMountPath value to set
     * @return the UnmanagedFileSystemReference object itself.
     */
    public UnmanagedFileSystemReference withRelativeMountPath(String relativeMountPath) {
        this.relativeMountPath = relativeMountPath;
        return this;
    }

}
