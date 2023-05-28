package com.nelioalves.workshopmongo.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long timestap;
	private Integer status;
	private String error;
	private String path;
	
	public StandardError() {}

	public StandardError(Long timestap, Integer status, String error, String path) {
		this.timestap = timestap;
		this.status = status;
		this.error = error;
		this.path = path;
	}

	public Long getTimestap() {
		return timestap;
	}

	public void setTimestap(Long timestap) {
		this.timestap = timestap;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	

}
