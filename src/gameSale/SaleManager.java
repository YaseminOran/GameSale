package gameSale;

public class SaleManager {
	public void sale(Customer customer, Game game) {
		System.out.println(game.getName() + " oyunu "+ game.getSalePrice() + " Türk Lirası olarak " + customer.getFirstName() 
		+ " müşterisi tarafından satın alındı");
	}
	
	public void returnOfSale(Customer customer, Game game) {
		System.out.println(game.getName() + " oyunu " + customer.getFirstName() + " kişisi iade etti");
	}

}
