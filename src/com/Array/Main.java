package com.Array;

import com.Array.ArrayFormation.DeleteElement;
import com.Array.ArrayFormation.InsertElement;
import com.Array.ArrayFormation.Search;
import com.Array.ArrayRotation.ArrayRotation;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayRotation rotate = new ArrayRotation();
        int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
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
        int[] arr1 = new int[20];
        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 70;
        int capacity = 20;
        int n = 6;
        int key = 26;

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
        DeleteElement delete = new DeleteElement();
        int arr2[] = {10, 50, 30, 40, 20};
        int n1 = arr2.length;
        System.out.println("Array before deletion:");
        for (int i=0; i<n1; i++) {
            System.out.print(arr2[i] + " ");
        }
        n1 = delete.deleteElement(arr2,30);

        System.out.println("Array after deletion");

        for (int i=0; i<n1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

