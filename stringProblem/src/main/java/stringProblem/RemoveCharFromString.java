package stringProblem;

import java.lang.String;
public class RemoveCharFromString {

    static String input = "";
    public static void main(String[] args) {
        input = "axxbraxcadaxxbxrax";
        char token = 'x';
        removeChar(token);
        removeCharOneLine(token);
    }
    
    /**
    *
    * @return
    * @should return string w/o x
    */
//    @should not return a null object
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
    

    /**
    *
    * @return
    * @should return string w/o x
    */
//    @should not return a null object
    private static void removeCharOneLine(char token) {
    String replaceString;
    replaceString = input.replace("x","");
    System.out.println(replaceString+" - x removed with Java String replace() method");
    }
}