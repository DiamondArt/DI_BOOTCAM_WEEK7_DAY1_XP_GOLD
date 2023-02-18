/**
 * Abstract class Article
 * @author Melissa Kouadio
 * */
abstract class Article {
    protected String name;
    protected double price;
    protected String description;
    public Article() {}

    public Article(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }
    public abstract double getSolde();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * abstract method
     * */
    public void displayArticle() {
        System.out.println("Product name: "+this.name +"\nProduct Description: "+this.description+ "\nProduct Price: "+this.price +"\t\tSolde price "+ getSolde());
        System.out.println("\n==================================================================================\n");
    }
}
