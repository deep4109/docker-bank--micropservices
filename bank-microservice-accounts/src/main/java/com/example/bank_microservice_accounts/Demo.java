package com.example.bank_microservice_accounts;

public class Demo {

    public static void main(String[] args) {
        System.out.println("Hello");

        String email = "a@b.com";
        System.out.println(isValidEmail(email));
    }


    /**
     * This method validates an email address
     * @param email the email address to be validated
     * @return true if the email is valid, false otherwise
     */
    public static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(emailRegex);
    }
}
