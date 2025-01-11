/*
 * Copyright (c) 2020, Acord Solution Group and/or its affiliates. All rights reserved.
 */
package com.fis.api.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.*;

import java.util.List;
import java.util.Map;

/**
 * <p>AL3MessageV2.java</p>

 * 
 * @author Nikita Jain

 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class BPI {
	

    @JsonProperty("code")
	private String code;


    @JsonProperty("rate_float")
	private String rate_float;


	@JsonProperty("description")
	private String description;


	@JsonProperty("rate")
	private String rate;


	@JsonProperty("symbol")
	private String symbol;

}
