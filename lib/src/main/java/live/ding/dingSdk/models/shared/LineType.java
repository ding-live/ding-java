/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package live.ding.dingSdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * LineType - The type of phone line.
 */
public enum LineType {
    FIXED_LINE("FixedLine"),
    MOBILE("Mobile"),
    TOLL_FREE("TollFree"),
    PREMIUM_RATE("PremiumRate"),
    SHARED_COST("SharedCost"),
    VOIP("Voip"),
    PAGER("Pager"),
    VOICE_MAIL("VoiceMail"),
    UNIVERSAL_ACCESS("UniversalAccess"),
    SERVICE("Service"),
    UNKNOWN("Unknown");

    @JsonValue
    public final String value;

    private LineType(String value) {
        this.value = value;
    }
}
