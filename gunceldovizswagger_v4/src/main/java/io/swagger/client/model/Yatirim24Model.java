/*
 * GuncelDoviz Web API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.Doviz;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import android.os.Parcelable;
import android.os.Parcel;
/**
 * Yatirim24Model
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-04T18:06:05.678Z[GMT]")
public class Yatirim24Model implements Parcelable , Serializable {
  private static final long serialVersionUID = 1L;
  @SerializedName("dovizList")
  private List<Doviz> dovizList = null;

  public Yatirim24Model() {
  }
  public Yatirim24Model dovizList(List<Doviz> dovizList) {
    this.dovizList = dovizList;
    return this;
  }

  public Yatirim24Model addDovizListItem(Doviz dovizListItem) {
    if (this.dovizList == null) {
      this.dovizList = new ArrayList<Doviz>();
    }
    this.dovizList.add(dovizListItem);
    return this;
  }

   /**
   * Get dovizList
   * @return dovizList
  **/
  @Schema(description = "")
  public List<Doviz> getDovizList() {
    return dovizList;
  }

  public void setDovizList(List<Doviz> dovizList) {
    this.dovizList = dovizList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Yatirim24Model yatirim24Model = (Yatirim24Model) o;
    return Objects.equals(this.dovizList, yatirim24Model.dovizList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dovizList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Yatirim24Model {\n");
    
    sb.append("    dovizList: ").append(toIndentedString(dovizList)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public void writeToParcel(Parcel out, int flags) {
    out.writeValue(dovizList);
  }

  Yatirim24Model(Parcel in) {
    dovizList = (List<Doviz>)in.readValue(Doviz.class.getClassLoader());
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<Yatirim24Model> CREATOR = new Parcelable.Creator<Yatirim24Model>() {
    public Yatirim24Model createFromParcel(Parcel in) {
      return new Yatirim24Model(in);
    }
    public Yatirim24Model[] newArray(int size) {
      return new Yatirim24Model[size];
    }
  };
}
