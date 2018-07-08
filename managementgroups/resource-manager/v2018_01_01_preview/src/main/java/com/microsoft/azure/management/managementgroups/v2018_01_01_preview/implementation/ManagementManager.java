/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managementgroups.v2018_01_01_preview.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.managementgroups.v2018_01_01_preview.ManagementGroups;
import com.microsoft.azure.management.managementgroups.v2018_01_01_preview.ManagementGroupSubscriptions;
import com.microsoft.azure.management.managementgroups.v2018_01_01_preview.Operations;
import com.microsoft.azure.management.managementgroups.v2018_01_01_preview.Entities;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure Management resource management.
 */
public final class ManagementManager extends ManagerCore<ManagementManager, ManagementGroupsAPIImpl> {
    private ManagementGroups managementGroups;
    private ManagementGroupSubscriptions managementGroupSubscriptions;
    private Operations operations;
    private Entities entities;
    /**
    * Get a Configurable instance that can be used to create ManagementManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new ManagementManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of ManagementManager that exposes Management resource management API entry points.
    *
    * @param credentials the credentials to use
    * @return the ManagementManager
    */
    public static ManagementManager authenticate(AzureTokenCredentials credentials) {
        return new ManagementManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build());
    }
    /**
    * Creates an instance of ManagementManager that exposes Management resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @return the ManagementManager
    */
    public static ManagementManager authenticate(RestClient restClient) {
        return new ManagementManager(restClient);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of ManagementManager that exposes Management management API entry points.
        *
        * @param credentials the credentials to use
        * @return the interface exposing Management management API entry points that work across subscriptions
        */
        ManagementManager authenticate(AzureTokenCredentials credentials);
    }

    /**
     * @return Entry point to manage ManagementGroups.
     */
    public ManagementGroups managementGroups() {
        if (this.managementGroups == null) {
            this.managementGroups = new ManagementGroupsImpl(this);
        }
        return this.managementGroups;
    }

    /**
     * @return Entry point to manage ManagementGroupSubscriptions.
     */
    public ManagementGroupSubscriptions managementGroupSubscriptions() {
        if (this.managementGroupSubscriptions == null) {
            this.managementGroupSubscriptions = new ManagementGroupSubscriptionsImpl(this);
        }
        return this.managementGroupSubscriptions;
    }

    /**
     * @return Entry point to manage Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(this);
        }
        return this.operations;
    }

    /**
     * @return Entry point to manage Entities.
     */
    public Entities entities() {
        if (this.entities == null) {
            this.entities = new EntitiesImpl(this);
        }
        return this.entities;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public ManagementManager authenticate(AzureTokenCredentials credentials) {
           return ManagementManager.authenticate(buildRestClient(credentials));
        }
     }
    private ManagementManager(RestClient restClient) {
        super(
            restClient,
            null,
            new ManagementGroupsAPIImpl(restClient));
    }
}