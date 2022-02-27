package TestingPurpose.Deck_Of_Card;

public class Deck_Main_Class {

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.printCards();
        System.out.println();
        //deck.shuffleTwo();
        deck.shuffleOne();
        deck.printCards();
    }
}
