package com.main.Array.ArrayFormation;

public class InsertElement {

    public int insert(int arr[], int n, int key, int capacity){
        if(n >= capacity){
            return n;
        }
        arr[n] = key;
        return (n+1);
    }
}
