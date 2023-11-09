# RetryAuthenticationResponseStatus

The status of the retry. Possible values are:
  * `approved` - The retry was approved and a new code was sent.
  * `denied` - The retry was denied.
  * `no_attempt` - No attempt was sent yet so we cannot perform a retry.
  * `rate_limited` - The authentication was rate limited and cannot be retried.
  * `expired_auth` - The authentication has expired and cannot be retried.
  * `already_validated` - The authentication has already been validated.



## Values

| Name                | Value               |
| ------------------- | ------------------- |
| `APPROVED`          | approved            |
| `DENIED`            | denied              |
| `NO_ATTEMPT`        | no_attempt          |
| `RATE_LIMITED`      | rate_limited        |
| `EXPIRED_AUTH`      | expired_auth        |
| `ALREADY_VALIDATED` | already_validated   |