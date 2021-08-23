/**
 * Screenshot Capture API
 * Webseite-Herunterladen.de Screenshot Capture is a very simple but powerful screenshot API that anyone can easily use to create pixel-perfect website screenshots. It always uses a recent version of Chrome to ensure that all modern web features are fully supported and rendering is exactly as your customers would expect.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.models


/**
 * An error description
 * @param code The HTTP-error number
 * @param message A textual description of the error occured.
 */
data class ErrorModel (

    /* The HTTP-error number */
    val code: kotlin.Long? = null,
    /* A textual description of the error occured. */
    val message: kotlin.String? = null
) {
}