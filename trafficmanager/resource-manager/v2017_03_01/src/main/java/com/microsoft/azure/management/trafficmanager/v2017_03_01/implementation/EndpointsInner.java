/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.trafficmanager.v2017_03_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Endpoints.
 */
public class EndpointsInner {
    /** The Retrofit service to perform REST calls. */
    private EndpointsService service;
    /** The service client containing this operation class. */
    private TrafficManagerManagementClientImpl client;

    /**
     * Initializes an instance of EndpointsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public EndpointsInner(Retrofit retrofit, TrafficManagerManagementClientImpl client) {
        this.service = retrofit.create(EndpointsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Endpoints to be
     * used by Retrofit to perform actually REST calls.
     */
    interface EndpointsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.trafficmanager.v2017_03_01.Endpoints update" })
        @PATCH("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/trafficmanagerprofiles/{profileName}/{endpointType}/{endpointName}")
        Observable<Response<ResponseBody>> update(@Path("resourceGroupName") String resourceGroupName, @Path("profileName") String profileName, @Path("endpointType") String endpointType, @Path("endpointName") String endpointName, @Path("subscriptionId") String subscriptionId, @Body EndpointInner parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.trafficmanager.v2017_03_01.Endpoints get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/trafficmanagerprofiles/{profileName}/{endpointType}/{endpointName}")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("profileName") String profileName, @Path("endpointType") String endpointType, @Path("endpointName") String endpointName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.trafficmanager.v2017_03_01.Endpoints createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/trafficmanagerprofiles/{profileName}/{endpointType}/{endpointName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("profileName") String profileName, @Path("endpointType") String endpointType, @Path("endpointName") String endpointName, @Path("subscriptionId") String subscriptionId, @Body EndpointInner parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.trafficmanager.v2017_03_01.Endpoints delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/trafficmanagerprofiles/{profileName}/{endpointType}/{endpointName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("resourceGroupName") String resourceGroupName, @Path("profileName") String profileName, @Path("endpointType") String endpointType, @Path("endpointName") String endpointName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Update a Traffic Manager endpoint.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager endpoint to be updated.
     * @param profileName The name of the Traffic Manager profile.
     * @param endpointType The type of the Traffic Manager endpoint to be updated.
     * @param endpointName The name of the Traffic Manager endpoint to be updated.
     * @param parameters The Traffic Manager endpoint parameters supplied to the Update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the EndpointInner object if successful.
     */
    public EndpointInner update(String resourceGroupName, String profileName, String endpointType, String endpointName, EndpointInner parameters) {
        return updateWithServiceResponseAsync(resourceGroupName, profileName, endpointType, endpointName, parameters).toBlocking().single().body();
    }

    /**
     * Update a Traffic Manager endpoint.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager endpoint to be updated.
     * @param profileName The name of the Traffic Manager profile.
     * @param endpointType The type of the Traffic Manager endpoint to be updated.
     * @param endpointName The name of the Traffic Manager endpoint to be updated.
     * @param parameters The Traffic Manager endpoint parameters supplied to the Update operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<EndpointInner> updateAsync(String resourceGroupName, String profileName, String endpointType, String endpointName, EndpointInner parameters, final ServiceCallback<EndpointInner> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(resourceGroupName, profileName, endpointType, endpointName, parameters), serviceCallback);
    }

    /**
     * Update a Traffic Manager endpoint.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager endpoint to be updated.
     * @param profileName The name of the Traffic Manager profile.
     * @param endpointType The type of the Traffic Manager endpoint to be updated.
     * @param endpointName The name of the Traffic Manager endpoint to be updated.
     * @param parameters The Traffic Manager endpoint parameters supplied to the Update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EndpointInner object
     */
    public Observable<EndpointInner> updateAsync(String resourceGroupName, String profileName, String endpointType, String endpointName, EndpointInner parameters) {
        return updateWithServiceResponseAsync(resourceGroupName, profileName, endpointType, endpointName, parameters).map(new Func1<ServiceResponse<EndpointInner>, EndpointInner>() {
            @Override
            public EndpointInner call(ServiceResponse<EndpointInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Update a Traffic Manager endpoint.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager endpoint to be updated.
     * @param profileName The name of the Traffic Manager profile.
     * @param endpointType The type of the Traffic Manager endpoint to be updated.
     * @param endpointName The name of the Traffic Manager endpoint to be updated.
     * @param parameters The Traffic Manager endpoint parameters supplied to the Update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EndpointInner object
     */
    public Observable<ServiceResponse<EndpointInner>> updateWithServiceResponseAsync(String resourceGroupName, String profileName, String endpointType, String endpointName, EndpointInner parameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (profileName == null) {
            throw new IllegalArgumentException("Parameter profileName is required and cannot be null.");
        }
        if (endpointType == null) {
            throw new IllegalArgumentException("Parameter endpointType is required and cannot be null.");
        }
        if (endpointName == null) {
            throw new IllegalArgumentException("Parameter endpointName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.update(resourceGroupName, profileName, endpointType, endpointName, this.client.subscriptionId(), parameters, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<EndpointInner>>>() {
                @Override
                public Observable<ServiceResponse<EndpointInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<EndpointInner> clientResponse = updateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<EndpointInner> updateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<EndpointInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<EndpointInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a Traffic Manager endpoint.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager endpoint.
     * @param profileName The name of the Traffic Manager profile.
     * @param endpointType The type of the Traffic Manager endpoint.
     * @param endpointName The name of the Traffic Manager endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the EndpointInner object if successful.
     */
    public EndpointInner get(String resourceGroupName, String profileName, String endpointType, String endpointName) {
        return getWithServiceResponseAsync(resourceGroupName, profileName, endpointType, endpointName).toBlocking().single().body();
    }

    /**
     * Gets a Traffic Manager endpoint.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager endpoint.
     * @param profileName The name of the Traffic Manager profile.
     * @param endpointType The type of the Traffic Manager endpoint.
     * @param endpointName The name of the Traffic Manager endpoint.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<EndpointInner> getAsync(String resourceGroupName, String profileName, String endpointType, String endpointName, final ServiceCallback<EndpointInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, profileName, endpointType, endpointName), serviceCallback);
    }

    /**
     * Gets a Traffic Manager endpoint.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager endpoint.
     * @param profileName The name of the Traffic Manager profile.
     * @param endpointType The type of the Traffic Manager endpoint.
     * @param endpointName The name of the Traffic Manager endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EndpointInner object
     */
    public Observable<EndpointInner> getAsync(String resourceGroupName, String profileName, String endpointType, String endpointName) {
        return getWithServiceResponseAsync(resourceGroupName, profileName, endpointType, endpointName).map(new Func1<ServiceResponse<EndpointInner>, EndpointInner>() {
            @Override
            public EndpointInner call(ServiceResponse<EndpointInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a Traffic Manager endpoint.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager endpoint.
     * @param profileName The name of the Traffic Manager profile.
     * @param endpointType The type of the Traffic Manager endpoint.
     * @param endpointName The name of the Traffic Manager endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EndpointInner object
     */
    public Observable<ServiceResponse<EndpointInner>> getWithServiceResponseAsync(String resourceGroupName, String profileName, String endpointType, String endpointName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (profileName == null) {
            throw new IllegalArgumentException("Parameter profileName is required and cannot be null.");
        }
        if (endpointType == null) {
            throw new IllegalArgumentException("Parameter endpointType is required and cannot be null.");
        }
        if (endpointName == null) {
            throw new IllegalArgumentException("Parameter endpointName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(resourceGroupName, profileName, endpointType, endpointName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<EndpointInner>>>() {
                @Override
                public Observable<ServiceResponse<EndpointInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<EndpointInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<EndpointInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<EndpointInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<EndpointInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Create or update a Traffic Manager endpoint.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager endpoint to be created or updated.
     * @param profileName The name of the Traffic Manager profile.
     * @param endpointType The type of the Traffic Manager endpoint to be created or updated.
     * @param endpointName The name of the Traffic Manager endpoint to be created or updated.
     * @param parameters The Traffic Manager endpoint parameters supplied to the CreateOrUpdate operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the EndpointInner object if successful.
     */
    public EndpointInner createOrUpdate(String resourceGroupName, String profileName, String endpointType, String endpointName, EndpointInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, profileName, endpointType, endpointName, parameters).toBlocking().single().body();
    }

    /**
     * Create or update a Traffic Manager endpoint.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager endpoint to be created or updated.
     * @param profileName The name of the Traffic Manager profile.
     * @param endpointType The type of the Traffic Manager endpoint to be created or updated.
     * @param endpointName The name of the Traffic Manager endpoint to be created or updated.
     * @param parameters The Traffic Manager endpoint parameters supplied to the CreateOrUpdate operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<EndpointInner> createOrUpdateAsync(String resourceGroupName, String profileName, String endpointType, String endpointName, EndpointInner parameters, final ServiceCallback<EndpointInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, profileName, endpointType, endpointName, parameters), serviceCallback);
    }

    /**
     * Create or update a Traffic Manager endpoint.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager endpoint to be created or updated.
     * @param profileName The name of the Traffic Manager profile.
     * @param endpointType The type of the Traffic Manager endpoint to be created or updated.
     * @param endpointName The name of the Traffic Manager endpoint to be created or updated.
     * @param parameters The Traffic Manager endpoint parameters supplied to the CreateOrUpdate operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EndpointInner object
     */
    public Observable<EndpointInner> createOrUpdateAsync(String resourceGroupName, String profileName, String endpointType, String endpointName, EndpointInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, profileName, endpointType, endpointName, parameters).map(new Func1<ServiceResponse<EndpointInner>, EndpointInner>() {
            @Override
            public EndpointInner call(ServiceResponse<EndpointInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Create or update a Traffic Manager endpoint.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager endpoint to be created or updated.
     * @param profileName The name of the Traffic Manager profile.
     * @param endpointType The type of the Traffic Manager endpoint to be created or updated.
     * @param endpointName The name of the Traffic Manager endpoint to be created or updated.
     * @param parameters The Traffic Manager endpoint parameters supplied to the CreateOrUpdate operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EndpointInner object
     */
    public Observable<ServiceResponse<EndpointInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String profileName, String endpointType, String endpointName, EndpointInner parameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (profileName == null) {
            throw new IllegalArgumentException("Parameter profileName is required and cannot be null.");
        }
        if (endpointType == null) {
            throw new IllegalArgumentException("Parameter endpointType is required and cannot be null.");
        }
        if (endpointName == null) {
            throw new IllegalArgumentException("Parameter endpointName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.createOrUpdate(resourceGroupName, profileName, endpointType, endpointName, this.client.subscriptionId(), parameters, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<EndpointInner>>>() {
                @Override
                public Observable<ServiceResponse<EndpointInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<EndpointInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<EndpointInner> createOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<EndpointInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<EndpointInner>() { }.getType())
                .register(201, new TypeToken<EndpointInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Deletes a Traffic Manager endpoint.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager endpoint to be deleted.
     * @param profileName The name of the Traffic Manager profile.
     * @param endpointType The type of the Traffic Manager endpoint to be deleted.
     * @param endpointName The name of the Traffic Manager endpoint to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeleteOperationResultInner object if successful.
     */
    public DeleteOperationResultInner delete(String resourceGroupName, String profileName, String endpointType, String endpointName) {
        return deleteWithServiceResponseAsync(resourceGroupName, profileName, endpointType, endpointName).toBlocking().single().body();
    }

    /**
     * Deletes a Traffic Manager endpoint.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager endpoint to be deleted.
     * @param profileName The name of the Traffic Manager profile.
     * @param endpointType The type of the Traffic Manager endpoint to be deleted.
     * @param endpointName The name of the Traffic Manager endpoint to be deleted.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeleteOperationResultInner> deleteAsync(String resourceGroupName, String profileName, String endpointType, String endpointName, final ServiceCallback<DeleteOperationResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, profileName, endpointType, endpointName), serviceCallback);
    }

    /**
     * Deletes a Traffic Manager endpoint.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager endpoint to be deleted.
     * @param profileName The name of the Traffic Manager profile.
     * @param endpointType The type of the Traffic Manager endpoint to be deleted.
     * @param endpointName The name of the Traffic Manager endpoint to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeleteOperationResultInner object
     */
    public Observable<DeleteOperationResultInner> deleteAsync(String resourceGroupName, String profileName, String endpointType, String endpointName) {
        return deleteWithServiceResponseAsync(resourceGroupName, profileName, endpointType, endpointName).map(new Func1<ServiceResponse<DeleteOperationResultInner>, DeleteOperationResultInner>() {
            @Override
            public DeleteOperationResultInner call(ServiceResponse<DeleteOperationResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes a Traffic Manager endpoint.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager endpoint to be deleted.
     * @param profileName The name of the Traffic Manager profile.
     * @param endpointType The type of the Traffic Manager endpoint to be deleted.
     * @param endpointName The name of the Traffic Manager endpoint to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeleteOperationResultInner object
     */
    public Observable<ServiceResponse<DeleteOperationResultInner>> deleteWithServiceResponseAsync(String resourceGroupName, String profileName, String endpointType, String endpointName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (profileName == null) {
            throw new IllegalArgumentException("Parameter profileName is required and cannot be null.");
        }
        if (endpointType == null) {
            throw new IllegalArgumentException("Parameter endpointType is required and cannot be null.");
        }
        if (endpointName == null) {
            throw new IllegalArgumentException("Parameter endpointName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.delete(resourceGroupName, profileName, endpointType, endpointName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DeleteOperationResultInner>>>() {
                @Override
                public Observable<ServiceResponse<DeleteOperationResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DeleteOperationResultInner> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DeleteOperationResultInner> deleteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<DeleteOperationResultInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DeleteOperationResultInner>() { }.getType())
                .register(204, new TypeToken<DeleteOperationResultInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
