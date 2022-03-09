package com.felixwc.ssm.mvc.start.exception;

/**
 * TODO
 * user-defined exception extends ClassCastException
 * @author lenovo
 * since 2020-11-10  18:08
 */
class MyClassCastException extends ClassCastException{
    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }
}
