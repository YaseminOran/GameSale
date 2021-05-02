package gameSale;

public class Gamer extends User{
	private int numberOfGames;
	private int cash;
	
	public Gamer() {
		
	}

	public int getNumberOfGames() {
		return numberOfGames;
	}

	public void setNumberOfGames(int numberOfGames) {
		this.numberOfGames = numberOfGames;
	}

	public int getCash() {
		return cash;
	}

	public void setCash(int cash) {
		this.cash = cash;
	}
	

}
