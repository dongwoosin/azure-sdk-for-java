/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.computervision.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * A collection of content tags, along with a list of captions sorted by
 * confidence level, and image metadata.
 */
@JsonFlatten
public class ImageDescription {
    /**
     * A collection of image tags.
     */
    @JsonProperty(value = "description.tags")
    private List<String> tags;

    /**
     * A list of captions, sorted by confidence level.
     */
    @JsonProperty(value = "description.captions")
    private List<ImageCaption> captions;

    /**
     * Id of the REST API request.
     */
    @JsonProperty(value = "requestId")
    private String requestId;

    /**
     * The metadata property.
     */
    @JsonProperty(value = "metadata")
    private ImageMetadata metadata;

    /**
     * Get the tags value.
     *
     * @return the tags value
     */
    public List<String> tags() {
        return this.tags;
    }

    /**
     * Set the tags value.
     *
     * @param tags the tags value to set
     * @return the ImageDescription object itself.
     */
    public ImageDescription withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the captions value.
     *
     * @return the captions value
     */
    public List<ImageCaption> captions() {
        return this.captions;
    }

    /**
     * Set the captions value.
     *
     * @param captions the captions value to set
     * @return the ImageDescription object itself.
     */
    public ImageDescription withCaptions(List<ImageCaption> captions) {
        this.captions = captions;
        return this;
    }

    /**
     * Get the requestId value.
     *
     * @return the requestId value
     */
    public String requestId() {
        return this.requestId;
    }

    /**
     * Set the requestId value.
     *
     * @param requestId the requestId value to set
     * @return the ImageDescription object itself.
     */
    public ImageDescription withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the metadata value.
     *
     * @return the metadata value
     */
    public ImageMetadata metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata value.
     *
     * @param metadata the metadata value to set
     * @return the ImageDescription object itself.
     */
    public ImageDescription withMetadata(ImageMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

}
