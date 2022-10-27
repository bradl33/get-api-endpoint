package com.bradl3y.getapiendpoint;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class HngMemberNotFoundAdvice {

    //Return error message when an HngMemberNotFoundException is thrown
    @ResponseBody
    @ExceptionHandler(HngMemberNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String employeeNotFoundHandler(HngMemberNotFoundException ex) {
        return ex.getMessage();
    }
}
