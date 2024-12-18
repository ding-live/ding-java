/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package live.ding.dingsdk.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;
import live.ding.dingsdk.utils.Utils;


public class DeliveryStatus {

    /**
     * The ID of the attempt.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("attempt_id")
    private Optional<String> attemptId;

    /**
     * The attempt number.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("attempt_number")
    private Optional<Long> attemptNumber;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private Optional<OffsetDateTime> createdAt;

    /**
     * The status of the delivery. Possible values are:
     *   * `unknown` - The status of the delivery is unknown.
     *   * `submitted` - The message has been submitted to the carrier.
     *   * `in_transit` - The message is in transit to the recipient.
     *   * `delivered` - The message has been delivered to the recipient.
     *   * `undeliverable` - The message could not be delivered to the recipient.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends AuthenticationStatusResponseStatus> status;

    /**
     * The type of the event.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends AuthenticationStatusResponseSchemasType> type;

    @JsonCreator
    public DeliveryStatus(
            @JsonProperty("attempt_id") Optional<String> attemptId,
            @JsonProperty("attempt_number") Optional<Long> attemptNumber,
            @JsonProperty("created_at") Optional<OffsetDateTime> createdAt,
            @JsonProperty("status") Optional<? extends AuthenticationStatusResponseStatus> status,
            @JsonProperty("type") Optional<? extends AuthenticationStatusResponseSchemasType> type) {
        Utils.checkNotNull(attemptId, "attemptId");
        Utils.checkNotNull(attemptNumber, "attemptNumber");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(type, "type");
        this.attemptId = attemptId;
        this.attemptNumber = attemptNumber;
        this.createdAt = createdAt;
        this.status = status;
        this.type = type;
    }
    
    public DeliveryStatus() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The ID of the attempt.
     */
    @JsonIgnore
    public Optional<String> attemptId() {
        return attemptId;
    }

    /**
     * The attempt number.
     */
    @JsonIgnore
    public Optional<Long> attemptNumber() {
        return attemptNumber;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> createdAt() {
        return createdAt;
    }

    /**
     * The status of the delivery. Possible values are:
     *   * `unknown` - The status of the delivery is unknown.
     *   * `submitted` - The message has been submitted to the carrier.
     *   * `in_transit` - The message is in transit to the recipient.
     *   * `delivered` - The message has been delivered to the recipient.
     *   * `undeliverable` - The message could not be delivered to the recipient.
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AuthenticationStatusResponseStatus> status() {
        return (Optional<AuthenticationStatusResponseStatus>) status;
    }

    /**
     * The type of the event.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AuthenticationStatusResponseSchemasType> type() {
        return (Optional<AuthenticationStatusResponseSchemasType>) type;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the attempt.
     */
    public DeliveryStatus withAttemptId(String attemptId) {
        Utils.checkNotNull(attemptId, "attemptId");
        this.attemptId = Optional.ofNullable(attemptId);
        return this;
    }

    /**
     * The ID of the attempt.
     */
    public DeliveryStatus withAttemptId(Optional<String> attemptId) {
        Utils.checkNotNull(attemptId, "attemptId");
        this.attemptId = attemptId;
        return this;
    }

    /**
     * The attempt number.
     */
    public DeliveryStatus withAttemptNumber(long attemptNumber) {
        Utils.checkNotNull(attemptNumber, "attemptNumber");
        this.attemptNumber = Optional.ofNullable(attemptNumber);
        return this;
    }

    /**
     * The attempt number.
     */
    public DeliveryStatus withAttemptNumber(Optional<Long> attemptNumber) {
        Utils.checkNotNull(attemptNumber, "attemptNumber");
        this.attemptNumber = attemptNumber;
        return this;
    }

    public DeliveryStatus withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    public DeliveryStatus withCreatedAt(Optional<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The status of the delivery. Possible values are:
     *   * `unknown` - The status of the delivery is unknown.
     *   * `submitted` - The message has been submitted to the carrier.
     *   * `in_transit` - The message is in transit to the recipient.
     *   * `delivered` - The message has been delivered to the recipient.
     *   * `undeliverable` - The message could not be delivered to the recipient.
     * 
     */
    public DeliveryStatus withStatus(AuthenticationStatusResponseStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * The status of the delivery. Possible values are:
     *   * `unknown` - The status of the delivery is unknown.
     *   * `submitted` - The message has been submitted to the carrier.
     *   * `in_transit` - The message is in transit to the recipient.
     *   * `delivered` - The message has been delivered to the recipient.
     *   * `undeliverable` - The message could not be delivered to the recipient.
     * 
     */
    public DeliveryStatus withStatus(Optional<? extends AuthenticationStatusResponseStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * The type of the event.
     */
    public DeliveryStatus withType(AuthenticationStatusResponseSchemasType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    /**
     * The type of the event.
     */
    public DeliveryStatus withType(Optional<? extends AuthenticationStatusResponseSchemasType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeliveryStatus other = (DeliveryStatus) o;
        return 
            Objects.deepEquals(this.attemptId, other.attemptId) &&
            Objects.deepEquals(this.attemptNumber, other.attemptNumber) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            attemptId,
            attemptNumber,
            createdAt,
            status,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeliveryStatus.class,
                "attemptId", attemptId,
                "attemptNumber", attemptNumber,
                "createdAt", createdAt,
                "status", status,
                "type", type);
    }
    
    public final static class Builder {
 
        private Optional<String> attemptId = Optional.empty();
 
        private Optional<Long> attemptNumber = Optional.empty();
 
        private Optional<OffsetDateTime> createdAt = Optional.empty();
 
        private Optional<? extends AuthenticationStatusResponseStatus> status = Optional.empty();
 
        private Optional<? extends AuthenticationStatusResponseSchemasType> type = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the attempt.
         */
        public Builder attemptId(String attemptId) {
            Utils.checkNotNull(attemptId, "attemptId");
            this.attemptId = Optional.ofNullable(attemptId);
            return this;
        }

        /**
         * The ID of the attempt.
         */
        public Builder attemptId(Optional<String> attemptId) {
            Utils.checkNotNull(attemptId, "attemptId");
            this.attemptId = attemptId;
            return this;
        }

        /**
         * The attempt number.
         */
        public Builder attemptNumber(long attemptNumber) {
            Utils.checkNotNull(attemptNumber, "attemptNumber");
            this.attemptNumber = Optional.ofNullable(attemptNumber);
            return this;
        }

        /**
         * The attempt number.
         */
        public Builder attemptNumber(Optional<Long> attemptNumber) {
            Utils.checkNotNull(attemptNumber, "attemptNumber");
            this.attemptNumber = attemptNumber;
            return this;
        }

        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = Optional.ofNullable(createdAt);
            return this;
        }

        public Builder createdAt(Optional<OffsetDateTime> createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        /**
         * The status of the delivery. Possible values are:
         *   * `unknown` - The status of the delivery is unknown.
         *   * `submitted` - The message has been submitted to the carrier.
         *   * `in_transit` - The message is in transit to the recipient.
         *   * `delivered` - The message has been delivered to the recipient.
         *   * `undeliverable` - The message could not be delivered to the recipient.
         * 
         */
        public Builder status(AuthenticationStatusResponseStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        /**
         * The status of the delivery. Possible values are:
         *   * `unknown` - The status of the delivery is unknown.
         *   * `submitted` - The message has been submitted to the carrier.
         *   * `in_transit` - The message is in transit to the recipient.
         *   * `delivered` - The message has been delivered to the recipient.
         *   * `undeliverable` - The message could not be delivered to the recipient.
         * 
         */
        public Builder status(Optional<? extends AuthenticationStatusResponseStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        /**
         * The type of the event.
         */
        public Builder type(AuthenticationStatusResponseSchemasType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        /**
         * The type of the event.
         */
        public Builder type(Optional<? extends AuthenticationStatusResponseSchemasType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public DeliveryStatus build() {
            return new DeliveryStatus(
                attemptId,
                attemptNumber,
                createdAt,
                status,
                type);
        }
    }
}

