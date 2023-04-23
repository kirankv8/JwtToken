package com.application.jwt.exceptionhandler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;

import jakarta.servlet.http.HttpServletRequest;
//
//@ControllerAdvice
//public class ExceptionHandler {
//	
//	   
//	    public ResponseEntity<ErrorResponse> handleAccessDeniedException(AccessDeniedException e, HttpServletRequest request){
//	        return ResponseEntity.status(403).body(new ErrorResponse(e.getMessage()));
//	    }
//	
//}
