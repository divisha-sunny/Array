package com.main.Array.ArrayRotation;

public class ArrayRotation {
    /*Function to left rotate arr[] of size n by d*/
    public void leftRotate(int arr[], int d)
    {
        int n = arr.length;
        for (int i = 0; i < d; i++){
            leftRotateOne(arr, n);
        }

    }

    void leftRotateOne(int arr[], int n)
    {
        int temp = arr[0], i;
        for (i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[i] = temp;
    }
    public void rightRotate(int arr[], int d){
        int n = arr.length;
        for(int i=0; i<d; i++){
            rightRotateOne(arr, n);
        }

    }
    void rightRotateOne(int arr[], int n){
    int temp = arr[n-1],i;
     for(i=n-1; i>0; i--){
         arr[i] = arr[i-1];
     }
     arr[i]=temp;
    }

    public void printArray(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
