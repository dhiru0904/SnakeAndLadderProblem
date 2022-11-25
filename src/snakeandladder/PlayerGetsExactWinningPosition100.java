package snakeandladder;

import java.util.Random;

public class PlayerGetsExactWinningPosition100 {
    void PlayerGetsExactWinningPosition100() {
        System.out.println("Welcome to Snake and Ladder Problem");
    }public static void main(String args[]){
        PlayerGetsExactWinningPosition100 input = new PlayerGetsExactWinningPosition100();
        int start_position=0;
        int Player_Position=0;
        int Winning_Position = 100;
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
                /*
                Repeat till the Player reaches the winning position 100.
                 */
                if (Player_Position <= 0) {
                    Player_Position = 0;
                    System.out.println("Oops Snake byte and Player is Starting from zero");
                    System.out.println("Player current position is : " + Player_Position);
                } else {
                    System.out.println("Oops Snake bytes and Player moves behind by number of position : " + die);
                    System.out.println("Player current position is : " + Player_Position);
                }
                break;
        }
        if (Player_Position > Winning_Position)
        {
        Player_Position -= die;
            System.out.println("Position goes beyond 100.\nSo no play - Player stays in the same position ");
            System.out.println("Player current position is : " + Player_Position);
            System.out.println("The number required by the player is : "+(Winning_Position-Player_Position));
        }

         while (Player_Position != Winning_Position);
                System.out.println("Player reaches the winning position");
    }}

