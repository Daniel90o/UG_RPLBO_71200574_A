package com.ug10.twitter;

public class BioException extends Exception {
    private String message;
    private int code;
    public BioException (String message){
        super(message);
    }
    public BioException (int code){
        super();
        this.code = code;
        if (code == 1){
            this.message= "Bio cannot be empty";
        }
        else if (code==2){
            this.message= "Min. length is 5 characters";
        }
        else if (code==3){
            this.message= "Max. length is 30 characters";
        } else if (code ==4) {
            this.message = "Can only contain . ; @ ; and ' '";
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
