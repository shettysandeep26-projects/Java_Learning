package org.example;

import java.util.*;

public class Learn {
    public static void main(String[] args) {
        Learn learn = new Learn();
        learn.work();
    }

    public void reverseAnArray() {
        String[] strArray = new String[]{"a", "b", "c", "d", "e"};
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

    public void reverseString() {
        String originalString = "String";
        String reverse = "";
        for (int i = originalString.length() - 1; i >= 0; i--) {
            reverse += originalString.charAt(i);
        }
        System.out.println(reverse);

        StringBuilder original = new StringBuilder("abcde");
        System.out.println(original.reverse());

    }

    public void iterateHashMap() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        map.put("d", "4");
        System.out.println(map);

        for (String key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, String> entry = itr.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void set() {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        System.out.println(set.add("c"));
        System.out.println(set);
    }

    public void arrayList() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        System.out.println(list.add("c"));
        System.out.println(list);
    }

    public void duplicateInArray() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 1, 2, 3};
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (!set.add(i)) {
                System.out.println("Duplicate element: " + i);
            }
        }
    }

    public void searchElementInArray() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int searchElement = 1;
        boolean found = false;
        for (int num : arr) {
            if (num == searchElement) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(searchElement + " is found in the array.");
        } else {
            System.out.println(searchElement + " is not found in the array.");
        }
    }

    public void largestElementInArray() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Largest element in the array is: " + largest);
    }

    public void sortArray() {
        int[] arr = {10, 6, 1, 5, 7, 9, 8};
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public void secondLargestElementInArray() {
        int[] arr = new int[]{10, 6, 1, 5, 7, 9, 8};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Second largest element in the array is: " + secondLargest);

//        {
//            int[] arr = new int[]{10, 6, 1, 5, 7, 9, 8};
//            Arrays.sort(arr);
//            System.out.println("Sorted array: " + Arrays.toString(arr));
//            System.out.println("Second largest element in the array is: " + arr[arr.length - 2]);
//        }
    }

    public void work() {

    }


}
