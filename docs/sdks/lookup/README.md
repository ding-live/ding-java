# Lookup
(*lookup*)

## Overview

Retrieve up-to-date metadata about a specific phone number

### Available Operations

* [lookup](#lookup) - Lookup a number

## lookup

Lookup a number

### Example Usage

```java
package hello.world;

import live.ding.dingSdk.Ding;
import live.ding.dingSdk.models.operations.LookupRequest;
import live.ding.dingSdk.models.operations.LookupResponse;
import live.ding.dingSdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ding sdk = Ding.builder()
                .setSecurity(new Security("YOUR_API_KEY"){{
                    apiKey = "YOUR_API_KEY";
                }})
                .build();

            LookupResponse res = sdk.lookup.lookup("6e93aa15-9177-4d09-8395-b69ce50db1c8", "string");

            if (res.lookupResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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

**[live.ding.dingSdk.models.operations.LookupResponse](../../models/operations/LookupResponse.md)**

