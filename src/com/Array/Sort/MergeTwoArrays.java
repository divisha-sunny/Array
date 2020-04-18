package com.Array.Sort;

public class MergeTwoArrays {
   // First array is of size m+n and contains n elements and second array is of size m
    public void moveToEnd(int mPlusN[], int size){
        int j = size-1;
        for(int i = size-1; i>=0; i--) {
            if (mPlusN[i] != -1) {
                mPlusN[j] = mPlusN[i];
                j--;
            }
        }
    }
    public void merge(int mPlusN[], int N[], int m, int n){

        int i=n;// nth index of m+n
        int j=0;// current index of mPlusN[]
        int k=0;// current index of N

        while(k<(m+n))
        {
         if((i < (m+n) && mPlusN[i] <= N[j] || (j==n))){
             mPlusN[k] = mPlusN[i];
             k++;
             i++;
         }
         else{
             mPlusN[k] = N[j];
             k++;
             j++;
         }
        }
    }
}
