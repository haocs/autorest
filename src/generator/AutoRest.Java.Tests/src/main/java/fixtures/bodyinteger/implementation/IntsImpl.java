/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyinteger.implementation;

import retrofit2.Retrofit;
import fixtures.bodyinteger.Ints;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import fixtures.bodyinteger.models.ErrorException;
import java.io.IOException;
import okhttp3.ResponseBody;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import retrofit2.Response;

/**
 * An instance of this class provides access to all the operations defined
 * in Ints.
 */
public final class IntsImpl implements Ints {
    /** The Retrofit service to perform REST calls. */
    private IntsService service;
    /** The service client containing this operation class. */
    private AutoRestIntegerTestServiceImpl client;

    /**
     * Initializes an instance of Ints.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public IntsImpl(Retrofit retrofit, AutoRestIntegerTestServiceImpl client) {
        this.service = retrofit.create(IntsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Ints to be
     * used by Retrofit to perform actually REST calls.
     */
    interface IntsService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("int/null")
        Call<ResponseBody> getNull();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("int/invalid")
        Call<ResponseBody> getInvalid();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("int/overflowint32")
        Call<ResponseBody> getOverflowInt32();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("int/underflowint32")
        Call<ResponseBody> getUnderflowInt32();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("int/overflowint64")
        Call<ResponseBody> getOverflowInt64();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("int/underflowint64")
        Call<ResponseBody> getUnderflowInt64();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("int/max/32")
        Call<ResponseBody> putMax32(@Body int intBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("int/max/64")
        Call<ResponseBody> putMax64(@Body long intBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("int/min/32")
        Call<ResponseBody> putMin32(@Body int intBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("int/min/64")
        Call<ResponseBody> putMin64(@Body long intBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("int/unixtime")
        Call<ResponseBody> getUnixTime();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("int/unixtime")
        Call<ResponseBody> putUnixTimeDate(@Body long intBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("int/invalidunixtime")
        Call<ResponseBody> getInvalidUnixTime();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("int/nullunixtime")
        Call<ResponseBody> getNullUnixTime();

    }

    /**
     * Get null Int value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the int object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Integer> getNull() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getNull();
        return getNullDelegate(call.execute());
    }

    /**
     * Get null Int value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<Integer> getNullAsync(final ServiceCallback<Integer> serviceCallback) {
        Call<ResponseBody> call = service.getNull();
        final ServiceCall<Integer> serviceCall = new ServiceCall<>(call);
        call.enqueue(new ServiceResponseCallback<Integer>(serviceCall, serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponse<Integer> clientResponse = getNullDelegate(response);
                    if (serviceCallback != null) {
                        serviceCallback.success(clientResponse);
                    }
                    serviceCall.success(clientResponse);
                } catch (ErrorException | IOException exception) {
                    if (serviceCallback != null) {
                        serviceCallback.failure(exception);
                    }
                    serviceCall.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Integer> getNullDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Integer, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Integer>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get invalid Int value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the int object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Integer> getInvalid() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getInvalid();
        return getInvalidDelegate(call.execute());
    }

    /**
     * Get invalid Int value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<Integer> getInvalidAsync(final ServiceCallback<Integer> serviceCallback) {
        Call<ResponseBody> call = service.getInvalid();
        final ServiceCall<Integer> serviceCall = new ServiceCall<>(call);
        call.enqueue(new ServiceResponseCallback<Integer>(serviceCall, serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponse<Integer> clientResponse = getInvalidDelegate(response);
                    if (serviceCallback != null) {
                        serviceCallback.success(clientResponse);
                    }
                    serviceCall.success(clientResponse);
                } catch (ErrorException | IOException exception) {
                    if (serviceCallback != null) {
                        serviceCallback.failure(exception);
                    }
                    serviceCall.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Integer> getInvalidDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Integer, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Integer>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get overflow Int32 value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the int object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Integer> getOverflowInt32() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getOverflowInt32();
        return getOverflowInt32Delegate(call.execute());
    }

    /**
     * Get overflow Int32 value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<Integer> getOverflowInt32Async(final ServiceCallback<Integer> serviceCallback) {
        Call<ResponseBody> call = service.getOverflowInt32();
        final ServiceCall<Integer> serviceCall = new ServiceCall<>(call);
        call.enqueue(new ServiceResponseCallback<Integer>(serviceCall, serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponse<Integer> clientResponse = getOverflowInt32Delegate(response);
                    if (serviceCallback != null) {
                        serviceCallback.success(clientResponse);
                    }
                    serviceCall.success(clientResponse);
                } catch (ErrorException | IOException exception) {
                    if (serviceCallback != null) {
                        serviceCallback.failure(exception);
                    }
                    serviceCall.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Integer> getOverflowInt32Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Integer, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Integer>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get underflow Int32 value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the int object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Integer> getUnderflowInt32() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getUnderflowInt32();
        return getUnderflowInt32Delegate(call.execute());
    }

    /**
     * Get underflow Int32 value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<Integer> getUnderflowInt32Async(final ServiceCallback<Integer> serviceCallback) {
        Call<ResponseBody> call = service.getUnderflowInt32();
        final ServiceCall<Integer> serviceCall = new ServiceCall<>(call);
        call.enqueue(new ServiceResponseCallback<Integer>(serviceCall, serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponse<Integer> clientResponse = getUnderflowInt32Delegate(response);
                    if (serviceCallback != null) {
                        serviceCallback.success(clientResponse);
                    }
                    serviceCall.success(clientResponse);
                } catch (ErrorException | IOException exception) {
                    if (serviceCallback != null) {
                        serviceCallback.failure(exception);
                    }
                    serviceCall.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Integer> getUnderflowInt32Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Integer, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Integer>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get overflow Int64 value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the long object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Long> getOverflowInt64() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getOverflowInt64();
        return getOverflowInt64Delegate(call.execute());
    }

    /**
     * Get overflow Int64 value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<Long> getOverflowInt64Async(final ServiceCallback<Long> serviceCallback) {
        Call<ResponseBody> call = service.getOverflowInt64();
        final ServiceCall<Long> serviceCall = new ServiceCall<>(call);
        call.enqueue(new ServiceResponseCallback<Long>(serviceCall, serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponse<Long> clientResponse = getOverflowInt64Delegate(response);
                    if (serviceCallback != null) {
                        serviceCallback.success(clientResponse);
                    }
                    serviceCall.success(clientResponse);
                } catch (ErrorException | IOException exception) {
                    if (serviceCallback != null) {
                        serviceCallback.failure(exception);
                    }
                    serviceCall.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Long> getOverflowInt64Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Long, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Long>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get underflow Int64 value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the long object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Long> getUnderflowInt64() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getUnderflowInt64();
        return getUnderflowInt64Delegate(call.execute());
    }

    /**
     * Get underflow Int64 value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<Long> getUnderflowInt64Async(final ServiceCallback<Long> serviceCallback) {
        Call<ResponseBody> call = service.getUnderflowInt64();
        final ServiceCall<Long> serviceCall = new ServiceCall<>(call);
        call.enqueue(new ServiceResponseCallback<Long>(serviceCall, serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponse<Long> clientResponse = getUnderflowInt64Delegate(response);
                    if (serviceCallback != null) {
                        serviceCallback.success(clientResponse);
                    }
                    serviceCall.success(clientResponse);
                } catch (ErrorException | IOException exception) {
                    if (serviceCallback != null) {
                        serviceCallback.failure(exception);
                    }
                    serviceCall.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Long> getUnderflowInt64Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Long, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Long>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put max int32 value.
     *
     * @param intBody the int value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putMax32(int intBody) throws ErrorException, IOException {
        Call<ResponseBody> call = service.putMax32(intBody);
        return putMax32Delegate(call.execute());
    }

    /**
     * Put max int32 value.
     *
     * @param intBody the int value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<Void> putMax32Async(int intBody, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.putMax32(intBody);
        final ServiceCall<Void> serviceCall = new ServiceCall<>(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCall, serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponse<Void> clientResponse = putMax32Delegate(response);
                    if (serviceCallback != null) {
                        serviceCallback.success(clientResponse);
                    }
                    serviceCall.success(clientResponse);
                } catch (ErrorException | IOException exception) {
                    if (serviceCallback != null) {
                        serviceCallback.failure(exception);
                    }
                    serviceCall.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> putMax32Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put max int64 value.
     *
     * @param intBody the long value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putMax64(long intBody) throws ErrorException, IOException {
        Call<ResponseBody> call = service.putMax64(intBody);
        return putMax64Delegate(call.execute());
    }

    /**
     * Put max int64 value.
     *
     * @param intBody the long value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<Void> putMax64Async(long intBody, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.putMax64(intBody);
        final ServiceCall<Void> serviceCall = new ServiceCall<>(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCall, serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponse<Void> clientResponse = putMax64Delegate(response);
                    if (serviceCallback != null) {
                        serviceCallback.success(clientResponse);
                    }
                    serviceCall.success(clientResponse);
                } catch (ErrorException | IOException exception) {
                    if (serviceCallback != null) {
                        serviceCallback.failure(exception);
                    }
                    serviceCall.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> putMax64Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put min int32 value.
     *
     * @param intBody the int value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putMin32(int intBody) throws ErrorException, IOException {
        Call<ResponseBody> call = service.putMin32(intBody);
        return putMin32Delegate(call.execute());
    }

    /**
     * Put min int32 value.
     *
     * @param intBody the int value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<Void> putMin32Async(int intBody, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.putMin32(intBody);
        final ServiceCall<Void> serviceCall = new ServiceCall<>(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCall, serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponse<Void> clientResponse = putMin32Delegate(response);
                    if (serviceCallback != null) {
                        serviceCallback.success(clientResponse);
                    }
                    serviceCall.success(clientResponse);
                } catch (ErrorException | IOException exception) {
                    if (serviceCallback != null) {
                        serviceCallback.failure(exception);
                    }
                    serviceCall.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> putMin32Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put min int64 value.
     *
     * @param intBody the long value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putMin64(long intBody) throws ErrorException, IOException {
        Call<ResponseBody> call = service.putMin64(intBody);
        return putMin64Delegate(call.execute());
    }

    /**
     * Put min int64 value.
     *
     * @param intBody the long value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<Void> putMin64Async(long intBody, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.putMin64(intBody);
        final ServiceCall<Void> serviceCall = new ServiceCall<>(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCall, serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponse<Void> clientResponse = putMin64Delegate(response);
                    if (serviceCallback != null) {
                        serviceCallback.success(clientResponse);
                    }
                    serviceCall.success(clientResponse);
                } catch (ErrorException | IOException exception) {
                    if (serviceCallback != null) {
                        serviceCallback.failure(exception);
                    }
                    serviceCall.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> putMin64Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get datetime encoded as Unix time value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DateTime object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<DateTime> getUnixTime() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getUnixTime();
        ServiceResponse<Long> response = getUnixTimeDelegate(call.execute());
        DateTime body = null;
        if (response.getBody() != null) {
            body = new DateTime(response.getBody() * 1000L, DateTimeZone.UTC);
        }
        return new ServiceResponse<DateTime>(body, response.getResponse());
    }

    /**
     * Get datetime encoded as Unix time value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<DateTime> getUnixTimeAsync(final ServiceCallback<DateTime> serviceCallback) {
        Call<ResponseBody> call = service.getUnixTime();
        final ServiceCall<DateTime> serviceCall = new ServiceCall<>(call);
        call.enqueue(new ServiceResponseCallback<DateTime>(serviceCall, serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponse<Long> result = getUnixTimeDelegate(response);
                    DateTime body = null;
                    if (result.getBody() != null) {
                        body = new DateTime(result.getBody() * 1000L, DateTimeZone.UTC);
                    }
                    ServiceResponse<DateTime> clientResponse = new ServiceResponse<DateTime>(body, result.getResponse());
                    if (serviceCallback != null) {
                        serviceCallback.success(clientResponse);
                    }
                    serviceCall.success(clientResponse);
                } catch (ErrorException | IOException exception) {
                    if (serviceCallback != null) {
                        serviceCallback.failure(exception);
                    }
                    serviceCall.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Long> getUnixTimeDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Long, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Long>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put datetime encoded as Unix time.
     *
     * @param intBody the long value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putUnixTimeDate(DateTime intBody) throws ErrorException, IOException {
        Long intBodyConverted = intBody.toDateTime(DateTimeZone.UTC).getMillis() / 1000;
        Call<ResponseBody> call = service.putUnixTimeDate(intBodyConverted);
        return putUnixTimeDateDelegate(call.execute());
    }

    /**
     * Put datetime encoded as Unix time.
     *
     * @param intBody the long value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<Void> putUnixTimeDateAsync(DateTime intBody, final ServiceCallback<Void> serviceCallback) {
        Long intBodyConverted = intBody.toDateTime(DateTimeZone.UTC).getMillis() / 1000;
        Call<ResponseBody> call = service.putUnixTimeDate(intBodyConverted);
        final ServiceCall<Void> serviceCall = new ServiceCall<>(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCall, serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponse<Void> clientResponse = putUnixTimeDateDelegate(response);
                    if (serviceCallback != null) {
                        serviceCallback.success(clientResponse);
                    }
                    serviceCall.success(clientResponse);
                } catch (ErrorException | IOException exception) {
                    if (serviceCallback != null) {
                        serviceCallback.failure(exception);
                    }
                    serviceCall.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> putUnixTimeDateDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get invalid Unix time value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DateTime object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<DateTime> getInvalidUnixTime() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getInvalidUnixTime();
        ServiceResponse<Long> response = getInvalidUnixTimeDelegate(call.execute());
        DateTime body = null;
        if (response.getBody() != null) {
            body = new DateTime(response.getBody() * 1000L, DateTimeZone.UTC);
        }
        return new ServiceResponse<DateTime>(body, response.getResponse());
    }

    /**
     * Get invalid Unix time value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<DateTime> getInvalidUnixTimeAsync(final ServiceCallback<DateTime> serviceCallback) {
        Call<ResponseBody> call = service.getInvalidUnixTime();
        final ServiceCall<DateTime> serviceCall = new ServiceCall<>(call);
        call.enqueue(new ServiceResponseCallback<DateTime>(serviceCall, serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponse<Long> result = getInvalidUnixTimeDelegate(response);
                    DateTime body = null;
                    if (result.getBody() != null) {
                        body = new DateTime(result.getBody() * 1000L, DateTimeZone.UTC);
                    }
                    ServiceResponse<DateTime> clientResponse = new ServiceResponse<DateTime>(body, result.getResponse());
                    if (serviceCallback != null) {
                        serviceCallback.success(clientResponse);
                    }
                    serviceCall.success(clientResponse);
                } catch (ErrorException | IOException exception) {
                    if (serviceCallback != null) {
                        serviceCallback.failure(exception);
                    }
                    serviceCall.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Long> getInvalidUnixTimeDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Long, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Long>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get null Unix time value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DateTime object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<DateTime> getNullUnixTime() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getNullUnixTime();
        ServiceResponse<Long> response = getNullUnixTimeDelegate(call.execute());
        DateTime body = null;
        if (response.getBody() != null) {
            body = new DateTime(response.getBody() * 1000L, DateTimeZone.UTC);
        }
        return new ServiceResponse<DateTime>(body, response.getResponse());
    }

    /**
     * Get null Unix time value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<DateTime> getNullUnixTimeAsync(final ServiceCallback<DateTime> serviceCallback) {
        Call<ResponseBody> call = service.getNullUnixTime();
        final ServiceCall<DateTime> serviceCall = new ServiceCall<>(call);
        call.enqueue(new ServiceResponseCallback<DateTime>(serviceCall, serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponse<Long> result = getNullUnixTimeDelegate(response);
                    DateTime body = null;
                    if (result.getBody() != null) {
                        body = new DateTime(result.getBody() * 1000L, DateTimeZone.UTC);
                    }
                    ServiceResponse<DateTime> clientResponse = new ServiceResponse<DateTime>(body, result.getResponse());
                    if (serviceCallback != null) {
                        serviceCallback.success(clientResponse);
                    }
                    serviceCall.success(clientResponse);
                } catch (ErrorException | IOException exception) {
                    if (serviceCallback != null) {
                        serviceCallback.failure(exception);
                    }
                    serviceCall.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Long> getNullUnixTimeDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Long, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Long>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
