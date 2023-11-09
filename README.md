# Ding Java SDK

The Ding Java library provides convenient access to the Ding API from applications written in the Java language.

<!-- Start SDK Installation -->
## SDK Installation

### Gradle

```groovy
implementation 'live.ding.dingSdk:ding:0.1.1'
```
<!-- End SDK Installation -->

## SDK Example Usage

<!-- Start SDK Example Usage -->
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
                .setSecurity(new Security("YOUR_API_KEY"){{
                    apiKey = "YOUR_API_KEY";
                }})
                .build();

            live.ding.dingSdk.models.shared.CreateAuthenticationRequest req = new CreateAuthenticationRequest("82779012-9667-4917-8532-b94017ce3f0f", "+1234567890"){{
                appRealm = "string";
                appVersion = "string";
                callbackUrl = "https://regal-butane.name";
                deviceId = "string";
                deviceModel = "string";
                deviceType = DeviceType.ANDROID;
                ip = "69.99.185.232";
                isReturningUser = false;
                osVersion = "string";
            }};            

            CreateAutenticationResponse res = sdk.otp.send(req);

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

### Retry an authentication

Retry an authentication if a user has not received the code.


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
<!-- End SDK Example Usage -->

<!-- Start SDK Available Operations -->
## Available Resources and Operations


### [otp](docs/sdks/otp/README.md)

* [check](docs/sdks/otp/README.md#check) - Check an authentication code
* [retry](docs/sdks/otp/README.md#retry) - Retry an authentication
* [send](docs/sdks/otp/README.md#send) - Create an authentication

### [lookup](docs/sdks/lookup/README.md)

* [lookup](docs/sdks/lookup/README.md#lookup) - Lookup a phone number
<!-- End SDK Available Operations -->

<!-- Start Dev Containers -->

<!-- End Dev Containers -->

<!-- Placeholder for Future Speakeasy SDK Sections -->

# Development

## Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

## Contributions

While we value open-source contributions to this SDK, this library is generated programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release!
