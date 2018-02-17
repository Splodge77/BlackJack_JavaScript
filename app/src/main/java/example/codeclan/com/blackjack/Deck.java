package example.codeclan.com.blackjack;

import android.media.Image;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by user on 25/01/2018.
 */

public class Deck {
   public ArrayList<Card> list;

   public void populate(){
       for (CardName cardName : CardName.values()){
           for(Suit cardSuit :Suit.values()){
               Card card = new Card(cardName, cardSuit);
               list.add(card);
           }
       }
   }

   public Deck() {
       list = new ArrayList<Card>();
       populate();
   }

    public ArrayList<Card> getList() {
        return new ArrayList<Card>(list);
    }

    public Card randomCard() {
       Collections.shuffle(this.list);
       Card card = list.get(0);
       return card;
    }
}
