import java.util.ArrayList;
import java.util.List;

public class DotCom {

    int[] locationsCells;
    int numOfHits = 0;
    DotComTester tester = new DotComTester();
    Boolean isAlive = true;
    List<String> newSet = new ArrayList<>();

    String checkYourSelf(String userGuesses) {
        int Guess = Integer.parseInt(userGuesses);
        String result = "miss";

        for (String cell : newSet) {
            if (String.valueOf(Guess).equals(cell)) {
                result = "hit";
                newSet.remove(String.valueOf(Guess));

                numOfHits++;
                break;
            }
        }

        if (newSet.isEmpty()) {
            result = "kill";

            System.out.println();
            System.out.println("You took "+tester.numOfGuesses+" guesses");
        }
        System.out.println(result);

        return result;
    }
    public void setLocationCells(int[] locs) {
        locationsCells = locs;
        for(int arr: locationsCells) newSet.add(String.valueOf(arr));
    }
}
