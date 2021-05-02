package gameSale;

public class Main {

	public static void main(String[] args) {
		User user1 = new User();
		user1.setNationalIdentity("123456");
		user1.setFirstName("yasemin");
		user1.setLastName("Arslan");
		user1.setYearBirth("1985");
		
		Customer customer1=new Customer();
		customer1.setCardNo("1111 2222 1111");
		customer1.setPassword(0000);
		customer1.setFirstName("yasemin");
		customer1.setNationalIdentity("123456");
		customer1.setLastName("Arslan");
	
		GamerManager gamerManager = new GamerManager();
		Gamer gamer1 = gamerManager.add(user1, customer1);
		
		Game game1 = new Game();
		game1.setId(1);
		game1.setName("PUBG");
		game1.setSalePrice(32);
		game1.setUnitsInStock(10);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		
		SaleManager saleManager = new SaleManager();
		saleManager.sale(customer1, game1);
		
		Campaign campaign1 = new Campaign();
		campaign1.setId(1);
		campaign1.setName("Yaz ındirimi");
		campaign1.setPercentOfDiscount(25);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.applyCampaign(game1, campaign1);
		
		saleManager.sale(customer1, game1);
	}
		
		
		
		
		
		

}
