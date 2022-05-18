package com.ug11.instapost;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InstaPost {
    private int totalMention;
    private String email;
    private String username;
    private final String regex = "^(.+)@google.com";

    public InstaPost(String uname) {
        this.username = uname;
    }
    public void printInfo(){
        System.out.println( "Username: "+ this.username);
        System.out.println("Email: "+ this.email);
        System.out.println("Mention: "+ this.totalMention);
    }

    public void login(String email)throws EmailException{
            Pattern isGoogle = Pattern.compile(this.username.toLowerCase(Locale.ROOT) + "@gmail.com");
            Pattern pattern = Pattern.compile("(.+)@gmail.com");
            Matcher matcher = pattern.matcher(email);
            Matcher google = isGoogle.matcher(email);
            try {
                if (matcher.matches() == false) {
                    throw new EmailException(1);
                } else if (google.matches() == false) {
                    throw new EmailException(2);
                } else{
                    this.email = email;
                    System.out.println("Login berhasil!");
                }
            } catch (EmailException e) {
                System.out.println("Error : " + e.getErrorMessage());
            }
    }

    public void post(String caption){
        int meeen = 0;
        String prefix = "";
        System.out.println("Caption: "+caption);
        StringBuilder sb = new StringBuilder();
        String[] arrOfStr = caption.split(" ");
        for (String a : arrOfStr){
            Pattern att = Pattern.compile("^@(.+)");
            Matcher menti = att.matcher(a);
            if (menti.matches() == true){
                sb.append(prefix);
                prefix = ", ";
                sb.append(a);
                this.totalMention += 1;
                meeen++;
            }
        }

        System.out.println("Pengguna yang anda mention: "+sb.toString().trim());
        System.out.println("Total username yang anda mention: "+meeen);
    }

}
