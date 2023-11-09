/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package live.ding.dingSdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ErrorResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    public Code code;

    public ErrorResponse withCode(Code code) {
        this.code = code;
        return this;
    }
    
    /**
     * A link to the documentation that describes the error.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("doc_url")
    public String docUrl;

    public ErrorResponse withDocUrl(String docUrl) {
        this.docUrl = docUrl;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public String message;

    public ErrorResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    public ErrorResponse(){}
}
