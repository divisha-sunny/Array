package com.main.Strings;

public class StringRotation {
    //Program to find two strings are rotations to each other or not using only one call of isasubstring() method.
    //Create a temp string and store the concatenation of str1 and str1. If stt2 is substring of temp then they are rotations of each other.
    public boolean isRotation(String s1, String s2) {
        int len = s1.length();
        if (s2.length() == len && len > 0) {
            String s1s1 = s1 + s1;
            return isSubstring(s1s1, s2);
        }
        return false;
    }

    boolean isSubstring(String s1, String s2) {
        int count = 0;
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) == s2.charAt(count)){
                count++;
            }
            else{
                count=0;
            }
            if(count == s2.length()){
                return true;
            }
        }
        return false;
    }
}