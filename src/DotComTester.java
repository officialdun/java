import java.util.Scanner;

public class DotComTester {

    public static int numOfGuesses = 0;
    public static void main(String[]args){

        DotCom dot = new DotCom();
        GameHelper helper = new GameHelper();

        int random = (int)(Math.random()*6);
        int[] locations = {random, random+1, random+2};

        /*for(int i=0 ; i<3 ; i++){
            locations[i] = random;
            x++;
        }*/

        dot.setLocationCells(locations);
        for (int a: locations){
            System.out.println(a);
        }

        while (dot.isAlive) {

            String userGuess = helper.getUserInput("new number please");
            String result = dot.checkYourSelf(userGuess);

            numOfGuesses++;
            if (result.equals("kill")){
                dot.isAlive = false;
            }
            else if(numOfGuesses>6){
                System.out.println("Number of guesses "+numOfGuesses);
                System.out.println("Game Over!!");
                dot.isAlive = false;
            }else{

            }
        }
    }

}
