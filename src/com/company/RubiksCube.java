package com.company;

import java.util.Random;
import java.util.Scanner;

public class RubiksCube {

    public static void method(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("___     Start game     ___");
        System.out.println("Predict amount of points (2..19): 9");
        System.out.println("User rolls the dices...");
        int dice1 = random.nextInt(12);
        int dice2 = random.nextInt(12);

        switch (dice1) {
            case 1 -> System.out.println("" +
                    "\n+-------+" +
                    "\n|       |" +
                    "\n|   #   |" +
                    "\n|       |" +
                    "\n+-------+");
            case 2 -> System.out.println("" +
                    "\n+-------+" +
                    "\n|     # |" +
                    "\n|       |" +
                    "\n|  #    |" +
                    "\n+-------+");
            case 3 -> System.out.println("" +
                    "\n+-------+" +
                    "\n|     # |" +
                    "\n|   #   |" +
                    "\n| #     |" +
                    "\n+-------+");
            case 4 -> System.out.println("" +
                    "\n+-------+" +
                    "\n|   #   |" +
                    "\n| #   # |" +
                    "\n|   #   |" +
                    "\n+-------+");
            case 5 -> System.out.println("" +
                    "\n+-------+" +
                    "\n|  #  # |" +
                    "\n|   #   |" +
                    "\n|  #  # |" +
                    "\n+-------+");
            case 6 -> System.out.println("" +
                    "\n+-------+" +
                    "\n| #   # |" +
                    "\n| #   # |" +
                    "\n| #   # |" +
                    "\n+-------+");
        }

        switch (dice2) {
            case 1:
                System.out.println("" +
                        "\n+-------+" +
                        "\n|       |" +
                        "\n|   #   |" +
                        "\n|       |" +
                        "\n+-------+");
                break;
            case 2:
                System.out.println("" +
                        "\n+-------+" +
                        "\n|     # |" +
                        "\n|       |" +
                        "\n|  #    |" +
                        "\n+-------+");
                break;
            case 3:
                System.out.println("" +
                        "\n+-------+" +
                        "\n|     # |" +
                        "\n|   #   |" +
                        "\n| #     |" +
                        "\n+-------+");
                break;
            case 4:
                System.out.println("" +
                        "\n+-------+" +
                        "\n|   #   |" +
                        "\n| #   # |" +
                        "\n|   #   |" +
                        "\n+-------+");
                break;
            case 5:
                System.out.println("" +
                        "\n+-------+" +
                        "\n|  #  # |" +
                        "\n|   #   |" +
                        "\n|  #  # |" +
                        "\n+-------+");
                break;
            case 6:
                System.out.println("" +
                        "\n+-------+" +
                        "\n| #   # |" +
                        "\n| #   # |" +
                        "\n| #   # |" +
                        "\n+-------+");
                break;
        }

        int sum = (dice1 + dice2);
//        int b = sum - Math.abs(sum - ) * 2;
        System.out.println("On the dice fell " + sum + " points.");
//        System.out.println("Result is " + dice1 + "-" + "abc( " + dice1 + "-" + dice2 + ") * 2: " + b + " points.");
//        if (b > 0){
//            System.out.println("User wins!");
//        } else {
//            System.out.println("User lost!");
//        }
    }
}
