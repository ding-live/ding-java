/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package live.ding.dingsdk.models.operations;

import java.lang.Exception;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import live.ding.dingsdk.models.shared.CreateAuthenticationRequest;
import live.ding.dingsdk.models.shared.CreateCheckRequest;
import live.ding.dingsdk.models.shared.FeedbackRequest;
import live.ding.dingsdk.models.shared.RetryAuthenticationRequest;

public class SDKMethodInterfaces {


    public interface MethodCallCheck {
        CheckResponse check(
            Optional<? extends CreateCheckRequest> request) throws Exception;
    }


    public interface MethodCallCreateAuthentication {
        CreateAuthenticationResponse createAuthentication(
            Optional<? extends CreateAuthenticationRequest> request) throws Exception;
    }


    public interface MethodCallFeedback {
        FeedbackResponse feedback(
            Optional<? extends FeedbackRequest> request) throws Exception;
    }


    public interface MethodCallGetAuthenticationStatus {
        GetAuthenticationStatusResponse getAuthenticationStatus(
            String authUuid) throws Exception;
    }


    public interface MethodCallRetry {
        RetryResponse retry(
            Optional<? extends RetryAuthenticationRequest> request) throws Exception;
    }


    public interface MethodCallLookup {
        LookupResponse lookup(
            String customerUuid,
            String phoneNumber,
            Optional<? extends List<Type>> type) throws Exception;
    }


}
