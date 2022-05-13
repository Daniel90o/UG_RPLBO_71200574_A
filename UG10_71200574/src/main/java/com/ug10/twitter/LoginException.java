package com.ug10.twitter;

public class LoginException extends Exception {
    private String message;
    private int code;
    public LoginException (String message){
        super(message);
    }
    public LoginException(int code){
        super();
        this.code = code;
        if (code == 1){
            this.message= "Username password cannot be empty";
        }
        else if (code==2){
            this.message= "Wrong password or username";
        }

    }
    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
