package com.ug10.twitter;

public class TweetException extends Exception{
    private String message;
    private int code;
    public TweetException(String message){
        super(message);
    }
    public TweetException (int code){
        super();
        this.code = code;
        if (code == 1){
            this.message= "Tweet cannot be empty";
        }
        else if (code==2){
            this.message= "Min. length is 8 characters";
        }
        else if (code==3){
            this.message= "Max. length is 140 characters";
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
