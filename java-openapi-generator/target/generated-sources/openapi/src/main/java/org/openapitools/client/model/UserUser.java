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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.UserProviderInfo;
import org.openapitools.client.model.UserUserExternal;

/**
 * Represents a StackHawk User
 */
@ApiModel(description = "Represents a StackHawk User")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-04T12:28:48.411362-06:00[America/Denver]")
public class UserUser {
  public static final String SERIALIZED_NAME_EXTERNAL = "external";
  @SerializedName(SERIALIZED_NAME_EXTERNAL)
  private UserUserExternal external;

  public static final String SERIALIZED_NAME_ORGANIZATION_IDS = "organizationIds";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_IDS)
  private List<String> organizationIds = null;

  public static final String SERIALIZED_NAME_PROVIDER = "provider";
  @SerializedName(SERIALIZED_NAME_PROVIDER)
  private UserProviderInfo provider;

  public static final String SERIALIZED_NAME_STACKHAWK_ID = "stackhawkId";
  @SerializedName(SERIALIZED_NAME_STACKHAWK_ID)
  private String stackhawkId;


  public UserUser external(UserUserExternal external) {
    
    this.external = external;
    return this;
  }

   /**
   * Get external
   * @return external
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserUserExternal getExternal() {
    return external;
  }


  public void setExternal(UserUserExternal external) {
    this.external = external;
  }


  public UserUser organizationIds(List<String> organizationIds) {
    
    this.organizationIds = organizationIds;
    return this;
  }

  public UserUser addOrganizationIdsItem(String organizationIdsItem) {
    if (this.organizationIds == null) {
      this.organizationIds = new ArrayList<String>();
    }
    this.organizationIds.add(organizationIdsItem);
    return this;
  }

   /**
   * **Deprecated**
   * @return organizationIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "**Deprecated**")

  public List<String> getOrganizationIds() {
    return organizationIds;
  }


  public void setOrganizationIds(List<String> organizationIds) {
    this.organizationIds = organizationIds;
  }


  public UserUser provider(UserProviderInfo provider) {
    
    this.provider = provider;
    return this;
  }

   /**
   * Get provider
   * @return provider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserProviderInfo getProvider() {
    return provider;
  }


  public void setProvider(UserProviderInfo provider) {
    this.provider = provider;
  }


  public UserUser stackhawkId(String stackhawkId) {
    
    this.stackhawkId = stackhawkId;
    return this;
  }

   /**
   * internal identifier for this user. _this is not the user uuid_
   * @return stackhawkId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "internal identifier for this user. _this is not the user uuid_")

  public String getStackhawkId() {
    return stackhawkId;
  }


  public void setStackhawkId(String stackhawkId) {
    this.stackhawkId = stackhawkId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserUser userUser = (UserUser) o;
    return Objects.equals(this.external, userUser.external) &&
        Objects.equals(this.organizationIds, userUser.organizationIds) &&
        Objects.equals(this.provider, userUser.provider) &&
        Objects.equals(this.stackhawkId, userUser.stackhawkId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(external, organizationIds, provider, stackhawkId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserUser {\n");
    sb.append("    external: ").append(toIndentedString(external)).append("\n");
    sb.append("    organizationIds: ").append(toIndentedString(organizationIds)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    stackhawkId: ").append(toIndentedString(stackhawkId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

