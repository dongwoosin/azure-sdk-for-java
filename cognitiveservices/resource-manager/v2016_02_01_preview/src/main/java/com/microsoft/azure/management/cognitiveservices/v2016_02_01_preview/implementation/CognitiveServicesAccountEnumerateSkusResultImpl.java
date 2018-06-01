/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cognitiveservices.v2016_02_01_preview.implementation;

import com.microsoft.azure.management.cognitiveservices.v2016_02_01_preview.CognitiveServicesAccountEnumerateSkusResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.cognitiveservices.v2016_02_01_preview.CognitiveServicesResourceAndSku;

class CognitiveServicesAccountEnumerateSkusResultImpl extends WrapperImpl<CognitiveServicesAccountEnumerateSkusResultInner> implements CognitiveServicesAccountEnumerateSkusResult {
    private final CognitiveServicesManager manager;
    CognitiveServicesAccountEnumerateSkusResultImpl(CognitiveServicesAccountEnumerateSkusResultInner inner, CognitiveServicesManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public CognitiveServicesManager manager() {
        return this.manager;
    }

    @Override
    public List<CognitiveServicesResourceAndSku> value() {
        return this.inner().value();
    }

}