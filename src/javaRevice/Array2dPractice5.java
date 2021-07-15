package javaRevice;

import java.util.Scanner;

public class Array2dPractice5 {
    public static void main(String[] args) {

        int[][] i = new int[3][3];
        Scanner ann = new Scanner(System.in);
        System.out.println("enter your valus");
        for (int a = 0;  a < 3; a++){
            for (int b = 0; b < 3; b++){
                i[a][b] = ann.nextInt();
            }
            System.out.println();
        }
        System.out.println("enter your output");
        for (int a = 0; a < 3; a++){
            for (int b =0; b < 3; b++){
                System.out.print(i[a][b]+" ");
            }
            System.out.println();
        }
    }
}
