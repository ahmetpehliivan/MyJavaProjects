package com.softtech.softtechspringboot.app.cus.enums;

import com.softtech.softtechspringboot.app.gen.enums.BaseErrorMessage;

public enum CusErrorMessage implements BaseErrorMessage {
    CUSTOMER_ERROR_MESSAGE("Customer not found!"),
    ;

    private String message;

    CusErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    @Override
    public String toString(){
        return message;
    }
}
