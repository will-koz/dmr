package dmr;

import java.util.Scanner;

public class Printer {

// Print out a basic Bash-like prompt and return the command given from it
public static String prompt () {
	Scanner s = new Scanner(System.in);
	return s.nextLine();
}

}
