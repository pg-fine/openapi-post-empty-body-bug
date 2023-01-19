# openapi-post-empty-body-bug

This repository shows a bug in the OpenAPI generator for java clients using okhttp3.
When making a POST request with an empty body the generated client produces a NullPointerException.

Run to reproduce this bug:
```
./gradlew test
```
or
```
./gradle test
```



## UPDATE
__The bug is resolved in OpenApi Version 6.2.0__
