package Strings;

public class areTwoStringsUnique {

   public boolean isUniqueString(String str){
        if(str.length() > 128){
            return false; // Assumed that we didnot use extended ASCII
        }
        boolean char_set[] = new boolean[128];
        for(int i=0; i<str.length();i++){
            int val = str.charAt(i);
            if(char_set[val]){
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }
}
//The time complexity is O(N) and space complexity is O(1)
