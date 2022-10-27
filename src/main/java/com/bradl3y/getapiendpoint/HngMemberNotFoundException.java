package com.bradl3y.getapiendpoint;

public class HngMemberNotFoundException extends RuntimeException{

    //Render HTTP 404 when HngMemberNotFoundException is thrown
    public HngMemberNotFoundException(Long id) {
        super("Could not find HNG member " + id);
    }
}
