/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_07_01.implementation;

import com.microsoft.azure.management.network.v2018_07_01.ServiceEndpointPolicyDefinition;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.List;

class ServiceEndpointPolicyDefinitionImpl extends CreatableUpdatableImpl<ServiceEndpointPolicyDefinition, ServiceEndpointPolicyDefinitionInner, ServiceEndpointPolicyDefinitionImpl> implements ServiceEndpointPolicyDefinition, ServiceEndpointPolicyDefinition.Definition, ServiceEndpointPolicyDefinition.Update {
    private final NetworkManager manager;
    private String resourceGroupName;
    private String serviceEndpointPolicyName;
    private String serviceEndpointPolicyDefinitionName;

    ServiceEndpointPolicyDefinitionImpl(String name, NetworkManager manager) {
        super(name, new ServiceEndpointPolicyDefinitionInner());
        this.manager = manager;
        // Set resource name
        this.serviceEndpointPolicyDefinitionName = name;
        //
    }

    ServiceEndpointPolicyDefinitionImpl(ServiceEndpointPolicyDefinitionInner inner, NetworkManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.serviceEndpointPolicyDefinitionName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serviceEndpointPolicyName = IdParsingUtils.getValueFromIdByName(inner.id(), "serviceEndpointPolicies");
        this.serviceEndpointPolicyDefinitionName = IdParsingUtils.getValueFromIdByName(inner.id(), "serviceEndpointPolicyDefinitions");
        //
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ServiceEndpointPolicyDefinition> createResourceAsync() {
        ServiceEndpointPolicyDefinitionsInner client = this.manager().inner().serviceEndpointPolicyDefinitions();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serviceEndpointPolicyName, this.serviceEndpointPolicyDefinitionName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ServiceEndpointPolicyDefinition> updateResourceAsync() {
        ServiceEndpointPolicyDefinitionsInner client = this.manager().inner().serviceEndpointPolicyDefinitions();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serviceEndpointPolicyName, this.serviceEndpointPolicyDefinitionName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ServiceEndpointPolicyDefinitionInner> getInnerAsync() {
        ServiceEndpointPolicyDefinitionsInner client = this.manager().inner().serviceEndpointPolicyDefinitions();
        return client.getAsync(this.resourceGroupName, this.serviceEndpointPolicyName, this.serviceEndpointPolicyDefinitionName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String service() {
        return this.inner().service();
    }

    @Override
    public List<String> serviceResources() {
        return this.inner().serviceResources();
    }

    @Override
    public ServiceEndpointPolicyDefinitionImpl withExistingServiceEndpointPolicy(String resourceGroupName, String serviceEndpointPolicyName) {
        this.resourceGroupName = resourceGroupName;
        this.serviceEndpointPolicyName = serviceEndpointPolicyName;
        return this;
    }

    @Override
    public ServiceEndpointPolicyDefinitionImpl withDescription(String description) {
        this.inner().withDescription(description);
        return this;
    }

    @Override
    public ServiceEndpointPolicyDefinitionImpl withEtag(String etag) {
        this.inner().withEtag(etag);
        return this;
    }

    @Override
    public ServiceEndpointPolicyDefinitionImpl withId(String id) {
        this.inner().withId(id);
        return this;
    }

    @Override
    public ServiceEndpointPolicyDefinitionImpl withName(String name) {
        this.inner().withName(name);
        return this;
    }

    @Override
    public ServiceEndpointPolicyDefinitionImpl withProvisioningState(String provisioningState) {
        this.inner().withProvisioningState(provisioningState);
        return this;
    }

    @Override
    public ServiceEndpointPolicyDefinitionImpl withService(String service) {
        this.inner().withService(service);
        return this;
    }

    @Override
    public ServiceEndpointPolicyDefinitionImpl withServiceResources(List<String> serviceResources) {
        this.inner().withServiceResources(serviceResources);
        return this;
    }

}
