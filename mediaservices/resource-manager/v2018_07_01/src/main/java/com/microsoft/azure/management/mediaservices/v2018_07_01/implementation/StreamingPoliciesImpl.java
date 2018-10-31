/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.mediaservices.v2018_07_01.StreamingPolicies;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.mediaservices.v2018_07_01.StreamingPolicy;

class StreamingPoliciesImpl extends WrapperImpl<StreamingPoliciesInner> implements StreamingPolicies {
    private final MediaManager manager;

    StreamingPoliciesImpl(MediaManager manager) {
        super(manager.inner().streamingPolicies());
        this.manager = manager;
    }

    public MediaManager manager() {
        return this.manager;
    }

    @Override
    public StreamingPolicyImpl define(String name) {
        return wrapModel(name);
    }

    private StreamingPolicyImpl wrapModel(StreamingPolicyInner inner) {
        return  new StreamingPolicyImpl(inner, manager());
    }

    private StreamingPolicyImpl wrapModel(String name) {
        return new StreamingPolicyImpl(name, this.manager());
    }

    @Override
    public Observable<StreamingPolicy> listAsync(final String resourceGroupName, final String accountName) {
        StreamingPoliciesInner client = this.inner();
        return client.listAsync(resourceGroupName, accountName)
        .flatMapIterable(new Func1<Page<StreamingPolicyInner>, Iterable<StreamingPolicyInner>>() {
            @Override
            public Iterable<StreamingPolicyInner> call(Page<StreamingPolicyInner> page) {
                return page.items();
            }
        })
        .map(new Func1<StreamingPolicyInner, StreamingPolicy>() {
            @Override
            public StreamingPolicy call(StreamingPolicyInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<StreamingPolicy> getAsync(String resourceGroupName, String accountName, String streamingPolicyName) {
        StreamingPoliciesInner client = this.inner();
        return client.getAsync(resourceGroupName, accountName, streamingPolicyName)
        .map(new Func1<StreamingPolicyInner, StreamingPolicy>() {
            @Override
            public StreamingPolicy call(StreamingPolicyInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String accountName, String streamingPolicyName) {
        StreamingPoliciesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, accountName, streamingPolicyName).toCompletable();
    }

}