package com.Array.ArrayRotation;

public class ReversalAlgoritmforArrayRotation {

    public void leftRotate(int arr[], int d){
        if(d==0){
            return;
        }
        int n=arr.length;
        reverseArray(arr,0,d-1);
        reverseArray(arr,d,n-1);
        reverseArray(arr,0,n-1);
    }

    void reverseArray(int arr[], int start, int end){
        int temp;
        while(start<end){
            temp=start;
            start=end;
            end=temp;
            start++;
            end--;
        }
    }
}
