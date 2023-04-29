package dmr;

import java.util.Scanner;
import dmr.Question;
import dmr.Quiz;

public class Printer {

// Print out man information (topic and background)
public static void man (Question q) {
	print_topic(q.get_topic());
	print_text(q.get_context());
}

public static void print_text (String s, int numbered) {
	int size = 76; // 76 columns before new line
	int idx = 0;
	int col = 0;
	while (idx < s.length()) {
		if (col == 0) System.out.print("\t");
		System.out.print(s.charAt(idx));
		col++;
		if (s.charAt(idx++) == '\n' || col == size) {
			System.out.println();
			col = 0;
		}
	}
	System.out.println();
}

public static void print_text (String s) { print_text(s, 0); }

public static void print_topic (String s) {
	System.out.print("\u001B[7m"); // Reverse colors
	System.out.print(s); // Print string
	System.out.println("\u001B[0m");// Reset colors
}

// Print out a basic Bash-like prompt and return the command given from it
public static String prompt (Quiz q) {
	System.out.print("\n\u256D\u2500\u2500\u2500\u2500 ");

	System.out.println(q.num_correct_questions() + " Correct / " + q.num_questions() + " Total");

	System.out.print("\u2570\u2500\u2500 $ ");

	Scanner s = new Scanner(System.in);
	return s.nextLine();
}

}
