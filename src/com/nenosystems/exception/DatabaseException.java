package com.nenosystems.exception;

/**
 * DatabaseException is propogated by DAO classes when an unhandled Database
 * com.nenosystems.exception occurred
 * 
 * @author SUNRAYS Technologies
 * @version 1.0
 * @Copyright (c) SUNRAYS Technologies
 */
public class DatabaseException extends Exception {

    /**
     * @param msg
     *            : Error message
     */
    public DatabaseException(String msg) {
        super(msg);
    }

}