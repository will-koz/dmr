package dmr;

import java.util.ArrayList;
import dmr.Question;

public class Quiz {

private ArrayList<Question> questions;

public int num_correct_questions () { return 0; } // TEMP
public int num_questions () { return questions.size(); }

public int parse_command (String s) { return 1; } // TEMP

public Quiz () {
	questions = new ArrayList<Question>();
}

}
