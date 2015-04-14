package com.nenosystems.exception;

/**
 * ApplicationException is propogated from Service classes when an business
 * logic com.nenosystems.exception occurered.
 * 
 * @author SUNRAYS Technologies
 * @version 1.0
 * @Copyright (c) SUNRAYS Technologies
 */
public class ApplicationException extends Exception {

    /**
     * @param msg
     *            : Error message
     */
    public ApplicationException(String msg) {
        super(msg);
    }
}