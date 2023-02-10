import java.util.*;
import java.io.*;

public class FlashCards {
    //The questions and answers
    private Map<String, String> flashCards;

    //Creates a new set of flashcards
    public FlashCards(Scanner in){
        this.setFlashCards(in);
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
    public void setFlashCards(Scanner in){
        //TODO
        //create a HashMap to put key/value pairs into
            flashCards = new HashMap<String, String>();

        //until the end of the file
        while(in.hasNext()){

            //read in the next line of the file and store it in a string
            String question = in.nextLine();
            //if that string is exactly "++++""
            if(question.equals("++++")){
                //put the next line as the key, and the line after that as the value
                question = in.nextLine();
                flashCards.put(question, in.nextLine());
            }
        }
    }

    //Poses each question in flashCards, then posts whether the user matched the card.
    public void runQuiz(){
        //TODO
        //create a scanner for user input
        Scanner console = new Scanner(System.in);
        //for all the key value pairs in flashCards
        for(String key: flashCards.keySet()){
            //Ask the question.
            System.out.println("What is the answer to " + key + "?");
            //Get the users response.
            String response = "" + console.nextLine();
            // Print correct if correct, otherwise print incorrect.
            if(response.equals(flashCards.get(key))) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }

    //Prints all the key/value pairs in flashCards, one pair per line
    public void showDeck(){
        //TODO
        System.out.println("Here are the questions and answers.");
        for(String key: flashCards.keySet()){
            System.out.print(key + " ");
            System.out.println("" + flashCards.get(key));
        }
    }
}
