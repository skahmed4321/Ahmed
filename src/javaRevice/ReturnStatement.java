package javaRevice;

public class ReturnStatement {

    public int addNumber(){
        int a= 20;
        int b= 30;
        int c= a+b;
        return c;
    }

    public static void main(String[] args) {

        ReturnStatement r = new ReturnStatement();
        int d = r.addNumber();
        System.out.println(d);

    }
}
