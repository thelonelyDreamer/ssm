package com.felixwc.ssm.mvc.start.exception;

import java.io.IOException;

/**
 * TODO
 * user-defined Exception extends IOException
 *
 * @author lenovo
 * since 2020-11-10  18:05
 */
public class MyIOException extends IOException {
    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }
}
