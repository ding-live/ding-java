/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package live.ding.dingsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * CheckStatus - The status of the check. Possible values are:
 *   * `unknown` - The status is unknown.
 *   * `valid` - The code is valid.
 *   * `invalid` - The code is invalid.
 *   * `without_attempt` - No attempt was sent yet, so a check cannot be completed.
 *   * `rate_limited` - The authentication was rate limited and cannot be checked.
 *   * `already_validated` - The authentication has already been validated.
 *   * `expired_auth` - The authentication has expired and cannot be checked.
 * 
 */
public enum CheckStatus {
    UNKNOWN("unknown"),
    VALID("valid"),
    INVALID("invalid"),
    WITHOUT_ATTEMPT("without_attempt"),
    RATE_LIMITED("rate_limited"),
    ALREADY_VALIDATED("already_validated"),
    EXPIRED_AUTH("expired_auth");

    @JsonValue
    private final String value;

    private CheckStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}