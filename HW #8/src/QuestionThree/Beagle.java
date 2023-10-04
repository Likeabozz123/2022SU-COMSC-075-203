package QuestionThree;

public class Beagle extends Dog{

    private boolean tricolor;

    public Beagle() {
        super(10, "Chad", "Chad's Owner", "Beagle");
    }

    public Beagle(int age, String name, String owner, boolean tricolor) {
        super(age, name, owner, "Beagle");
        this.tricolor = tricolor;
    }

    public boolean isTricolor() {
        return tricolor;
    }

    public void setTricolor(boolean tricolor) {
        this.tricolor = tricolor;
    }
}
