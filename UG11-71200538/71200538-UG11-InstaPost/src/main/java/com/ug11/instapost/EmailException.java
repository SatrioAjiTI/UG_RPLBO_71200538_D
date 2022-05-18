package com.ug11.instapost;

public class EmailException extends Exception{
    private int errCode;
    private String errMessage;
    public EmailException(int errCode) {
        super();
        this.errCode = errCode;
        if(errCode==1){
            this.errMessage = "Email tidak valid!";
        }
        else if(errCode==2){
            this.errMessage = "Email tidak terdaftar di Google!";
        }
    }

    public EmailException(String errorMessage){
        super(errorMessage);
    }

    public int getErrorCode(){
        return this.errCode;
    }

    public String getErrorMessage(){
        return this.errMessage;
    }
}
