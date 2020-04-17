package com.Array.ArrayFormation;

public class DeleteElement {
    public int deleteElement(int arr[],int key){
        int pos = findElement(arr, key);
        if(pos == -1){
            System.out.println("Element not found");
        }
        int n = arr.length;
        for(int i=pos; i<n; i++){
            arr[i]=arr[i+1];
        }
        return n-1;
    }
    int findElement(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}
