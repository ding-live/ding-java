/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package live.ding.dingsdk.models.operations;

import java.lang.String;
import live.ding.dingsdk.utils.Utils;

public class LookupRequestBuilder {

    private String customerUuid;
    private String phoneNumber;
    private final SDKMethodInterfaces.MethodCallLookup sdk;

    public LookupRequestBuilder(SDKMethodInterfaces.MethodCallLookup sdk) {
        this.sdk = sdk;
    }

    public LookupRequestBuilder customerUuid(String customerUuid) {
        Utils.checkNotNull(customerUuid, "customerUuid");
        this.customerUuid = customerUuid;
        return this;
    }

    public LookupRequestBuilder phoneNumber(String phoneNumber) {
        Utils.checkNotNull(phoneNumber, "phoneNumber");
        this.phoneNumber = phoneNumber;
        return this;
    }

    public LookupResponse call() throws Exception {

        return sdk.lookup(
            customerUuid,
            phoneNumber);
    }
}