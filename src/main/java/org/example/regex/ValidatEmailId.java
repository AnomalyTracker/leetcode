package org.example.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidatEmailId {
    private static  final  String string_regex = "[a-z0-9][a-z0-9_]*@gmail[.]com";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email Id to validate");
        String emailId = sc.nextLine();
        if(validatEmailId(emailId)){
            System.out.println("Entered mail id is valid");
        }
        else
            System.out.println("Entered mail id is invalid");
    }

    private static boolean validatEmailId(String emailId) {
        return Pattern.matches(string_regex,emailId);
    }
}
