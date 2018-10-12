public abstract class GamePlayer {

	public static final int ROCK = 1;
	public static final int PAPER = 2;
	public static final int SCISSORS = 3;

	private String name;
	private int choice;
	private int wins;

	/**
	 * Creates a player with the given playerName with no wins
	 * 
	 * @param playerName
	 *            the name of the player
	 * @return
	 */

	public GamePlayer(String playerName) {
		name = playerName;
	}

	/**
	 * Returns the name of the player
	 * 
	 * @return the name of the player
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the player's choice of weapon for the game as an integer
	 * 
	 * @return the player's choice of weapon for the game as an integer
	 */
	public int getChoice() {
		return choice;
	}

	/**
	 * Returns the name of the player's choice of weapon
	 * 
	 * @return the name of the player's choice of weapon
	 */
	public String getChoiceName() {
		String choiceName = "stuff";
		if (choice == 1) {
			choiceName = "ROCK";
		} else if (choice == 2) {
			choiceName = "PAPER";
		} else {
			choiceName = "SCISSORS";
		}
		return choiceName;
	}

	/**
	 * Sets the player's choice of weapon
	 * 
	 * @param playerChoice
	 *            the player's choice of weapon
	 */
	public void setChoice(int playerChoice) {
		choice = playerChoice;
	}
	public void setName(String myName) {
		name = myName;
	}

	/**
	 * The player chooses their weapon
	 */
	public abstract void makeChoice();

	/**
	 * Add one to the total number of wins
	 */
	public void win() {
		wins++;
	}

	/**
	 * Returns the number of wins
	 * 
	 * @return the number of wins
	 */
	public int getWins() {
		return wins;
	}
	public void setWins() {
		wins++;
		
	}

	@Override
	public String toString() {
		return name + ": " + wins;
	}

}