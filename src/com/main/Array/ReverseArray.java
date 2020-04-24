package com.main.Array;

public class ReverseArray {
    public void reverse(int arr[]){
        for(int i=0; i<arr.length/2; i++){
            int other = arr.length-i-1;
            int temp = arr[i];
            arr[i] = arr[other];
            arr[other] = temp;
        }
    }

    public void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
