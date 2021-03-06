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
import fixtures.bodyinteger.models.ErrorException;
import java.io.IOException;
import okhttp3.ResponseBody;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

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
        Observable<Response<ResponseBody>> getNull();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("int/invalid")
        Observable<Response<ResponseBody>> getInvalid();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("int/overflowint32")
        Observable<Response<ResponseBody>> getOverflowInt32();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("int/underflowint32")
        Observable<Response<ResponseBody>> getUnderflowInt32();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("int/overflowint64")
        Observable<Response<ResponseBody>> getOverflowInt64();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("int/underflowint64")
        Observable<Response<ResponseBody>> getUnderflowInt64();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("int/max/32")
        Observable<Response<ResponseBody>> putMax32(@Body int intBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("int/max/64")
        Observable<Response<ResponseBody>> putMax64(@Body long intBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("int/min/32")
        Observable<Response<ResponseBody>> putMin32(@Body int intBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("int/min/64")
        Observable<Response<ResponseBody>> putMin64(@Body long intBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("int/unixtime")
        Observable<Response<ResponseBody>> getUnixTime();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("int/unixtime")
        Observable<Response<ResponseBody>> putUnixTimeDate(@Body long intBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("int/invalidunixtime")
        Observable<Response<ResponseBody>> getInvalidUnixTime();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("int/nullunixtime")
        Observable<Response<ResponseBody>> getNullUnixTime();

    }

    /**
     * Get null Int value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the int object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Integer> getNull() throws ErrorException, IOException {
        return getNullAsync().toBlocking().single();
    }

    /**
     * Get null Int value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Integer> getNullAsync(final ServiceCallback<Integer> serviceCallback) {
        return ServiceCall.create(getNullAsync(), serviceCallback);
    }

    /**
     * Get null Int value.
     *
     * @return the observable to the int object
     */
    public Observable<ServiceResponse<Integer>> getNullAsync() {
        return service.getNull()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Integer>>>() {
                @Override
                public Observable<ServiceResponse<Integer>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Integer> clientResponse = getNullDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
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
        return getInvalidAsync().toBlocking().single();
    }

    /**
     * Get invalid Int value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Integer> getInvalidAsync(final ServiceCallback<Integer> serviceCallback) {
        return ServiceCall.create(getInvalidAsync(), serviceCallback);
    }

    /**
     * Get invalid Int value.
     *
     * @return the observable to the int object
     */
    public Observable<ServiceResponse<Integer>> getInvalidAsync() {
        return service.getInvalid()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Integer>>>() {
                @Override
                public Observable<ServiceResponse<Integer>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Integer> clientResponse = getInvalidDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
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
        return getOverflowInt32Async().toBlocking().single();
    }

    /**
     * Get overflow Int32 value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Integer> getOverflowInt32Async(final ServiceCallback<Integer> serviceCallback) {
        return ServiceCall.create(getOverflowInt32Async(), serviceCallback);
    }

    /**
     * Get overflow Int32 value.
     *
     * @return the observable to the int object
     */
    public Observable<ServiceResponse<Integer>> getOverflowInt32Async() {
        return service.getOverflowInt32()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Integer>>>() {
                @Override
                public Observable<ServiceResponse<Integer>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Integer> clientResponse = getOverflowInt32Delegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
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
        return getUnderflowInt32Async().toBlocking().single();
    }

    /**
     * Get underflow Int32 value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Integer> getUnderflowInt32Async(final ServiceCallback<Integer> serviceCallback) {
        return ServiceCall.create(getUnderflowInt32Async(), serviceCallback);
    }

    /**
     * Get underflow Int32 value.
     *
     * @return the observable to the int object
     */
    public Observable<ServiceResponse<Integer>> getUnderflowInt32Async() {
        return service.getUnderflowInt32()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Integer>>>() {
                @Override
                public Observable<ServiceResponse<Integer>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Integer> clientResponse = getUnderflowInt32Delegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
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
        return getOverflowInt64Async().toBlocking().single();
    }

    /**
     * Get overflow Int64 value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Long> getOverflowInt64Async(final ServiceCallback<Long> serviceCallback) {
        return ServiceCall.create(getOverflowInt64Async(), serviceCallback);
    }

    /**
     * Get overflow Int64 value.
     *
     * @return the observable to the long object
     */
    public Observable<ServiceResponse<Long>> getOverflowInt64Async() {
        return service.getOverflowInt64()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Long>>>() {
                @Override
                public Observable<ServiceResponse<Long>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Long> clientResponse = getOverflowInt64Delegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
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
        return getUnderflowInt64Async().toBlocking().single();
    }

    /**
     * Get underflow Int64 value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Long> getUnderflowInt64Async(final ServiceCallback<Long> serviceCallback) {
        return ServiceCall.create(getUnderflowInt64Async(), serviceCallback);
    }

    /**
     * Get underflow Int64 value.
     *
     * @return the observable to the long object
     */
    public Observable<ServiceResponse<Long>> getUnderflowInt64Async() {
        return service.getUnderflowInt64()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Long>>>() {
                @Override
                public Observable<ServiceResponse<Long>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Long> clientResponse = getUnderflowInt64Delegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
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
        return putMax32Async(intBody).toBlocking().single();
    }

    /**
     * Put max int32 value.
     *
     * @param intBody the int value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> putMax32Async(int intBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(putMax32Async(intBody), serviceCallback);
    }

    /**
     * Put max int32 value.
     *
     * @param intBody the int value
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putMax32Async(int intBody) {
        return service.putMax32(intBody)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putMax32Delegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
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
        return putMax64Async(intBody).toBlocking().single();
    }

    /**
     * Put max int64 value.
     *
     * @param intBody the long value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> putMax64Async(long intBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(putMax64Async(intBody), serviceCallback);
    }

    /**
     * Put max int64 value.
     *
     * @param intBody the long value
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putMax64Async(long intBody) {
        return service.putMax64(intBody)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putMax64Delegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
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
        return putMin32Async(intBody).toBlocking().single();
    }

    /**
     * Put min int32 value.
     *
     * @param intBody the int value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> putMin32Async(int intBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(putMin32Async(intBody), serviceCallback);
    }

    /**
     * Put min int32 value.
     *
     * @param intBody the int value
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putMin32Async(int intBody) {
        return service.putMin32(intBody)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putMin32Delegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
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
        return putMin64Async(intBody).toBlocking().single();
    }

    /**
     * Put min int64 value.
     *
     * @param intBody the long value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> putMin64Async(long intBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(putMin64Async(intBody), serviceCallback);
    }

    /**
     * Put min int64 value.
     *
     * @param intBody the long value
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putMin64Async(long intBody) {
        return service.putMin64(intBody)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putMin64Delegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
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
        return getUnixTimeAsync().toBlocking().single();
    }

    /**
     * Get datetime encoded as Unix time value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<DateTime> getUnixTimeAsync(final ServiceCallback<DateTime> serviceCallback) {
        return ServiceCall.create(getUnixTimeAsync(), serviceCallback);
    }

    /**
     * Get datetime encoded as Unix time value.
     *
     * @return the observable to the DateTime object
     */
    public Observable<ServiceResponse<DateTime>> getUnixTimeAsync() {
        return service.getUnixTime()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DateTime>>>() {
                @Override
                public Observable<ServiceResponse<DateTime>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Long> result = getUnixTimeDelegate(response);
                        DateTime body = null;
                        if (result.getBody() != null) {
                            body = new DateTime(result.getBody() * 1000L, DateTimeZone.UTC);
                        }
                        ServiceResponse<DateTime> clientResponse = new ServiceResponse<DateTime>(body, result.getResponse());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
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
        return putUnixTimeDateAsync(intBody).toBlocking().single();
    }

    /**
     * Put datetime encoded as Unix time.
     *
     * @param intBody the long value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> putUnixTimeDateAsync(DateTime intBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(putUnixTimeDateAsync(intBody), serviceCallback);
    }

    /**
     * Put datetime encoded as Unix time.
     *
     * @param intBody the long value
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putUnixTimeDateAsync(DateTime intBody) {
        Long intBodyConverted = intBody.toDateTime(DateTimeZone.UTC).getMillis() / 1000;
        return service.putUnixTimeDate(intBodyConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putUnixTimeDateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
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
        return getInvalidUnixTimeAsync().toBlocking().single();
    }

    /**
     * Get invalid Unix time value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<DateTime> getInvalidUnixTimeAsync(final ServiceCallback<DateTime> serviceCallback) {
        return ServiceCall.create(getInvalidUnixTimeAsync(), serviceCallback);
    }

    /**
     * Get invalid Unix time value.
     *
     * @return the observable to the DateTime object
     */
    public Observable<ServiceResponse<DateTime>> getInvalidUnixTimeAsync() {
        return service.getInvalidUnixTime()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DateTime>>>() {
                @Override
                public Observable<ServiceResponse<DateTime>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Long> result = getInvalidUnixTimeDelegate(response);
                        DateTime body = null;
                        if (result.getBody() != null) {
                            body = new DateTime(result.getBody() * 1000L, DateTimeZone.UTC);
                        }
                        ServiceResponse<DateTime> clientResponse = new ServiceResponse<DateTime>(body, result.getResponse());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
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
        return getNullUnixTimeAsync().toBlocking().single();
    }

    /**
     * Get null Unix time value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<DateTime> getNullUnixTimeAsync(final ServiceCallback<DateTime> serviceCallback) {
        return ServiceCall.create(getNullUnixTimeAsync(), serviceCallback);
    }

    /**
     * Get null Unix time value.
     *
     * @return the observable to the DateTime object
     */
    public Observable<ServiceResponse<DateTime>> getNullUnixTimeAsync() {
        return service.getNullUnixTime()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DateTime>>>() {
                @Override
                public Observable<ServiceResponse<DateTime>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Long> result = getNullUnixTimeDelegate(response);
                        DateTime body = null;
                        if (result.getBody() != null) {
                            body = new DateTime(result.getBody() * 1000L, DateTimeZone.UTC);
                        }
                        ServiceResponse<DateTime> clientResponse = new ServiceResponse<DateTime>(body, result.getResponse());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Long> getNullUnixTimeDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Long, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Long>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
