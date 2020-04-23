package com.main.Strings;

public class oneAway {

    //We can have functions for Insertion and Removal combined and replacement seperately
    public boolean oneEditAway(String first, String second ){

        if(first.length() == second.length()){
            return oneEditReplace(first, second);
        }
        else if(first.length()+1 == second.length()){
            return oneEditInsertOrRemove(first, second);
        }
        else if(first.length()-1 == second.length()){
            return oneEditInsertOrRemove(first, second);
        }
        return false;
    }

    boolean oneEditReplace(String s1, String s2){
        boolean foundDifference = false;
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                if(foundDifference){
                    return false;
                }
                foundDifference = true;
            }
        }
        return true;
    }

    boolean oneEditInsertOrRemove(String s1, String s2){
        int index1 = 0;
        int index2 = 0;
        while(index2 < s2.length() && index1 < s1.length()){
            if(s1.charAt(index1) != s2.charAt(index2)){
                if(s1.length() > s2.length()){
                    index1++;
                }
                else {
                    index2++;
                }
                if(s1.charAt(index1) == s2.charAt(index2)){
                    return true;
                }
                return false;
            }
            else{
                index1++;
                index2++;
            }
        }
        return true;
    }

    public boolean combinesONeMoveAway(String first, String second){
        if(Math.abs(first.length() - second.length()) > 1){
            return false;
        }
        String s1 = first.length() < second.length() ? first : second;
        String s2 = first.length() < second.length() ? second : first;
        int index1 = 0;
        int index2 = 0;
        boolean foundDifference = false;

        while(index2 < s2.length() && index1 < s1.length()){
            if(s1.charAt(index1) != s2.charAt(index2)) {
                if (foundDifference) {
                    return false;
                }
                foundDifference = true;

                if (s1.length() == s2.length()) {
                    index1++;
                }
            }
            else{
                index1++;
            }
            index2++;
        }
        return true;
    }
}
