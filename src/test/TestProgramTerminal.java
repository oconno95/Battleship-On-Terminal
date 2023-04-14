package test;

import battleship.Battleship;
import battleship.HumanPlayer;

public class TestProgramTerminal {

    public static void main(String[] args) {
       Battleship game = new Battleship();
       char playAgain = 'n';
       do {
            game.startGame();
            System.out.println("Want to play again? (y,n): ");
            playAgain = HumanPlayer.in.next().charAt(0);
       } while(playAgain == 'y');

       HumanPlayer.in.close();
    }    
}
