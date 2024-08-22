/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package live.ding.dingSdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * FeedbackRequestStatus - The type of the feedback.
 */
public enum FeedbackRequestStatus {
    ONBOARDED("onboarded"),
    NOT_ONBOARDED("not_onboarded");

    @JsonValue
    private final String value;

    private FeedbackRequestStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
