import java.util.Scanner


package com.TheIronYard;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please input 2 numbers, separated by a space");

        while (in.hasNext()) {
            if (in.hasNextInt())
                System.out.println(in.nextInt());
            else
                in.next();
            }
        }
    }

