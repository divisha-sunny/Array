package com.Array;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayRotation rotate = new ArrayRotation();
        int arr[] = {0,1,2,3,4,5,6,7,8,9};
            rotate.rightRotate(arr, 1);
            rotate.printArray(arr);
            System.out.println(" ");
            arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            rotate.leftRotate(arr, 1);
            rotate.printArray(arr);
        }
    }

