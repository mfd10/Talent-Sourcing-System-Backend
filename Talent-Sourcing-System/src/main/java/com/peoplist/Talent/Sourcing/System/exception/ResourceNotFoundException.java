package com.peoplist.Talent.Sourcing.System.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(Integer id, String err){
        super("Could not found the+"+err+  " with id "+ id);
    }
}
