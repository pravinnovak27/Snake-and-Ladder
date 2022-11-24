package com.bridgelabz;
import java.util.Random;
public class RandomValue {
    public static void main(String[] args) {

        Random rand = new Random();
        int diceValue = rand.nextInt(6)+1;
        System.out.println("Dice Value is " +diceValue);
    }
}
