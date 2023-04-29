package dmr;

public class Question {

private String command;
private String context;
private String question;
private String topic;
private String[] answers;
private int correct_answer;

/* 0 - Unanswered
 * 1 - Correct
 * -1 - Incorrect
 */
private int status;

public String get_command () { return command; }
public String get_context () { return context; }
public int get_status () { return status; }
public String get_topic () { return topic; }

public Question (String com, String con, String q, String t, String[] a, int cor) {
	command = com;
	context = con;
	question = q;
	topic = t;
	answers = a;
	correct_answer = cor;
	status = 0;
}

}
