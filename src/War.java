import java.util.ArrayList;

public class War {

    public static void main(String[] args) {
        System.out.println("Welcome to the game of War!\n");
        Player p1 = new Player();
        Player p2 = new Player();
        Deck deck = new Deck();
        deck.shuffleDeck();
        int roundCt = 0;

        ArrayList<Card> p1Hand = new ArrayList<>();
        ArrayList<Card> p2Hand = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            p1Hand.add(deck.get(i));
        }
        for (int i = 26; i < 52 ; i++) {
            p2Hand.add(deck.get(i));
        }
        p1.setHand(p1Hand);
        p2.setHand(p2Hand);
        System.out.println("Hands have been dealt... let's play!");
        System.out.println("\n --------------------------------------------------------------\n");

        while (p1.getHand().size() > 0 && p2.getHand().size() > 0){
            int p1Val = p1.draw().getVal();
            int p2Val = p2.draw().getVal();
            Card p1Card = p1.getHand().get(0);
            Card p2Card = p1.getHand().get(0);


            if (p1Val == p2Val){
                System.out.println("Both players drew the same card!");

                int p1Next4Sum = 0;
                if (p1.getHand().size() > 4) {
                    for (int i = 1; i <= 4; i++) {
                        p1Next4Sum += p1.getHand().get(i).getVal();
                    }
                } else {
                    for (int i = 1; i < p1.getHand().size(); i++) {
                        p1Next4Sum += p1.getHand().get(i).getVal();
                    }
                }

                int p2Next4Sum = 0;
                if (p2.getHand().size() > 4) {
                    for (int i = 1; i <= 4; i++) {
                        p2Next4Sum += p2.getHand().get(i).getVal();
                    }
                } else {
                    for (int i = 1; i < p2.getHand().size(); i++) {
                        p2Next4Sum += p2.getHand().get(i).getVal();
                    }
                }



                if (p1Next4Sum > p2Next4Sum) {
                    System.out.println("Player 1's next 4 cards had a higher sum, they take all!");
                    for (int i = 0; i < 5; i++) {
                        if (i < p2.getHand().size()) {
                            p1.addToDeck(p2.getHand().get(i));
                        }
                            p2.removeFromDeck(i);
                    }
                }
                else if (p1Next4Sum < p2Next4Sum) {
                    System.out.println("Player 2's next 4 cards had a higher sum, they take all!");
                    for (int i = 0; i < 5; i++) {
                        if (i < p1.getHand().size()) {
                            p2.addToDeck(p1.getHand().get(i));
                        }
                        p1.removeFromDeck(i);
                    }
                } else if (p1Next4Sum == p2Next4Sum){
                    if (p1.findHighestVal() > p2.findHighestVal()){
                        System.out.println("Both players had the same sum for their next 4 cards. But, Player 1 had the highest value! They get all cards!");
                        for (int i = 0; i < 5; i++) {
                            if (i < p2.getHand().size()) {
                                p1.addToDeck(p2.getHand().get(i));
                            }
                            p2.removeFromDeck(i);
                        }
                    } else if (p1.findHighestVal() < p2.findHighestVal()){
                        System.out.println("Both players had the same sum for their next 4 cards. But, Player 2 had the highest value! They get all cards!");
                        for (int i = 0; i < 5; i++) {
                            if (i < p1.getHand().size()) {
                                p2.addToDeck(p1.getHand().get(i));
                            }
                            p1.removeFromDeck(i);
                        }
                    } else if (p1.findHighestVal() == p2.findHighestVal()){
                        if (p1.findHighestCard().getSuit() > p2.findHighestCard().getSuit()){
                            System.out.println("Both players had the same sum and highest value for their next 4 cards. But, Player 1 had the highest suit! They get all cards!");
                            for (int i = 0; i < 5; i++) {
                                if (i < p2.getHand().size()) {
                                    p1.addToDeck(p2.getHand().get(i));
                                }
                                p2.removeFromDeck(i);
                            }
                        } else if (p1.findHighestCard().getSuit() < p2.findHighestCard().getSuit()){
                            System.out.println("Both players had the same sum and highest value for their next 4 cards. But, Player 2 had the highest suit! They get all cards!");
                            for (int i = 0; i < 5; i++) {
                                if (i < p1.getHand().size()) {
                                    p2.addToDeck(p1.getHand().get(i));
                                }
                                p1.removeFromDeck(i);
                            }
                        }
                    }
                }
                System.out.println("\n --------------------------------------------------------------\n");
                roundCt++;
            }
            else if (p1Val < p2Val){
                System.out.println("Player 1 has the highest value! They get both cards");
                p1.addToDeck(p2Card);
                p2.removeFromDeck(0);
                System.out.println("\n --------------------------------------------------------------\n");
                roundCt++;
            }
            else if (p2Val < p1Val){
                System.out.println("Player 2 has the highest value! They get both cards");
                p2.addToDeck(p1Card);
                p1.removeFromDeck(0);
                System.out.println("\n --------------------------------------------------------------\n");
                roundCt++;
            }
        }

        if (p1.getHand().size() == 0){
            System.out.println("Player 2 wins!");
        } else if (p2.getHand().size() == 0){
            System.out.println("Player 1 wins!");
        }
        System.out.println("Player 1's " + p1.toString());
        System.out.println("Player 2's " + p2.toString());
        System.out.println("There were " + roundCt + " rounds played.");
    }



}
