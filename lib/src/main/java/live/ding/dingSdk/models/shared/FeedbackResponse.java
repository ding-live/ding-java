/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package live.ding.dingSdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class FeedbackResponse {
    /**
     * The UUID of the feedback.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("uuid")
    public String uuid;

    public FeedbackResponse withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    
    public FeedbackResponse(){}
}
