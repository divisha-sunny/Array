package com.Array.ArrayFormation;

public class Search {

    public int SearchElement(int arr[], int data){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == data){
                return i;
            }
        }
        return -1;
    }
}
