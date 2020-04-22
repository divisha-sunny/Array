package com.main.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.main.Main.NO_OF_CHARACTERS;

public class palindromePermutation {
    //To decide if a string is a permutation of palindrome, there should be even characters and at most one odd character in the middle.
    //Therefore strings with even length must have all even count of the characters and strings with odd length must have exactly one character with odd count.
    public boolean canFormPalindrome(String str){
        int count[] = new int[NO_OF_CHARACTERS];
        Arrays.fill(count,0);

        for(int i=0; i<str.length(); i++){
            count[str.charAt(i)]++;
        }
        int odd = 0;
        for(int i=0; i<count.length; i++) {

            if (count[i] == 1) {
                odd++;
            }
            if (odd > 1) {
                return false;
            }

        }
        return true;
    }

    public boolean palindromePermutawithList(String str){

        // Traverse the string and remove the character if already contains else add to the list.
        // If string length is even expected to be empty else size is expected to be 1
        List<Character> list = new ArrayList<Character>();
        for(int i=0; i<str.length(); i++){
            if(list.contains(str.charAt(i))){
                list.remove((Character)str.charAt(i));
            }
            else{
                list.add(str.charAt(i));
            }
        }
        if(((str.length() % 2) == 0 && list.isEmpty()) || ((str.length() % 2) != 0 && (list.size() == 1))){
            return true;
        }
        return false;
    }
}
