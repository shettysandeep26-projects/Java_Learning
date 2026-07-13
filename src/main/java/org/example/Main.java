package org.example;

import java.util.Arrays;
import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        findDuplicateInArray();
    }

    public static void fibanoci() {
        int num1 = 0;
        int num2 = 1;
        int sum = 0;
        System.out.println("Fib \n 0 \n");
        for (int i = 0; i < 5; i++) {
            sum = num1 + num2;
            System.out.println(sum + "\n");
            num1 = num2;
            num2 = sum;
        }
    }

    public static void reverseArray() {
        String[] strArray = new String[]{"a", "b", "c", "d"};
        int start = 0;
        int end = strArray.length - 1;
        while (start < end) {
            String temp = strArray[start];
            strArray[start] = strArray[end];
            strArray[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.asList(strArray));
    }

    public static void reverseString() {
        String originalString = "String";
        String reverse = "";
//        StringBuilder reverse = new StringBuilder();
        for (int i = originalString.length() - 1; i >= 0; i--) {
            reverse += originalString.charAt(i);
//            reverse.append(originalString.charAt(i));
        }
        System.out.println(reverse);
    }

    public static void palindrome() {
        String original = "madam";
        StringBuilder reverse = new StringBuilder();
//        String reverse = new StringBuilder(original).reverse().toString();
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse.append(original.charAt(i));
        }
        if (original.contentEquals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

    public static void findDuplicateInArray() {
        int[] arr = {1, 2, 3, 1, 4, 3};
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num)) {
                System.out.println(num + " is a duplicate");
            }
        }
        System.out.println(set);
    }


}