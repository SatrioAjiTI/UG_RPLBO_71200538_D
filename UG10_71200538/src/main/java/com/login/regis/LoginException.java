package com.login.regis;

public class LoginException extends Exception{
    private int errCode;
    private String errMessage;
    public LoginException(int errCode) {
        super();
        this.errCode = errCode;
        if(errCode==1){
            this.errMessage = "Input username tidak boleh kosong!";
        }
        else if(errCode==2){
            this.errMessage = "Input password tidak boleh kosong!";
        }
        else if(errCode==3){
            this.errMessage = "Username dan password tidak sesuai!";
        }
    }

    public LoginException(String errorMessage){
        super(errorMessage);
    }

    public int getErrorCode(){
        return this.errCode;
    }

    public String getErrorMessage(){
        return this.errMessage;
    }

}
