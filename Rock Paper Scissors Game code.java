import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        // 0 for ROCK
        // 1 for PAPER
        // 2 for SCISSORS
        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissors :");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);
        if(userInput == computerInput){
            System.out.println("DRAW");
        }
        else if(userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1){
            System.out.println("YOU WON...!");
        }
        else{
            System.out.println("COMPUTER WON");
        }
        if(computerInput == 0){
            System.out.println("Computer choice : Rock");
        }
            else if(computerInput == 1){
            System.out.println("Computer choice : Paper");
        }
        else if(computerInput == 2){
            System.out.println("Computer choice : Scissors");
        }
    }
}
