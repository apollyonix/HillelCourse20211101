package ua.hille.rest;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Order {

  @SerializedName("id")
  private Integer id;
  @SerializedName("petId")
  private Integer petId;
  @SerializedName("quantity")
  private Integer quantity;
  @SerializedName("shipDate")
  private String shipDate;
  @SerializedName("status")
  private String status;
  @SerializedName("complete")
  private Boolean complete;

  private String newField;
}