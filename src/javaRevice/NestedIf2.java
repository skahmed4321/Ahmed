package javaRevice;

public class NestedIf2 {
    public static void main(String[] args) {
        int a = 15;
        int b = 25;
        int c = 40;
        int d = 60;

        if (a > b) {
            if (a > c) {
                if(a > d){
                    System.out.println("a is greater");
                }
                else {
                    System.out.println("d is grater");
                }
            } else if (c > d){
                System.out.println("c is greater");
            }
            else {
                System.out.println("d is grater");
            }


        } else if (b > c) {
            System.out.println("b is greater");

        } else {
            System.out.println("c is greater");
        }



        }
    }
