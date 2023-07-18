package com.greenstitch.exception;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class MyErrorDetails {

	private LocalDateTime timestamp;
	private String message;
	private String details;
	
}
