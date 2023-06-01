package com.egm.accountservice.exceptions;

import lombok.Data;

import java.util.Date;

@Data
public class ErrorMessage {

	private String detail;
	private Date date;
}
