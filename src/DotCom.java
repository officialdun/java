public class DotCom {

    int[] locationsCells;
    int numOfHits = 0;
    DotComTester tester = new DotComTester();
    Boolean isAlive = true;

   /* int startingPoint = (int)(Math.random()*5);*/

    String checkYourSelf(String userGuesses) {
        int Guess = Integer.parseInt(userGuesses);
        String result = "miss";

        for (int cell : locationsCells) {
            if (Guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        }

        if (numOfHits == locationsCells.length) {
            result = "kill";
            System.out.println("You took "+tester.numOfGuesses+" guesses");
        }
        System.out.println(result);


        return result;
    }

    public void setLocationCells(int[] locs) {
        locationsCells = locs;

    }
}
