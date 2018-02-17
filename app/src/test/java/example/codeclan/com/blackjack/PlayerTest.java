package example.codeclan.com.blackjack;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;

/**
 * Created by user on 06/02/2018.
 */

public class PlayerTest {

    Player player;
    Card card;
    Card card1;
    Card card2;

    @Before
    public void before(){
        player = new Player();
    }

    @Test
    public void cardAdded(){
        card = new Card(CardName.JACK, Suit.DIAMONDS);
        player.addCard(card);
        assertNotNull(card);
    }

    @Test
    public void handHasValue(){
        card1 = new Card(CardName.KING, Suit.DIAMONDS);
        card2 = new Card(CardName.SEVEN, Suit.SPADES);
        player.addCard(card1);
        player.addCard(card2);
        player.setScore();
        assertEquals(17, player.getScore());
    }

    @Test
    public void aceBecomesOne(){
        card1 = new Card(CardName.ACE, Suit.SPADES);
        card2 = new Card(CardName.ACE, Suit.HEARTS);
        player.addCard(card1);
        player.addCard(card2);
        player.setScore();
        assertEquals(12, player.getScore());
    }

    @Test
    public void playerSticks() {
        playerSticks();
        assertEquals(true, player.stick);
    }

    @Test
    public void handHasScore(){
        Card card = new Card(CardName.ACE, Suit.SPADES);
        player.addCard(card);
        player.setScore();
        assertEquals(11, player.getScore());
    }
}
