package javaRevice;

import java.util.Scanner;

public class UserInputPractice {

    public static void main(String[] args) {

        Scanner prac = new Scanner(System.in);
        System.out.println("Enter your Bloodgroup:");
        String bloodgroup = prac.next();
        System.out.println("Enter your Age:");
        int age = prac.nextInt();

        System.out.println("bloodgroup:" + bloodgroup);
        System.out.println("age:" + age);



    }
}
