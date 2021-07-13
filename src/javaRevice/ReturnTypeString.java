package javaRevice;

public class ReturnTypeString {



        public String addNumber(){
            String s = "rahim";
            String n = "karim";
            String d = s+" "+n;
            return d;

        }

        public static void main(String[] args) {
            ReturnTypeString r = new ReturnTypeString();
            String e = r.addNumber();
            System.out.println(e);
        }
    }

