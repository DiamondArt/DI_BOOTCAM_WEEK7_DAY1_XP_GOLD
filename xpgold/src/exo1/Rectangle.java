package exo1;

public class Rectangle extends Shape {
    private String shapeColor;

    public Rectangle(double width, double height) {
        super(width, height);
    }

    public Rectangle(double width, double height, String color) {
        super(width, height);
        this.shapeColor = color;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.getWidth() * this.getHeight();
    }
    public void rectangleInfo() {
        System.out.println("============ Rectangle Info =========================\n");
        System.out.println("Width: "+ this.getWidth() + "\nHeight: "+ this.getHeight() + "\ncolor: "+ this.shapeColor +"\nArea "+getArea());
    }
}
