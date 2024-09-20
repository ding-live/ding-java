/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package live.ding.dingSdk.models.shared;


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
import live.ding.dingSdk.utils.Utils;


public class RetryAuthenticationResponse {

    /**
     * The UUID of the corresponding authentication.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("authentication_uuid")
    private Optional<String> authenticationUuid;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private Optional<OffsetDateTime> createdAt;

    /**
     * The time at which the next retry will be available.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next_retry_at")
    private Optional<OffsetDateTime> nextRetryAt;

    /**
     * The number of remaining retries.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("remaining_retry")
    private Optional<Long> remainingRetry;

    /**
     * The status of the retry. Possible values are:
     *   * `approved` - The retry was approved and a new code was sent.
     *   * `denied` - The retry was denied.
     *   * `no_attempt` - No attempt was sent yet, so a retry cannot be completed.
     *   * `rate_limited` - The authentication was rate limited and cannot be retried.
     *   * `expired_auth` - The authentication has expired and cannot be retried.
     *   * `already_validated` - The authentication has already been validated.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends RetryAuthenticationResponseStatus> status;

    @JsonCreator
    public RetryAuthenticationResponse(
            @JsonProperty("authentication_uuid") Optional<String> authenticationUuid,
            @JsonProperty("created_at") Optional<OffsetDateTime> createdAt,
            @JsonProperty("next_retry_at") Optional<OffsetDateTime> nextRetryAt,
            @JsonProperty("remaining_retry") Optional<Long> remainingRetry,
            @JsonProperty("status") Optional<? extends RetryAuthenticationResponseStatus> status) {
        Utils.checkNotNull(authenticationUuid, "authenticationUuid");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(nextRetryAt, "nextRetryAt");
        Utils.checkNotNull(remainingRetry, "remainingRetry");
        Utils.checkNotNull(status, "status");
        this.authenticationUuid = authenticationUuid;
        this.createdAt = createdAt;
        this.nextRetryAt = nextRetryAt;
        this.remainingRetry = remainingRetry;
        this.status = status;
    }
    
    public RetryAuthenticationResponse() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The UUID of the corresponding authentication.
     */
    @JsonIgnore
    public Optional<String> authenticationUuid() {
        return authenticationUuid;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> createdAt() {
        return createdAt;
    }

    /**
     * The time at which the next retry will be available.
     */
    @JsonIgnore
    public Optional<OffsetDateTime> nextRetryAt() {
        return nextRetryAt;
    }

    /**
     * The number of remaining retries.
     */
    @JsonIgnore
    public Optional<Long> remainingRetry() {
        return remainingRetry;
    }

    /**
     * The status of the retry. Possible values are:
     *   * `approved` - The retry was approved and a new code was sent.
     *   * `denied` - The retry was denied.
     *   * `no_attempt` - No attempt was sent yet, so a retry cannot be completed.
     *   * `rate_limited` - The authentication was rate limited and cannot be retried.
     *   * `expired_auth` - The authentication has expired and cannot be retried.
     *   * `already_validated` - The authentication has already been validated.
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<RetryAuthenticationResponseStatus> status() {
        return (Optional<RetryAuthenticationResponseStatus>) status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The UUID of the corresponding authentication.
     */
    public RetryAuthenticationResponse withAuthenticationUuid(String authenticationUuid) {
        Utils.checkNotNull(authenticationUuid, "authenticationUuid");
        this.authenticationUuid = Optional.ofNullable(authenticationUuid);
        return this;
    }

    /**
     * The UUID of the corresponding authentication.
     */
    public RetryAuthenticationResponse withAuthenticationUuid(Optional<String> authenticationUuid) {
        Utils.checkNotNull(authenticationUuid, "authenticationUuid");
        this.authenticationUuid = authenticationUuid;
        return this;
    }

    public RetryAuthenticationResponse withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    public RetryAuthenticationResponse withCreatedAt(Optional<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The time at which the next retry will be available.
     */
    public RetryAuthenticationResponse withNextRetryAt(OffsetDateTime nextRetryAt) {
        Utils.checkNotNull(nextRetryAt, "nextRetryAt");
        this.nextRetryAt = Optional.ofNullable(nextRetryAt);
        return this;
    }

    /**
     * The time at which the next retry will be available.
     */
    public RetryAuthenticationResponse withNextRetryAt(Optional<OffsetDateTime> nextRetryAt) {
        Utils.checkNotNull(nextRetryAt, "nextRetryAt");
        this.nextRetryAt = nextRetryAt;
        return this;
    }

    /**
     * The number of remaining retries.
     */
    public RetryAuthenticationResponse withRemainingRetry(long remainingRetry) {
        Utils.checkNotNull(remainingRetry, "remainingRetry");
        this.remainingRetry = Optional.ofNullable(remainingRetry);
        return this;
    }

    /**
     * The number of remaining retries.
     */
    public RetryAuthenticationResponse withRemainingRetry(Optional<Long> remainingRetry) {
        Utils.checkNotNull(remainingRetry, "remainingRetry");
        this.remainingRetry = remainingRetry;
        return this;
    }

    /**
     * The status of the retry. Possible values are:
     *   * `approved` - The retry was approved and a new code was sent.
     *   * `denied` - The retry was denied.
     *   * `no_attempt` - No attempt was sent yet, so a retry cannot be completed.
     *   * `rate_limited` - The authentication was rate limited and cannot be retried.
     *   * `expired_auth` - The authentication has expired and cannot be retried.
     *   * `already_validated` - The authentication has already been validated.
     * 
     */
    public RetryAuthenticationResponse withStatus(RetryAuthenticationResponseStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * The status of the retry. Possible values are:
     *   * `approved` - The retry was approved and a new code was sent.
     *   * `denied` - The retry was denied.
     *   * `no_attempt` - No attempt was sent yet, so a retry cannot be completed.
     *   * `rate_limited` - The authentication was rate limited and cannot be retried.
     *   * `expired_auth` - The authentication has expired and cannot be retried.
     *   * `already_validated` - The authentication has already been validated.
     * 
     */
    public RetryAuthenticationResponse withStatus(Optional<? extends RetryAuthenticationResponseStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
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
        RetryAuthenticationResponse other = (RetryAuthenticationResponse) o;
        return 
            Objects.deepEquals(this.authenticationUuid, other.authenticationUuid) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.nextRetryAt, other.nextRetryAt) &&
            Objects.deepEquals(this.remainingRetry, other.remainingRetry) &&
            Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            authenticationUuid,
            createdAt,
            nextRetryAt,
            remainingRetry,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RetryAuthenticationResponse.class,
                "authenticationUuid", authenticationUuid,
                "createdAt", createdAt,
                "nextRetryAt", nextRetryAt,
                "remainingRetry", remainingRetry,
                "status", status);
    }
    
    public final static class Builder {
 
        private Optional<String> authenticationUuid = Optional.empty();
 
        private Optional<OffsetDateTime> createdAt = Optional.empty();
 
        private Optional<OffsetDateTime> nextRetryAt = Optional.empty();
 
        private Optional<Long> remainingRetry = Optional.empty();
 
        private Optional<? extends RetryAuthenticationResponseStatus> status = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The UUID of the corresponding authentication.
         */
        public Builder authenticationUuid(String authenticationUuid) {
            Utils.checkNotNull(authenticationUuid, "authenticationUuid");
            this.authenticationUuid = Optional.ofNullable(authenticationUuid);
            return this;
        }

        /**
         * The UUID of the corresponding authentication.
         */
        public Builder authenticationUuid(Optional<String> authenticationUuid) {
            Utils.checkNotNull(authenticationUuid, "authenticationUuid");
            this.authenticationUuid = authenticationUuid;
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
         * The time at which the next retry will be available.
         */
        public Builder nextRetryAt(OffsetDateTime nextRetryAt) {
            Utils.checkNotNull(nextRetryAt, "nextRetryAt");
            this.nextRetryAt = Optional.ofNullable(nextRetryAt);
            return this;
        }

        /**
         * The time at which the next retry will be available.
         */
        public Builder nextRetryAt(Optional<OffsetDateTime> nextRetryAt) {
            Utils.checkNotNull(nextRetryAt, "nextRetryAt");
            this.nextRetryAt = nextRetryAt;
            return this;
        }

        /**
         * The number of remaining retries.
         */
        public Builder remainingRetry(long remainingRetry) {
            Utils.checkNotNull(remainingRetry, "remainingRetry");
            this.remainingRetry = Optional.ofNullable(remainingRetry);
            return this;
        }

        /**
         * The number of remaining retries.
         */
        public Builder remainingRetry(Optional<Long> remainingRetry) {
            Utils.checkNotNull(remainingRetry, "remainingRetry");
            this.remainingRetry = remainingRetry;
            return this;
        }

        /**
         * The status of the retry. Possible values are:
         *   * `approved` - The retry was approved and a new code was sent.
         *   * `denied` - The retry was denied.
         *   * `no_attempt` - No attempt was sent yet, so a retry cannot be completed.
         *   * `rate_limited` - The authentication was rate limited and cannot be retried.
         *   * `expired_auth` - The authentication has expired and cannot be retried.
         *   * `already_validated` - The authentication has already been validated.
         * 
         */
        public Builder status(RetryAuthenticationResponseStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        /**
         * The status of the retry. Possible values are:
         *   * `approved` - The retry was approved and a new code was sent.
         *   * `denied` - The retry was denied.
         *   * `no_attempt` - No attempt was sent yet, so a retry cannot be completed.
         *   * `rate_limited` - The authentication was rate limited and cannot be retried.
         *   * `expired_auth` - The authentication has expired and cannot be retried.
         *   * `already_validated` - The authentication has already been validated.
         * 
         */
        public Builder status(Optional<? extends RetryAuthenticationResponseStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public RetryAuthenticationResponse build() {
            return new RetryAuthenticationResponse(
                authenticationUuid,
                createdAt,
                nextRetryAt,
                remainingRetry,
                status);
        }
    }
}
