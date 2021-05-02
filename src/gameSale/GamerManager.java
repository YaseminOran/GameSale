package gameSale;

public class GamerManager {
	public Gamer add (User user,Customer customer) {
		if(VerifyGamer.Verify(user, customer) ){
			Gamer gamer = new Gamer();
			gamer.setFirstName(user.getFirstName());
			gamer.setLastName(user.getLastName());
			gamer.setYearBirth(user.getYearBirth());
			gamer.setNationalIdentity(user.getNationalIdentity());
			
			
			gamer.setNationalIdentity(user.getNationalIdentity());
			System.out.println("Oyuncu kaydedildi : " + gamer.getFirstName());
			return gamer;
		}
		System.out.println("Bilgiler uymuyor");
		return null;
		
	}
	
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silindi : " + gamer.getFirstName());
	}
	
	public void update(Gamer gamer) {
		System.out.println("Oyuncu güncellendi : " + gamer.getFirstName());
	}
		
		
	}


