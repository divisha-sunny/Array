package com.main.Strings;

import java.util.Arrays;

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
}
