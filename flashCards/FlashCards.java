import java.util.*;
import java.io.*;

public class FlashCards {
    //The questions and answers
    private Map<String, String> flashCards;

    //Creates a new set of flashcards
    public FlashCards(Scanner flashCardFile){
        this.setFlashCards(flashCardFile);
    }

    /**
     * pre: Takes a text file of the following format:
     *
     * ++++
     * Mercury
     * 1
     * ++++
     * Venus
     * 2
     *
     *
     * Post: flashCards is a map containing as key/value Mercury/1, Venus/2, ...
     **/

    public void setFlashCards(Scanner flashCardFile){

        //create a HashMap to put key/value pairs into
        flashCards = new HashMap<String, String>();

        //until the end of the file, store in string
        while(flashCardFile.hasNext()){
            String question = flashCardFile.nextLine();
            if(question.equals("++++")){
                //save next line as the key, and the following as the value
                question = flashCardFile.nextLine();
                flashCards.put(question, flashCardFile.nextLine());
            }
        }
    }

    //Poses question in flashCards, then posts if user matched the answer.
    public void runQuiz(){
        Scanner console = new Scanner(System.in);

        //all key value pairs in flashCards -> Ask question -> user response -> print true/false
        for(String key: flashCards.keySet()){
            System.out.println("What is the answer to " + key + "?");
            String response = "" + console.nextLine();
            if(response.equals(flashCards.get(key))) {
                System.out.println("True!");
            } else {
                System.out.println("False! The correct answer was \"" + flashCards.get(key) + "\"");
            }
            System.out.println();
        }
        console.close();
    }

    //Prints all key/value pairs in flashCards, one pair per line
    public void showDeck(){
        System.out.println("Here are the questions and answers.");
        for(String key: flashCards.keySet()){
            System.out.print(key + " = ");
            System.out.println("" + flashCards.get(key));
        }
    }
}
