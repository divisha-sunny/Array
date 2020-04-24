package com.main.Strings;

public class ZeroMatrix {

    //If we iterate through the matrix and everytime we see a cell with value zero, set its column and row to zero.
    //When we come across other cells in that row or column, we'll see thae zeros and change their row and column to zero then our entire matrix will be zero
    // Another way is to keep a second matrix which flags the zero locations. But it requires O(MN) space.
    public void setZeros(int[][] matrix){
        boolean row[] = new boolean[matrix.length];
        boolean column[] = new boolean[matrix[0].length];

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    column[j] = true;
                }
            }
        }
        // Nullify marked rows
        for(int i=0; i<row.length; i++){
            if(row[i]){
                for(int j=0; j<matrix[0].length; j++){
                    matrix[i][j] = 0;
                }
            }
        }
        //Nullify marked columns
        for(int j=0; j<column.length; j++){
            if(column[j]){
                for(int i=0; i<matrix.length; i++){
                    matrix[i][j] = 0;
                }
            }
        }
        // O(N)
    }
    public void setZero(int[][] matrix){
        //Time complexity - O(1)
        boolean rowHasZero = false;
        boolean columnHasZero = false;

        for(int j=0; j<matrix.length; j++){
            if(matrix[0][j] == 0){
                rowHasZero = true;
                break;
            }
        }

        for(int i=0; i<matrix.length; i++){
            if(matrix[i][0] == 0){
                columnHasZero = true;
                break;
            }
        }
        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix.length; j++){
                if(matrix[i][j] == 0){
                   matrix [i][0] = 0;
                   matrix [0][j] = 0;
                }
            }
        }

        for(int i=1; i<matrix.length; i++){
            if(matrix[i][0] == 0){
                nullifyRow(matrix, i);
            }
        }
        for(int j=1; j<matrix[0].length; j++){
            if(matrix[0][j]  == 0){
                nullifyColumn(matrix, j);
            }
        }
        if(rowHasZero){
            nullifyRow(matrix,0);
        }
        if(columnHasZero){
            nullifyColumn(matrix,0);
        }

    }

    void nullifyRow(int mat[][], int i){
        for(int j=0; j<mat[0].length; j++){
            mat[i][j] = 0;
        }
    }

    void nullifyColumn(int mat[][], int j){
        for(int i=0; i<mat.length; i++){
            mat[i][j] = 0;
        }
    }

    public static void printMatrix(int mat[ ][ ])
    {
        int i, j;
        int R = mat.length;
        int C = mat[0].length;
        for (i = 0; i < R; i++)
        {
            for (j = 0; j < C; j++)
            {
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
