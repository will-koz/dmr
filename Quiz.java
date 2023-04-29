package dmr;

import java.util.ArrayList;
import dmr.Question;

public class Quiz {

private ArrayList<Question> questions;

public int num_correct_questions () { return 0; } // TEMP
public int num_questions () { return questions.size(); }

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

	// Exit is not requested:
	return 0;
}

public Quiz () {
	questions = new ArrayList<Question>();
}

}
