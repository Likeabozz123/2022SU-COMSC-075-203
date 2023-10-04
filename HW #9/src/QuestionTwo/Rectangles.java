package QuestionTwo;

public class Rectangles extends Shape{

    public int length;
    public int width;

    public Rectangles(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}
