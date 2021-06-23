package javaRevice;

public class LeapYear {

    public static void main(String[] args) {
//      int year = 2022;
//      if(((year % 4 == 0) && (year % 100!= 0)) || (year % 400 == 0)){
//          System.out.println("leap year");
//
//      }
//      else {
//          System.out.println("not leap year");
//      }


        int year = 2022;

        if (year % 4 == 0) {

            if (year % 100 != 0) {

                System.out.println("leap year");

            } else {
                if (year % 400 == 0) {
                    System.out.println("leap year");

                } else {
                    System.out.println("not leap year");
                }
            }

        } else {
            System.out.println("not leap year");

        }


    }


    }
