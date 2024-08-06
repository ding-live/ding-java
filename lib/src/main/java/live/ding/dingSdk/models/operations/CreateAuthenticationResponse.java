/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package live.ding.dingSdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class CreateAuthenticationResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public CreateAuthenticationResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * OK
     */
    
    public live.ding.dingSdk.models.shared.CreateAuthenticationResponse createAuthenticationResponse;

    public CreateAuthenticationResponse withCreateAuthenticationResponse(live.ding.dingSdk.models.shared.CreateAuthenticationResponse createAuthenticationResponse) {
        this.createAuthenticationResponse = createAuthenticationResponse;
        return this;
    }
    
    /**
     * Bad Request
     */
    
    public live.ding.dingSdk.models.shared.ErrorResponse errorResponse;

    public CreateAuthenticationResponse withErrorResponse(live.ding.dingSdk.models.shared.ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public CreateAuthenticationResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public CreateAuthenticationResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public CreateAuthenticationResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode, @JsonProperty("RawResponse") HttpResponse<byte[]> rawResponse) {
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
  }
}
