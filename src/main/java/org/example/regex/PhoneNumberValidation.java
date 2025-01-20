package org.example.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneNumberValidation {
    private static  final  String string_regex = "(0|91)?[6-9][0-9]{9}";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Phone number to validate");
        String ph = sc.nextLine();
        if(isValidatPhoneNum(ph)){
            System.out.println("Entered number is valid phone number");
        }
        else
            System.out.println("Entered number is invalid");
    }

    private static boolean isValidatPhoneNum(String ph) {
        return Pattern.matches(string_regex,ph);
    }
}
