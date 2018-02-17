package example.codeclan.com.blackjack;

import java.util.ArrayList;

/**
 * Created by user on 06/02/2018.
 */

public class Player {

    private ArrayList<Card> hand;
    private int score;
    private int initialScore;
    public boolean stick;

    public Player(){
        this.hand = new ArrayList<>();
        this.initialScore = 0;
        this.stick = false;
    }

    public void addCard(Card card){
        if(stick == !true && playerIsBust() == !true)
        hand.add(card);
    }

    public int handSize(){
        return hand.size();
    }


    public int getScore() {
        return score;
    }

    public void playerSticks(){
        stick = true;
    }

    public boolean playerIsBust(){
        if (getScore() > 21){
            return true;
        }
        else return false;
    }

    public int setScore(){
        for(Card card : hand){
            int value = card.getCardValue();
            initialScore += value;
            if(value == 11 && initialScore > 21){
                score += 1;
            }
            else score += value;
        }
        return score;
    }

    public String getCardNames(){
        for (Card card : hand) {
            return card.getCardName() + " of " + card.getSuit();
        }
        return null;
    }


}
