package javaRevice;

public class Array2d {

    public static void main(String[] args) {
        int[][] a = {{2,3,4},{5,6,7},{8,9,10}};
        for(int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
