# Otp
(*otp()*)

## Overview

Send OTP codes to your users using their phone numbers.

### Available Operations

* [check](#check) - Check a code
* [createAuthentication](#createauthentication) - Send a code
* [feedback](#feedback) - Send feedback
* [getAuthenticationStatus](#getauthenticationstatus) - Get authentication status
* [retry](#retry) - Perform a retry

## check

Check a code

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import live.ding.dingsdk.Ding;
import live.ding.dingsdk.models.errors.ErrorResponse;
import live.ding.dingsdk.models.operations.CheckResponse;
import live.ding.dingsdk.models.shared.CreateCheckRequest;
import live.ding.dingsdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

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
import live.ding.dingsdk.Ding;
import live.ding.dingsdk.models.errors.ErrorResponse;
import live.ding.dingsdk.models.operations.CreateAuthenticationResponse;
import live.ding.dingsdk.models.shared.CreateAuthenticationRequest;
import live.ding.dingsdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        Ding sdk = Ding.builder()
                .security(Security.builder()
                    .apiKey("YOUR_API_KEY")
                    .build())
            .build();

        CreateAuthenticationRequest req = CreateAuthenticationRequest.builder()
                .customerUuid("c9f826e0-deca-41ec-871f-ecd6e8efeb46")
                .phoneNumber("+1234567890")
                .locale("fr-FR")
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
import live.ding.dingsdk.Ding;
import live.ding.dingsdk.models.errors.ErrorResponse;
import live.ding.dingsdk.models.operations.FeedbackResponse;
import live.ding.dingsdk.models.shared.FeedbackRequest;
import live.ding.dingsdk.models.shared.FeedbackRequestStatus;
import live.ding.dingsdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

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

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400                         | application/json            |
| models/errors/SDKError      | 4XX, 5XX                    | \*/\*                       |

## getAuthenticationStatus

Get authentication status

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import live.ding.dingsdk.Ding;
import live.ding.dingsdk.models.errors.ErrorResponse;
import live.ding.dingsdk.models.operations.GetAuthenticationStatusResponse;
import live.ding.dingsdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        Ding sdk = Ding.builder()
                .security(Security.builder()
                    .apiKey("YOUR_API_KEY")
                    .build())
            .build();

        GetAuthenticationStatusResponse res = sdk.otp().getAuthenticationStatus()
                .authUuid("d8446450-f2fa-4dd9-806b-df5b8c661f23")
                .call();

        if (res.authenticationStatusResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `authUuid`         | *String*           | :heavy_check_mark: | N/A                |

### Response

**[GetAuthenticationStatusResponse](../../models/operations/GetAuthenticationStatusResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400                         | application/json            |
| models/errors/SDKError      | 4XX, 5XX                    | \*/\*                       |

## retry

Perform a retry

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import live.ding.dingsdk.Ding;
import live.ding.dingsdk.models.errors.ErrorResponse;
import live.ding.dingsdk.models.operations.RetryResponse;
import live.ding.dingsdk.models.shared.RetryAuthenticationRequest;
import live.ding.dingsdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

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

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400                         | application/json            |
| models/errors/SDKError      | 4XX, 5XX                    | \*/\*                       |