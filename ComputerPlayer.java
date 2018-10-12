public class ComputerPlayer extends GamePlayer {

public ComputerPlayer(String playerName) {
	super(playerName);	
}
/**
 * Constructs a new ComputerPlayer that represents human playing 
 * with the given playerName
 * @param playerName the name of the player
 */



@Override
/**
 * The player will randomly choose one of the choices
 */
public void makeChoice() {
	int random = (int) Math.random() *4;
	setChoice(random);
}

}