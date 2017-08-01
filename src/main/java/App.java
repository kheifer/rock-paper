import game.RPSw;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void main(String[] args) {
        boolean GamePlay = true;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String player1="";
        String player2="automatedComputerResponse";

        try {
            while (GamePlay) {
                System.out.println("Let's play a game? one player, two player or exit");
                String answer = bufferedReader.readLine();
                String lowAnswer = answer.toLowerCase();

                if (lowAnswer.equals("one player")) {
                    System.out.println("Insert your first shake, Player 1!(rock, paper, scissors)");
                    player1 = bufferedReader.readLine();
                    System.out.println("computer thinking...");
                } else if (lowAnswer.equals("two player")){
                    System.out.println("Insert your first shake, Player 1!(rock, paper, scissors)");
                    player1 = bufferedReader.readLine();
                    for (int i = 0; i < 80; i++) System.out.println();
                    System.out.println("How about you, challenger?(rock, paper, scissors)");
                    player2 = bufferedReader.readLine();
                }else if (lowAnswer.equals("exit")) {
                System.out.println("Goodbye!");
                GamePlay = false;
             }
                RPSw newShake = new RPSw();
                String gameResult = newShake.roundEvaluator(player1, player2);

                System.out.println(gameResult);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
