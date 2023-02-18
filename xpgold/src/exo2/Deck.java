package exo2;
import java.util.ArrayList;
import java.util.Random;


public class Deck {

    private final ArrayList<Card> deck;

    public static final int DEFAULT_CARDS = 52;

    public static final int DEFAULT_NUM_SHUFFLE = 7;

    /**
     * Constructor
     */
    Deck(){
        deck = initDeck(DEFAULT_CARDS);
    }

    /**
     * @param numCards
     */
    public Deck(int numCards){
        deck = initDeck(numCards);
    }

    /**
     * Methods
     * @param numCards
     * @return List
     */
    private ArrayList<Card> initDeck(int numCards){
        ArrayList<Card> vet = new ArrayList<>(numCards);
        int k = 0;
        while (k < numCards) {
            for (int i = 0; i < Card.S.length(); i++) {
                for (int j = 0; j < Card.V.length(); j++) {
                    vet.add(new Card(j, i));
                    k++;
                }
            }
        }
        return vet;
    }


    /**
     * @return int
     */
    public int size() { return deck.size(); }

    public void shuffle(){
        shuffle(DEFAULT_NUM_SHUFFLE);
    }

    /**
     * @param times
     */
    public void shuffle(int times){
        Random rand = new Random();
        int x, y;
        Card tmp;
        for (int t=0; t<times; t++) {
            for (int i = 0; i < deck.size(); i++) {
                x = rand.nextInt(deck.size());
                y = rand.nextInt(deck.size());
                tmp = deck.get(x);
                deck.set(x, deck.get(y));
                deck.set(y, tmp);
            }
        }
    }

    /**
     * @return Card
     */
    public Card pop(){
        Card c = deck.get(0);
        deck.remove(0);
        return c;
    }

    /**
     * @return Card
     */
    public Card pull(){
        return get(0);
    }

    /**
     * @param index
     * @return card
     */
    public Card get(int index){
        return deck.get(index);
    }

    /**
     * @return Card
     */
    public Card pick(){
        Random rand = new Random();
        return deck.get(rand.nextInt(deck.size()));
    }


    /**
     * @return String
     */
    public String toString(){
        String s = "\n";
        int i=1;
        for (Card c: deck) {
            s += c.toString() + " ";
            if (i%Card.V.length() == 0) s += "\n";
            i++;
        }
        return s;
    }
}
