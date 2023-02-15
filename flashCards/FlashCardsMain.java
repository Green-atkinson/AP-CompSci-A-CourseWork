import java.util.*;
import java.io.*;

//FlashCardsMain, 

public class FlashCardsMain {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner console = new Scanner(System.in);
        
        //user input file name, creates flashcard deck
        System.out.println("What file would you like? (don't include the .txt extension)");
        String deck = console.next() + ".txt";
        System.out.println();

        Scanner flashCardFile = new Scanner(new File(deck));
        FlashCards cards = new FlashCards(flashCardFile);

        //shows all question/answer pairs
        cards.showDeck();
        System.out.println();

        //waits for user to type 'ready' and hit enter before running the quiz
        System.out.println("Type \"ready\" to begin quiz.");
        while (true) {
            String line = console.next();
            if ("ready".equalsIgnoreCase(line)) {
                break;
            }
            System.out.println();
            System.out.println("Incorrect input!");
            System.out.println("Type \"ready\" to begin quiz.");
        }

        for(int i = 0; i < 20; i++){
            System.out.println();
        }

        //runs the quiz
        cards.runQuiz();

        console.close();
        flashCardFile.close();
    }

}