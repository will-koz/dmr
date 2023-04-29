package dmr;

import java.util.ArrayList;
import dmr.Question;

public class Quiz {

private ArrayList<Question> questions;

public int num_correct_questions () { return 0; } // TEMP
public int num_questions () { return questions.size(); }

public void ask_question () {
	; // TODO
}

public Question find_question (String s) {
	for (int i = 0; i < questions.size(); i++) {
		Question q = questions.get(i);
		if (q.get_command().equals(s))
			return q;
	}

	return null;
}

public void man_question () {
	; // TODO
}

// Goes beyond parsing command, also initiates printing the man information or question
public int parse_command (String s) {
	s = s.trim().toLowerCase(); // Make sure to get rid of whitespace
	int space_location = s.indexOf(" ");
	String first_command = s;
	String second_command;
	if (space_location > 0) {
		first_command = s.substring(0, space_location);
		second_command = s.substring(space_location + 1);
	}

	if (first_command.equals("exit"))
		return 1; // Exit is requested.

	if (first_command.equals("man")) {
		; // TODO man
	}
	else {
		; // TODO ask question
	}

	return 0; // Exit is not requested:
}

public Quiz () {
	questions = new ArrayList<Question>();
}

}
