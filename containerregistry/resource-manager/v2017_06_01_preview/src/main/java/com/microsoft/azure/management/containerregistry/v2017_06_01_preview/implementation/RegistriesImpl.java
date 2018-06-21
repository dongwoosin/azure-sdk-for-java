/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.containerregistry.v2017_06_01_preview.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.containerregistry.v2017_06_01_preview.Registries;
import com.microsoft.azure.management.containerregistry.v2017_06_01_preview.Registry;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.containerregistry.v2017_06_01_preview.RegistryListCredentialsResult;
import com.microsoft.azure.management.containerregistry.v2017_06_01_preview.RegistryNameStatus;
import com.microsoft.azure.management.containerregistry.v2017_06_01_preview.PasswordName;
import com.microsoft.azure.management.containerregistry.v2017_06_01_preview.RegistryUsageListResult;

class RegistriesImpl extends GroupableResourcesCoreImpl<Registry, RegistryImpl, RegistryInner, RegistriesInner, ContainerRegistryManager>  implements Registries {
    protected RegistriesImpl(ContainerRegistryManager manager) {
        super(manager.inner().registries(), manager);
    }

    @Override
    protected Observable<RegistryInner> getInnerAsync(String resourceGroupName, String name) {
        RegistriesInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        RegistriesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<Registry> listByResourceGroup(String resourceGroupName) {
        RegistriesInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<Registry> listByResourceGroupAsync(String resourceGroupName) {
        RegistriesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<RegistryInner>, Iterable<RegistryInner>>() {
            @Override
            public Iterable<RegistryInner> call(Page<RegistryInner> page) {
                return page.items();
            }
        })
        .map(new Func1<RegistryInner, Registry>() {
            @Override
            public Registry call(RegistryInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<Registry> list() {
        RegistriesInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<Registry> listAsync() {
        RegistriesInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<RegistryInner>, Iterable<RegistryInner>>() {
            @Override
            public Iterable<RegistryInner> call(Page<RegistryInner> page) {
                return page.items();
            }
        })
        .map(new Func1<RegistryInner, Registry>() {
            @Override
            public Registry call(RegistryInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public RegistryImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Observable<RegistryListCredentialsResult> listCredentialsAsync(String resourceGroupName, String registryName) {
        RegistriesInner client = this.inner();
        return client.listCredentialsAsync(resourceGroupName, registryName)
        .map(new Func1<RegistryListCredentialsResultInner, RegistryListCredentialsResult>() {
            @Override
            public RegistryListCredentialsResult call(RegistryListCredentialsResultInner inner) {
                return new RegistryListCredentialsResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<RegistryListCredentialsResult> regenerateCredentialAsync(String resourceGroupName, String registryName, PasswordName name) {
        RegistriesInner client = this.inner();
        return client.regenerateCredentialAsync(resourceGroupName, registryName, name)
        .map(new Func1<RegistryListCredentialsResultInner, RegistryListCredentialsResult>() {
            @Override
            public RegistryListCredentialsResult call(RegistryListCredentialsResultInner inner) {
                return new RegistryListCredentialsResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<RegistryNameStatus> checkNameAvailabilityAsync(String name) {
        RegistriesInner client = this.inner();
        return client.checkNameAvailabilityAsync(name)
        .map(new Func1<RegistryNameStatusInner, RegistryNameStatus>() {
            @Override
            public RegistryNameStatus call(RegistryNameStatusInner inner) {
                return new RegistryNameStatusImpl(inner, manager());
            }
        });
    }

    @Override
    protected RegistryImpl wrapModel(RegistryInner inner) {
        return  new RegistryImpl(inner.name(), inner, manager());
    }

    @Override
    protected RegistryImpl wrapModel(String name) {
        return new RegistryImpl(name, new RegistryInner(), this.manager());
    }

    @Override
    public Observable<RegistryUsageListResult> listUsagesAsync(String resourceGroupName, String registryName) {
        RegistriesInner client = this.inner();
        return client.listUsagesAsync(resourceGroupName, registryName)
        .map(new Func1<RegistryUsageListResultInner, RegistryUsageListResult>() {
            @Override
            public RegistryUsageListResult call(RegistryUsageListResultInner inner) {
                return new RegistryUsageListResultImpl(inner, manager());
            }
        });
    }

}
