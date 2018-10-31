/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.devtestlab.v2016_05_15.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.devtestlab.v2016_05_15.Secrets;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.devtestlab.v2016_05_15.Secret;

class SecretsImpl extends WrapperImpl<SecretsInner> implements Secrets {
    private final DevTestLabManager manager;

    SecretsImpl(DevTestLabManager manager) {
        super(manager.inner().secrets());
        this.manager = manager;
    }

    public DevTestLabManager manager() {
        return this.manager;
    }

    @Override
    public SecretImpl define(String name) {
        return wrapModel(name);
    }

    private SecretImpl wrapModel(SecretInner inner) {
        return  new SecretImpl(inner, manager());
    }

    private SecretImpl wrapModel(String name) {
        return new SecretImpl(name, this.manager());
    }

    @Override
    public Observable<Secret> listAsync(final String resourceGroupName, final String labName, final String userName) {
        SecretsInner client = this.inner();
        return client.listAsync(resourceGroupName, labName, userName)
        .flatMapIterable(new Func1<Page<SecretInner>, Iterable<SecretInner>>() {
            @Override
            public Iterable<SecretInner> call(Page<SecretInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SecretInner, Secret>() {
            @Override
            public Secret call(SecretInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Secret> getAsync(String resourceGroupName, String labName, String userName, String name) {
        SecretsInner client = this.inner();
        return client.getAsync(resourceGroupName, labName, userName, name)
        .map(new Func1<SecretInner, Secret>() {
            @Override
            public Secret call(SecretInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String labName, String userName, String name) {
        SecretsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, labName, userName, name).toCompletable();
    }

}