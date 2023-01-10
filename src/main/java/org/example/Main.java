package org.example;

/*You have two strings as an input , 3 > n > 5000, where n is a string length
Output is a boolean, which indicates if these two string are anagrams(case insensitive)
Write unit tests that covers at least 80% cases
Tech stack: Java 8+, JUnit 5
Publish in Gitlab/Github */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to anagram checker app :)");
        System.out.println("Type first String:");
        String first = scanner.nextLine();
        System.out.println("Type second String:");
        String second = scanner.nextLine();

        if (isAnagram(first, second)) {
            System.out.println(first + " and " + second + " are anagrams");
        } else {
            System.out.println(first + " and " + second + " aren't anagrams");
        }
    }

    public static boolean isAnagram(String first, String second) {
        first = first.toLowerCase().replaceAll("\\s+", "");
        second = second.toLowerCase().replaceAll("\\s+", "");

        if (first.isEmpty() && second.isEmpty()) {
            return false;
        }

        if (first.length() != second.length()) {
            return false;
        }

        char[] letters1 = first.toCharArray();
        char[] letters2 = second.toCharArray();
        Arrays.sort(letters1);
        Arrays.sort(letters2);
        return Arrays.equals(letters1, letters2);
    }
}