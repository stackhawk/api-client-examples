/**
 * StackHawk Public API
 *  ![STACKHAWK](https://images.ctfassets.net/nx13ojx82pll/1zPawvEGOq9zKX8PuVw0kB/e4a31b30fdb07b7e424277d7824d2ffe/stackhawk-long.png) # StackHawk API  This is the OpenAPI specification for the [StackHawk](https://www.stackhawk.com) REST API, affectionately known as _Falcon_ 🦅 #Kaakaww!  StackHawk is an application security testing tool built for developers. With powerful automation and integration capabilities, StackHawk gives engineers the ability to find and fix security vulnerabilities on every merge.  ## Getting Started  To make requests to the StackHawk API, you will first need an **API Key** from the StackHawk platform. That will be used to request an **access token**, which is used to authorize requests made to the StackHawk API.  Use of the StackHawk API will require a [StackHawk account](https://auth.stackhawk.com) and an organization with sufficient permissions.  From the StackHawk platform, under [Settings > API Keys](https://app.stackhawk.com/settings/apikeys) create a new API Key. These secrets are long-lived, so store this value in a secure fashion.  ### Authorization  Requests made to the StackHawk API server are authorized following the [OAuth2.0 protocol](https://oauth.net/2/)  To get an access token, make a request to `GET /api/v1/auth/login` and provide the user apikey through the `X-ApiKey` request header. This route will then return an access token that can authenticate further API requests. This token can then be used to authenticate subsequent requests, using the `authorization: Bearer` header.  For more information, see the **Api Authentication** section.  ### Rate Limiting  Api calls are ratelimited, with at most 180 requests per minute.  ## StackHawk Api Standards  ### Client Errors  API Calls that fail due to client input will return 4xx status code.  #### `401 Unauthorized` The server doesn't think you should be making this request.  This error is intentionally vague for security purposes, but any of the following could cause it:  - no authorization was provided - authorization has expired - authorization is insufficient for the requested resource  #### `404 Not Found`  The route or resource does not exist.  #### `400 Bad Request` The server could not process this request, although it may have tried. The JSON reponse body `message` will include details on what input was invalid.  ### Pagination and Sorting  Listing API routes will return resources in a paginated fashion. Paginated requests follow a pattern of taking the following optional path parameters:  * `pageToken`: a string incrementing count of pages in the pagination, starting from '0' * `pageSize`: the number of elements to request in the page, defaults to 10 * `sortField`: sorts the listed resource by an approved field, defaults to sorting by resource name * `sortDir`: either 'asc' or 'desc', defaults ascending  The responseBody of these API routes will additionally include two fields:  * `nextPageToken`: a string indicating the next `pageToken` to pass in for the next page of results with this request * `totalCount`: the total number of resources the query can paginate through  ## Questions? Comments? Concerns? Kaa-Kaww?  We are always making advancements and improvements to our Platform, Scanner and the StackHawk API. If you encounter an issue you cannot solve with this documentation, please reach out to [support@stackhawk.com](mailto:support@stackhawk.com) with your questions, and we’ll help you troubleshoot any issues and get you soaring with StackHawk.   
 *
 * The version of the OpenAPI document: 0.0.1
 * Contact: hello@stackhawk.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.StackHawkPublicApi);
  }
}(this, function(expect, StackHawkPublicApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new StackHawkPublicApi.OrganizationsApi();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('OrganizationsApi', function() {
    describe('createApplication', function() {
      it('should call createApplication successfully', function(done) {
        //uncomment below and update the code to test createApplication
        //instance.createApplication(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('listApplications', function() {
      it('should call listApplications successfully', function(done) {
        //uncomment below and update the code to test listApplications
        //instance.listApplications(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
