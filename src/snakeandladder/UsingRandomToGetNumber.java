package snakeandladder;

import java.util.Random;

public class UsingRandomToGetNumber {
    UsingRandomToGetNumber() {

        System.out.println("Welcome to Snake and Ladder Problem");
    }public static void main(String args[]){
        UsingRandomToGetNumber input = new UsingRandomToGetNumber();

        /*
        UC-1 Snake & Ladder game played with single played at start position.
         */
        int start_position=0;
        System.out.println("Single player at starting position "+start_position);
        /*
        UC-2 The player rolling die and get a random number between 1 to 6.
         */

        Random random = new Random();
        int die = (random.nextInt(6) + 1);
        System.out.println("The Player rolls the die and get a random number between 1 to 6 : " + die);
    }

}
