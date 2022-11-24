package com.bridgelabz;
import java.util.Random;

public class ExactWinning {
    public static void main(String[] args) {

        int position = 0;
        final int WINNINGPOSITION = 100;
        while(position <= WINNINGPOSITION) {
            Random rand = new Random();
            int diceValue = rand.nextInt(6)+1;
            System.out.println("Dice Value is  " +diceValue);
            int option = rand.nextInt(3);
            if(position == WINNINGPOSITION) {
                System.out.println("You won the game");

                break;
            }
            switch(option) {
                case 0:
                    System.out.println("No Play");
                    break;
                case 1:
                    System.out.println("Ladder");
                    position += diceValue;
                    System.out.println("Current Position is " + position);

                    if(position > 100) {
                        position = position - diceValue;
                        System.out.println("Current Position is " + position);
                    }
                    break;
                case 2:
                    System.out.println("Snake");
                    position -= diceValue;
                    System.out.println("Current Position is " + position);

                    if(position < 0) {
                        position = 0;
                        System.out.println("Current Position is " + position);
                    }
                    break;
                default:
                    System.out.println("Not Correct");
                }
            }
        }
}
