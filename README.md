# wh-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>org.openapitools</groupId>
    <artifactId>openapi-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

- target/openapi-android-client-1.0.0.jar
- target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.openapitools.client.api.ScreenshotApi;

public class ScreenshotApiExample {

    public static void main(String[] args) {
        ScreenshotApi apiInstance = new ScreenshotApi();
        String token = null; // String | A valid token is needed to make paid API calls. Tokens can be managed from your account.
        String hash = null; // String | The hash value is for authenticated requests. If you want to publish this URL, you should use the authenticated requests.
        String url = null; // String | The URL of the website you want to capture. Please include the protocol (http:// or https://).
        String fileType = null; // String | The image file format of the captured screenshot. Either png, jpeg or PDF with 72 dpi.
        Long ttl = null; // Long | Number of seconds the capture file is cached by our CDN. An API request that is loaded through the cache does not count as a paid request. You can set a number of seconds from 0 seconds up to 2592000 seconds. This is a maximum of 30 days.
        Boolean invalidate = null; // Boolean | Force the API to invalidate the cache and capture a new screenshot. This call costs you additional money, because a call of a cache hit is not charged.
        Boolean full = null; // Boolean | Set this parameter to true if you want to screenshot the whole web page in full size.
        Boolean lazyloadScroll = false; // Boolean | Set this parameter to true to scroll down through the entire page before taking a screenshot. This is useful for triggering animations or lazy load elements in full screen.
        Long delay = null; // Long | The delay in milliseconds to wait after the page loads before taking the screenshot. This is in milliseconds. One second is 1000 milliseconds. From 0 milliseconds to a maximum of 10,000 milliseconds.
        Long width = 1920; // Long | The width, in pixels, of the browser viewport to use.
        Long height = 1080; // Long | The height, in pixels, of the browser viewport to use. Ignored if you set full to true.
        Long quality = 90; // Long | The quality of the image between 0 and 100. This works only for the jpeg format, for PNG images the parameter is applied only during compression.
        BigDecimal scale = 1.0; // BigDecimal | The scale factor of the device to use when taking the screenshot. For example, a scale factor of 2 produces a high-resolution screenshot suitable for viewing on Retina devices. The larger the scale factor, the larger the screenshot produced.
        Long x = 0; // Long | The starting point of a section screenshot on the X axis.
        Long y = 0; // Long | The starting point of a section screenshot on the Y axis.
        Boolean redirect = false; // Boolean | If you set Redirect, the response will be a 302 redirect to the screenshot file in our CDN.
        String language = null; // String | Sets the Accept-Language header on requests to the target URL so that you can take screenshots from a website with a specific language.
        Boolean randomUserAgent = false; // Boolean | Sets a random user agent header to emulate a different devices when taking screenshots.
        String userAgent = null; // String | Sets the user agent header to emulate a specific device when taking screenshots.
        String headers = null; // String | A semicolon-separated list of header parameters to be used when capturing the screenshot. Each header should be passed as a key-value pair and multiple pairs should be separated by a semicolon.
        String cookies = null; // String | A semicolon-separated list of cookies to be used when capturing the screenshot. Each cookies should be passed as a key-value pair and multiple pairs should be separated by a semicolon.
        String css = null; // String | Inject your custom CSS.
        String js = null; // String | Inject your custom Javascript.
        String wait = null; // String | Wait until the specified CSS selector matches an element present in the page before taking a screenshot. The process is canceled after 60 seconds.
        String element = null; // String | Takes a screenshot of the first element matched by the specified CSS selector. This is ignored if full is true. (This option cannot be used with the PDF export format.)
        String timezone = Europe/Berlin; // String | The IANA time zone identifier used for this capture.
        String device = null; // String | The device used in the emulation.
        BigDecimal latitude = 0.0; // BigDecimal | The latitude used in the emulation of the geo-location.
        BigDecimal longitude = 0.0; // BigDecimal | The longitude used in the emulation of the geo-location.
        BigDecimal accuracy = 2.0; // BigDecimal | The accuracy in meters used in the emulation of the geo-location.
        String proxy = null; // String | Use an address of a proxy server through which the screenshot should be taken. The proxy address should be formatted as http://username:password@proxyserver.com:31280
        Boolean adblock = false; // Boolean | Prevent ads from being displayed. Block requests from popular ad networks and hide frequent ads.
        Boolean hideCookieBanners = false; // Boolean | Prevent cookie banners and pop-ups from being displayed. The best possible result is tried.
        try {
            File result = apiInstance.captureScreenshotAuthenticated(token, hash, url, fileType, ttl, invalidate, full, lazyloadScroll, delay, width, height, quality, scale, x, y, redirect, language, randomUserAgent, userAgent, headers, cookies, css, js, wait, element, timezone, device, latitude, longitude, accuracy, proxy, adblock, hideCookieBanners);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScreenshotApi#captureScreenshotAuthenticated");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.webseite-herunterladen.de/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ScreenshotApi* | [**captureScreenshotAuthenticated**](docs/ScreenshotApi.md#captureScreenshotAuthenticated) | **GET** /capture/{token}/{hash} | 
*ScreenshotApi* | [**captureScreenshotUnauthenticated**](docs/ScreenshotApi.md#captureScreenshotUnauthenticated) | **GET** /capture/{token} | 


## Documentation for Models

 - [ErrorModel](docs/ErrorModel.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



