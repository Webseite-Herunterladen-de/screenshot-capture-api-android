# ScreenshotApi

All URIs are relative to *https://api.webseite-herunterladen.de/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**captureScreenshotAuthenticated**](ScreenshotApi.md#captureScreenshotAuthenticated) | **GET** /capture/{token}/{hash} | 
[**captureScreenshotUnauthenticated**](ScreenshotApi.md#captureScreenshotUnauthenticated) | **GET** /capture/{token} | 

<a name="captureScreenshotAuthenticated"></a>
# **captureScreenshotAuthenticated**
> kotlin.Array&lt;kotlin.Byte&gt; captureScreenshotAuthenticated(token, hash, url, fileType, ttl, invalidate, full, lazyloadScroll, delay, width, height, quality, scale, x, y, redirect, language, randomUserAgent, userAgent, headers, cookies, css, js, wait, element, timezone, device, latitude, longitude, accuracy, proxy, adblock, hideCookieBanners)



Webseite-Herunterladen.de Screenshot Capture is a very simple but powerful screenshot API that anyone can easily use to create pixel-perfect website screenshots. It always uses a recent version of Chrome to ensure that all modern web features are fully supported and rendering is exactly as your customers would expect.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ScreenshotApi()
val token : kotlin.String = token_example // kotlin.String | A valid token is needed to make paid API calls. Tokens can be managed from your account.
val hash : kotlin.String = hash_example // kotlin.String | The hash value is for authenticated requests. If you want to publish this URL, you should use the authenticated requests.
val url : kotlin.String = url_example // kotlin.String | The URL of the website you want to capture. Please include the protocol (http:// or https://).
val fileType : kotlin.String = fileType_example // kotlin.String | The image file format of the captured screenshot. Either png, jpeg, webp or PDF with 72 dpi.
val ttl : kotlin.Long = 789 // kotlin.Long | Number of seconds the capture file is cached by our CDN. An API request that is loaded through the cache does not count as a paid request. You can set a number of seconds from 0 seconds up to 2592000 seconds. This is a maximum of 30 days.
val invalidate : kotlin.Boolean = true // kotlin.Boolean | Force the API to invalidate the cache and capture a new screenshot. This call costs you additional money, because a call of a cache hit is not charged.
val full : kotlin.Boolean = true // kotlin.Boolean | Set this parameter to true if you want to screenshot the whole web page in full size.
val lazyloadScroll : kotlin.Boolean = true // kotlin.Boolean | Set this parameter to true to scroll down through the entire page before taking a screenshot. This is useful for triggering animations or lazy load elements in full screen.
val delay : kotlin.Long = 789 // kotlin.Long | The delay in milliseconds to wait after the page loads before taking the screenshot. This is in milliseconds. One second is 1000 milliseconds. From 0 milliseconds to a maximum of 10,000 milliseconds.
val width : kotlin.Long = 789 // kotlin.Long | The width, in pixels, of the browser viewport to use.
val height : kotlin.Long = 789 // kotlin.Long | The height, in pixels, of the browser viewport to use. Ignored if you set full to true.
val quality : kotlin.Long = 789 // kotlin.Long | The quality of the image between 0 and 100. This works only for the jpeg format, for PNG images the parameter is applied only during compression.
val scale : java.math.BigDecimal = 1.2 // java.math.BigDecimal | The scale factor of the device to use when taking the screenshot. For example, a scale factor of 2 produces a high-resolution screenshot suitable for viewing on Retina devices. The larger the scale factor, the larger the screenshot produced.
val x : kotlin.Long = 789 // kotlin.Long | The starting point of a section screenshot on the X axis.
val y : kotlin.Long = 789 // kotlin.Long | The starting point of a section screenshot on the Y axis.
val redirect : kotlin.Boolean = true // kotlin.Boolean | If you set Redirect, the response will be a 302 redirect to the screenshot file in our CDN.
val language : kotlin.String = language_example // kotlin.String | Sets the Accept-Language header on requests to the target URL so that you can take screenshots from a website with a specific language.
val randomUserAgent : kotlin.Boolean = true // kotlin.Boolean | Sets a random user agent header to emulate a different devices when taking screenshots.
val userAgent : kotlin.String = userAgent_example // kotlin.String | Sets the user agent header to emulate a specific device when taking screenshots.
val headers : kotlin.String = headers_example // kotlin.String | A semicolon-separated list of header parameters to be used when capturing the screenshot. Each header should be passed as a key-value pair and multiple pairs should be separated by a semicolon.
val cookies : kotlin.String = cookies_example // kotlin.String | A semicolon-separated list of cookies to be used when capturing the screenshot. Each cookies should be passed as a key-value pair and multiple pairs should be separated by a semicolon.
val css : kotlin.String = css_example // kotlin.String | Inject your custom CSS.
val js : kotlin.String = js_example // kotlin.String | Inject your custom Javascript.
val wait : kotlin.String = wait_example // kotlin.String | Wait until the specified CSS selector matches an element present in the page before taking a screenshot. The process is canceled after 60 seconds.
val element : kotlin.String = element_example // kotlin.String | Takes a screenshot of the first element matched by the specified CSS selector. This is ignored if full is true. (This option cannot be used with the PDF export format.)
val timezone : kotlin.String = timezone_example // kotlin.String | The IANA time zone identifier used for this capture.
val device : kotlin.String = device_example // kotlin.String | The device used in the emulation.
val latitude : java.math.BigDecimal = 1.2 // java.math.BigDecimal | The latitude used in the emulation of the geo-location.
val longitude : java.math.BigDecimal = 1.2 // java.math.BigDecimal | The longitude used in the emulation of the geo-location.
val accuracy : java.math.BigDecimal = 1.2 // java.math.BigDecimal | The accuracy in meters used in the emulation of the geo-location.
val proxy : kotlin.String = proxy_example // kotlin.String | Use an address of a proxy server through which the screenshot should be taken. The proxy address should be formatted as http://username:password@proxyserver.com:31280
val adblock : kotlin.Boolean = true // kotlin.Boolean | Prevent ads from being displayed. Block requests from popular ad networks and hide frequent ads.
val hideCookieBanners : kotlin.Boolean = true // kotlin.Boolean | Prevent cookie banners and pop-ups from being displayed. The best possible result is tried.
try {
    val result : kotlin.Array<kotlin.Byte> = apiInstance.captureScreenshotAuthenticated(token, hash, url, fileType, ttl, invalidate, full, lazyloadScroll, delay, width, height, quality, scale, x, y, redirect, language, randomUserAgent, userAgent, headers, cookies, css, js, wait, element, timezone, device, latitude, longitude, accuracy, proxy, adblock, hideCookieBanners)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScreenshotApi#captureScreenshotAuthenticated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScreenshotApi#captureScreenshotAuthenticated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| A valid token is needed to make paid API calls. Tokens can be managed from your account. |
 **hash** | **kotlin.String**| The hash value is for authenticated requests. If you want to publish this URL, you should use the authenticated requests. |
 **url** | **kotlin.String**| The URL of the website you want to capture. Please include the protocol (http:// or https://). |
 **fileType** | **kotlin.String**| The image file format of the captured screenshot. Either png, jpeg, webp or PDF with 72 dpi. | [optional] [enum: png, pdf, jpeg, webp]
 **ttl** | **kotlin.Long**| Number of seconds the capture file is cached by our CDN. An API request that is loaded through the cache does not count as a paid request. You can set a number of seconds from 0 seconds up to 2592000 seconds. This is a maximum of 30 days. | [optional] [enum: ]
 **invalidate** | **kotlin.Boolean**| Force the API to invalidate the cache and capture a new screenshot. This call costs you additional money, because a call of a cache hit is not charged. | [optional]
 **full** | **kotlin.Boolean**| Set this parameter to true if you want to screenshot the whole web page in full size. | [optional]
 **lazyloadScroll** | **kotlin.Boolean**| Set this parameter to true to scroll down through the entire page before taking a screenshot. This is useful for triggering animations or lazy load elements in full screen. | [optional] [default to false]
 **delay** | **kotlin.Long**| The delay in milliseconds to wait after the page loads before taking the screenshot. This is in milliseconds. One second is 1000 milliseconds. From 0 milliseconds to a maximum of 10,000 milliseconds. | [optional] [enum: ]
 **width** | **kotlin.Long**| The width, in pixels, of the browser viewport to use. | [optional] [default to 1920] [enum: ]
 **height** | **kotlin.Long**| The height, in pixels, of the browser viewport to use. Ignored if you set full to true. | [optional] [default to 1080] [enum: ]
 **quality** | **kotlin.Long**| The quality of the image between 0 and 100. This works only for the jpeg format, for PNG images the parameter is applied only during compression. | [optional] [default to 90] [enum: ]
 **scale** | **java.math.BigDecimal**| The scale factor of the device to use when taking the screenshot. For example, a scale factor of 2 produces a high-resolution screenshot suitable for viewing on Retina devices. The larger the scale factor, the larger the screenshot produced. | [optional] [default to 1.0]
 **x** | **kotlin.Long**| The starting point of a section screenshot on the X axis. | [optional] [default to 0] [enum: ]
 **y** | **kotlin.Long**| The starting point of a section screenshot on the Y axis. | [optional] [default to 0] [enum: ]
 **redirect** | **kotlin.Boolean**| If you set Redirect, the response will be a 302 redirect to the screenshot file in our CDN. | [optional] [default to false]
 **language** | **kotlin.String**| Sets the Accept-Language header on requests to the target URL so that you can take screenshots from a website with a specific language. | [optional]
 **randomUserAgent** | **kotlin.Boolean**| Sets a random user agent header to emulate a different devices when taking screenshots. | [optional] [default to false]
 **userAgent** | **kotlin.String**| Sets the user agent header to emulate a specific device when taking screenshots. | [optional]
 **headers** | **kotlin.String**| A semicolon-separated list of header parameters to be used when capturing the screenshot. Each header should be passed as a key-value pair and multiple pairs should be separated by a semicolon. | [optional]
 **cookies** | **kotlin.String**| A semicolon-separated list of cookies to be used when capturing the screenshot. Each cookies should be passed as a key-value pair and multiple pairs should be separated by a semicolon. | [optional]
 **css** | **kotlin.String**| Inject your custom CSS. | [optional]
 **js** | **kotlin.String**| Inject your custom Javascript. | [optional]
 **wait** | **kotlin.String**| Wait until the specified CSS selector matches an element present in the page before taking a screenshot. The process is canceled after 60 seconds. | [optional]
 **element** | **kotlin.String**| Takes a screenshot of the first element matched by the specified CSS selector. This is ignored if full is true. (This option cannot be used with the PDF export format.) | [optional]
 **timezone** | **kotlin.String**| The IANA time zone identifier used for this capture. | [optional] [default to Europe/Berlin]
 **device** | **kotlin.String**| The device used in the emulation. | [optional] [enum: Blackberry PlayBook, Blackberry PlayBook landscape, BlackBerry Z30, BlackBerry Z30 landscape, Galaxy Note 3, Galaxy Note 3 landscape, Galaxy Note II, Galaxy Note II landscape, Galaxy S III, Galaxy S III landscape, Galaxy S5, Galaxy S5 landscape, iPad, iPad landscape, iPad Mini, iPad Mini landscape, iPad Pro, iPad Pro landscape, iPhone 4, iPhone 4 landscape, iPhone 5, iPhone 5 landscape, iPhone 6, iPhone 6 landscape, iPhone 6 Plus, iPhone 6 Plus landscape, iPhone 7, iPhone 7 landscape, iPhone 7 Plus, iPhone 7 Plus landscape, iPhone 8, iPhone 8 landscape, iPhone 8 Plus, iPhone 8 Plus landscape, iPhone SE, iPhone SE landscape, iPhone X, iPhone X landscape, iPhone XR, iPhone XR landscape, iPhone 11, iPhone 11 landscape, iPhone 11 Pro, iPhone 11 Pro landscape, iPhone 11 Pro Max, iPhone 11 Pro Max landscape, JioPhone 2, JioPhone 2 landscape, Kindle Fire HDX, Kindle Fire HDX landscape, LG Optimus L70, LG Optimus L70 landscape, Microsoft Lumia 550, Microsoft Lumia 950, Microsoft Lumia 950 landscape, Nexus 10, Nexus 10 landscape, Nexus 4, Nexus 4 landscape, Nexus 5, Nexus 5 landscape, Nexus 5X, Nexus 5X landscape, Nexus 6, Nexus 6 landscape, Nexus 6P, Nexus 6P landscape, Nexus 7, Nexus 7 landscape, Nokia Lumia 520, Nokia Lumia 520 landscape, Nokia N9, Nokia N9 landscape, Pixel 2, Pixel 2 landscape, Pixel 2 XL, Pixel 2 XL landscape]
 **latitude** | **java.math.BigDecimal**| The latitude used in the emulation of the geo-location. | [optional] [default to 0.0]
 **longitude** | **java.math.BigDecimal**| The longitude used in the emulation of the geo-location. | [optional] [default to 0.0]
 **accuracy** | **java.math.BigDecimal**| The accuracy in meters used in the emulation of the geo-location. | [optional] [default to 2.0]
 **proxy** | **kotlin.String**| Use an address of a proxy server through which the screenshot should be taken. The proxy address should be formatted as http://username:password@proxyserver.com:31280 | [optional]
 **adblock** | **kotlin.Boolean**| Prevent ads from being displayed. Block requests from popular ad networks and hide frequent ads. | [optional] [default to false]
 **hideCookieBanners** | **kotlin.Boolean**| Prevent cookie banners and pop-ups from being displayed. The best possible result is tried. | [optional] [default to false]

### Return type

[**kotlin.Array&lt;kotlin.Byte&gt;**](kotlin.Array&lt;kotlin.Byte&gt;.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/pdf, image/jpeg, image/png, image/webp

<a name="captureScreenshotUnauthenticated"></a>
# **captureScreenshotUnauthenticated**
> kotlin.Array&lt;kotlin.Byte&gt; captureScreenshotUnauthenticated(token, url, fileType, ttl, invalidate, full, lazyloadScroll, delay, width, height, quality, scale, x, y, redirect, language, randomUserAgent, userAgent, headers, cookies, css, js, wait, element, timezone, device, latitude, longitude, accuracy, proxy, adblock, hideCookieBanners)



Webseite-Herunterladen.de Screenshot Capture is a very simple but powerful screenshot API that anyone can easily use to create pixel-perfect website screenshots. It always uses a recent version of Chrome to ensure that all modern web features are fully supported and rendering is exactly as your customers would expect.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ScreenshotApi()
val token : kotlin.String = token_example // kotlin.String | A valid token is needed to make paid API calls. Tokens can be managed from your account.
val url : kotlin.String = url_example // kotlin.String | The URL of the website you want to capture. Please include the protocol (http:// or https://).
val fileType : kotlin.String = fileType_example // kotlin.String | The image file format of the captured screenshot. Either png, jpeg, webp or PDF with 72 dpi.
val ttl : kotlin.Long = 789 // kotlin.Long | Number of seconds the capture file is cached by our CDN. An API request that is loaded through the cache does not count as a paid request. You can set a number of seconds from 0 seconds up to 2592000 seconds. This is a maximum of 30 days.
val invalidate : kotlin.Boolean = true // kotlin.Boolean | Force the API to invalidate the cache and capture a new screenshot. This call costs you additional money, because a call of a cache hit is not charged.
val full : kotlin.Boolean = true // kotlin.Boolean | Set this parameter to true if you want to screenshot the whole web page in full size.
val lazyloadScroll : kotlin.Boolean = true // kotlin.Boolean | Set this parameter to true to scroll down through the entire page before taking a screenshot. This is useful for triggering animations or lazy load elements in full screen.
val delay : kotlin.Long = 789 // kotlin.Long | The delay in milliseconds to wait after the page loads before taking the screenshot. This is in milliseconds. One second is 1000 milliseconds. From 0 milliseconds to a maximum of 10,000 milliseconds.
val width : kotlin.Long = 789 // kotlin.Long | The width, in pixels, of the browser viewport to use.
val height : kotlin.Long = 789 // kotlin.Long | The height, in pixels, of the browser viewport to use. Ignored if you set full to true.
val quality : kotlin.Long = 789 // kotlin.Long | The quality of the image between 0 and 100. This works only for the jpeg format, for PNG images the parameter is applied only during compression.
val scale : java.math.BigDecimal = 1.2 // java.math.BigDecimal | The scale factor of the device to use when taking the screenshot. For example, a scale factor of 2 produces a high-resolution screenshot suitable for viewing on Retina devices. The larger the scale factor, the larger the screenshot produced.
val x : kotlin.Long = 789 // kotlin.Long | The starting point of a section screenshot on the X axis.
val y : kotlin.Long = 789 // kotlin.Long | The starting point of a section screenshot on the Y axis.
val redirect : kotlin.Boolean = true // kotlin.Boolean | If you set Redirect, the response will be a 302 redirect to the screenshot file in our CDN.
val language : kotlin.String = language_example // kotlin.String | Sets the Accept-Language header on requests to the target URL so that you can take screenshots from a website with a specific language.
val randomUserAgent : kotlin.Boolean = true // kotlin.Boolean | Sets a random user agent header to emulate a different devices when taking screenshots.
val userAgent : kotlin.String = userAgent_example // kotlin.String | Sets the user agent header to emulate a specific device when taking screenshots.
val headers : kotlin.String = headers_example // kotlin.String | A semicolon-separated list of header parameters to be used when capturing the screenshot. Each header should be passed as a key-value pair and multiple pairs should be separated by a semicolon.
val cookies : kotlin.String = cookies_example // kotlin.String | A semicolon-separated list of cookies to be used when capturing the screenshot. Each cookies should be passed as a key-value pair and multiple pairs should be separated by a semicolon.
val css : kotlin.String = css_example // kotlin.String | Inject your custom CSS.
val js : kotlin.String = js_example // kotlin.String | Inject your custom Javascript.
val wait : kotlin.String = wait_example // kotlin.String | Wait until the specified CSS selector matches an element present in the page before taking a screenshot. The process is canceled after 60 seconds.
val element : kotlin.String = element_example // kotlin.String | Takes a screenshot of the first element matched by the specified CSS selector. This is ignored if full is true. (This option cannot be used with the PDF export format.)
val timezone : kotlin.String = timezone_example // kotlin.String | The IANA time zone identifier used for this capture.
val device : kotlin.String = device_example // kotlin.String | The device used in the emulation.
val latitude : java.math.BigDecimal = 1.2 // java.math.BigDecimal | The latitude used in the emulation of the geo-location.
val longitude : java.math.BigDecimal = 1.2 // java.math.BigDecimal | The longitude used in the emulation of the geo-location.
val accuracy : java.math.BigDecimal = 1.2 // java.math.BigDecimal | The accuracy in meters used in the emulation of the geo-location.
val proxy : kotlin.String = proxy_example // kotlin.String | Use an address of a proxy server through which the screenshot should be taken. The proxy address should be formatted as http://username:password@proxyserver.com:31280
val adblock : kotlin.Boolean = true // kotlin.Boolean | Prevent ads from being displayed. Block requests from popular ad networks and hide frequent ads.
val hideCookieBanners : kotlin.Boolean = true // kotlin.Boolean | Prevent cookie banners and pop-ups from being displayed. The best possible result is tried.
try {
    val result : kotlin.Array<kotlin.Byte> = apiInstance.captureScreenshotUnauthenticated(token, url, fileType, ttl, invalidate, full, lazyloadScroll, delay, width, height, quality, scale, x, y, redirect, language, randomUserAgent, userAgent, headers, cookies, css, js, wait, element, timezone, device, latitude, longitude, accuracy, proxy, adblock, hideCookieBanners)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScreenshotApi#captureScreenshotUnauthenticated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScreenshotApi#captureScreenshotUnauthenticated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| A valid token is needed to make paid API calls. Tokens can be managed from your account. |
 **url** | **kotlin.String**| The URL of the website you want to capture. Please include the protocol (http:// or https://). |
 **fileType** | **kotlin.String**| The image file format of the captured screenshot. Either png, jpeg, webp or PDF with 72 dpi. | [optional] [enum: png, pdf, jpeg, webp]
 **ttl** | **kotlin.Long**| Number of seconds the capture file is cached by our CDN. An API request that is loaded through the cache does not count as a paid request. You can set a number of seconds from 0 seconds up to 2592000 seconds. This is a maximum of 30 days. | [optional] [enum: ]
 **invalidate** | **kotlin.Boolean**| Force the API to invalidate the cache and capture a new screenshot. This call costs you additional money, because a call of a cache hit is not charged. | [optional]
 **full** | **kotlin.Boolean**| Set this parameter to true if you want to screenshot the whole web page in full size. | [optional]
 **lazyloadScroll** | **kotlin.Boolean**| Set this parameter to true to scroll down through the entire page before taking a screenshot. This is useful for triggering animations or lazy load elements in full screen. | [optional] [default to false]
 **delay** | **kotlin.Long**| The delay in milliseconds to wait after the page loads before taking the screenshot. This is in milliseconds. One second is 1000 milliseconds. From 0 milliseconds to a maximum of 10,000 milliseconds. | [optional] [enum: ]
 **width** | **kotlin.Long**| The width, in pixels, of the browser viewport to use. | [optional] [default to 1920] [enum: ]
 **height** | **kotlin.Long**| The height, in pixels, of the browser viewport to use. Ignored if you set full to true. | [optional] [default to 1080] [enum: ]
 **quality** | **kotlin.Long**| The quality of the image between 0 and 100. This works only for the jpeg format, for PNG images the parameter is applied only during compression. | [optional] [default to 90] [enum: ]
 **scale** | **java.math.BigDecimal**| The scale factor of the device to use when taking the screenshot. For example, a scale factor of 2 produces a high-resolution screenshot suitable for viewing on Retina devices. The larger the scale factor, the larger the screenshot produced. | [optional] [default to 1.0]
 **x** | **kotlin.Long**| The starting point of a section screenshot on the X axis. | [optional] [default to 0] [enum: ]
 **y** | **kotlin.Long**| The starting point of a section screenshot on the Y axis. | [optional] [default to 0] [enum: ]
 **redirect** | **kotlin.Boolean**| If you set Redirect, the response will be a 302 redirect to the screenshot file in our CDN. | [optional] [default to false]
 **language** | **kotlin.String**| Sets the Accept-Language header on requests to the target URL so that you can take screenshots from a website with a specific language. | [optional]
 **randomUserAgent** | **kotlin.Boolean**| Sets a random user agent header to emulate a different devices when taking screenshots. | [optional] [default to false]
 **userAgent** | **kotlin.String**| Sets the user agent header to emulate a specific device when taking screenshots. | [optional]
 **headers** | **kotlin.String**| A semicolon-separated list of header parameters to be used when capturing the screenshot. Each header should be passed as a key-value pair and multiple pairs should be separated by a semicolon. | [optional]
 **cookies** | **kotlin.String**| A semicolon-separated list of cookies to be used when capturing the screenshot. Each cookies should be passed as a key-value pair and multiple pairs should be separated by a semicolon. | [optional]
 **css** | **kotlin.String**| Inject your custom CSS. | [optional]
 **js** | **kotlin.String**| Inject your custom Javascript. | [optional]
 **wait** | **kotlin.String**| Wait until the specified CSS selector matches an element present in the page before taking a screenshot. The process is canceled after 60 seconds. | [optional]
 **element** | **kotlin.String**| Takes a screenshot of the first element matched by the specified CSS selector. This is ignored if full is true. (This option cannot be used with the PDF export format.) | [optional]
 **timezone** | **kotlin.String**| The IANA time zone identifier used for this capture. | [optional] [default to Europe/Berlin]
 **device** | **kotlin.String**| The device used in the emulation. | [optional] [enum: Blackberry PlayBook, Blackberry PlayBook landscape, BlackBerry Z30, BlackBerry Z30 landscape, Galaxy Note 3, Galaxy Note 3 landscape, Galaxy Note II, Galaxy Note II landscape, Galaxy S III, Galaxy S III landscape, Galaxy S5, Galaxy S5 landscape, iPad, iPad landscape, iPad Mini, iPad Mini landscape, iPad Pro, iPad Pro landscape, iPhone 4, iPhone 4 landscape, iPhone 5, iPhone 5 landscape, iPhone 6, iPhone 6 landscape, iPhone 6 Plus, iPhone 6 Plus landscape, iPhone 7, iPhone 7 landscape, iPhone 7 Plus, iPhone 7 Plus landscape, iPhone 8, iPhone 8 landscape, iPhone 8 Plus, iPhone 8 Plus landscape, iPhone SE, iPhone SE landscape, iPhone X, iPhone X landscape, iPhone XR, iPhone XR landscape, iPhone 11, iPhone 11 landscape, iPhone 11 Pro, iPhone 11 Pro landscape, iPhone 11 Pro Max, iPhone 11 Pro Max landscape, JioPhone 2, JioPhone 2 landscape, Kindle Fire HDX, Kindle Fire HDX landscape, LG Optimus L70, LG Optimus L70 landscape, Microsoft Lumia 550, Microsoft Lumia 950, Microsoft Lumia 950 landscape, Nexus 10, Nexus 10 landscape, Nexus 4, Nexus 4 landscape, Nexus 5, Nexus 5 landscape, Nexus 5X, Nexus 5X landscape, Nexus 6, Nexus 6 landscape, Nexus 6P, Nexus 6P landscape, Nexus 7, Nexus 7 landscape, Nokia Lumia 520, Nokia Lumia 520 landscape, Nokia N9, Nokia N9 landscape, Pixel 2, Pixel 2 landscape, Pixel 2 XL, Pixel 2 XL landscape]
 **latitude** | **java.math.BigDecimal**| The latitude used in the emulation of the geo-location. | [optional] [default to 0.0]
 **longitude** | **java.math.BigDecimal**| The longitude used in the emulation of the geo-location. | [optional] [default to 0.0]
 **accuracy** | **java.math.BigDecimal**| The accuracy in meters used in the emulation of the geo-location. | [optional] [default to 2.0]
 **proxy** | **kotlin.String**| Use an address of a proxy server through which the screenshot should be taken. The proxy address should be formatted as http://username:password@proxyserver.com:31280 | [optional]
 **adblock** | **kotlin.Boolean**| Prevent ads from being displayed. Block requests from popular ad networks and hide frequent ads. | [optional] [default to false]
 **hideCookieBanners** | **kotlin.Boolean**| Prevent cookie banners and pop-ups from being displayed. The best possible result is tried. | [optional] [default to false]

### Return type

[**kotlin.Array&lt;kotlin.Byte&gt;**](kotlin.Array&lt;kotlin.Byte&gt;.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/pdf, image/jpeg, image/png, image/webp

