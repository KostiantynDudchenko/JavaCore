package javaCore.t2t3t10;

public class Palindrome {

    public static boolean isPalindrome(String text) {
        return text.replaceAll("[^a-zA-Z0-9]", "")
                .equalsIgnoreCase(new StringBuilder(text.replaceAll("[^a-zA-Z0-9]", ""))
                        .reverse().toString());
    }

    public static void main(String[] args) {
        String t = "m=ad=-a}{:m";

        System.out.println(Palindrome.isPalindrome(t));
    }
}
