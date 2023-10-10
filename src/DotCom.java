import java.util.ArrayList;
import java.util.List;

public class DotCom {

    int[] locationsCells;
    int numOfHits = 0;
    DotComTester tester = new DotComTester();
    Boolean isAlive = true;
    int[] hits = new int[3];

    List<Integer> newSet = new ArrayList<>();

   /* int startingPoint = (int)(Math.random()*5);*/

    String checkYourSelf(String userGuesses) {
        int Guess = Integer.parseInt(userGuesses);
        String result = "miss";


        int ch = 0;

        for (int cell : locationsCells) {
            if (Guess == cell) {
                result = "hit";

               // locationsCells[ch] = -1;



                


                numOfHits++;
                break;
            }


            ch++;

        }

        if (numOfHits == locationsCells.length) {
            result = "kill";

            for (int g: hits){
                System.out.print(g+" ");
            }
            System.out.println();

            System.out.println("You took "+tester.numOfGuesses+" guesses");
        }
        System.out.println(result);


        return result;
    }

    public void setLocationCells(int[] locs) {
        locationsCells = locs;

    }
}
