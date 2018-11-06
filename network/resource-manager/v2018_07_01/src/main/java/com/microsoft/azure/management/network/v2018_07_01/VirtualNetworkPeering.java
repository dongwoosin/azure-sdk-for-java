/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_07_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2018_07_01.implementation.VirtualNetworkPeeringInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2018_07_01.implementation.NetworkManager;
import com.microsoft.azure.SubResource;

/**
 * Type representing VirtualNetworkPeering.
 */
public interface VirtualNetworkPeering extends HasInner<VirtualNetworkPeeringInner>, Indexable, Refreshable<VirtualNetworkPeering>, Updatable<VirtualNetworkPeering.Update>, HasManager<NetworkManager> {
    /**
     * @return the allowForwardedTraffic value.
     */
    Boolean allowForwardedTraffic();

    /**
     * @return the allowGatewayTransit value.
     */
    Boolean allowGatewayTransit();

    /**
     * @return the allowVirtualNetworkAccess value.
     */
    Boolean allowVirtualNetworkAccess();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the peeringState value.
     */
    VirtualNetworkPeeringState peeringState();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the remoteAddressSpace value.
     */
    AddressSpace remoteAddressSpace();

    /**
     * @return the remoteVirtualNetwork value.
     */
    SubResource remoteVirtualNetwork();

    /**
     * @return the useRemoteGateways value.
     */
    Boolean useRemoteGateways();

    /**
     * The entirety of the VirtualNetworkPeering definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithVirtualNetwork, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of VirtualNetworkPeering definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a VirtualNetworkPeering definition.
         */
        interface Blank extends WithVirtualNetwork {
        }

        /**
         * The stage of the virtualnetworkpeering definition allowing to specify VirtualNetwork.
         */
        interface WithVirtualNetwork {
           /**
            * Specifies resourceGroupName, virtualNetworkName.
            */
            WithCreate withExistingVirtualNetwork(String resourceGroupName, String virtualNetworkName);
        }

        /**
         * The stage of the virtualnetworkpeering definition allowing to specify AllowForwardedTraffic.
         */
        interface WithAllowForwardedTraffic {
            /**
             * Specifies allowForwardedTraffic.
             */
            WithCreate withAllowForwardedTraffic(Boolean allowForwardedTraffic);
        }

        /**
         * The stage of the virtualnetworkpeering definition allowing to specify AllowGatewayTransit.
         */
        interface WithAllowGatewayTransit {
            /**
             * Specifies allowGatewayTransit.
             */
            WithCreate withAllowGatewayTransit(Boolean allowGatewayTransit);
        }

        /**
         * The stage of the virtualnetworkpeering definition allowing to specify AllowVirtualNetworkAccess.
         */
        interface WithAllowVirtualNetworkAccess {
            /**
             * Specifies allowVirtualNetworkAccess.
             */
            WithCreate withAllowVirtualNetworkAccess(Boolean allowVirtualNetworkAccess);
        }

        /**
         * The stage of the virtualnetworkpeering definition allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             */
            WithCreate withEtag(String etag);
        }

        /**
         * The stage of the virtualnetworkpeering definition allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             */
            WithCreate withId(String id);
        }

        /**
         * The stage of the virtualnetworkpeering definition allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             */
            WithCreate withName(String name);
        }

        /**
         * The stage of the virtualnetworkpeering definition allowing to specify PeeringState.
         */
        interface WithPeeringState {
            /**
             * Specifies peeringState.
             */
            WithCreate withPeeringState(VirtualNetworkPeeringState peeringState);
        }

        /**
         * The stage of the virtualnetworkpeering definition allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             */
            WithCreate withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the virtualnetworkpeering definition allowing to specify RemoteAddressSpace.
         */
        interface WithRemoteAddressSpace {
            /**
             * Specifies remoteAddressSpace.
             */
            WithCreate withRemoteAddressSpace(AddressSpace remoteAddressSpace);
        }

        /**
         * The stage of the virtualnetworkpeering definition allowing to specify RemoteVirtualNetwork.
         */
        interface WithRemoteVirtualNetwork {
            /**
             * Specifies remoteVirtualNetwork.
             */
            WithCreate withRemoteVirtualNetwork(SubResource remoteVirtualNetwork);
        }

        /**
         * The stage of the virtualnetworkpeering definition allowing to specify UseRemoteGateways.
         */
        interface WithUseRemoteGateways {
            /**
             * Specifies useRemoteGateways.
             */
            WithCreate withUseRemoteGateways(Boolean useRemoteGateways);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<VirtualNetworkPeering>, DefinitionStages.WithAllowForwardedTraffic, DefinitionStages.WithAllowGatewayTransit, DefinitionStages.WithAllowVirtualNetworkAccess, DefinitionStages.WithEtag, DefinitionStages.WithId, DefinitionStages.WithName, DefinitionStages.WithPeeringState, DefinitionStages.WithProvisioningState, DefinitionStages.WithRemoteAddressSpace, DefinitionStages.WithRemoteVirtualNetwork, DefinitionStages.WithUseRemoteGateways {
        }
    }
    /**
     * The template for a VirtualNetworkPeering update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<VirtualNetworkPeering>, UpdateStages.WithAllowForwardedTraffic, UpdateStages.WithAllowGatewayTransit, UpdateStages.WithAllowVirtualNetworkAccess, UpdateStages.WithEtag, UpdateStages.WithId, UpdateStages.WithName, UpdateStages.WithPeeringState, UpdateStages.WithProvisioningState, UpdateStages.WithRemoteAddressSpace, UpdateStages.WithRemoteVirtualNetwork, UpdateStages.WithUseRemoteGateways {
    }

    /**
     * Grouping of VirtualNetworkPeering update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the virtualnetworkpeering update allowing to specify AllowForwardedTraffic.
         */
        interface WithAllowForwardedTraffic {
            /**
             * Specifies allowForwardedTraffic.
             */
            Update withAllowForwardedTraffic(Boolean allowForwardedTraffic);
        }

        /**
         * The stage of the virtualnetworkpeering update allowing to specify AllowGatewayTransit.
         */
        interface WithAllowGatewayTransit {
            /**
             * Specifies allowGatewayTransit.
             */
            Update withAllowGatewayTransit(Boolean allowGatewayTransit);
        }

        /**
         * The stage of the virtualnetworkpeering update allowing to specify AllowVirtualNetworkAccess.
         */
        interface WithAllowVirtualNetworkAccess {
            /**
             * Specifies allowVirtualNetworkAccess.
             */
            Update withAllowVirtualNetworkAccess(Boolean allowVirtualNetworkAccess);
        }

        /**
         * The stage of the virtualnetworkpeering update allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             */
            Update withEtag(String etag);
        }

        /**
         * The stage of the virtualnetworkpeering update allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             */
            Update withId(String id);
        }

        /**
         * The stage of the virtualnetworkpeering update allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             */
            Update withName(String name);
        }

        /**
         * The stage of the virtualnetworkpeering update allowing to specify PeeringState.
         */
        interface WithPeeringState {
            /**
             * Specifies peeringState.
             */
            Update withPeeringState(VirtualNetworkPeeringState peeringState);
        }

        /**
         * The stage of the virtualnetworkpeering update allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             */
            Update withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the virtualnetworkpeering update allowing to specify RemoteAddressSpace.
         */
        interface WithRemoteAddressSpace {
            /**
             * Specifies remoteAddressSpace.
             */
            Update withRemoteAddressSpace(AddressSpace remoteAddressSpace);
        }

        /**
         * The stage of the virtualnetworkpeering update allowing to specify RemoteVirtualNetwork.
         */
        interface WithRemoteVirtualNetwork {
            /**
             * Specifies remoteVirtualNetwork.
             */
            Update withRemoteVirtualNetwork(SubResource remoteVirtualNetwork);
        }

        /**
         * The stage of the virtualnetworkpeering update allowing to specify UseRemoteGateways.
         */
        interface WithUseRemoteGateways {
            /**
             * Specifies useRemoteGateways.
             */
            Update withUseRemoteGateways(Boolean useRemoteGateways);
        }

    }
}
