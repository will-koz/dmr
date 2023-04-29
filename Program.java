import dmr.Printer;
import dmr.Quiz;

public class Program {

private static void load_data (Quiz q) {
	String[] cc_ans = { "AT&T Bell Labs", "IBM Labs", "University of California Berkeley",
		"The National Security Agency" };
	String[] chmod_ans;
	String[] grep_ans;
	String[] mkdir_ans;
	String[] uname_ans;
	String[] whoami_ans;
	q.add_question("cc",
		"lorem",
		"Where was Ritchie working when he developed the C programming language?",
		"C Compiler", cc_ans, 0);
	q.add_question("chmod", "lorem", "question", "Change Mode", chmod_ans, 0);
	q.add_question("grep", "lorem", "question", "Global Regular Expression Print", grep_ans, 0);
	q.add_question("mkdir", "lorem", "question", "Make Directory", mkdir_ans, 0);
	q.add_question("uname", "lorem", "question", "Unix Name", uname_ans, 0);
	q.add_question("whoami", "lorem", "question", "Who am I?", whoami_ans, 0);
}

public static void main (String[] args) {
	// TODO add README and license

	Quiz q = new Quiz ();
	load_data(q);

	String help = "Welcome to the Dennis Ritchie Quiz App Shell! Dennis Ritchie was a computer"
	            + " programmer who is known for developing the C language and Unix operating"
	            + " system. This quiz is in the form of a Unix shell. You can use `man` followed by"
	            + " a command to learn more about his life and the Unix operating system. Enter a"
	            + " command when you are ready to answer a question about him.\n\nHere are the"
	            + " commands:\n";

	Printer.print_text(help);
	q.dump_commands();

	int exit_requested = 0;

	while (exit_requested == 0) {
		exit_requested = q.parse_command(Printer.prompt(q));
	}
}

}
