package QuestionTwo;

public class Triangle extends Shape{

    public int base;
    public int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}
