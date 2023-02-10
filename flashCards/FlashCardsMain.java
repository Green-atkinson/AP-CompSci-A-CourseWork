import java.util.*;
import java.io.*;

public class FlashCardsMain {
    public static void main(String[] args)
        throws FileNotFoundException {

        Scanner console = new Scanner(System.in);

        System.out.println("What file would you like? (don't include the .txt extension)");
        String deck = console.next() + ".txt";

        Scanner in = new Scanner(new File(deck));
        FlashCards cards = new FlashCards(in);

        //shows all question/answer pairs
        cards.showDeck();

        //waits for user to hit type ready and hit enter before running the quiz
        System.out.println("Type \"ready\" to begin quiz.");
        console.next();
        for(int i = 0; i < 20; i++){
            System.out.println();
        }

        //runs the quiz
        cards.runQuiz();

    }

}