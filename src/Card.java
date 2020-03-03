public class Card {

    private int val;
    private String valString;
    private int suit;
    private String suitString;

    public Card(int valInp, int suitInp){
        val = valInp;
        suit = suitInp;
        valToString();
        suitToSymbol();
    }

    private void valToString(){
        if (val == 11){
            valString = "J";
        } else if (val == 12){
            valString = "Q";
        } else if (val == 13){
            valString = "K";
        } else if (val == 14){
            valString = "A";
        } else {
            valString = "" + val;
        }
    }

    private void suitToSymbol(){
        if (suit == 1){
            suitString = "♤";
        } else if (suit == 2){
            suitString = "♡";
        } else if (suit == 3){
            suitString = "♢";
        } else if (suit == 4){
            suitString = "♧";
        }
    }

    public String toString(){
        valToString();
        suitToSymbol();
        return "" + valString + suitString;
    }

    public int getVal(){
        return val;
    }

    public int getSuit(){return suit;}
}
