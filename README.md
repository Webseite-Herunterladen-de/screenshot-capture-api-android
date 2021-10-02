# io.swagger.client - Kotlin client library for Screenshot Capture API

## Requires

* Kotlin 1.4.30
* Gradle 5.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in Swagger definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://api.screenshot-capture-api.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ScreenshotApi* | [**captureScreenshotAuthenticated**](docs/ScreenshotApi.md#capturescreenshotauthenticated) | **GET** /capture/{token}/{hash} | 
*ScreenshotApi* | [**captureScreenshotUnauthenticated**](docs/ScreenshotApi.md#capturescreenshotunauthenticated) | **GET** /capture/{token} | 

<a name="documentation-for-models"></a>
## Documentation for Models

 - [io.swagger.client.models.ErrorModel](docs/ErrorModel.md)

<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
