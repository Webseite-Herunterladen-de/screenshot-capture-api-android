# ScreenshotApi

All URIs are relative to *https://api.webseite-herunterladen.de/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**placeScreenshotOrderAuthenticated**](ScreenshotApi.md#placeScreenshotOrderAuthenticated) | **GET** /capture/{token}/{hash} | 
[**placeScreenshotOrderUnauthenticated**](ScreenshotApi.md#placeScreenshotOrderUnauthenticated) | **GET** /capture/{token} | 



## placeScreenshotOrderAuthenticated

> File placeScreenshotOrderAuthenticated(token, hash, url, fileType, ttl, invalidate, full, lazyloadScroll, delay, width, height, quality, scale, x, y, redirect, language, randomUserAgent, userAgent, headers, cookies, css, js, wait, element, timezone, device, latitude, longitude, accuracy, proxy, adblock, hideCookieBanners)



Webseite-Herunterladen.de Screenshot Capture is a very simple but powerful screenshot API that anyone can easily use to create pixel-perfect website screenshots. It always uses a recent version of Chrome to ensure that all modern web features are fully supported and rendering is exactly as your customers would expect.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ScreenshotApi;

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
    File result = apiInstance.placeScreenshotOrderAuthenticated(token, hash, url, fileType, ttl, invalidate, full, lazyloadScroll, delay, width, height, quality, scale, x, y, redirect, language, randomUserAgent, userAgent, headers, cookies, css, js, wait, element, timezone, device, latitude, longitude, accuracy, proxy, adblock, hideCookieBanners);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScreenshotApi#placeScreenshotOrderAuthenticated");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| A valid token is needed to make paid API calls. Tokens can be managed from your account. | [default to null]
 **hash** | **String**| The hash value is for authenticated requests. If you want to publish this URL, you should use the authenticated requests. | [default to null]
 **url** | **String**| The URL of the website you want to capture. Please include the protocol (http:// or https://). | [default to null]
 **fileType** | **String**| The image file format of the captured screenshot. Either png, jpeg or PDF with 72 dpi. | [optional] [default to null] [enum: png, pdf, jpeg]
 **ttl** | **Long**| Number of seconds the capture file is cached by our CDN. An API request that is loaded through the cache does not count as a paid request. You can set a number of seconds from 0 seconds up to 2592000 seconds. This is a maximum of 30 days. | [optional] [default to null]
 **invalidate** | **Boolean**| Force the API to invalidate the cache and capture a new screenshot. This call costs you additional money, because a call of a cache hit is not charged. | [optional] [default to null]
 **full** | **Boolean**| Set this parameter to true if you want to screenshot the whole web page in full size. | [optional] [default to null]
 **lazyloadScroll** | **Boolean**| Set this parameter to true to scroll down through the entire page before taking a screenshot. This is useful for triggering animations or lazy load elements in full screen. | [optional] [default to false]
 **delay** | **Long**| The delay in milliseconds to wait after the page loads before taking the screenshot. This is in milliseconds. One second is 1000 milliseconds. From 0 milliseconds to a maximum of 10,000 milliseconds. | [optional] [default to null]
 **width** | **Long**| The width, in pixels, of the browser viewport to use. | [optional] [default to 1920]
 **height** | **Long**| The height, in pixels, of the browser viewport to use. Ignored if you set full to true. | [optional] [default to 1080]
 **quality** | **Long**| The quality of the image between 0 and 100. This works only for the jpeg format, for PNG images the parameter is applied only during compression. | [optional] [default to 90]
 **scale** | **BigDecimal**| The scale factor of the device to use when taking the screenshot. For example, a scale factor of 2 produces a high-resolution screenshot suitable for viewing on Retina devices. The larger the scale factor, the larger the screenshot produced. | [optional] [default to 1.0]
 **x** | **Long**| The starting point of a section screenshot on the X axis. | [optional] [default to 0]
 **y** | **Long**| The starting point of a section screenshot on the Y axis. | [optional] [default to 0]
 **redirect** | **Boolean**| If you set Redirect, the response will be a 302 redirect to the screenshot file in our CDN. | [optional] [default to false]
 **language** | **String**| Sets the Accept-Language header on requests to the target URL so that you can take screenshots from a website with a specific language. | [optional] [default to null]
 **randomUserAgent** | **Boolean**| Sets a random user agent header to emulate a different devices when taking screenshots. | [optional] [default to false]
 **userAgent** | **String**| Sets the user agent header to emulate a specific device when taking screenshots. | [optional] [default to null]
 **headers** | **String**| A semicolon-separated list of header parameters to be used when capturing the screenshot. Each header should be passed as a key-value pair and multiple pairs should be separated by a semicolon. | [optional] [default to null]
 **cookies** | **String**| A semicolon-separated list of cookies to be used when capturing the screenshot. Each cookies should be passed as a key-value pair and multiple pairs should be separated by a semicolon. | [optional] [default to null]
 **css** | **String**| Inject your custom CSS. | [optional] [default to null]
 **js** | **String**| Inject your custom Javascript. | [optional] [default to null]
 **wait** | **String**| Wait until the specified CSS selector matches an element present in the page before taking a screenshot. The process is canceled after 60 seconds. | [optional] [default to null]
 **element** | **String**| Takes a screenshot of the first element matched by the specified CSS selector. This is ignored if full is true. (This option cannot be used with the PDF export format.) | [optional] [default to null]
 **timezone** | **String**| The IANA time zone identifier used for this capture. | [optional] [default to Europe/Berlin]
 **device** | **String**| The device used in the emulation. | [optional] [default to null] [enum: Blackberry PlayBook, Blackberry PlayBook landscape, BlackBerry Z30, BlackBerry Z30 landscape, Galaxy Note 3, Galaxy Note 3 landscape, Galaxy Note II, Galaxy Note II landscape, Galaxy S III, Galaxy S III landscape, Galaxy S5, Galaxy S5 landscape, iPad, iPad landscape, iPad Mini, iPad Mini landscape, iPad Pro, iPad Pro landscape, iPhone 4, iPhone 4 landscape, iPhone 5, iPhone 5 landscape, iPhone 6, iPhone 6 landscape, iPhone 6 Plus, iPhone 6 Plus landscape, iPhone 7, iPhone 7 landscape, iPhone 7 Plus, iPhone 7 Plus landscape, iPhone 8, iPhone 8 landscape, iPhone 8 Plus, iPhone 8 Plus landscape, iPhone SE, iPhone SE landscape, iPhone X, iPhone X landscape, iPhone XR, iPhone XR landscape, iPhone 11, iPhone 11 landscape, iPhone 11 Pro, iPhone 11 Pro landscape, iPhone 11 Pro Max, iPhone 11 Pro Max landscape, JioPhone 2, JioPhone 2 landscape, Kindle Fire HDX, Kindle Fire HDX landscape, LG Optimus L70, LG Optimus L70 landscape, Microsoft Lumia 550, Microsoft Lumia 950, Microsoft Lumia 950 landscape, Nexus 10, Nexus 10 landscape, Nexus 4, Nexus 4 landscape, Nexus 5, Nexus 5 landscape, Nexus 5X, Nexus 5X landscape, Nexus 6, Nexus 6 landscape, Nexus 6P, Nexus 6P landscape, Nexus 7, Nexus 7 landscape, Nokia Lumia 520, Nokia Lumia 520 landscape, Nokia N9, Nokia N9 landscape, Pixel 2, Pixel 2 landscape, Pixel 2 XL, Pixel 2 XL landscape]
 **latitude** | **BigDecimal**| The latitude used in the emulation of the geo-location. | [optional] [default to 0.0]
 **longitude** | **BigDecimal**| The longitude used in the emulation of the geo-location. | [optional] [default to 0.0]
 **accuracy** | **BigDecimal**| The accuracy in meters used in the emulation of the geo-location. | [optional] [default to 2.0]
 **proxy** | **String**| Use an address of a proxy server through which the screenshot should be taken. The proxy address should be formatted as http://username:password@proxyserver.com:31280 | [optional] [default to null]
 **adblock** | **Boolean**| Prevent ads from being displayed. Block requests from popular ad networks and hide frequent ads. | [optional] [default to false]
 **hideCookieBanners** | **Boolean**| Prevent cookie banners and pop-ups from being displayed. The best possible result is tried. | [optional] [default to false]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/pdf, image/jpeg, image/png


## placeScreenshotOrderUnauthenticated

> File placeScreenshotOrderUnauthenticated(token, url, fileType, ttl, invalidate, full, lazyloadScroll, delay, width, height, quality, scale, x, y, redirect, language, randomUserAgent, userAgent, headers, cookies, css, js, wait, element, timezone, device, latitude, longitude, accuracy, proxy, adblock, hideCookieBanners)



Webseite-Herunterladen.de Screenshot Capture is a very simple but powerful screenshot API that anyone can easily use to create pixel-perfect website screenshots. It always uses a recent version of Chrome to ensure that all modern web features are fully supported and rendering is exactly as your customers would expect.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ScreenshotApi;

ScreenshotApi apiInstance = new ScreenshotApi();
String token = null; // String | A valid token is needed to make paid API calls. Tokens can be managed from your account.
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
    File result = apiInstance.placeScreenshotOrderUnauthenticated(token, url, fileType, ttl, invalidate, full, lazyloadScroll, delay, width, height, quality, scale, x, y, redirect, language, randomUserAgent, userAgent, headers, cookies, css, js, wait, element, timezone, device, latitude, longitude, accuracy, proxy, adblock, hideCookieBanners);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScreenshotApi#placeScreenshotOrderUnauthenticated");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| A valid token is needed to make paid API calls. Tokens can be managed from your account. | [default to null]
 **url** | **String**| The URL of the website you want to capture. Please include the protocol (http:// or https://). | [default to null]
 **fileType** | **String**| The image file format of the captured screenshot. Either png, jpeg or PDF with 72 dpi. | [optional] [default to null] [enum: png, pdf, jpeg]
 **ttl** | **Long**| Number of seconds the capture file is cached by our CDN. An API request that is loaded through the cache does not count as a paid request. You can set a number of seconds from 0 seconds up to 2592000 seconds. This is a maximum of 30 days. | [optional] [default to null]
 **invalidate** | **Boolean**| Force the API to invalidate the cache and capture a new screenshot. This call costs you additional money, because a call of a cache hit is not charged. | [optional] [default to null]
 **full** | **Boolean**| Set this parameter to true if you want to screenshot the whole web page in full size. | [optional] [default to null]
 **lazyloadScroll** | **Boolean**| Set this parameter to true to scroll down through the entire page before taking a screenshot. This is useful for triggering animations or lazy load elements in full screen. | [optional] [default to false]
 **delay** | **Long**| The delay in milliseconds to wait after the page loads before taking the screenshot. This is in milliseconds. One second is 1000 milliseconds. From 0 milliseconds to a maximum of 10,000 milliseconds. | [optional] [default to null]
 **width** | **Long**| The width, in pixels, of the browser viewport to use. | [optional] [default to 1920]
 **height** | **Long**| The height, in pixels, of the browser viewport to use. Ignored if you set full to true. | [optional] [default to 1080]
 **quality** | **Long**| The quality of the image between 0 and 100. This works only for the jpeg format, for PNG images the parameter is applied only during compression. | [optional] [default to 90]
 **scale** | **BigDecimal**| The scale factor of the device to use when taking the screenshot. For example, a scale factor of 2 produces a high-resolution screenshot suitable for viewing on Retina devices. The larger the scale factor, the larger the screenshot produced. | [optional] [default to 1.0]
 **x** | **Long**| The starting point of a section screenshot on the X axis. | [optional] [default to 0]
 **y** | **Long**| The starting point of a section screenshot on the Y axis. | [optional] [default to 0]
 **redirect** | **Boolean**| If you set Redirect, the response will be a 302 redirect to the screenshot file in our CDN. | [optional] [default to false]
 **language** | **String**| Sets the Accept-Language header on requests to the target URL so that you can take screenshots from a website with a specific language. | [optional] [default to null]
 **randomUserAgent** | **Boolean**| Sets a random user agent header to emulate a different devices when taking screenshots. | [optional] [default to false]
 **userAgent** | **String**| Sets the user agent header to emulate a specific device when taking screenshots. | [optional] [default to null]
 **headers** | **String**| A semicolon-separated list of header parameters to be used when capturing the screenshot. Each header should be passed as a key-value pair and multiple pairs should be separated by a semicolon. | [optional] [default to null]
 **cookies** | **String**| A semicolon-separated list of cookies to be used when capturing the screenshot. Each cookies should be passed as a key-value pair and multiple pairs should be separated by a semicolon. | [optional] [default to null]
 **css** | **String**| Inject your custom CSS. | [optional] [default to null]
 **js** | **String**| Inject your custom Javascript. | [optional] [default to null]
 **wait** | **String**| Wait until the specified CSS selector matches an element present in the page before taking a screenshot. The process is canceled after 60 seconds. | [optional] [default to null]
 **element** | **String**| Takes a screenshot of the first element matched by the specified CSS selector. This is ignored if full is true. (This option cannot be used with the PDF export format.) | [optional] [default to null]
 **timezone** | **String**| The IANA time zone identifier used for this capture. | [optional] [default to Europe/Berlin]
 **device** | **String**| The device used in the emulation. | [optional] [default to null] [enum: Blackberry PlayBook, Blackberry PlayBook landscape, BlackBerry Z30, BlackBerry Z30 landscape, Galaxy Note 3, Galaxy Note 3 landscape, Galaxy Note II, Galaxy Note II landscape, Galaxy S III, Galaxy S III landscape, Galaxy S5, Galaxy S5 landscape, iPad, iPad landscape, iPad Mini, iPad Mini landscape, iPad Pro, iPad Pro landscape, iPhone 4, iPhone 4 landscape, iPhone 5, iPhone 5 landscape, iPhone 6, iPhone 6 landscape, iPhone 6 Plus, iPhone 6 Plus landscape, iPhone 7, iPhone 7 landscape, iPhone 7 Plus, iPhone 7 Plus landscape, iPhone 8, iPhone 8 landscape, iPhone 8 Plus, iPhone 8 Plus landscape, iPhone SE, iPhone SE landscape, iPhone X, iPhone X landscape, iPhone XR, iPhone XR landscape, iPhone 11, iPhone 11 landscape, iPhone 11 Pro, iPhone 11 Pro landscape, iPhone 11 Pro Max, iPhone 11 Pro Max landscape, JioPhone 2, JioPhone 2 landscape, Kindle Fire HDX, Kindle Fire HDX landscape, LG Optimus L70, LG Optimus L70 landscape, Microsoft Lumia 550, Microsoft Lumia 950, Microsoft Lumia 950 landscape, Nexus 10, Nexus 10 landscape, Nexus 4, Nexus 4 landscape, Nexus 5, Nexus 5 landscape, Nexus 5X, Nexus 5X landscape, Nexus 6, Nexus 6 landscape, Nexus 6P, Nexus 6P landscape, Nexus 7, Nexus 7 landscape, Nokia Lumia 520, Nokia Lumia 520 landscape, Nokia N9, Nokia N9 landscape, Pixel 2, Pixel 2 landscape, Pixel 2 XL, Pixel 2 XL landscape]
 **latitude** | **BigDecimal**| The latitude used in the emulation of the geo-location. | [optional] [default to 0.0]
 **longitude** | **BigDecimal**| The longitude used in the emulation of the geo-location. | [optional] [default to 0.0]
 **accuracy** | **BigDecimal**| The accuracy in meters used in the emulation of the geo-location. | [optional] [default to 2.0]
 **proxy** | **String**| Use an address of a proxy server through which the screenshot should be taken. The proxy address should be formatted as http://username:password@proxyserver.com:31280 | [optional] [default to null]
 **adblock** | **Boolean**| Prevent ads from being displayed. Block requests from popular ad networks and hide frequent ads. | [optional] [default to false]
 **hideCookieBanners** | **Boolean**| Prevent cookie banners and pop-ups from being displayed. The best possible result is tried. | [optional] [default to false]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/pdf, image/jpeg, image/png
