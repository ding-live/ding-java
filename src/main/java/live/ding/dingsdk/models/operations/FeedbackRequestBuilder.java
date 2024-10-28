/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package live.ding.dingsdk.models.operations;

import java.util.Optional;
import live.ding.dingsdk.models.shared.FeedbackRequest;
import live.ding.dingsdk.utils.Utils;

public class FeedbackRequestBuilder {

    private Optional<? extends FeedbackRequest> request = Optional.empty();
    private final SDKMethodInterfaces.MethodCallFeedback sdk;

    public FeedbackRequestBuilder(SDKMethodInterfaces.MethodCallFeedback sdk) {
        this.sdk = sdk;
    }
                
    public FeedbackRequestBuilder request(FeedbackRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = Optional.of(request);
        return this;
    }

    public FeedbackRequestBuilder request(Optional<? extends FeedbackRequest> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public FeedbackResponse call() throws Exception {

        return sdk.feedback(
            request);
    }
}