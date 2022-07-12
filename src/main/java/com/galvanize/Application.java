package com.galvanize;

public class Application {

    public static void main(String[] args){
        if (args.length < 1){
            System.out.println("Please specify a number");
        }
        else {
            int number = Integer.parseInt(args[0]);   // arg1
            if (number % 3 ==0 && number % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if (number % 3 ==0){
                System.out.println("Fizz");
            }
            else if (number % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(args[0]);
                System.out.println(args[0].getClass().getSimpleName());
            }
        }
    }
}
