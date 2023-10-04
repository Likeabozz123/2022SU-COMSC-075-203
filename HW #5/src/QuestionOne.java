import java.awt.*;

public class QuestionOne {

    public static int riddle(int x, Point p) {
        x = x + 7;
        return x + p.x + p.y;
    }
    public static void main(String[] args) {
        int x = 5;
        Point blank = new Point(1, 2); // blank is mutable because if you do blank.x = 10; there aren't any errors, and if you look at point's class code, x and y aren't final

        System.out.println(riddle(x, blank)); // 15
        System.out.println(x); // 5
        System.out.println(blank.x); // 1
        System.out.println(blank.y); // 2
    }
}
