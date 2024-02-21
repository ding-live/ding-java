# Ding Java SDK

The Ding Java library provides convenient access to the Ding API from applications written in the Java language.

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Gradle

```groovy
implementation 'live.ding.dingSdk:ding:0.4.0'
```
<!-- End SDK Installation [installation] -->

## SDK Example Usage

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Send a code

Send an OTP code to a user's phone number.


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
                .setSecurity(new Security(
                "YOUR_API_KEY"){{
                    apiKey = "YOUR_API_KEY";
                }})
                .build();

            live.ding.dingSdk.models.shared.CreateAuthenticationRequest req = new CreateAuthenticationRequest(
                "eae192ab-9e1e-4b21-b5b1-bfcb79a32fcc",
                "+1234567890"){{
                appRealm = "<value>";
                appVersion = "<value>";
                callbackUrl = "http://silly-credit.name";
                deviceId = "<value>";
                deviceModel = "<value>";
                deviceType = DeviceType.WEB;
                ip = "97.139.118.123";
                isReturningUser = false;
                osVersion = "<value>";

            }};

            live.ding.dingSdk.models.operations.CreateAutenticationResponse res = sdk.otp.createAutentication(req);

            if (res.createAuthenticationResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Check a code

Check that a code entered by a user is valid.


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

### Perform a retry

Perform a retry if a user has not received the code.


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
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

### [otp](docs/sdks/otp/README.md)

* [check](docs/sdks/otp/README.md#check) - Check a code
* [createAutentication](docs/sdks/otp/README.md#createautentication) - Send a code
* [retry](docs/sdks/otp/README.md#retry) - Perform a retry

### [lookup](docs/sdks/lookup/README.md)

* [lookup](docs/sdks/lookup/README.md#lookup) - Perform a phone number lookup
<!-- End Available Resources and Operations [operations] -->

<!-- Start Server Selection [server] -->
## Server Selection

## Server Selection

### Select Server by Index

You can override the default server globally using the `setServerIndex` option when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| # | Server | Variables |
| - | ------ | --------- |
| 0 | `https://api.ding.live/v1` | None |




### Override Server URL Per-Client

The default server can also be overridden globally using the `setServerURL` option when initializing the SDK client instance. For example:
<!-- End Server Selection [server] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->

# Development

## Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

## Contributions

While we value open-source contributions to this SDK, this library is generated programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release!
