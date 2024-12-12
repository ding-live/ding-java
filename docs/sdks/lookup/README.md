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
import java.util.List;
import live.ding.dingsdk.Ding;
import live.ding.dingsdk.models.errors.ErrorResponse;
import live.ding.dingsdk.models.operations.LookupResponse;
import live.ding.dingsdk.models.operations.Type;
import live.ding.dingsdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        Ding sdk = Ding.builder()
                .security(Security.builder()
                    .apiKey("YOUR_API_KEY")
                    .build())
            .build();

        LookupResponse res = sdk.lookup().lookup()
                .customerUuid("6e93aa15-9177-4d09-8395-b69ce50db1c8")
                .phoneNumber("<value>")
                .type(List.of(
                    Type.CNAM))
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