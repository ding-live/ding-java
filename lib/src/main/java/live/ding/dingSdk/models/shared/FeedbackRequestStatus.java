/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package live.ding.dingSdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * FeedbackRequestStatus - The type of the feedback.
 */
public enum FeedbackRequestStatus {
    ONBOARDED("onboarded"),
    NOT_ONBOARDED("not_onboarded");

    @JsonValue
    public final String value;

    private FeedbackRequestStatus(String value) {
        this.value = value;
    }
}
