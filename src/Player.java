import java.util.ArrayList;

public class Player {
    ArrayList<Card> hand = new ArrayList<>();
    Card currentCard;

    public void setHand(ArrayList cards){
        hand = cards;
    }

    public Card draw(){
        return hand.get(0);
    }

    public void addToDeck(Card c){
        hand.add(c);
    }

    public ArrayList<Card> getHand(){
        return hand;
    }

    public Card removeFromDeck(int index){
        if (index < hand.size()) {
            return hand.remove(index);
        } else {
            return null;
        }
    }

    public String toString(){
        return "Hand: " + hand.toString();
    }

    public int findHighestVal(){
        Card high = (Card) hand.get(0);
        int minVal = high.getVal();
        for (int i = 0; i < hand.size(); i++) {
            Card comp = (Card) hand.get(i);
            if (comp.getVal() > minVal){
                high = comp;
                minVal = comp.getVal();
            }
        }
        return minVal;
    }

    public Card findHighestCard(){
        Card high = (Card) hand.get(0);
        int minVal = high.getVal();
        for (int i = 0; i < hand.size(); i++) {
            Card comp = (Card) hand.get(i);
            if (comp.getVal() > minVal){
                high = comp;
                minVal = comp.getVal();
            }
        }
        return high;
    }

}
