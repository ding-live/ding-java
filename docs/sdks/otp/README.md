# Otp
(*otp*)

## Overview

Send OTP codes to your users using their phone numbers.

### Available Operations

* [check](#check) - Check an authentication code
* [createAutentication](#createautentication) - Create an authentication
* [retry](#retry) - Retry an authentication

## check

Check an authentication code

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
                .setSecurity(new Security("YOUR_API_KEY"){{
                    apiKey = "YOUR_API_KEY";
                }})
                .build();

            live.ding.dingSdk.models.shared.CreateCheckRequest req = new CreateCheckRequest("e0e7b0e9-739d-424b-922f-1c2cb48ab077", "123456", "8f1196d5-806e-4b71-9b24-5f96ec052808");            

            CheckResponse res = sdk.otp.check(req);

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


## createAutentication

Create an authentication

### Example Usage

```java
package hello.world;

import live.ding.dingSdk.Ding;
import live.ding.dingSdk.models.operations.CreateAutenticationResponse;
import live.ding.dingSdk.models.shared.CreateAuthenticationRequest;
import live.ding.dingSdk.models.shared.DeviceType;
import live.ding.dingSdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ding sdk = Ding.builder()
                .setSecurity(new Security("YOUR_API_KEY"){{
                    apiKey = "YOUR_API_KEY";
                }})
                .build();

            live.ding.dingSdk.models.shared.CreateAuthenticationRequest req = new CreateAuthenticationRequest("eae192ab-9e1e-4b21-b5b1-bfcb79a32fcc", "+1234567890"){{
                appRealm = "string";
                appVersion = "string";
                callbackUrl = "http://silly-credit.name";
                deviceId = "string";
                deviceModel = "string";
                deviceType = DeviceType.WEB;
                ip = "97.139.118.123";
                isReturningUser = false;
                osVersion = "string";
            }};            

            CreateAutenticationResponse res = sdk.otp.createAutentication(req);

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

**[live.ding.dingSdk.models.operations.CreateAutenticationResponse](../../models/operations/CreateAutenticationResponse.md)**


## retry

Retry an authentication

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
                .setSecurity(new Security("YOUR_API_KEY"){{
                    apiKey = "YOUR_API_KEY";
                }})
                .build();

            live.ding.dingSdk.models.shared.RetryAuthenticationRequest req = new RetryAuthenticationRequest("a74ee547-564d-487a-91df-37fb25413a91", "3c8b3a46-881e-4cdd-93a6-f7f238bf020a");            

            RetryResponse res = sdk.otp.retry(req);

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
