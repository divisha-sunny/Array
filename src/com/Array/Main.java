package com.Array;

import Strings.areTwoStringsPermutationsToEachOther;
import Strings.areTwoStringsUnique;
import com.Array.ArrayFormation.DeleteElement;
import com.Array.ArrayFormation.InsertElement;
import com.Array.ArrayFormation.Search;
import com.Array.ArrayRotation.ArrayRotation;
import com.Array.Sort.MergeTwoArrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayRotation rotate = new ArrayRotation();
       // int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            /*rotate.rightRotate(arr, 1);
            rotate.printArray(arr);
            System.out.println(" ");
            arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            rotate.leftRotate(arr, 1);
            rotate.printArray(arr);*/
        ArrayRotation rotation = new ArrayRotation();
            /*rotation.leftRotate(arr,2);
            rotate.printArray(arr);*/
        Search search = new Search();
       /* int k = search.SearchElement(arr,5);
        System.out.println("The element is in the index "+k+" and in the position "+(k+1));*/
       /* int[] arr1 = new int[20];
        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 70;
        int capacity = 20;
        int n = 6;
        int key = 26;*/

        InsertElement insert = new InsertElement();
       /* System.out.println("Before Insertion:");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        n = insert.insert(arr1,n,key,capacity);
        System.out.println("After Insertion:");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }*/
       /* DeleteElement delete = new DeleteElement();
        int arr[] = {10, 50, 30, 40, 20};
        int n = arr.length;
        System.out.println("Array before deletion:");
        for (int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        n = delete.deleteElement(arr,5,30);
        System.out.println("\n");
        System.out.println("Array after deletion");

        for (int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }*/
        /*MergeTwoArrays merge = new MergeTwoArrays();
        int mPlusN[] = {2, 8, -1, -1, -1, 13, -1, 15, 20};
        int N[] = {5, 7, 9, 25};
        int n = N.length;
        int m = mPlusN.length - n;

        *//*Move the m elements at the end of mPlusN*//*
        merge.moveToEnd(mPlusN, m + n);

        *//*Merge N[] into mPlusN[] *//*
        merge.merge(mPlusN, N, m, n);

        *//* Print the resultant mPlusN *//*
        rotate.printArray(mPlusN);*/

       /* areTwoStringsUnique unique = new areTwoStringsUnique();
        String input = "Divisha";
        if(unique.isUniqueString(input)){
            System.out.println("Has Unique characters");
        }
        else {
            System.out.println("Has duplicate characters");
        }*/

        areTwoStringsPermutationsToEachOther permutation = new areTwoStringsPermutationsToEachOther();
        String str1 = "dog";
        String str2 = "dog";
        if(permutation.charCount(str1, str2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}

