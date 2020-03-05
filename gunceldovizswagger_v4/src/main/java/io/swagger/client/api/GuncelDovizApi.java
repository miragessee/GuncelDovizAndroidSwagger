package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.Yatirim24Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface GuncelDovizApi {
  /**
   * 
   * 
   * @return Call&lt;Yatirim24Model&gt;
   */
  @GET("api/GuncelDoviz/GetYatirim24")
  Call<Yatirim24Model> apiGuncelDovizGetYatirim24Get();
    

}
