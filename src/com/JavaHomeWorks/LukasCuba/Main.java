package com.JavaHomeWorks.LukasCuba;

public class Main {

    public static void main(String[] args) {

        displaySortedNUmber(2,3,1);

    }

    public static void displaySortedNUmber(double num1, double num2, double num3){

        double result;

        if (num2 < num1 && num2 < num3) {

            result = num1;
            num1 = num2;
            num2 = result;

        }else if (num3 < num1 && num3 < num2) {

            result = num1;
            num1 = num3;
            num3 = result;

        }if (num3 < num2){

            result = num2;
            num2 = num3;
            num3 = result;

        }

        System.out.println(num1 + " " + num2 + " " + num3);

    }


}
