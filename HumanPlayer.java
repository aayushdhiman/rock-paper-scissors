import java.util.Scanner;

public class HumanPlayer extends GamePlayer {
	public HumanPlayer(String playerName) {
		super(playerName);
	}

	@Override
	/**
	 * The player will be prompted to make a choice of weapons
	 */
	public void makeChoice() {
		int pick = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Rock\n2. Paper\n3. Scissors");
		pick = scanner.nextInt();

		setChoice(pick);
	}

}
