/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.rest.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;

/**
 * An Access policy.
 */
public class AccessPolicy {
    /**
     * the date-time the policy is active.
     */
    @JsonProperty(value = "Start")
    private DateTime start;

    /**
     * the date-time the policy expires.
     */
    @JsonProperty(value = "Expiry")
    private DateTime expiry;

    /**
     * the permissions for the acl policy.
     */
    @JsonProperty(value = "Permission")
    private String permission;

    /**
     * Get the start value.
     *
     * @return the start value
     */
    public DateTime start() {
        return this.start;
    }

    /**
     * Set the start value.
     *
     * @param start the start value to set
     * @return the AccessPolicy object itself.
     */
    public AccessPolicy withStart(DateTime start) {
        this.start = start;
        return this;
    }

    /**
     * Get the expiry value.
     *
     * @return the expiry value
     */
    public DateTime expiry() {
        return this.expiry;
    }

    /**
     * Set the expiry value.
     *
     * @param expiry the expiry value to set
     * @return the AccessPolicy object itself.
     */
    public AccessPolicy withExpiry(DateTime expiry) {
        this.expiry = expiry;
        return this;
    }

    /**
     * Get the permission value.
     *
     * @return the permission value
     */
    public String permission() {
        return this.permission;
    }

    /**
     * Set the permission value.
     *
     * @param permission the permission value to set
     * @return the AccessPolicy object itself.
     */
    public AccessPolicy withPermission(String permission) {
        this.permission = permission;
        return this;
    }

}
