package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, Welcome to Simple Calculator");
        String input1 = getInput("Insert the first number: ");
        String input2 = getInput("Insert the second number: ");
        String inputop = getInput("Insert the operation (+, -, *, /): ");
        double result = 0;

        try {
            switch (inputop){
                case "+":
                    result = addValues(input1,input2);
                    break;
                case "-":
                    result = substractValues(input1,input2);
                    break;
                case "/":
                    result = divideValues(input1,input2);
                    break;
                case "*":
                    result = multiplyValues(input1,input2);
                    break;
                default:
                    System.out.println("Unrecognised operation");
                    return;
            }
            System.out.println("The result is: " + result);
        } catch (Exception e){
            System.out.println("Number formatting exception " + e.getMessage());
        }
    }

    private static String getInput(String prompt){
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static double substractValues(String input1, String input2){
        double num1 = Double.parseDouble(input1);
        double num2 = Double.parseDouble(input2);
        return num1 - num2;
    }

    public static double addValues(String input1, String input2){
        double num1 = Double.parseDouble(input1);
        double num2 = Double.parseDouble(input2);
        return num1 + num2;
    }

    public static double multiplyValues(String input1, String input2){
        double num1 = Double.parseDouble(input1);
        double num2 = Double.parseDouble(input2);
        return num1 * num2;
    }

    public static double divideValues(String input1, String input2){
        double num1 = Double.parseDouble(input1);
        double num2 = Double.parseDouble(input2);
        return num1 / num2;
    }
}
