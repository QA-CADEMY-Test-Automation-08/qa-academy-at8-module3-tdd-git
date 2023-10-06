package com.qaacademy.module3.tddgit.roberto.katas;

public class CamelCaseMethod {
    public static String camelCase(String str) {
        str = str.strip();
        if (str.equals("")) {
            return "";
        } else {
            String[] strArr = str.split(" ");
            StringBuilder response = new StringBuilder();
            for (String s : strArr) {
                if (!s.equals("")) {
                    response.append(s.substring(0, 1).toUpperCase()).append(s.substring(1));
                }
            }
            return response.toString();
        }
    }
}
