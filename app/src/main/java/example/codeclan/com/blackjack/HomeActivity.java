package example.codeclan.com.blackjack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void onPlayButtonClicked(View playButton){
        Game game = new Game(new Dealer());
        Player player = new Player();
        game.play();

        String dealerHand = game.dealer.getCardNames();
        TextView dealersHand = findViewById(R.id.dealersHand);
        dealersHand.setText(dealerHand);

        String playerHand = player.getCardNames();
        TextView playersHand = findViewById(R.id.playersHand);
        playersHand.setText(playerHand);

        String result = game.checkWinner();
        TextView resultView = findViewById(R.id.result);
        resultView.setText(result.toString());
    }
}
