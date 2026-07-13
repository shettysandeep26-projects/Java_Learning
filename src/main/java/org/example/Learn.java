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

    public void set(){
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        System.out.println(set.add("c"));
        System.out.println(set);
    }

    public void work() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        System.out.println(list.add("c"));
        System.out.println(list);

    }


}
