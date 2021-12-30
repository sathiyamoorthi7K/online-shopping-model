package com.ecommerce.model.exceptions;

import java.util.Date;

public class ExceptionResponse {
	
	private Date exceptionTime;
	private String message;
	private String details;
	
	public ExceptionResponse() {
		super();
	}
	
	public ExceptionResponse(Date exceptionTime, String message, String details) {
		super();
		this.exceptionTime = exceptionTime;
		this.message = message;
		this.details = details;
	}
	public Date getExceptionTime() {
		return exceptionTime;
	}
	public void setExceptionTime(Date exceptionTime) {
		this.exceptionTime = exceptionTime;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	
	
}
