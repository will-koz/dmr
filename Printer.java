package dmr;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import dmr.Question;
import dmr.Quiz;

public class Printer {

// Ask a question and return 1 if correct, -1 otherwise
public static int ask (Question q) {
	// First, print out topic and question
	print_topic(q.get_topic());
	print_text(q.get_question());
	print_text("");

	// Then, shuffle list and find new correct answer
	String[] answers = q.get_answers();
	String correct = answers[q.get_correct_answer()];
	List<String> string_list = Arrays.asList(answers.clone());
	Collections.shuffle(string_list);
	int correct_num = 0;
	for (int i = 0; i < string_list.size(); i++)
		if (string_list.get(i).equals(correct))
			correct_num = i + 1;

	// Print out answers and prompt user for input
	// could be moved above for efficiency, but this really isn't a high-performance program
	for (int i = 0; i < string_list.size(); i++)
		print_text(string_list.get(i), i + 1);
	System.out.print("\nEnter number: ");

	// parse input and determine if it is the same as the correct answer
	Scanner s = new Scanner(System.in);
	int i = 0;
	try { i = s.nextInt(); }
	catch (Exception e) {}

	if (i == correct_num) {
		System.out.println("That is correct!");
		return 1;
	}

	System.out.println("That is not correct :(");
	return -1;
}

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
		if (col == 0) {
			if (numbered != 0) System.out.print(numbered + ".");
			System.out.print("\t");
		}
		if (s.charAt(idx) != '\n') System.out.print(s.charAt(idx));
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

	System.out.print(q.num_correct_questions() + " Correct / ");
 	System.out.print(q.num_questions() + " Total (");
	System.out.println(q.num_answered_questions() + " Answered)");

	System.out.print("\u2570\u2500\u2500 $ ");

	Scanner s = new Scanner(System.in);
	return s.nextLine();
}

}
