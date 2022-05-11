package com.login.regis;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App 
{
    private static final String regex = "^(.+)@(.+)$";
    public static void main (String[] args) throws PasswordException, UsernameException, EmailException, LoginException {
        System.out.println("Selamat datang di HatiMu");
        System.out.println("Silahkan mendaftar dulu <3 ");


        Scanner user = new Scanner(System.in);
            System.out.println("Nama pengguna: ");
            String username = user.nextLine();
        try {
            if (username.isEmpty()) {
                throw new UsernameException(1);
            } else if (username.length() < 6) {
                throw new UsernameException(2);
            }
        } catch (UsernameException e) {
            System.out.println("Error : " + e.getErrorMessage());
        }

            Scanner pass = new Scanner(System.in);
            System.out.println("Password: ");
            String password = pass.nextLine();

            Scanner kpass = new Scanner(System.in);
            System.out.println("Konfirmasi Password: ");
            String konfirmasiPassword = pass.nextLine();

            try {
                if (password.isEmpty()) {
                    throw new PasswordException(1);
                } else if (password.length() < 7) {
                    throw new PasswordException(2);
                } else if (password.equals(username)) {
                    throw new PasswordException(4);
                }else if(!password.equals(konfirmasiPassword)){
                    throw new PasswordException(5);
                } else {
                    boolean flagKecil = false;
                    boolean flagBesar = false;
                    boolean flagAngka = false;
                    boolean flagSimbol = false;
                    if (!password.matches("[^a-zA-Z0-9 ]")){
                            flagSimbol = true;
                    }
                    for (int i = 0; i < password.length(); i++) {
                        char c = password.charAt(i);
                        if (Character.isLetter(c) && Character.isLowerCase(c))
                            flagKecil = true;
                        if (Character.isLetter(c) && Character.isUpperCase(c))
                            flagBesar = true;
                        if (Character.isDigit(c))
                            flagAngka = true;

                    }
                    if (!(flagKecil || flagAngka || flagBesar || flagSimbol)) {
                        throw new PasswordException(3);
                    }
                }
            } catch (PasswordException e) {
                System.out.println("Error : " + e.getErrorMessage());
            }

        Scanner emil = new Scanner(System.in);
        System.out.println("Email: ");
        String email = emil.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);


        try {
            if (email.isEmpty()) {
                throw new EmailException(1);
            }
            else if ( matcher.matches() == false){
                    throw new EmailException(2);
            }
        } catch (EmailException e) {
            System.out.println("Error : " + e.getErrorMessage());
        }
        User userBaru = new User(username,email,password);

        Scanner Lus = new Scanner(System.in);
        System.out.println("Username: ");
        String logUser = pass.nextLine();

        Scanner lpass = new Scanner(System.in);
        System.out.println("Password: ");
        String logPass = pass.nextLine();
        try {
            if (logUser.isEmpty()) {
                throw new LoginException(1);
            }
            else if (logPass.isEmpty()){
                throw new LoginException(2);
            }
            else if(logUser != userBaru.getUsername() || logPass != userBaru.getPassword()){
                throw new LoginException(3);
            }
        } catch (LoginException e) {
            System.out.println("Error : " + e.getErrorMessage());
        }
        System.out.println("Selamat datang"+userBaru.getUsername());
    }

}


