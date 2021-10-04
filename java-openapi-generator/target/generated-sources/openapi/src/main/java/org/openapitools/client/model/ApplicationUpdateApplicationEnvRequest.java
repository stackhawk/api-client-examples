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

/**
 * Request to update an existing StackHawk Environment.
 */
@ApiModel(description = "Request to update an existing StackHawk Environment.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-04T12:28:48.411362-06:00[America/Denver]")
public class ApplicationUpdateApplicationEnvRequest {
  public static final String SERIALIZED_NAME_APPLICATION_ID = "applicationId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private String applicationId;

  /**
   * updated riskLevel for this environment.
   */
  @JsonAdapter(DataTypeEnum.Adapter.class)
  public enum DataTypeEnum {
    NONE("NONE"),
    
    PII("PII"),
    
    PCI("PCI"),
    
    FIN("FIN"),
    
    PKI("PKI"),
    
    HIPAA("HIPAA"),
    
    FERPA("FERPA");

    private String value;

    DataTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DataTypeEnum fromValue(String value) {
      for (DataTypeEnum b : DataTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DataTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DataTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DataTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DataTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DATA_TYPE = "dataType";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private DataTypeEnum dataType;

  public static final String SERIALIZED_NAME_ENV_ID = "envId";
  @SerializedName(SERIALIZED_NAME_ENV_ID)
  private String envId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * updated riskLevel for this environment.
   */
  @JsonAdapter(RiskLevelEnum.Adapter.class)
  public enum RiskLevelEnum {
    LOW("LOW"),
    
    MEDIUM("MEDIUM"),
    
    HIGH("HIGH"),
    
    CRITICAL("CRITICAL");

    private String value;

    RiskLevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RiskLevelEnum fromValue(String value) {
      for (RiskLevelEnum b : RiskLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RiskLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RiskLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RiskLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RiskLevelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RISK_LEVEL = "riskLevel";
  @SerializedName(SERIALIZED_NAME_RISK_LEVEL)
  private RiskLevelEnum riskLevel;


  public ApplicationUpdateApplicationEnvRequest applicationId(String applicationId) {
    
    this.applicationId = applicationId;
    return this;
  }

   /**
   * the UUID identifier of this application.
   * @return applicationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the UUID identifier of this application.")

  public String getApplicationId() {
    return applicationId;
  }


  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }


  public ApplicationUpdateApplicationEnvRequest dataType(DataTypeEnum dataType) {
    
    this.dataType = dataType;
    return this;
  }

   /**
   * updated riskLevel for this environment.
   * @return dataType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "updated riskLevel for this environment.")

  public DataTypeEnum getDataType() {
    return dataType;
  }


  public void setDataType(DataTypeEnum dataType) {
    this.dataType = dataType;
  }


  public ApplicationUpdateApplicationEnvRequest envId(String envId) {
    
    this.envId = envId;
    return this;
  }

   /**
   * the UUID identifier of this environment.
   * @return envId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the UUID identifier of this environment.")

  public String getEnvId() {
    return envId;
  }


  public void setEnvId(String envId) {
    this.envId = envId;
  }


  public ApplicationUpdateApplicationEnvRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * updated name for this environment.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "updated name for this environment.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ApplicationUpdateApplicationEnvRequest riskLevel(RiskLevelEnum riskLevel) {
    
    this.riskLevel = riskLevel;
    return this;
  }

   /**
   * updated riskLevel for this environment.
   * @return riskLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "updated riskLevel for this environment.")

  public RiskLevelEnum getRiskLevel() {
    return riskLevel;
  }


  public void setRiskLevel(RiskLevelEnum riskLevel) {
    this.riskLevel = riskLevel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationUpdateApplicationEnvRequest applicationUpdateApplicationEnvRequest = (ApplicationUpdateApplicationEnvRequest) o;
    return Objects.equals(this.applicationId, applicationUpdateApplicationEnvRequest.applicationId) &&
        Objects.equals(this.dataType, applicationUpdateApplicationEnvRequest.dataType) &&
        Objects.equals(this.envId, applicationUpdateApplicationEnvRequest.envId) &&
        Objects.equals(this.name, applicationUpdateApplicationEnvRequest.name) &&
        Objects.equals(this.riskLevel, applicationUpdateApplicationEnvRequest.riskLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, dataType, envId, name, riskLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationUpdateApplicationEnvRequest {\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
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

