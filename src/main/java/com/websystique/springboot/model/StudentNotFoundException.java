package com.websystique.springboot.model;

/**
 * @author Anil Chowdhury
 *         Created on 11/6/2018.
 */
public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String exception) {
        super(exception);
    }
}
