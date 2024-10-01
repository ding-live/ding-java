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
import live.ding.dingSdk.models.errors.ErrorResponse;
import live.ding.dingSdk.models.operations.CheckResponse;
import live.ding.dingSdk.models.shared.CreateCheckRequest;
import live.ding.dingSdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        Ding sdk = Ding.builder()
                .security(Security.builder()
                    .apiKey("YOUR_API_KEY")
                    .build())
            .build();

        CreateCheckRequest req = CreateCheckRequest.builder()
                .authenticationUuid("eebe792b-2fcc-44a0-87f1-650e79259e02")
                .checkCode("123456")
                .customerUuid("64f66a7c-4b2c-4131-a8ff-d5b954cca05f")
                .build();

        CheckResponse res = sdk.otp().check()
                .request(req)
                .call();

        if (res.createCheckResponse().isPresent()) {
            // handle response
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

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400                         | application/json            |
| models/errors/SDKError      | 4XX, 5XX                    | \*/\*                       |

## createAuthentication

Send a code

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import live.ding.dingSdk.Ding;
import live.ding.dingSdk.models.errors.ErrorResponse;
import live.ding.dingSdk.models.operations.CreateAuthenticationResponse;
import live.ding.dingSdk.models.shared.CreateAuthenticationRequest;
import live.ding.dingSdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        Ding sdk = Ding.builder()
                .security(Security.builder()
                    .apiKey("YOUR_API_KEY")
                    .build())
            .build();

        CreateAuthenticationRequest req = CreateAuthenticationRequest.builder()
                .customerUuid("cf2edc1c-7fc6-48fb-86da-b7508c6b7b71")
                .phoneNumber("+1234567890")
                .build();

        CreateAuthenticationResponse res = sdk.otp().createAuthentication()
                .request(req)
                .call();

        if (res.createAuthenticationResponse().isPresent()) {
            // handle response
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

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400                         | application/json            |
| models/errors/SDKError      | 4XX, 5XX                    | \*/\*                       |

## feedback

Send feedback

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import live.ding.dingSdk.Ding;
import live.ding.dingSdk.models.operations.FeedbackResponse;
import live.ding.dingSdk.models.shared.FeedbackRequest;
import live.ding.dingSdk.models.shared.FeedbackRequestStatus;
import live.ding.dingSdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        Ding sdk = Ding.builder()
                .security(Security.builder()
                    .apiKey("YOUR_API_KEY")
                    .build())
            .build();

        FeedbackRequest req = FeedbackRequest.builder()
                .customerUuid("cc0f6c04-40de-448f-8301-3cb0e6565dff")
                .phoneNumber("+1234567890")
                .status(FeedbackRequestStatus.ONBOARDED)
                .build();

        FeedbackResponse res = sdk.otp().feedback()
                .request(req)
                .call();

        if (res.feedbackResponse().isPresent()) {
            // handle response
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

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## retry

Perform a retry

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import live.ding.dingSdk.Ding;
import live.ding.dingSdk.models.errors.ErrorResponse1;
import live.ding.dingSdk.models.operations.RetryResponse;
import live.ding.dingSdk.models.shared.RetryAuthenticationRequest;
import live.ding.dingSdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws ErrorResponse1, Exception {

        Ding sdk = Ding.builder()
                .security(Security.builder()
                    .apiKey("YOUR_API_KEY")
                    .build())
            .build();

        RetryAuthenticationRequest req = RetryAuthenticationRequest.builder()
                .authenticationUuid("a4e4548a-1f7b-451a-81cb-a68ed5aff3b0")
                .customerUuid("28532118-1b33-420a-b57b-648c9bf85fee")
                .build();

        RetryResponse res = sdk.otp().retry()
                .request(req)
                .call();

        if (res.retryAuthenticationResponse().isPresent()) {
            // handle response
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

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| models/errors/ErrorResponse1 | 400                          | application/json             |
| models/errors/SDKError       | 4XX, 5XX                     | \*/\*                        |