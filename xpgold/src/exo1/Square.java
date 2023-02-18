package exo1;

public class Square extends Shape {
    private String borderColor;
    private  double a;
    public  Square(double width, double height) {
        super(width, height);
    }
    public Square(double c, String borderColor) {
        this.borderColor = borderColor;
        this.a = c;
    }
    @Override
    public double getArea() {
        return  (this.a * this.a);
    }

    public void squareInfo() {
        System.out.println("============ Square Info =========================\n");
        System.out.println("Cote: "+ this.a + "\ncolor: "+ this.borderColor +"\nArea "+getArea());
    }
}
