package javaRevice;

import java.util.Scanner;

public class Array2dPractice3 {
    public static void main(String[] args) {

        int d[][]  = new int[3][2];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your values");
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 2; j++){
                d[i][j] =scan.nextInt();
            }
            System.out.println();
        }
        System.out.println("your output:");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 2; j++){
                System.out.print(d[i][j]+" ");
            }
            System.out.println();
        }

    }
}
