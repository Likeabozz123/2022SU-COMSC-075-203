package QuestionTwo;

public class Rectangle {

    private double length;
    private double width;
    private static int numRect;

    public Rectangle() {

    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public static int getNumRect() {
        return numRect;
    }

    public double getArea() {
        return width * length;
    }

    public boolean isSquare() {
        return width == length;
    }
}
