import java.util.ArrayList;
import java.util.*;

public class Deck {
    ArrayList<Card> deck = new ArrayList<>();

    public Deck(){
        for (int suit = 1; suit <= 4; suit++) {
            for (int val = 2; val <= 14; val++) {
                deck.add(new Card(val, suit));
            }
        }
    }

    public void shuffleDeck(){
        Collections.shuffle(deck);
    }

    public Card get(int i) {
        return deck.get(i);
    }


}
