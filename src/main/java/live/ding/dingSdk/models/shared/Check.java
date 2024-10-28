/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package live.ding.dingSdk.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;
import live.ding.dingSdk.utils.Utils;


public class Check {

    /**
     * The code that was checked.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    private Optional<String> code;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private Optional<OffsetDateTime> createdAt;

    /**
     * The ID of the check.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends CheckStatus> status;

    /**
     * The type of the event.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends AuthenticationStatusResponseType> type;

    @JsonCreator
    public Check(
            @JsonProperty("code") Optional<String> code,
            @JsonProperty("created_at") Optional<OffsetDateTime> createdAt,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("status") Optional<? extends CheckStatus> status,
            @JsonProperty("type") Optional<? extends AuthenticationStatusResponseType> type) {
        Utils.checkNotNull(code, "code");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(type, "type");
        this.code = code;
        this.createdAt = createdAt;
        this.id = id;
        this.status = status;
        this.type = type;
    }
    
    public Check() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The code that was checked.
     */
    @JsonIgnore
    public Optional<String> code() {
        return code;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> createdAt() {
        return createdAt;
    }

    /**
     * The ID of the check.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CheckStatus> status() {
        return (Optional<CheckStatus>) status;
    }

    /**
     * The type of the event.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AuthenticationStatusResponseType> type() {
        return (Optional<AuthenticationStatusResponseType>) type;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The code that was checked.
     */
    public Check withCode(String code) {
        Utils.checkNotNull(code, "code");
        this.code = Optional.ofNullable(code);
        return this;
    }

    /**
     * The code that was checked.
     */
    public Check withCode(Optional<String> code) {
        Utils.checkNotNull(code, "code");
        this.code = code;
        return this;
    }

    public Check withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    public Check withCreatedAt(Optional<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The ID of the check.
     */
    public Check withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * The ID of the check.
     */
    public Check withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public Check withStatus(CheckStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    public Check withStatus(Optional<? extends CheckStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * The type of the event.
     */
    public Check withType(AuthenticationStatusResponseType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    /**
     * The type of the event.
     */
    public Check withType(Optional<? extends AuthenticationStatusResponseType> type) {
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
        Check other = (Check) o;
        return 
            Objects.deepEquals(this.code, other.code) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            code,
            createdAt,
            id,
            status,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Check.class,
                "code", code,
                "createdAt", createdAt,
                "id", id,
                "status", status,
                "type", type);
    }
    
    public final static class Builder {
 
        private Optional<String> code = Optional.empty();
 
        private Optional<OffsetDateTime> createdAt = Optional.empty();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<? extends CheckStatus> status = Optional.empty();
 
        private Optional<? extends AuthenticationStatusResponseType> type = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The code that was checked.
         */
        public Builder code(String code) {
            Utils.checkNotNull(code, "code");
            this.code = Optional.ofNullable(code);
            return this;
        }

        /**
         * The code that was checked.
         */
        public Builder code(Optional<String> code) {
            Utils.checkNotNull(code, "code");
            this.code = code;
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
         * The ID of the check.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * The ID of the check.
         */
        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder status(CheckStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        public Builder status(Optional<? extends CheckStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        /**
         * The type of the event.
         */
        public Builder type(AuthenticationStatusResponseType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        /**
         * The type of the event.
         */
        public Builder type(Optional<? extends AuthenticationStatusResponseType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public Check build() {
            return new Check(
                code,
                createdAt,
                id,
                status,
                type);
        }
    }
}

