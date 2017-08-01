package game;
import java.util.Random;

public class RPSw {
    public String result;

    public String roundEvaluator(String one, String two ){


        if(two.equals("automatedComputerResponse")){
            String [] options ={"rock", "paper", "scissors"};
            Random random = new Random();
            int randomNum = random.nextInt(3);
            two = options[randomNum];
            result = "Computer picked "+ two +" so the result is ";
        }
        if (one.equals(two)){
            result += "Tie!";
        }else if (((one.equals("rock"))&&(two.equals("paper"))) || ((one.equals("paper"))&&(two.equals("rock")))){
                result += "Paper Wins!";
            }else if(((one.equals("paper")) && (two.equals("scissors"))) ||((one.equals("scissors")) && (two.equals("paper")))){
                    result += "Scissors Wins!";
                }else if(((one.equals("rock")) && (two.equals("scissors")))||((one.equals("scissors")) && (two.equals("rock")))) {
                result += "Rock Wins!";
            }
        return result;
    }
}
