package yirmialti;

public class Iphone14 extends CepTelefonu
{

	Iphone14() {
		System.out.println(
		"Iphone14 Sınıfı Yapılandırıcısı");
	}
	
	void interneteBaglan(String internetAdresi) 
	{
		System.out.println("Bağlanılan "
				+ "site :"+internetAdresi);
	}

	@Override
	void ZilSesi() {
		// TODO Auto-generated method stub
		System.out.println(
				"Her ses dosyası tipinde zil sesi"
				+ " kullanılabilir.");
	}

	@Override
	void Oyunlar(String oyunTuru) {
		// TODO Auto-generated method stub
		System.out.println(oyunTuru+ 
				" oyun oynanabilir.");
	}
}
