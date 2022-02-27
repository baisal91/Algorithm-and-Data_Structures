package TestingPurpose.Deck_Of_Card;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Deck {

    List<Card> deck_of_card;
    List<Card> shuufled_deck_of_card;

    public Deck(){
        deck_of_card = new ArrayList<>();
        shuufled_deck_of_card = new ArrayList<>();

        for(Suit s: Suit.values()){
            for(int i=1; i<=13; i++){
                deck_of_card.add(new Card(s, i));
            }
        }
    }

    public void printCards(){

        for(Card i: deck_of_card){
            System.out.print(i + "  ");
        }
        for(Card i: shuufled_deck_of_card){
            System.out.print(i + "  ");
        }
    }

    public void shuffleOne(){
        Collections.shuffle(deck_of_card);
    }

    public void shuffleTwo(){

        while (deck_of_card.size()>0){
            int random = (int) (Math.random() * deck_of_card.size());
            shuufled_deck_of_card.add(deck_of_card.remove(random));
        }
    }

}
