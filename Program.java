import dmr.Printer;
import dmr.Quiz;

public class Program {

private static void load_data (Quiz q) {
	// TEMP
	String[] cc_ans = { "Dont know", "Baby don't hurt me.", "Mutiny on the Bounty", "Start me up" };
	q.add_question("cc", "C Compiler", "What is love?", "lorem", cc_ans, 1);
}

public static void main (String[] args) {
	// TODO at beginning of game print out help information
	// TODO add README and license

	Quiz q = new Quiz ();
	load_data(q);

	int exit_requested = 0;

	while (exit_requested == 0) {
		exit_requested = q.parse_command(Printer.prompt(q));
	}
}

}
