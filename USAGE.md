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

### Send feedback

Send feedback about the authentication process.


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

### Get authentication status

Get the status of an authentication.


```java
package hello.world;

import java.lang.Exception;
import live.ding.dingSdk.Ding;
import live.ding.dingSdk.models.operations.GetAuthenticationStatusResponse;
import live.ding.dingSdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

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
import live.ding.dingSdk.Ding;
import live.ding.dingSdk.models.errors.ErrorResponse1;
import live.ding.dingSdk.models.operations.LookupResponse;
import live.ding.dingSdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws ErrorResponse1, Exception {

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