import java.util.Scanner;


/*
 * We can only make guesses between 1 to 7
 * Should log out whether it is a hit or miss
 * Should Tell us the number of guesses we made
 * Should only take a number between 1 and 7
 * Shouldn't mark a hit twice on one cell
 * */

public class Game {

    int a = 1222;



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Game game = new Game();

        game.method2();



//        System.out.println("Hello enter a number");
//        int a = sc.nextInt();
//        System.out.println("input is "+a);

        int guess = (int) (Math.random() * 7) + 1;

        System.out.println(guess);


    }

    private void method2() {
    }
}