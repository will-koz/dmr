package dmr;

import java.util.ArrayList;
import dmr.Printer;
import dmr.Question;

public class Quiz {

private ArrayList<Question> questions;

public int num_answered_questions () {
	int tally = 0;
	for (Question q : questions) tally += (q.get_status() != 0) ? 1 : 0;
	return tally;
}

public int num_correct_questions () {
	int tally = 0;
	for (Question q : questions) tally += (q.get_status() == 1) ? 1 : 0;
	return tally;
}


public int num_questions () { return questions.size(); }

public void add_question (String com, String con, String q, String t, String[] a, int cor) {
	questions.add(new Question(com, con, q, t, a, cor));
}

public void ask_question (String s) {
	try {
		Question q = find_question(s);
		q.set_status(Printer.ask(q));
	} catch (NullPointerException e) {
		System.out.println("Unknown command: " + s);
	}
}

public void dump_commands () {
	for (int i = 0; i < questions.size(); i++)
		Printer.print_text(questions.get(i).get_command() + " - "
			+ questions.get(i).get_topic(), i + 1);
}

public Question find_question (String s) {
	for (int i = 0; i < questions.size(); i++) {
		Question q = questions.get(i);
		if (q.get_command().equals(s))
			return q;
	}

	return null;
}

public void man_question (String s) {
	try {
		Question q = find_question(s);
		Printer.man(q);
	} catch (NullPointerException e) {
		System.out.println("Unknown command: " + s);
	}
}

// Goes beyond parsing command, also initiates printing the man information or question
public int parse_command (String s) {
	s = s.trim().toLowerCase(); // Make sure to get rid of whitespace
	int space_location = s.indexOf(" ");
	String first_command = s;
	String second_command = "";
	if (space_location > 0) {
		first_command = s.substring(0, space_location);
		second_command = s.substring(space_location + 1);
	}

	if (first_command.equals("exit"))
		return 1; // Exit is requested.

	// TODO formatting / style
	if (first_command.equals("man")) {
		man_question(second_command);
	}
	else {
		ask_question(first_command);
	}

	return 0; // Exit is not requested:
}

public Quiz () {
	questions = new ArrayList<Question>();
}

}
