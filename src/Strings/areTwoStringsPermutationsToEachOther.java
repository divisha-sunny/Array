package Strings;


import java.util.Arrays;

public class areTwoStringsPermutationsToEachOther {
    public boolean usingSort(String s, String t){
        //For two String to be permutations they should have same characters.
        //Sorting and comparing
        if(s.length() != t.length()){
            return false;
        }
        //We cannot resolve sort method for Strings.
        //So we have to convert strings to character arrays
        char chs[] = s.toCharArray();
        char cht[] = t.toCharArray();

        Arrays.sort(chs);
        Arrays.sort(cht);
        for(int i=0; i<chs.length; i++){
            if(chs[i] != cht[i]){
                return false;
            }
        }
        return true;
    }
    //This algorithm is not optimal in some senses

    //If efficiency is very important, we can implement in following way
    //Two words with same character counts are permutations.

    public boolean charCount(String s, String t){

        if(s.length() != t.length()){
            return false;
        }
        int letter[] = new int[128];//Assumed ASCII
        char[] s_array = s.toCharArray();
        for(char c : s_array){
            letter[c]++;
        }
        for(int i=0; i<t.length();i++){
            int c = t.charAt(i);
            letter[c]--;
            if(letter[c] < 0){
                return false;
            }
        }
        return true;
    }
}
