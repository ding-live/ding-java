<!-- Start SDK Example Usage [usage] -->
### Send a code

Send an OTP code to a user's phone number.


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
                correlationId = "<value>";
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