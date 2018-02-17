package example.codeclan.com.blackjack;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;


/**
 * Created by user on 25/01/2018.
 */

public class GameTest {

    Game game;
    Player player;


    @Before
    public void before(){
        game = new Game(new Dealer());
        player = new Player();
        game.addPlayer(player);
    }

    @Test
    public void playerHasCards(){
        game.start();
        assertEquals(2, player.handSize());
    }

}
