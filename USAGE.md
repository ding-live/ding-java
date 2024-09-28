<!-- Start SDK Example Usage [usage] -->
### Send a code

Send an OTP code to a user's phone number.


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

### Check a code

Check that a code entered by a user is valid.


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

### Perform a retry

Perform a retry if a user has not received the code.


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
<!-- End SDK Example Usage [usage] -->