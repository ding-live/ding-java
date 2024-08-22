# Lookup
(*lookup()*)

## Overview

Retrieve up-to-date metadata about a specific phone number

### Available Operations

* [lookup](#lookup) - Perform a phone number lookup

## lookup

Perform a phone number lookup

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import live.ding.dingSdk.Ding;
import live.ding.dingSdk.models.errors.SDKError;
import live.ding.dingSdk.models.operations.LookupResponse;
import live.ding.dingSdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Ding sdk = Ding.builder()
                .security(Security.builder()
                    .apiKey("YOUR_API_KEY")
                    .build())
                .build();

            LookupResponse res = sdk.lookup().lookup()
                .customerUuid("6e93aa15-9177-4d09-8395-b69ce50db1c8")
                .phoneNumber("<value>")
                .call();

            if (res.lookupResponse().isPresent()) {
                // handle response
            }
        } catch (live.ding.dingSdk.models.errors.ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `customerUuid`     | *String*           | :heavy_check_mark: | N/A                |
| `phoneNumber`      | *String*           | :heavy_check_mark: | N/A                |

### Response

**[LookupResponse](../../models/operations/LookupResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400                         | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |
