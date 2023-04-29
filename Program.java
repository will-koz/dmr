import dmr.Printer;
import dmr.Quiz;

public class Program {

public static void main (String[] args) {
	// TODO at beginning of game print out help information
	// TODO add README and license

	int exit_requested = 0;

	while (exit_requested == 0) {
		Quiz q = new Quiz ();
		exit_requested = q.parse_command(Printer.prompt(q));
	}
}

}
