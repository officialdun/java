import javax.net.ssl.SSLContext;
import java.util.ArrayList;

public class DotComBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<>();
    private int numOfGuesses = 0;

    private void setUpGame(){
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");

        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);

       /* System.out.println("Your goal is to sink three dot coms.\n" +
                            "Pets.com, eToys.com, Go2.com \n" +
                            "Try to sink them all in the fewest number of guesses");*/
        System.out.println("""
                Your goal is to sink three dot coms.
                Pets.com, eToys.com, Go2.com\\s
                I have some candy
                Try to sink them all in the fewest number of guesses""");

        for(DotCom dotComToSet: dotComList){
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }


    private void startPlaying(){
        while (!dotComList.isEmpty()){
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }


    private void checkUserGuess(String userGuess){
        numOfGuesses++;
        String result = "miss";

        for(DotCom dotComToTest: dotComList){
            result = dotComToTest.checkYourSelf(userGuess);
            if (result.equals("hit")) break;
            if (result.equals("kill")) {
                dotComList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }


    private void finishGame(){
        System.out.println("All dots are dead! Your stock is now worthless");
        if (numOfGuesses<=18){
            System.out.println(" It only took you"+numOfGuesses+" guesses\n"+
                                " You got out before your options sank");
        }else{
            System.out.println(" You took long enough"+numOfGuesses+" guesses\n"+
                    "Fish are dancing with your options");
        }
    }

    private static void main(String[] args){
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();

    }
}
