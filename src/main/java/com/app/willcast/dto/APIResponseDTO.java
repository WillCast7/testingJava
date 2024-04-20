package com.app.willcast.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class APIResponseDTO<T> implements Serializable {

	private boolean state = false;
	private String message = null;
	private String error = null;
	private String code = null;
	private T data = null;

	//Respuesta con data
	public void setResponse(T data, String message, String code) {
		this.setMessage(message);
		this.setCode(code);
		this.setState(Boolean.TRUE);
		this.setData(data);
	}

	//Respuesta positiva sin data
	public void setSuccess(String message, String code) {
		this.setMessage(message);
		this.setCode(code);
		this.setState(Boolean.TRUE);
	}

	//Respuesta fallida sin data
	public void setFail(String message, String code) {
		this.setMessage(message);
		this.setCode(code);
		this.setState(Boolean.FALSE);
	}

	//Respuesta con error
	public void setFailError(String message, String code, String error) {
		this.setMessage(message);
		this.setError(error);
		this.setCode(code);
		this.setState(Boolean.FALSE);
	}
}
