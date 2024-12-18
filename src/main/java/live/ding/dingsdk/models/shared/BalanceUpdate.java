/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package live.ding.dingsdk.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;
import live.ding.dingsdk.utils.Utils;


public class BalanceUpdate {

    /**
     * The amount of the balance update.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("amount")
    private Optional<Double> amount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("balance_update_type")
    private Optional<? extends BalanceUpdateType> balanceUpdateType;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private Optional<OffsetDateTime> createdAt;

    /**
     * The type of the event.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends AuthenticationStatusResponseSchemasEventsType> type;

    @JsonCreator
    public BalanceUpdate(
            @JsonProperty("amount") Optional<Double> amount,
            @JsonProperty("balance_update_type") Optional<? extends BalanceUpdateType> balanceUpdateType,
            @JsonProperty("created_at") Optional<OffsetDateTime> createdAt,
            @JsonProperty("type") Optional<? extends AuthenticationStatusResponseSchemasEventsType> type) {
        Utils.checkNotNull(amount, "amount");
        Utils.checkNotNull(balanceUpdateType, "balanceUpdateType");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(type, "type");
        this.amount = amount;
        this.balanceUpdateType = balanceUpdateType;
        this.createdAt = createdAt;
        this.type = type;
    }
    
    public BalanceUpdate() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The amount of the balance update.
     */
    @JsonIgnore
    public Optional<Double> amount() {
        return amount;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BalanceUpdateType> balanceUpdateType() {
        return (Optional<BalanceUpdateType>) balanceUpdateType;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> createdAt() {
        return createdAt;
    }

    /**
     * The type of the event.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AuthenticationStatusResponseSchemasEventsType> type() {
        return (Optional<AuthenticationStatusResponseSchemasEventsType>) type;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The amount of the balance update.
     */
    public BalanceUpdate withAmount(double amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = Optional.ofNullable(amount);
        return this;
    }

    /**
     * The amount of the balance update.
     */
    public BalanceUpdate withAmount(Optional<Double> amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
        return this;
    }

    public BalanceUpdate withBalanceUpdateType(BalanceUpdateType balanceUpdateType) {
        Utils.checkNotNull(balanceUpdateType, "balanceUpdateType");
        this.balanceUpdateType = Optional.ofNullable(balanceUpdateType);
        return this;
    }

    public BalanceUpdate withBalanceUpdateType(Optional<? extends BalanceUpdateType> balanceUpdateType) {
        Utils.checkNotNull(balanceUpdateType, "balanceUpdateType");
        this.balanceUpdateType = balanceUpdateType;
        return this;
    }

    public BalanceUpdate withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    public BalanceUpdate withCreatedAt(Optional<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The type of the event.
     */
    public BalanceUpdate withType(AuthenticationStatusResponseSchemasEventsType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    /**
     * The type of the event.
     */
    public BalanceUpdate withType(Optional<? extends AuthenticationStatusResponseSchemasEventsType> type) {
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
        BalanceUpdate other = (BalanceUpdate) o;
        return 
            Objects.deepEquals(this.amount, other.amount) &&
            Objects.deepEquals(this.balanceUpdateType, other.balanceUpdateType) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            amount,
            balanceUpdateType,
            createdAt,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BalanceUpdate.class,
                "amount", amount,
                "balanceUpdateType", balanceUpdateType,
                "createdAt", createdAt,
                "type", type);
    }
    
    public final static class Builder {
 
        private Optional<Double> amount = Optional.empty();
 
        private Optional<? extends BalanceUpdateType> balanceUpdateType = Optional.empty();
 
        private Optional<OffsetDateTime> createdAt = Optional.empty();
 
        private Optional<? extends AuthenticationStatusResponseSchemasEventsType> type = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The amount of the balance update.
         */
        public Builder amount(double amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = Optional.ofNullable(amount);
            return this;
        }

        /**
         * The amount of the balance update.
         */
        public Builder amount(Optional<Double> amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = amount;
            return this;
        }

        public Builder balanceUpdateType(BalanceUpdateType balanceUpdateType) {
            Utils.checkNotNull(balanceUpdateType, "balanceUpdateType");
            this.balanceUpdateType = Optional.ofNullable(balanceUpdateType);
            return this;
        }

        public Builder balanceUpdateType(Optional<? extends BalanceUpdateType> balanceUpdateType) {
            Utils.checkNotNull(balanceUpdateType, "balanceUpdateType");
            this.balanceUpdateType = balanceUpdateType;
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
         * The type of the event.
         */
        public Builder type(AuthenticationStatusResponseSchemasEventsType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        /**
         * The type of the event.
         */
        public Builder type(Optional<? extends AuthenticationStatusResponseSchemasEventsType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public BalanceUpdate build() {
            return new BalanceUpdate(
                amount,
                balanceUpdateType,
                createdAt,
                type);
        }
    }
}

