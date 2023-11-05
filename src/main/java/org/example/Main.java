package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Integer.toString('z'-96));
        System.out.println(solve("khrushchev"));
    }
    public static int solve(final String s) {
        String vowels = "aeiou";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!vowels.contains(Character.toString(s.charAt(i)))) {
                result.append(s.charAt(i));
            } else result.append(' ');
        }
        String[] a = result.toString().split("[ \\t]+");
        List<Integer> res = new ArrayList<>();
            for (int i = 0; i < a.length; i++) {
                String ee = a[i];
                int r = 0;
                for (char d: ee.toCharArray()) {
                    r+= d-96;
                }
                res.add(r);
            }
        return Collections.max(res);
    }
}
// better way to slove:
//    static int solve(String s) {
//        return of(s.split("[aeiou]")).mapToInt(con -> con.chars().map(c -> c - 96).sum()).max().orElse(0);
//    }