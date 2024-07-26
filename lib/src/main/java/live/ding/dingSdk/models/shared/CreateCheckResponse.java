/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
 */

package live.ding.dingSdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateCheckResponse {
    /**
     * The UUID of the corresponding authentication.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("authentication_uuid")
    public String authenticationUuid;

    public CreateCheckResponse withAuthenticationUuid(String authenticationUuid) {
        this.authenticationUuid = authenticationUuid;
        return this;
    }
    
    /**
     * The status of the check. Possible values are:
     *   * `valid` - The code is valid.
     *   * `invalid` - The code is invalid.
     *   * `without_attempt` - No attempt was sent yet, so a check cannot be completed.
     *   * `rate_limited` - The authentication was rate limited and cannot be checked.
     *   * `already_validated` - The authentication has already been validated.
     *   * `expired_auth` - The authentication has expired and cannot be checked.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public CreateCheckResponseStatus status;

    public CreateCheckResponse withStatus(CreateCheckResponseStatus status) {
        this.status = status;
        return this;
    }
    
    public CreateCheckResponse(){}
}
