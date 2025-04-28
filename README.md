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

### Logging
A logging framework/facade has not yet been adopted but is under consideration.

For request and response logging (especially json bodies) use:
```java
SpeakeasyHTTPClient.setDebugLogging(true); // experimental API only (may change without warning)
```
Example output:
```
Sending request: http://localhost:35123/bearer#global GET
Request headers: {Accept=[application/json], Authorization=[******], Client-Level-Header=[added by client], Idempotency-Key=[some-key], x-speakeasy-user-agent=[speakeasy-sdk/java 0.0.1 internal 0.1.0 org.openapis.openapi]}
Received response: (GET http://localhost:35123/bearer#global) 200
Response headers: {access-control-allow-credentials=[true], access-control-allow-origin=[*], connection=[keep-alive], content-length=[50], content-type=[application/json], date=[Wed, 09 Apr 2025 01:43:29 GMT], server=[gunicorn/19.9.0]}
Response body:
{
  "authenticated": true, 
  "token": "global"
}
```
WARNING: This should only used for temporary debugging purposes. Leaving this option on in a production system could expose credentials/secrets in logs. <i>Authorization</i> headers are redacted by default and there is the ability to specify redacted header names via `SpeakeasyHTTPClient.setRedactedHeaders`.

Another option is to set the System property `-Djdk.httpclient.HttpClient.log=all`. However, this second option does not log bodies.
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
                .customerUuid("cf2edc1c-7fc6-48fb-86da-b7508c6b7b71")
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
import live.ding.dingsdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

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
import live.ding.dingsdk.Ding;
import live.ding.dingsdk.models.errors.ErrorResponse;
import live.ding.dingsdk.models.operations.LookupResponse;
import live.ding.dingsdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        Ding sdk = Ding.builder()
                .security(Security.builder()
                    .apiKey("YOUR_API_KEY")
                    .build())
            .build();

        LookupResponse res = sdk.lookup().lookup()
                .customerUuid("69a197d9-356c-45d1-a807-41874e16b555")
                .phoneNumber("<value>")
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

The default server can be overridden globally using the `.serverURL(String serverUrl)` builder method when initializing the SDK client instance. For example:
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
