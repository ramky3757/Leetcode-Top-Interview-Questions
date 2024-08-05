package easy.arrays;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
       int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        //convert rows to columns
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
               matrix[j][i]=temp;
            }
        }
        //reverse the matrix
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j< matrix.length/2;j++){

                int temp = matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j]=temp;
            }
        }

        //Print to verify
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<=matrix[i].length-1;j++){
                System.out.print(matrix[i][j]);
            }
        }
    }
}
