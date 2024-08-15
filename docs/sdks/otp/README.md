# Otp
(*otp()*)

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

import java.lang.Exception;
import live.ding.dingSdk.Ding;
import live.ding.dingSdk.models.errors.SDKError;
import live.ding.dingSdk.models.operations.CheckResponse;
import live.ding.dingSdk.models.shared.CreateCheckRequest;
import live.ding.dingSdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Ding sdk = Ding.builder()
                .security(Security.builder()
                    .apiKey("YOUR_API_KEY")
                    .build())
                .build();

            CreateCheckRequest req = CreateCheckRequest.builder()
                .authenticationUuid("e0e7b0e9-739d-424b-922f-1c2cb48ab077")
                .checkCode("123456")
                .customerUuid("8f1196d5-806e-4b71-9b24-5f96ec052808")
                .build();

            CheckResponse res = sdk.otp().check()
                .request(req)
                .call();

            if (res.createCheckResponse().isPresent()) {
                // handle response
            }
        } catch (live.ding.dingSdk.models.errors.ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```



### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [CreateCheckRequest](../../models/shared/CreateCheckRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |


### Response

**[CheckResponse](../../models/operations/CheckResponse.md)**
### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400                         | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |

## createAuthentication

Send a code

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import live.ding.dingSdk.Ding;
import live.ding.dingSdk.models.errors.SDKError;
import live.ding.dingSdk.models.operations.CreateAuthenticationResponse;
import live.ding.dingSdk.models.shared.CreateAuthenticationRequest;
import live.ding.dingSdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Ding sdk = Ding.builder()
                .security(Security.builder()
                    .apiKey("YOUR_API_KEY")
                    .build())
                .build();

            CreateAuthenticationRequest req = CreateAuthenticationRequest.builder()
                .customerUuid("c9f826e0-deca-41ec-871f-ecd6e8efeb46")
                .phoneNumber("+1234567890")
                .build();

            CreateAuthenticationResponse res = sdk.otp().createAuthentication()
                .request(req)
                .call();

            if (res.createAuthenticationResponse().isPresent()) {
                // handle response
            }
        } catch (live.ding.dingSdk.models.errors.ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```



### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateAuthenticationRequest](../../models/shared/CreateAuthenticationRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |


### Response

**[CreateAuthenticationResponse](../../models/operations/CreateAuthenticationResponse.md)**
### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400                         | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |

## feedback

Send feedback

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import live.ding.dingSdk.Ding;
import live.ding.dingSdk.models.errors.SDKError;
import live.ding.dingSdk.models.operations.FeedbackResponse;
import live.ding.dingSdk.models.shared.FeedbackRequest;
import live.ding.dingSdk.models.shared.FeedbackRequestStatus;
import live.ding.dingSdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Ding sdk = Ding.builder()
                .security(Security.builder()
                    .apiKey("YOUR_API_KEY")
                    .build())
                .build();

            FeedbackRequest req = FeedbackRequest.builder()
                .customerUuid("c0c405fa-6bcb-4094-9430-7d6e2428ff23")
                .phoneNumber("+1234567890")
                .status(FeedbackRequestStatus.ONBOARDED)
                .build();

            FeedbackResponse res = sdk.otp().feedback()
                .request(req)
                .call();

            if (res.feedbackResponse().isPresent()) {
                // handle response
            }
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```



### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | [FeedbackRequest](../../models/shared/FeedbackRequest.md) | :heavy_check_mark:                                        | The request object to use for the request.                |


### Response

**[FeedbackResponse](../../models/operations/FeedbackResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## retry

Perform a retry

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import live.ding.dingSdk.Ding;
import live.ding.dingSdk.models.errors.SDKError;
import live.ding.dingSdk.models.operations.RetryResponse;
import live.ding.dingSdk.models.shared.RetryAuthenticationRequest;
import live.ding.dingSdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Ding sdk = Ding.builder()
                .security(Security.builder()
                    .apiKey("YOUR_API_KEY")
                    .build())
                .build();

            RetryAuthenticationRequest req = RetryAuthenticationRequest.builder()
                .authenticationUuid("a74ee547-564d-487a-91df-37fb25413a91")
                .customerUuid("3c8b3a46-881e-4cdd-93a6-f7f238bf020a")
                .build();

            RetryResponse res = sdk.otp().retry()
                .request(req)
                .call();

            if (res.retryAuthenticationResponse().isPresent()) {
                // handle response
            }
        } catch (live.ding.dingSdk.models.errors.ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```



### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RetryAuthenticationRequest](../../models/shared/RetryAuthenticationRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |


### Response

**[RetryResponse](../../models/operations/RetryResponse.md)**
### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400                         | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |
