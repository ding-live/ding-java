# Otp
(*otp*)

## Overview

Send OTP codes to your users using their phone numbers.

### Available Operations

* [check](#check) - Check a code
* [createAuthentication](#createauthentication) - Send a code
* [feedback](#feedback) - Send feedback
* [retry](#retry) - Perform a retry

## check

Check a code

### Example Usage

```java
package hello.world;

import live.ding.dingSdk.Ding;
import live.ding.dingSdk.models.operations.CheckResponse;
import live.ding.dingSdk.models.shared.CreateCheckRequest;
import live.ding.dingSdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ding sdk = Ding.builder()
                .setSecurity(new Security(
                "YOUR_API_KEY"){{
                    apiKey = "YOUR_API_KEY";
                }})
                .build();

            live.ding.dingSdk.models.shared.CreateCheckRequest req = new CreateCheckRequest(
                "e0e7b0e9-739d-424b-922f-1c2cb48ab077",
                "123456",
                "8f1196d5-806e-4b71-9b24-5f96ec052808");

            live.ding.dingSdk.models.operations.CheckResponse res = sdk.otp.check(req);

            if (res.createCheckResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [live.ding.dingSdk.models.shared.CreateCheckRequest](../../models/shared/CreateCheckRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |


### Response

**[live.ding.dingSdk.models.operations.CheckResponse](../../models/operations/CheckResponse.md)**


## createAuthentication

Send a code

### Example Usage

```java
package hello.world;

import live.ding.dingSdk.Ding;
import live.ding.dingSdk.models.operations.CreateAuthenticationResponse;
import live.ding.dingSdk.models.shared.CreateAuthenticationRequest;
import live.ding.dingSdk.models.shared.DeviceType;
import live.ding.dingSdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ding sdk = Ding.builder()
                .setSecurity(new Security(
                "YOUR_API_KEY"){{
                    apiKey = "YOUR_API_KEY";
                }})
                .build();

            live.ding.dingSdk.models.shared.CreateAuthenticationRequest req = new CreateAuthenticationRequest(
                "c9f826e0-deca-41ec-871f-ecd6e8efeb46",
                "+1234567890"){{
                appRealm = "<value>";
                appVersion = "<value>";
                callbackUrl = "https://thin-television.name";
                deviceId = "<value>";
                deviceModel = "<value>";
                deviceType = DeviceType.ANDROID;
                ip = "176.157.112.67";
                isReturningUser = false;
                osVersion = "<value>";
                templateId = "<value>";

            }};

            live.ding.dingSdk.models.operations.CreateAuthenticationResponse res = sdk.otp.createAuthentication(req);

            if (res.createAuthenticationResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [live.ding.dingSdk.models.shared.CreateAuthenticationRequest](../../models/shared/CreateAuthenticationRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |


### Response

**[live.ding.dingSdk.models.operations.CreateAuthenticationResponse](../../models/operations/CreateAuthenticationResponse.md)**


## feedback

Send feedback

### Example Usage

```java
package hello.world;

import live.ding.dingSdk.Ding;
import live.ding.dingSdk.models.operations.FeedbackResponse;
import live.ding.dingSdk.models.shared.FeedbackRequest;
import live.ding.dingSdk.models.shared.FeedbackRequestStatus;
import live.ding.dingSdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ding sdk = Ding.builder()
                .setSecurity(new Security(
                "YOUR_API_KEY"){{
                    apiKey = "YOUR_API_KEY";
                }})
                .build();

            live.ding.dingSdk.models.shared.FeedbackRequest req = new FeedbackRequest(
                "c0c405fa-6bcb-4094-9430-7d6e2428ff23",
                "+1234567890",
                FeedbackRequestStatus.ONBOARDED);

            live.ding.dingSdk.models.operations.FeedbackResponse res = sdk.otp.feedback(req);

            if (res.feedbackResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [live.ding.dingSdk.models.shared.FeedbackRequest](../../models/shared/FeedbackRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |


### Response

**[live.ding.dingSdk.models.operations.FeedbackResponse](../../models/operations/FeedbackResponse.md)**


## retry

Perform a retry

### Example Usage

```java
package hello.world;

import live.ding.dingSdk.Ding;
import live.ding.dingSdk.models.operations.RetryResponse;
import live.ding.dingSdk.models.shared.RetryAuthenticationRequest;
import live.ding.dingSdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ding sdk = Ding.builder()
                .setSecurity(new Security(
                "YOUR_API_KEY"){{
                    apiKey = "YOUR_API_KEY";
                }})
                .build();

            live.ding.dingSdk.models.shared.RetryAuthenticationRequest req = new RetryAuthenticationRequest(
                "a74ee547-564d-487a-91df-37fb25413a91",
                "3c8b3a46-881e-4cdd-93a6-f7f238bf020a");

            live.ding.dingSdk.models.operations.RetryResponse res = sdk.otp.retry(req);

            if (res.retryAuthenticationResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [live.ding.dingSdk.models.shared.RetryAuthenticationRequest](../../models/shared/RetryAuthenticationRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |


### Response

**[live.ding.dingSdk.models.operations.RetryResponse](../../models/operations/RetryResponse.md)**

