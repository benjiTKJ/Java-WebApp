package com.benjamin.CryptoEx.api.domains.coins.coinData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Roi {
    @JsonProperty("times")
    private float times;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("percentage")
    private float percentage;

}