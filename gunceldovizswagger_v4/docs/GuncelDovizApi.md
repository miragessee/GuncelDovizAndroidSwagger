# GuncelDovizApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiGuncelDovizGetYatirim24Get**](GuncelDovizApi.md#apiGuncelDovizGetYatirim24Get) | **GET** api/GuncelDoviz/GetYatirim24 | 

<a name="apiGuncelDovizGetYatirim24Get"></a>
# **apiGuncelDovizGetYatirim24Get**
> Yatirim24Model apiGuncelDovizGetYatirim24Get()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GuncelDovizApi;


GuncelDovizApi apiInstance = new GuncelDovizApi();
try {
    Yatirim24Model result = apiInstance.apiGuncelDovizGetYatirim24Get();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GuncelDovizApi#apiGuncelDovizGetYatirim24Get");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Yatirim24Model**](Yatirim24Model.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

