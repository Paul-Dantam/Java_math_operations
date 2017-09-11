package com.TheIronYard;


import java.util.Scanner;



public class Main {

    int x = 5;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Please input 2 numbers hitting enter after each");

        String num1 = in.nextLine();
        String num2 = in.nextLine();

        System.out.println("your numbers are " + num1 + " " + num2);

        double operand1 = Double.parseDouble(num1);
        double operand2 = Double.parseDouble(num2);

        double sum = operand1 + operand2;

        double difference = operand1 - operand2;

        double division = operand1 / operand2;

        double multiplication = operand1 * operand2;

        double remainder = operand1 % operand2;

        showResults(sum, difference, division, multiplication, remainder);



    }

    public static void showResults(double sum, double difference, double division, double multiplication, double remainder) {
        System.out.println("The sum is "+sum);
        System.out.println("The difference is "+difference);
        System.out.println("The quotient is "+division);
        System.out.println("The product is "+multiplication);
        System.out.println("The remainder is "+remainder);


    }

}







