/**
 * Extends  Article class
 * @author Melissa Kouadio
 * */
public class Dress extends Article{
    private double reducePercent;
    public Dress() {
        this.reducePercent = 10;
    }
    public Dress(String name,double price, String description, double soldePrice) {
        super(name,price,description);
        this.reducePercent = soldePrice;
    }
    @Override
    public double getSolde() {
        return (this.reducePercent/100)*this.price;
    }
}
