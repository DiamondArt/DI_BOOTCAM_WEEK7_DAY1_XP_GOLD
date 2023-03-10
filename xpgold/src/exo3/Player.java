package exo3;

import exo2.Card;

import java.util.ArrayList;
import java.util.Random;

public class Player {

    private String name;

    private ArrayList<Card> cards;

    private int money;

    private int bet;

    private static final int DEFAULT_MONEY = 10;
    public Player(){
        name = randName();
        cards = new ArrayList<>();
        money = DEFAULT_MONEY;
        bet = 0;
    }
    public Player(String name){
        if (name.length() == 0) this.name = randName();
        else this.name = name;
        cards = new ArrayList<>();
        money = DEFAULT_MONEY;
        bet = 0;
    }

    public Player(String name, int bet){
        if (name.length() == 0) this.name = randName();
        else this.name = name;
        cards = new ArrayList<>();
        money = DEFAULT_MONEY;
        this.bet = bet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() == 0) this.name = randName();
        else this.name = name;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public int getMoney() {
        return money;
    }

    public int getBet() {
        return bet;
    }

    public void setBet(int bet) {
        this.bet = bet;
    }

    private String randName(){
        Random rand = new Random();
        String letters = "abcdefghiljkmnopqrstuvwxyz";
        String name = "";
        int maxLung = 10, minLung = 3;
        int l = rand.nextInt(maxLung - minLung) + minLung;
        for (int i=0; i<l; i++){
            name += letters.charAt(rand.nextInt(letters.length()));
        }
        return name;
    }


    public void resetMoney(){
        this.money = DEFAULT_MONEY;
    }

    public void updateMoney(int money){
        this.money += money;
    }

    public void addCard(Card c){
        cards.add(c);
    }

    public  void add(Card c) { cards.add(c); }

    public int cardValue(){
        ArrayList<Card> lista = ord(cards);
        int v = 0;
        for (Card c: lista){
            if (!c.isAce()){
                if (c.isFigure()) v += 10;
                else v += c.getValue() + 1;
            }
            else {
                if (v + 11 > 21) v += 1;
                else v += 11;
            }
        }
        return v;
    }

    private ArrayList<Card> ord(ArrayList<Card> mano){
        ArrayList<Card> lista = new ArrayList<>(mano);
        lista.sort(Comparable:: compareTo);
        return lista;
    }

    public int countCards() { return cards.size(); }

    public void clearMano(){
        cards.clear();
    }

    public String toString(){
        return "\n name: \t\t" + name + "\n Mano: \t\t" + cards.toString() + " = " + cardValue() + "\n money: \t???" + money;
    }
}
