/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
 */

package live.ding.dingSdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateAuthenticationRequest {
    /**
     * The Android SMS Retriever API hash code that identifies your app. This allows you to automatically retrieve and fill the OTP code on Android devices.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("app_realm")
    public String appRealm;

    public CreateAuthenticationRequest withAppRealm(String appRealm) {
        this.appRealm = appRealm;
        return this;
    }
    
    /**
     * The version of your application.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("app_version")
    public String appVersion;

    public CreateAuthenticationRequest withAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    
    /**
     * A webhook URL to which delivery statuses will be sent.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("callback_url")
    public String callbackUrl;

    public CreateAuthenticationRequest withCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    
    /**
     * A unique, user-defined identifier that will be included in webhook events
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("correlation_id")
    public String correlationId;

    public CreateAuthenticationRequest withCorrelationId(String correlationId) {
        this.correlationId = correlationId;
        return this;
    }
    
    /**
     * Your customer UUID, which can be found in the API settings in the dashboard.
     */
    @JsonProperty("customer_uuid")
    public String customerUuid;

    public CreateAuthenticationRequest withCustomerUuid(String customerUuid) {
        this.customerUuid = customerUuid;
        return this;
    }
    
    /**
     * Unique identifier for the user's device. For Android, this corresponds to the `ANDROID_ID` and for iOS, this corresponds to the `identifierForVendor`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("device_id")
    public String deviceId;

    public CreateAuthenticationRequest withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    
    /**
     * The model of the user's device.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("device_model")
    public String deviceModel;

    public CreateAuthenticationRequest withDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    
    /**
     * The type of device the user is using.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("device_type")
    public DeviceType deviceType;

    public CreateAuthenticationRequest withDeviceType(DeviceType deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    
    /**
     * The IP address of the user's device.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ip")
    public String ip;

    public CreateAuthenticationRequest withIp(String ip) {
        this.ip = ip;
        return this;
    }
    
    /**
     * Whether the user is a returning user on your app.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_returning_user")
    public Boolean isReturningUser;

    public CreateAuthenticationRequest withIsReturningUser(Boolean isReturningUser) {
        this.isReturningUser = isReturningUser;
        return this;
    }
    
    /**
     * The version of the user's device operating system.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("os_version")
    public String osVersion;

    public CreateAuthenticationRequest withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }
    
    /**
     * An E.164 formatted phone number to send the OTP to.
     */
    @JsonProperty("phone_number")
    public String phoneNumber;

    public CreateAuthenticationRequest withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    
    /**
     * The template id associated with the message content variant to be sent.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("template_id")
    public String templateId;

    public CreateAuthenticationRequest withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    
    public CreateAuthenticationRequest(@JsonProperty("customer_uuid") String customerUuid, @JsonProperty("phone_number") String phoneNumber) {
        this.customerUuid = customerUuid;
        this.phoneNumber = phoneNumber;
  }
}
