package QuestionOne;

public class Tile {

    char letter;
    int value;

    public Tile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }

    public void printTile() {
        System.out.println(letter + ": " + value);
    }
}
