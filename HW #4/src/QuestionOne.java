import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionOne {

    public static void main(String[] args) {
	    String[] prog_lang = new String[]{"Python", "Java", "C++"};
        // prog_lang[3] = "Javascript"; impossible, since we already declared the length of the array
        System.out.println(Arrays.toString(prog_lang));
        System.out.println(prog_lang.length);
    }
}
