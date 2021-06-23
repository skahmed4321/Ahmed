package javaRevice;

public class NewClass1 {

    public static void main(String[] args) {


        int age = 60;
        int waight = 70;

        if (age < 30) {
            if (waight < 50) {
                System.out.println("eligible for vote");
            } else {
                System.out.println("not eligible");
            }
        }
        else{
            if (age <= 30 && waight >= 50) {
                System.out.println("eligible for vaccine");

            }
            else {
                System.out.println("not eligible vaccine");
            }

        }

    }
}