/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2018_08_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.management.network.v2018_08_01.implementation.PublicIPPrefixInner;

/**
 * Type representing PublicIPPrefix.
 */
public interface PublicIPPrefix extends HasInner<PublicIPPrefixInner>, Resource, GroupableResourceCore<NetworkManager, PublicIPPrefixInner>, HasResourceGroup, Refreshable<PublicIPPrefix>, Updatable<PublicIPPrefix.Update>, HasManager<NetworkManager> {
    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the ipPrefix value.
     */
    String ipPrefix();

    /**
     * @return the ipTags value.
     */
    List<IpTag> ipTags();

    /**
     * @return the prefixLength value.
     */
    Integer prefixLength();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the publicIPAddresses value.
     */
    List<ReferencedPublicIpAddress> publicIPAddresses();

    /**
     * @return the publicIPAddressVersion value.
     */
    IPVersion publicIPAddressVersion();

    /**
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * @return the sku value.
     */
    PublicIPPrefixSku sku();

    /**
     * @return the zones value.
     */
    List<String> zones();

    /**
     * The entirety of the PublicIPPrefix definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of PublicIPPrefix definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a PublicIPPrefix definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the PublicIPPrefix definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the publicipprefix update allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             */
            WithCreate withEtag(String etag);
        }

        /**
         * The stage of the publicipprefix update allowing to specify IpPrefix.
         */
        interface WithIpPrefix {
            /**
             * Specifies ipPrefix.
             */
            WithCreate withIpPrefix(String ipPrefix);
        }

        /**
         * The stage of the publicipprefix update allowing to specify IpTags.
         */
        interface WithIpTags {
            /**
             * Specifies ipTags.
             */
            WithCreate withIpTags(List<IpTag> ipTags);
        }

        /**
         * The stage of the publicipprefix update allowing to specify PrefixLength.
         */
        interface WithPrefixLength {
            /**
             * Specifies prefixLength.
             */
            WithCreate withPrefixLength(Integer prefixLength);
        }

        /**
         * The stage of the publicipprefix update allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             */
            WithCreate withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the publicipprefix update allowing to specify PublicIPAddresses.
         */
        interface WithPublicIPAddresses {
            /**
             * Specifies publicIPAddresses.
             */
            WithCreate withPublicIPAddresses(List<ReferencedPublicIpAddress> publicIPAddresses);
        }

        /**
         * The stage of the publicipprefix update allowing to specify PublicIPAddressVersion.
         */
        interface WithPublicIPAddressVersion {
            /**
             * Specifies publicIPAddressVersion.
             */
            WithCreate withPublicIPAddressVersion(IPVersion publicIPAddressVersion);
        }

        /**
         * The stage of the publicipprefix update allowing to specify ResourceGuid.
         */
        interface WithResourceGuid {
            /**
             * Specifies resourceGuid.
             */
            WithCreate withResourceGuid(String resourceGuid);
        }

        /**
         * The stage of the publicipprefix update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             */
            WithCreate withSku(PublicIPPrefixSku sku);
        }

        /**
         * The stage of the publicipprefix update allowing to specify Zones.
         */
        interface WithZones {
            /**
             * Specifies zones.
             */
            WithCreate withZones(List<String> zones);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<PublicIPPrefix>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithEtag, DefinitionStages.WithIpPrefix, DefinitionStages.WithIpTags, DefinitionStages.WithPrefixLength, DefinitionStages.WithProvisioningState, DefinitionStages.WithPublicIPAddresses, DefinitionStages.WithPublicIPAddressVersion, DefinitionStages.WithResourceGuid, DefinitionStages.WithSku, DefinitionStages.WithZones {
        }
    }
    /**
     * The template for a PublicIPPrefix update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<PublicIPPrefix>, Resource.UpdateWithTags<Update>, UpdateStages.WithEtag, UpdateStages.WithIpPrefix, UpdateStages.WithIpTags, UpdateStages.WithPrefixLength, UpdateStages.WithProvisioningState, UpdateStages.WithPublicIPAddresses, UpdateStages.WithPublicIPAddressVersion, UpdateStages.WithResourceGuid, UpdateStages.WithSku, UpdateStages.WithZones {
    }

    /**
     * Grouping of PublicIPPrefix update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the publicipprefix {0} allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             */
            Update withEtag(String etag);
        }

        /**
         * The stage of the publicipprefix {0} allowing to specify IpPrefix.
         */
        interface WithIpPrefix {
            /**
             * Specifies ipPrefix.
             */
            Update withIpPrefix(String ipPrefix);
        }

        /**
         * The stage of the publicipprefix {0} allowing to specify IpTags.
         */
        interface WithIpTags {
            /**
             * Specifies ipTags.
             */
            Update withIpTags(List<IpTag> ipTags);
        }

        /**
         * The stage of the publicipprefix {0} allowing to specify PrefixLength.
         */
        interface WithPrefixLength {
            /**
             * Specifies prefixLength.
             */
            Update withPrefixLength(Integer prefixLength);
        }

        /**
         * The stage of the publicipprefix {0} allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             */
            Update withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the publicipprefix {0} allowing to specify PublicIPAddresses.
         */
        interface WithPublicIPAddresses {
            /**
             * Specifies publicIPAddresses.
             */
            Update withPublicIPAddresses(List<ReferencedPublicIpAddress> publicIPAddresses);
        }

        /**
         * The stage of the publicipprefix {0} allowing to specify PublicIPAddressVersion.
         */
        interface WithPublicIPAddressVersion {
            /**
             * Specifies publicIPAddressVersion.
             */
            Update withPublicIPAddressVersion(IPVersion publicIPAddressVersion);
        }

        /**
         * The stage of the publicipprefix {0} allowing to specify ResourceGuid.
         */
        interface WithResourceGuid {
            /**
             * Specifies resourceGuid.
             */
            Update withResourceGuid(String resourceGuid);
        }

        /**
         * The stage of the publicipprefix {0} allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             */
            Update withSku(PublicIPPrefixSku sku);
        }

        /**
         * The stage of the publicipprefix {0} allowing to specify Zones.
         */
        interface WithZones {
            /**
             * Specifies zones.
             */
            Update withZones(List<String> zones);
        }

    }
}
