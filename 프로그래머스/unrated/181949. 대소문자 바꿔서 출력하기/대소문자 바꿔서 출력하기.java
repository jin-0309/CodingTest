import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String anwser = "";
        
        for (Character text : a.toCharArray()) {
            if (Character.isUpperCase(text)) {
                anwser += Character.toLowerCase(text);
            } else if(Character.isLowerCase(text)) {
                anwser += Character.toUpperCase(text);
            }
        }
        System.out.println(anwser);
    }
}