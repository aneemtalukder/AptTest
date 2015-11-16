package com.demo.jsonmodels;

import com.instagram.common.json.annotation.JsonField;
import com.instagram.common.json.annotation.JsonType;

import java.io.Serializable;

@JsonType
public class ExampleResponse implements Serializable {

    @JsonField(fieldName = "amount")
    public String amount;

    @JsonField(fieldName = "quantity")
    public Double quantity;

}
