package javaRevice;

import java.util.Scanner;

public class Array2dPractice4 {
    public static void main(String[] args) {
//        int d[][]  = new int[3][2];
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter your values");
//        for(int i = 0; i < 3; i++){
//            for (int j = 0; j < 2; j++){
//                d[i][j] =scan.nextInt();

        int a[][] = new int[4][3];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your vallus");
        for(int b = 0; b < 4; b++){
            for(int c = 0; c < 3; c++){
                a[b][c] = input.nextInt();
            }
            System.out.println();
        }
        System.out.println("your output");
        for (int b = 0; b < 4; b++){
            for (int c = 0; c < 3; c++){
                System.out.print(a[b][c]+" ");
            }
            System.out.println();
        }

    }
}
