package dmr;

import java.util.Scanner;
import dmr.Quiz;

public class Printer {

// Print out a basic Bash-like prompt and return the command given from it
public static String prompt (Quiz q) {
	System.out.print("\u256D\u2500\u2500\u2500\u2500 ");

	System.out.println(q.num_correct_questions() + " Correct / " + q.num_questions() + " Total");

	System.out.print("\u2570\u2500\u2500 $ ");

	Scanner s = new Scanner(System.in);
	return s.nextLine();
}

}
