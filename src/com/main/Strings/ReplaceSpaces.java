package com.main.Strings;

public class ReplaceSpaces {
    int maximum;

 public ReplaceSpaces(int max) {
        maximum = max;
    }

    public char[] replaceSpaces(char[] str, int trueLength) {
        int space_count = 0;// i = 0;
        for (int i = 0; i <trueLength; i++)
            if (str[i] == ' ')
                space_count++;

        // count spaces and find current length
       /* while (str[i - 1] == ' ')
        {
            space_count--;
            i--;
        }*/

        // Find new length.
        int new_length = trueLength + space_count * 2;

        // New length must be smaller than length
        // of string provided.
        if (new_length > this.maximum)
            return str;

        // Start filling character from end
        //int index = new_length - 1;

        char[] new_str = str;
        str = new char[new_length];

        // Fill rest of the string from end
        for (int i = trueLength - 1; i >= 0; i--)
        {

            // inserts %20 in place of space
            if (new_str[i] == ' ')
            {
                str[new_length-1] = '0';
                str[new_length - 2] = '2';
                str[new_length - 3] = '%';
                new_length = new_length - 3;
            }

            else
            {
                str[new_length-1] = new_str[i];
                new_length--;
            }
        }
        return str;
 }
}

