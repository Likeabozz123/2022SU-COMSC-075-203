package QuestionTwo;

public class Circle extends Shape{

    public int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return 2 * radius * Math.PI;
    }

}
