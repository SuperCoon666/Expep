package com.company;

import java.util.Scanner;

class StrangeException extends Exception {
    private int number;
    @Override
    public String getMessage() {
        return "Number\"" + number +"\" is odd! Expected even number.";
    }
    public StrangeException(int num) {
        number=num;
    }
}
public class Main {
  static boolean even= false;
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws StrangeException {
        try{
            System.out.println("Enter an even number:");

            int x=in.nextInt(); //проверяемое на чётность число
            if (x % 2 == 1) throw new StrangeException(x);
        }
        catch (StrangeException e){
            System.out.println(e.getMessage());
            even = true;

        }
        finally {
            if (even ==false){
            System.out.println("Your number is even");}
        }
    }
}