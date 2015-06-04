package com.acn.demo.action;
import java.lang.String;
public class RemoveCharFromString {

    static String input = "";
    public static void main(String[] args) {
        input = "axxbraxcadaxxbxrax";
        char token = 'x';
        removeChar(token);
        removeCharOneLine(token);
    }

    private static void removeChar(char token) {
        // TODO Auto-generated method stub
        System.out.println(input);
        for (int i=0;i<input.length();i++) {
            if (input.charAt(i) == token) {
                 input = input.replace(input.charAt(i), ' ');
                 System.out.println("MATCHES FOUND AND REMOVED:");
                }
            }
            input = input.replaceAll(" ", ""); // replace extara spaces for deleted chars
            System.out.println(input+" - x removed with iteration");
        }
    private static void removeCharOneLine(char token) {
    String replaceString;
    replaceString = input.replace("x","");
    System.out.println(replaceString+" - x removed with Java String replace() method");
    }
}