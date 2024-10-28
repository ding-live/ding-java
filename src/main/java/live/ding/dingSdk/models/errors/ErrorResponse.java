/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package live.ding.dingSdk.models.errors;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
import live.ding.dingSdk.utils.Utils;

@SuppressWarnings("serial")
public class ErrorResponse extends RuntimeException {

    /**
     * A machine-readable code that describes the error.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    private Optional<? extends Code> code;

    /**
     * A link to the documentation that describes the error.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("doc_url")
    private Optional<String> docUrl;

    /**
     * A human-readable message that describes the error.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    private Optional<String> message;

    @JsonCreator
    public ErrorResponse(
            @JsonProperty("code") Optional<? extends Code> code,
            @JsonProperty("doc_url") Optional<String> docUrl,
            @JsonProperty("message") Optional<String> message) {
        super(message.orElse(null));
        Utils.checkNotNull(code, "code");
        Utils.checkNotNull(docUrl, "docUrl");
        Utils.checkNotNull(message, "message");
        this.code = code;
        this.docUrl = docUrl;
        this.message = message;
    }
    
    public ErrorResponse() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * A machine-readable code that describes the error.
     */
    @SuppressWarnings("unchecked")
    public Optional<Code> code(){
        return (Optional<Code>) code;
    }

    /**
     * A link to the documentation that describes the error.
     */
    public Optional<String> docUrl(){
        return docUrl;
    }

    /**
     * A human-readable message that describes the error.
     */
    public Optional<String> message(){
        return message;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A machine-readable code that describes the error.
     */
    public ErrorResponse withCode(Code code) {
        Utils.checkNotNull(code, "code");
        this.code = Optional.ofNullable(code);
        return this;
    }
    
    /**
     * A machine-readable code that describes the error.
     */
    public ErrorResponse withCode(Optional<? extends Code> code) {
        Utils.checkNotNull(code, "code");
        this.code = code;
        return this;
    }

    /**
     * A link to the documentation that describes the error.
     */
    public ErrorResponse withDocUrl(String docUrl) {
        Utils.checkNotNull(docUrl, "docUrl");
        this.docUrl = Optional.ofNullable(docUrl);
        return this;
    }
    
    /**
     * A link to the documentation that describes the error.
     */
    public ErrorResponse withDocUrl(Optional<String> docUrl) {
        Utils.checkNotNull(docUrl, "docUrl");
        this.docUrl = docUrl;
        return this;
    }

    /**
     * A human-readable message that describes the error.
     */
    public ErrorResponse withMessage(String message) {
        Utils.checkNotNull(message, "message");
        this.message = Optional.ofNullable(message);
        return this;
    }
    
    /**
     * A human-readable message that describes the error.
     */
    public ErrorResponse withMessage(Optional<String> message) {
        Utils.checkNotNull(message, "message");
        this.message = message;
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
        ErrorResponse other = (ErrorResponse) o;
        return
            Objects.deepEquals(this.code, other.code) &&
            Objects.deepEquals(this.docUrl, other.docUrl) &&
            Objects.deepEquals(this.message, other.message);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            code,
            docUrl,
            message);
    }

    @Override
    public String toString() {
        return Utils.toString(ErrorResponse.class,
                "code", code,
                "docUrl", docUrl,
                "message", message);
    }

    public final static class Builder {

        private Optional<? extends Code> code = Optional.empty();

        private Optional<String> docUrl = Optional.empty();

        private Optional<String> message = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }

        /**
         * A machine-readable code that describes the error.
         */
        public Builder code(Code code) {
            Utils.checkNotNull(code, "code");
            this.code = Optional.ofNullable(code);
            return this;
        }
        
        /**
         * A machine-readable code that describes the error.
         */
        public Builder code(Optional<? extends Code> code) {
            Utils.checkNotNull(code, "code");
            this.code = code;
            return this;
        }

        /**
         * A link to the documentation that describes the error.
         */
        public Builder docUrl(String docUrl) {
            Utils.checkNotNull(docUrl, "docUrl");
            this.docUrl = Optional.ofNullable(docUrl);
            return this;
        }
        
        /**
         * A link to the documentation that describes the error.
         */
        public Builder docUrl(Optional<String> docUrl) {
            Utils.checkNotNull(docUrl, "docUrl");
            this.docUrl = docUrl;
            return this;
        }

        /**
         * A human-readable message that describes the error.
         */
        public Builder message(String message) {
            Utils.checkNotNull(message, "message");
            this.message = Optional.ofNullable(message);
            return this;
        }
        
        /**
         * A human-readable message that describes the error.
         */
        public Builder message(Optional<String> message) {
            Utils.checkNotNull(message, "message");
            this.message = message;
            return this;
        }

        public ErrorResponse build() {
            return new ErrorResponse(
                code,
                docUrl,
                message);
        }
    }
}
