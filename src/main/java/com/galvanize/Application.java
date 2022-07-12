package com.galvanize;

public class Application {
    public static String fizzBuzz(int x){
        if (x % 3 ==0 && x % 5 == 0){
            return "FizzBuzz";
        }
        else if (x % 3 ==0){
            return "Fizz";
        }
        else if (x % 5 == 0){
            return "Buzz";
        }
        else {
            return String.format("%s Is A Integer",x);
        }
    }
    public static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        if (args.length < 1 || !isInt(args[0])) {
            System.out.println("Please specify a number!");
        }
        else{
            int number = Integer.parseInt(args[0]);
            System.out.println(fizzBuzz(number));
        }
    }


}
