import java.util.Scanner;

public class Game_Logic {
	public Game_Logic() {

	}

	public void waitforCommand() {

		System.out.println("What do?");
		Scanner sc = new Scanner(System.in);
		String com = sc.nextLine();
		// parse the command by spaces
		// read each word into an array valueString s = "This is a sample
		// sentence.";
		String[] words = com.split(" ");
		processCommand(words);

	}

	public void processCommand(String[] x) {
	}
}
