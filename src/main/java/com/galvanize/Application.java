package com.galvanize;

public class Application {

    public static void main(String[] args){
        if (args.length < 1){
            System.out.println("Please specify a name and email");
        }
        else if (args.length < 2){
            System.out.println(String.format("Please specify an email for %s",args[0]));
        }
        else {
            String firstArgument = args[0];   // arg1
            String secondArgument = args[1];  // arg2
            String message = String.format("%s <%s>", firstArgument, secondArgument);
            System.out.println(message);
        }
    }
}
