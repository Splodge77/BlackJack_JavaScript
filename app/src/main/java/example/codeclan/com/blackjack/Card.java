package example.codeclan.com.blackjack;


/**
 * Created by user on 25/01/2018.
 */

public class Card {

    private CardName cardName;
    private Suit suit;

    public Card(CardName cardName, Suit suit){
        this.cardName = cardName;
        this.suit = suit;
    }

    public String getSuit(){
        return this.suit.toString();
    }

    public String getCardName(){
        return this.cardName.toString();
    }

    public int getCardValue(){
        return this.cardName.getValue();
    }

    public void setCardValue(int newValue) {
        cardName.setValue(newValue);
    }

}
