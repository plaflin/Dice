package com.patricklaflin;
import java.util.Random;


public class Dice {
    public static void main(String[] args) {
        // TODO: PBL - This dice is too random. Come back and make it more precise.
        Random generator = new Random();
        int value = generator.nextInt();
        System.out.println("The random number is " +value);
    }
}
