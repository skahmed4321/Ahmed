package javaRevice;

public class ElseIf2 {

    public static void main(String[] args) {

        int a = 70;
        int b = 20;
        int c = 10;
        int d = 80;
        int e = 60;
        if (a > b && a > c && a > d && a > e) {
            System.out.println("a is greater");
        } else if (b > a && b > c && b > d && b > e) {
            System.out.println("b is greater");
        } else if (c > a && c > b && c > d && c > e) {
            System.out.println("c is greater");
        }else if (d > a && d > b && d > c && d > e) {
            System.out.println("d is greater");
        }
        else {
            System.out.println("e is greater");
        }

    }
}
