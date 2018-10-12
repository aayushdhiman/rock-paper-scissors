import javax.swing.JOptionPane;

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
		pick = Integer.parseInt(JOptionPane.showInputDialog("1. Rock\n2. Paper\n3. Scissors"));
		setChoice(pick);
	}

}
