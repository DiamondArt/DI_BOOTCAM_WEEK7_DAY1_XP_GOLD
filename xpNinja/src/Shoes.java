/**
 * Extends  Article class
 * @author Melissa Kouadio
 * */
public class Shoes extends Article {
    private double reducePercent;
    private int size;
    public Shoes() {
        this.reducePercent = 20;
    }
    public Shoes(String name,double price, String description, double soldePrice, int size) {
        super(name,price,description);
        this.reducePercent = soldePrice;
        this.size = size;
    }
    @Override
    public double getSolde() {
        return (this.reducePercent/100)*this.price;
    }
}
