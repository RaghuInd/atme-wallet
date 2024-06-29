package com.atme.wallet.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class WalletControllerAdvice {

	
	@ExceptionHandler({UserLoginException.class})
	public String handlerForLoginException(UserLoginException e) {
		return e.getMessage();
	}
}
