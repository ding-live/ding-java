/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package live.ding.dingsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * Capability - The capability of the attempt.
 */
public enum Capability {
    RCS("rcs"),
    TEXT("text"),
    WHATSAPP("whatsapp"),
    VIBER("viber");

    @JsonValue
    private final String value;

    private Capability(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
