package TestingPurpose.Deck_Of_Card;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class Card {

    Suit suit;
    int faceValue;

    Card(Suit suit, int faceValue){
        this.suit = suit;
        this.faceValue = faceValue;
    }

    public String toString(){
        return suit + " " + faceValue;
    }

}
