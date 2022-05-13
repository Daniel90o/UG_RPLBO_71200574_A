package com.ug10.twitter;

public class UsernameException extends Exception{

    private String message;
    private int code;
    public UsernameException(String message){
        super(message);
    }
    public UsernameException (int code){
        super();
        this.code = code;
        if (code == 1){
            this.message= "Username cannot be empty";
        }
        else if (code==2){
            this.message= "Min. length is 6 characters";
        }
        else if (code==3){
            this.message= "Can only consists numbers,letters, and underscore";
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
