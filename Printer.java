package dmr;

import java.util.Scanner;
import dmr.Quiz;

public class Printer {

// Print out a basic Bash-like prompt and return the command given from it
public static String prompt (Quiz q) {
	System.out.println("\u256D\u2500\u2500\u2500\u2500 ");

	System.out.println();

	System.out.print("\u2570\u2500\u2500 $ ");

	Scanner s = new Scanner(System.in);
	return s.nextLine();
}

}
