package com.dreamlayer.api.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(Include.NON_NULL)
public class CommonResponse {

	@JsonProperty("status")
    private String status;
	
	@JsonProperty("status_code")
    private int status_code;
	
	@JsonProperty("title")
    private String title;
	
	@JsonProperty("message")
    private String message;
	
	@JsonProperty("response")
    private List<?> response;
}
