import dmr.Printer;
import dmr.Quiz;

public class Program {

private static void load_data (Quiz q) {
	String[] cc_ans = { "AT&T Bell Labs", "IBM Labs", "University of California Berkeley",
		"The National Security Agency" };
	String[] chmod_ans = { "The Massachusetts Institute of Technology",
		"University of California Berkeley", "Princeton University", "Stanford University" };
	String[] grep_ans = { "Ken Thompson", "Brian Kernighan", "Rivest, Shaw and Adleman",
		"Alan Turing and Alonzo Church" };
	String[] mkdir_ans = { "File", "Folder", "System Call", "I/O (input/output)" };
	String[] uname_ans = { "PDP-7", "Atari 2600", "PDP-11", "Intel 8088" };
	String[] whoami_ans = { "Bachelor's degree", "Master of Science", "PhD", "Juris Doctor (JD)" };
	q.add_question("cc",
		"At Bell Labs, Ritchie he wrote Unix in B to supplement PDP-7 assembly. Since B was an"
		+ " interpreted language rather than a compiled language, it was not as useful as initially"
		+ " assumed for writing an operating system. After outgrowing B, he made the compiled"
		+ " language C which was used for further development of the Unix operating system. C is"
		+ " noted for its versatility, fluidity (compared with assembly language), and"
		+ " portability.",
		"Where was Ritchie working when he developed the C programming language?",
		"C Compiler", cc_ans, 0);
	q.add_question("chmod", "In 1967 he joined Bell Labs, where he first worked on the Multics"
		+ " operating system. Multics was a time-sharing system funded by the Advanced Research"
		+ " Projects Agency and jointly developed by researchers at the Massachusetts Institute of"
		+ " Technology, Bell Labs, and General Electric. However, the AT&T Corporation withdrew"
		+ " from the project and removed its GE computers in 1969. Regardless, Unix was"
		+ " successfully developed and is the ancestor of most operating systems used today.",
		"Which institution was most closely associated with the development of Unix? (This might be"
		+ " a tiny bit of a trick question.)", "Change Mode", chmod_ans, 0);
	q.add_question("grep", "Some of the people Ritchie famously worked with were Ken Thompson and"
		+ " Brian Kernighan. He worked with Thompson on the Unix operating system and the core"
		+ " utilities such as diff and grep. Ritchie and Kernighan wrote the book The C Programming"
		+ " Language, also known as K&R C.",
		"Who wrote grep with Ritchie?", "Global Regular Expression Print", grep_ans, 0);
	q.add_question("mkdir", "\"Everything is a File.\" Computers are only useful because they"
		+ " interact with the real world. Usually this is with a screen, keyboard or network"
		+ " connection. Collectively, all of the connections are called I/O, which stands for"
		+ " input/output. The Unix philosophy makes all of these accessible to users and to"
		+ " programmers as files. That way, all data can be accessed using the same methods (which"
		+ " are the read and write system calls).",
		"In the Unix philosophy, everything is supposed to be a ...?",
		"Make Directory", mkdir_ans, 0);
	q.add_question("uname", "The appeal of the Unix operating system comes from the era of"
		+ " mainframe computers. Ken Thompson and Ritchie wrote Unix on PDP-7 mainframes. While"
		+ " mainframes are still in use today (though they are now close to supercomputers because"
		+ " they have much better hardware than personal and other high end computers), when Unix"
		+ " was being developed they were ubiquitous.",
		"What computer hardware was Unix originally written on?", "Unix Name", uname_ans, 0);
	q.add_question("whoami", "He graduated from Harvard University with a degree in physics and"
		+ " mathematics, and also studied at Harvard while he was writing his PhD dissertation"
		+ " (though he did not officially receive his PhD). Before he defended his dissertation in"
		+ " 1968, he began working at Bell Laboratories in 1967.",
		"What degree did Ritchie get from Harvard University?", "Who am I?", whoami_ans, 0);
}

public static void main (String[] args) {
	// TODO add README and license

	Quiz q = new Quiz ();
	load_data(q);

	String help = "Welcome to the Dennis Ritchie Quiz App Shell! Dennis Ritchie was a computer"
	            + " programmer who is known for developing the C language and Unix operating"
	            + " system. This quiz is in the form of a Unix shell. You can use `man` followed by"
	            + " a command to learn more about his life and the Unix operating system. Enter a"
	            + " command when you are ready to answer a question about him. (You can type `exit`"
				+ " when you want to leave.)\n\nHere are the commands:\n";

	Printer.print_text(help);
	q.dump_commands();

	int exit_requested = 0;

	while (exit_requested == 0) exit_requested = q.parse_command(Printer.prompt(q));
}

}
