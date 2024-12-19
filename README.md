# Ding Java SDK

The Ding Java library provides convenient access to the Ding API from applications written in the Java language.

<!-- Start Summary [summary] -->
## Summary

Ding: The OTP API allows you to send authentication codes to your users using their phone numbers.
<!-- End Summary [summary] -->

<!-- Start Table of Contents [toc] -->
## Table of Contents
<!-- $toc-max-depth=2 -->
* [Ding Java SDK](#ding-java-sdk)
  * [SDK Installation](#sdk-installation)
  * [SDK Example Usage](#sdk-example-usage)
  * [SDK Example Usage](#sdk-example-usage-1)
  * [Available Resources and Operations](#available-resources-and-operations)
  * [Server Selection](#server-selection)
  * [Error Handling](#error-handling)
  * [Authentication](#authentication)
* [Development](#development)
  * [Maturity](#maturity)
  * [Contributions](#contributions)

<!-- End Table of Contents [toc] -->

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Getting started

JDK 11 or later is required.

The samples below show how a published SDK artifact is used:

Gradle:
```groovy
implementation 'live.ding:dingsdk:0.9.0'
```

Maven:
```xml
<dependency>
    <groupId>live.ding</groupId>
    <artifactId>dingsdk</artifactId>
    <version>0.9.0</version>
</dependency>
```

### How to build
After cloning the git repository to your file system you can build the SDK artifact from source to the `build` directory by running `./gradlew build` on *nix systems or `gradlew.bat` on Windows systems.

If you wish to build from source and publish the SDK artifact to your local Maven repository (on your filesystem) then use the following command (after cloning the git repo locally):

On *nix:
```bash
./gradlew publishToMavenLocal -Pskip.signing
```
On Windows:
```bash
gradlew.bat publishToMavenLocal -Pskip.signing
```
<!-- End SDK Installation [installation] -->

## SDK Example Usage

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Send a code

Send an OTP code to a user's phone number.


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

### Check a code

Check that a code entered by a user is valid.


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

### Perform a retry

Perform a retry if a user has not received the code.


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

### Send feedback

Send feedback about the authentication process.


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

### Get authentication status

Get the status of an authentication.


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

### Look up for phone number

Perform a phone number lookup.


```java
package hello.world;

import java.lang.Exception;
import java.util.List;
import live.ding.dingsdk.Ding;
import live.ding.dingsdk.models.errors.ErrorResponse;
import live.ding.dingsdk.models.operations.LookupResponse;
import live.ding.dingsdk.models.operations.Type;
import live.ding.dingsdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        Ding sdk = Ding.builder()
                .security(Security.builder()
                    .apiKey("YOUR_API_KEY")
                    .build())
            .build();

        LookupResponse res = sdk.lookup().lookup()
                .customerUuid("6e93aa15-9177-4d09-8395-b69ce50db1c8")
                .phoneNumber("<value>")
                .type(List.of(
                    Type.CNAM))
                .call();

        if (res.lookupResponse().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

<details open>
<summary>Available methods</summary>


### [lookup()](docs/sdks/lookup/README.md)

* [lookup](docs/sdks/lookup/README.md#lookup) - Look up for phone number

### [otp()](docs/sdks/otp/README.md)

* [check](docs/sdks/otp/README.md#check) - Check a code
* [createAuthentication](docs/sdks/otp/README.md#createauthentication) - Send a code
* [feedback](docs/sdks/otp/README.md#feedback) - Send feedback
* [getAuthenticationStatus](docs/sdks/otp/README.md#getauthenticationstatus) - Get authentication status
* [retry](docs/sdks/otp/README.md#retry) - Perform a retry

</details>
<!-- End Available Resources and Operations [operations] -->

<!-- Start Server Selection [server] -->
## Server Selection

### Override Server URL Per-Client

The default server can also be overridden globally using the `.serverURL(String serverUrl)` builder method when initializing the SDK client instance. For example:
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
                .serverURL("https://api.ding.live/v1")
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
<!-- End Server Selection [server] -->

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations. All operations return a response object or raise an exception.

By default, an API error will throw a `models/errors/SDKError` exception. When custom error responses are specified for an operation, the SDK may also throw their associated exception. You can refer to respective *Errors* tables in SDK docs for more details on possible exception types for each operation. For example, the `check` method throws the following exceptions:

| Error Type                  | Status Code | Content Type     |
| --------------------------- | ----------- | ---------------- |
| models/errors/ErrorResponse | 400         | application/json |
| models/errors/SDKError      | 4XX, 5XX    | \*/\*            |

### Example

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
<!-- End Error Handling [errors] -->

<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security scheme globally:

| Name     | Type   | Scheme  |
| -------- | ------ | ------- |
| `apiKey` | apiKey | API key |

You can set the security parameters through the `security` builder method when initializing the SDK client instance. For example:
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
<!-- End Authentication [security] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->

# Development

## Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

## Contributions

While we value open-source contributions to this SDK, this library is generated programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release!
