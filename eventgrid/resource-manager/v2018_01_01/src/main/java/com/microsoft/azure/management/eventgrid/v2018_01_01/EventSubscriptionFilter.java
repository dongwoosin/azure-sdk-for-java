/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2018_01_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Filter for the Event Subscription.
 */
public class EventSubscriptionFilter {
    /**
     * An optional string to filter events for an event subscription based on a
     * resource path prefix.
     * The format of this depends on the publisher of the events.
     * Wildcard characters are not supported in this path.
     */
    @JsonProperty(value = "subjectBeginsWith")
    private String subjectBeginsWith;

    /**
     * An optional string to filter events for an event subscription based on a
     * resource path suffix.
     * Wildcard characters are not supported in this path.
     */
    @JsonProperty(value = "subjectEndsWith")
    private String subjectEndsWith;

    /**
     * A list of applicable event types that need to be part of the event
     * subscription.
     * If it is desired to subscribe to all event types, the string "all" needs
     * to be specified as an element in this list.
     */
    @JsonProperty(value = "includedEventTypes")
    private List<String> includedEventTypes;

    /**
     * Specifies if the SubjectBeginsWith and SubjectEndsWith properties of the
     * filter
     * should be compared in a case sensitive manner.
     */
    @JsonProperty(value = "isSubjectCaseSensitive")
    private Boolean isSubjectCaseSensitive;

    /**
     * Get the subjectBeginsWith value.
     *
     * @return the subjectBeginsWith value
     */
    public String subjectBeginsWith() {
        return this.subjectBeginsWith;
    }

    /**
     * Set the subjectBeginsWith value.
     *
     * @param subjectBeginsWith the subjectBeginsWith value to set
     * @return the EventSubscriptionFilter object itself.
     */
    public EventSubscriptionFilter withSubjectBeginsWith(String subjectBeginsWith) {
        this.subjectBeginsWith = subjectBeginsWith;
        return this;
    }

    /**
     * Get the subjectEndsWith value.
     *
     * @return the subjectEndsWith value
     */
    public String subjectEndsWith() {
        return this.subjectEndsWith;
    }

    /**
     * Set the subjectEndsWith value.
     *
     * @param subjectEndsWith the subjectEndsWith value to set
     * @return the EventSubscriptionFilter object itself.
     */
    public EventSubscriptionFilter withSubjectEndsWith(String subjectEndsWith) {
        this.subjectEndsWith = subjectEndsWith;
        return this;
    }

    /**
     * Get the includedEventTypes value.
     *
     * @return the includedEventTypes value
     */
    public List<String> includedEventTypes() {
        return this.includedEventTypes;
    }

    /**
     * Set the includedEventTypes value.
     *
     * @param includedEventTypes the includedEventTypes value to set
     * @return the EventSubscriptionFilter object itself.
     */
    public EventSubscriptionFilter withIncludedEventTypes(List<String> includedEventTypes) {
        this.includedEventTypes = includedEventTypes;
        return this;
    }

    /**
     * Get the isSubjectCaseSensitive value.
     *
     * @return the isSubjectCaseSensitive value
     */
    public Boolean isSubjectCaseSensitive() {
        return this.isSubjectCaseSensitive;
    }

    /**
     * Set the isSubjectCaseSensitive value.
     *
     * @param isSubjectCaseSensitive the isSubjectCaseSensitive value to set
     * @return the EventSubscriptionFilter object itself.
     */
    public EventSubscriptionFilter withIsSubjectCaseSensitive(Boolean isSubjectCaseSensitive) {
        this.isSubjectCaseSensitive = isSubjectCaseSensitive;
        return this;
    }

}
