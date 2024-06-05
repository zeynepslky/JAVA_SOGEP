package yirmialti;

public class Nokia3310 extends CepTelefonu
{

	Nokia3310() 
	{
	System.out.println(
	"Nokia3310 Sınıfı Yapılandırıcısı");
	}
	
	void takozOzelligi() 
	{
	System.out.println("Dilerseniz "
			+ "arabanızın kaymaması için"
			+ " takoz olarak kullanabilirsiniz");
	}

	@Override
	void ZilSesi() {
		// TODO Auto-generated method stub
		System.out.println(
				"Sadece polifonik zil sesi"
				+ " kullanılabilir.");
	}

	@Override
	void Oyunlar(String oyunTuru) {
		// TODO Auto-generated method stub
		System.out.println(oyunTuru+ 
				" oyun oynanabilir.");
	}
}
