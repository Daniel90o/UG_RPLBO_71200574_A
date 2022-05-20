package com.ug11.channelsahamukdw;

public class EmailException extends Exception{

    private int errorCode;
    private String errorMessage;


    public EmailException(int errorCode){
        super();

        if(errorCode==1){
            this.errorMessage = "login tidak valid. coba lagi";
        }
    }
}
