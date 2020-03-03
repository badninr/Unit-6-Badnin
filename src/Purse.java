import java.util.ArrayList;

// A Purse holds a collection of Coins
public class Purse {
    private ArrayList coins;

    public Purse() {
        coins = new ArrayList();
    }

    // adds aCoin to the purse
    public void add(Coin aCoin) {
        coins.add(aCoin);
    }

    // returns total value of all coins in purse
    public double getTotal() {
        double sum = 0;
        for (int i = 0; i < coins.size(); i++) {
            Coin c = (Coin) coins.get(i);
            sum += c.getValue();
        }
        return sum;
    }

    // returns the number of coins in the Purse that matches aCoin (both myName & myValue)
    public int count(Coin aCoin) {
        int matches = 0;
        for (int i = 0; i < coins.size(); i++) {
            Coin c = (Coin) coins.get(i);
            if (aCoin.getName().equals(c.getName()) && aCoin.getValue() == c.getValue()){
                matches++;
            }
        }
        return matches;
    }

    // returns the name of the Coin in the Purse that has the smallest value
    public String findSmallest(){
        Coin min = (Coin) coins.get(0);
        double minVal = min.getValue();
        for (int i = 0; i < coins.size(); i++) {
            Coin comp = (Coin) coins.get(i);
            if (comp.getValue() < minVal){
                min = comp;
                minVal = comp.getValue();
            }
        }
        return min.getName();
    }

}

