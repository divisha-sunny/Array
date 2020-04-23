package com.main.Strings;

public class stringCompressor {
    // Bad way of doing this is to use String for compression
    //Using String
    public String compressBad(String str){
        String compressedString = "";
        int countConsecutive = 0;

        for(int i=0; i<str.length(); i++){
            countConsecutive++;

            if(i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)){
                compressedString = compressedString + str.charAt(i)+countConsecutive;
                countConsecutive = 0;
            }
        }
        return compressedString.length() < str.length() ? compressedString : str;
    }
    //Complexity is O(n^2)

    public String compress(String str){
        StringBuilder compressed = new StringBuilder();
        int countConsecutive = 0;
        for(int i=0; i< str.length(); i++){
            countConsecutive++;

            if(i+1 >= str.length() || (str.charAt(i) != str.charAt(i+1))){
                compressed.append(str.charAt(i));
                compressed.append(countConsecutive);
                countConsecutive = 0;
            }
        }
        return compressed.length() < str.length() ? compressed.toString() : str;
    }

    public String compressor(String str){
        int finalLength = countCompressor(str);
        if(finalLength >= str.length()){
            return str;
        }

        StringBuilder compressed = new StringBuilder();
        int countConsecutive = 0;
        for(int i=0; i<str.length(); i++){
            countConsecutive++;

            if(i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)){
                compressed.append(str.charAt(i));
                compressed.append(countConsecutive);
                countConsecutive = 0;
            }
        }
        return compressed.toString();
    }

    int countCompressor(String str){
        int compressedLength = 0;
        int countConsecutive = 0;

        for(int i=0; i<str.length(); i++){
            countConsecutive++;

            if(i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)){
               compressedLength = compressedLength + String.valueOf(countConsecutive).length();
               countConsecutive=0;
            }
        }
        return compressedLength;
    }
}
