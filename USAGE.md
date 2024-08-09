<!-- Start SDK Example Usage [usage] -->
### Send a code

Send an OTP code to a user's phone number.


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

### Check a code

Check that a code entered by a user is valid.


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

### Perform a retry

Perform a retry if a user has not received the code.


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
<!-- End SDK Example Usage [usage] -->