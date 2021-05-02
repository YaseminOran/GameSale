package gameSale;

public class GameManager {
	public void add(Game game) {
		System.out.println("Oyun eklendi : " + game.getName());
	}
	
	public void delete(Game game) {
		System.out.println("Oyun  silindi : " + game.getName());
	}
	
	public void update(Game game) {
		System.out.println("Oyun güncellendi : " + game.getName());
	}
}
