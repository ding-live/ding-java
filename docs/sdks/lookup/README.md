# Lookup
(*lookup()*)

## Overview

Retrieve up-to-date metadata about a specific phone number

### Available Operations

* [lookup](#lookup) - Look up for phone number

## lookup

Look up for phone number

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import live.ding.dingSdk.Ding;
import live.ding.dingSdk.models.errors.ErrorResponse1;
import live.ding.dingSdk.models.operations.LookupResponse;
import live.ding.dingSdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws ErrorResponse1, Exception {

        Ding sdk = Ding.builder()
                .security(Security.builder()
                    .apiKey("YOUR_API_KEY")
                    .build())
            .build();

        LookupResponse res = sdk.lookup().lookup()
                .customerUuid("69a197d9-356c-45d1-a807-41874e16b555")
                .phoneNumber("<value>")
                .call();

        if (res.lookupResponse().isPresent()) {
            // handle response
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

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| models/errors/ErrorResponse1 | 400                          | application/json             |
| models/errors/SDKError       | 4XX, 5XX                     | \*/\*                        |