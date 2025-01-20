package org.example.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractSubStringfromString {
    public static void main(String[] args) {
        String data = "This is a test String and 'This is data we want'";
        Pattern pattern = Pattern.compile("'(.*?)'");
        Matcher matcher = pattern.matcher(data);
        if (matcher.find())
        {
            System.out.println(matcher.group(1));
        }
        List<String> s1 = new ArrayList<>();
    }
}
