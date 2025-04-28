# Lookup
(*lookup()*)

## Overview

Retrieve up-to-date metadata about a specific phone number

### Available Operations

* [lookup](#lookup) - Look up for phone number

## lookup

Perform a phone number lookup.

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import live.ding.dingsdk.Ding;
import live.ding.dingsdk.models.errors.ErrorResponse;
import live.ding.dingsdk.models.operations.LookupResponse;
import live.ding.dingsdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

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

| Parameter                                      | Type                                           | Required                                       | Description                                    |
| ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- |
| `customerUuid`                                 | *String*                                       | :heavy_check_mark:                             | N/A                                            |
| `phoneNumber`                                  | *String*                                       | :heavy_check_mark:                             | N/A                                            |
| `type`                                         | List\<[Type](../../models/operations/Type.md)> | :heavy_minus_sign:                             | N/A                                            |

### Response

**[LookupResponse](../../models/operations/LookupResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400                         | application/json            |
| models/errors/SDKError      | 4XX, 5XX                    | \*/\*                       |