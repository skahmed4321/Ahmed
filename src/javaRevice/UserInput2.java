package javaRevice;

import java.util.Scanner;

public class UserInput2 {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name = user.next();
        System.out.println("Enter Your Age:");
        int age = user.nextInt();
        System.out.println("Enter Your Address:");
        String address = user.next();
        System.out.println("Enter Your Zipcode:");
        int zipcode = user.nextInt();

        System.out.println("Name"+name);
        System.out.println("Age"+age);
        System.out.println("Address"+address);
        System.out.println("Zipcode"+zipcode);
    }
}
