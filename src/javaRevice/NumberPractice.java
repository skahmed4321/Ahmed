package javaRevice;

public class NumberPractice {
    public static void main(String[] args) {
        int a =20;
        int b =30;
        int c =15;
        int d =40;
        if(a<b && a<c && a<d){
            System.out.println("a is smaller");
        }
        else if(b<a && b<c && b<d){
            System.out.println("b is smaller");
        }
        else if (c<a && c<b && c<d ){
            System.out.println("c is smaller");
        }
        else  {
            System.out.println("d is smaller");
        }

        }
    }


