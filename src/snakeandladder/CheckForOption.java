package snakeandladder;

import java.util.Random;

public class CheckForOption {
    CheckForOption() {
        System.out.println("Welcome to Snake and Ladder Problem");
    }public static void main(String args[]){
        CheckForOption input = new CheckForOption();
        int start_position=0;
        int Player_Position=0;
        Random random = new Random();
        /*
        UC-1 Snake & Ladder game played with single played at start position.
         */
        System.out.println("Single player at starting position "+start_position);
        /*
        UC-2 The player rolling die and get a random number between 1 to 6.
         */
        int die = (random.nextInt(6) + 1);
        System.out.println("The Player rolls the die and get a random number between 1 to 6 : " + die);
        /*
        UC-3 Player checks for an option
         */
        int d = random.nextInt(3);
        Player_Position = Player_Position + die;
        switch (d) {
            case 0:
                System.out.println("No play the player stays in the same position ");
                System.out.println("Player current position : " + Player_Position);
                break;
                case 1:
                Player_Position = Player_Position + die;
                System.out.println("Player gets Ladder & Player moves ahead by number of position received in the die : " + die);
                System.out.println("Player current position : " + Player_Position);
                break;
                case 2:
                Player_Position =Player_Position-die;
                System.out.println("Snake bytes & Player moves behind by number of position received in the die : " + die);
                System.out.println("Player current position is : " + Player_Position);
                break;

        }
    }
}
