/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodybyte;

import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import fixtures.bodybyte.models.ErrorException;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Bytes.
 */
public interface Bytes {
    /**
     * Get null byte value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the byte[] object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<byte[]> getNull() throws ErrorException, IOException;

    /**
     * Get null byte value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<byte[]> getNullAsync(final ServiceCallback<byte[]> serviceCallback);

    /**
     * Get null byte value.
     *
     * @return the observable to the byte[] object
     */
    Observable<ServiceResponse<byte[]>> getNullAsync();

    /**
     * Get empty byte value ''.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the byte[] object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<byte[]> getEmpty() throws ErrorException, IOException;

    /**
     * Get empty byte value ''.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<byte[]> getEmptyAsync(final ServiceCallback<byte[]> serviceCallback);

    /**
     * Get empty byte value ''.
     *
     * @return the observable to the byte[] object
     */
    Observable<ServiceResponse<byte[]>> getEmptyAsync();

    /**
     * Get non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the byte[] object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<byte[]> getNonAscii() throws ErrorException, IOException;

    /**
     * Get non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<byte[]> getNonAsciiAsync(final ServiceCallback<byte[]> serviceCallback);

    /**
     * Get non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     *
     * @return the observable to the byte[] object
     */
    Observable<ServiceResponse<byte[]>> getNonAsciiAsync();

    /**
     * Put non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     *
     * @param byteBody Base64-encoded non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6)
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putNonAscii(byte[] byteBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     *
     * @param byteBody Base64-encoded non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putNonAsciiAsync(byte[] byteBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     *
     * @param byteBody Base64-encoded non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6)
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putNonAsciiAsync(byte[] byteBody);

    /**
     * Get invalid byte value ':::SWAGGER::::'.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the byte[] object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<byte[]> getInvalid() throws ErrorException, IOException;

    /**
     * Get invalid byte value ':::SWAGGER::::'.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<byte[]> getInvalidAsync(final ServiceCallback<byte[]> serviceCallback);

    /**
     * Get invalid byte value ':::SWAGGER::::'.
     *
     * @return the observable to the byte[] object
     */
    Observable<ServiceResponse<byte[]>> getInvalidAsync();

}
