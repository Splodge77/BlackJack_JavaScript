package example.codeclan.com.blackjack;

/**
 * Created by user on 07/02/2018.
 */

public class Dealer extends Player {


    Deck deck;

    public Dealer(){
        this.deck = new Deck();
    }

    public void deal(Player player){
        player.addCard(deck.randomCard());
    }
}
