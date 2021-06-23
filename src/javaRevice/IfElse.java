package javaRevice;

public class IfElse {

    public static void main(String[] args) {


        int marks = -100;

        if (marks < 40) {
            System.out.println("fail");
        }
        else if(marks>=40 && marks < 60){
            System.out.println("pass");
        }

            else if(marks >= 60 && marks < 70){
            System.out.println("Grade C");
        }
            else if(marks >= 70 && marks < 80){
            System.out.println("Grade B");
        }

            else if(marks >= 80 && marks < 95){
            System.out.println("Grade A");
        }
            else if(marks >= 95){
            System.out.println("Grade A+");
        }
            else{
            System.out.println("Invaid");
        }

            }
        }
