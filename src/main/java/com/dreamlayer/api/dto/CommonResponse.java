package com.dreamlayer.api.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommonResponse {

	@JsonProperty("status")
    private String status;
	
	@JsonProperty("status_code")
    private int status_code;
	
	@JsonProperty("status_description")
    private String status_description;
	
	@JsonProperty("response")
    private List<?> response;
}
