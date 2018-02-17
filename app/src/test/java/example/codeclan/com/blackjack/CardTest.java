package example.codeclan.com.blackjack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 25/01/2018.
 */

public class CardTest {

    Card card;

    @Before
    public void before(){ card = new Card(CardName.ACE, Suit.HEARTS);}


    @Test
    public void cardHasValue(){
        assertEquals(11, card.getCardValue());

    }

    @Test
    public void canSetCardValue(){
        assertEquals(11, card.getCardValue());
        card.setCardValue(1);
        assertEquals(1, card.getCardValue());
    }
}
