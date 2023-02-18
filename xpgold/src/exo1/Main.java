package exo1;

import exo1.Rectangle;
import exo1.Square;

public class Main {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle(50.0,20.0, "Red");
        rect.rectangleInfo();

        Square square = new Square(25, "Blue");
        square.squareInfo();
    }
}