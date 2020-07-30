package com.estgoh.demo.services.exception;

public class ObjectNotFoundException extends RuntimeException {

    private static final long serialVersionUID = -41898341000480004L;

    public ObjectNotFoundException (String msg) {
        super(msg);
    }
    
}
