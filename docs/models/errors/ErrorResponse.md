# ErrorResponse

Bad Request


## Fields

| Field                                                             | Type                                                              | Required                                                          | Description                                                       | Example                                                           |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `code`                                                            | [Optional<Code>](../../models/errors/Code.md)                     | :heavy_minus_sign:                                                | A machine-readable code that describes the error.                 | invalid_phone_number                                              |
| `docUrl`                                                          | *Optional<String>*                                                | :heavy_minus_sign:                                                | A link to the documentation that describes the error.             | https://docs.prelude.so/api-reference/errors#invalid_phone_number |
| `message`                                                         | *Optional<String>*                                                | :heavy_minus_sign:                                                | A human-readable message that describes the error.                | +0 is not a valid phone number                                    |