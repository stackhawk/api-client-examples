/*
 * StackHawk Public API
 *  ![STACKHAWK](https://images.ctfassets.net/nx13ojx82pll/1zPawvEGOq9zKX8PuVw0kB/e4a31b30fdb07b7e424277d7824d2ffe/stackhawk-long.png) # StackHawk API  This is the OpenAPI specification for the [StackHawk](https://www.stackhawk.com) REST API, affectionately known as _Falcon_ 🦅 #Kaakaww!  StackHawk is an application security testing tool built for developers. With powerful automation and integration capabilities, StackHawk gives engineers the ability to find and fix security vulnerabilities on every merge.  ## Getting Started  To make requests to the StackHawk API, you will first need an **API Key** from the StackHawk platform. That will be used to request an **access token**, which is used to authorize requests made to the StackHawk API.  Use of the StackHawk API will require a [StackHawk account](https://auth.stackhawk.com) and an organization with sufficient permissions.  From the StackHawk platform, under [Settings > API Keys](https://app.stackhawk.com/settings/apikeys) create a new API Key. These secrets are long-lived, so store this value in a secure fashion.  ### Authorization  Requests made to the StackHawk API server are authorized following the [OAuth2.0 protocol](https://oauth.net/2/)  To get an access token, make a request to `GET /api/v1/auth/login` and provide the user apikey through the `X-ApiKey` request header. This route will then return an access token that can authenticate further API requests. This token can then be used to authenticate subsequent requests, using the `authorization: Bearer` header.  For more information, see the **Api Authentication** section.  ### Rate Limiting  Api calls are ratelimited, with at most 180 requests per minute.  ## StackHawk Api Standards  ### Client Errors  API Calls that fail due to client input will return 4xx status code.  #### `401 Unauthorized` The server doesn't think you should be making this request.  This error is intentionally vague for security purposes, but any of the following could cause it:  - no authorization was provided - authorization has expired - authorization is insufficient for the requested resource  #### `404 Not Found`  The route or resource does not exist.  #### `400 Bad Request` The server could not process this request, although it may have tried. The JSON reponse body `message` will include details on what input was invalid.  ### Pagination and Sorting  Listing API routes will return resources in a paginated fashion. Paginated requests follow a pattern of taking the following optional path parameters:  * `pageToken`: a string incrementing count of pages in the pagination, starting from '0' * `pageSize`: the number of elements to request in the page, defaults to 10 * `sortField`: sorts the listed resource by an approved field, defaults to sorting by resource name * `sortDir`: either 'asc' or 'desc', defaults ascending  The responseBody of these API routes will additionally include two fields:  * `nextPageToken`: a string indicating the next `pageToken` to pass in for the next page of results with this request * `totalCount`: the total number of resources the query can paginate through  ## Questions? Comments? Concerns? Kaa-Kaww?  We are always making advancements and improvements to our Platform, Scanner and the StackHawk API. If you encounter an issue you cannot solve with this documentation, please reach out to [support@stackhawk.com](mailto:support@stackhawk.com) with your questions, and we’ll help you troubleshoot any issues and get you soaring with StackHawk.   
 *
 * The version of the OpenAPI document: 0.0.1
 * Contact: hello@stackhawk.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.UserJWT;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApiAuthenticationApi
 */
@Ignore
public class ApiAuthenticationApiTest {

    private final ApiAuthenticationApi api = new ApiAuthenticationApi();

    
    /**
     * Login with API Key
     *
     * ## Access Login  Using a [StackHawk API Key](https://app.stackhawk.com/settings/apikeys), this endpoint returns an *access token* which can then be used in the &#x60;authorization&#x60; header of subsequent API requests. The access token returned is an [RFC-7519](https://datatracker.ietf.org/doc/html/rfc7519) compliant [jwt access token](https://jwt.io/).  Access tokens have an expiration of *30 minutes* and are issued on behalf of the requesting user.  An access token can only be used to interact with StackHawk resources that belong to the user, or to organizations that user is a part of and permissioned for.  For best practices, use the &#x60;/login&#x60; route only when starting a new access session to the StackHawk API, and use the &#x60;/refresh&#x60; route to request a fresh token to extend an API session.   
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void loginTest() throws ApiException {
        String xApiKey = null;
        UserJWT response = api.login(xApiKey);

        // TODO: test validations
    }
    
    /**
     * Refresh existing authentication
     *
     * ## Access Refresh  Once authenticated, an issued API Access Token has a will expire after 30 minutes.  This authenticated endpoint will \&quot;refresh\&quot; the access token by issuing a new jwt token with an extended expiration.  For best practices, use the &#x60;/refresh&#x60; route for refreshing authentication access to extend the API session. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void refreshTokenTest() throws ApiException {
        UserJWT response = api.refreshToken();

        // TODO: test validations
    }
    
}
