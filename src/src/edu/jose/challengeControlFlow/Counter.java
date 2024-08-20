package edu.jose.challengeControlFlow;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int parameterOne = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the second number:");
        int parameterTwo = scanner.nextInt();

        try {
            count(parameterOne, parameterTwo);

        }catch (InvalidParametersException exception) {
            System.out.println(exception.getMessage());
        }

    }
    static void count(int parameterOne, int parameterTwo ) throws InvalidParametersException{
        if (parameterOne > parameterTwo) {
            throw new InvalidParametersException("The second parameter must be greater than the first.");
        }

        int count = parameterTwo - parameterOne;

        for(int i = 1; i <= count; i++) {
            System.out.println("printing number " + i);
        }
    }
}
