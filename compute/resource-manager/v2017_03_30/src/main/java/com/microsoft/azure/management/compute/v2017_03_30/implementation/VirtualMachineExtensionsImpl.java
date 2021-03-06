/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.compute.v2017_03_30.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.compute.v2017_03_30.VirtualMachineExtensions;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.compute.v2017_03_30.VirtualMachineExtension;

class VirtualMachineExtensionsImpl extends WrapperImpl<VirtualMachineExtensionsInner> implements VirtualMachineExtensions {
    private final ComputeManager manager;

    VirtualMachineExtensionsImpl(ComputeManager manager) {
        super(manager.inner().virtualMachineExtensions());
        this.manager = manager;
    }

    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public VirtualMachineExtensionImpl define(String name) {
        return wrapModel(name);
    }

    private VirtualMachineExtensionImpl wrapModel(VirtualMachineExtensionInner inner) {
        return  new VirtualMachineExtensionImpl(inner, manager());
    }

    private VirtualMachineExtensionImpl wrapModel(String name) {
        return new VirtualMachineExtensionImpl(name, this.manager());
    }

    @Override
    public Observable<VirtualMachineExtension> getAsync(String resourceGroupName, String vmName, String vmExtensionName) {
        VirtualMachineExtensionsInner client = this.inner();
        return client.getAsync(resourceGroupName, vmName, vmExtensionName)
        .map(new Func1<VirtualMachineExtensionInner, VirtualMachineExtension>() {
            @Override
            public VirtualMachineExtension call(VirtualMachineExtensionInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String vmName, String vmExtensionName) {
        VirtualMachineExtensionsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, vmName, vmExtensionName).toCompletable();
    }

}
