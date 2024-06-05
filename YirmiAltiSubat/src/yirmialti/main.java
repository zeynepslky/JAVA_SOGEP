package yirmialti;

public class main {

	public static void main(String[] args) {
	
	Iphone14 iphoneObj=new Iphone14();
		
	iphoneObj.AramaYapma("05543456789");
	iphoneObj.MesajAtma("05543456789",
			"merhaba");
	iphoneObj.interneteBaglan("google.com");
	iphoneObj.ZilSesi();
	iphoneObj.Oyunlar("3d");
	
	System.out.println();
	System.out.println();
	
	Nokia3310 nokiaObj=new Nokia3310();
	nokiaObj.AramaYapma("05554443322");
	nokiaObj.MesajAtma("05554443322", 
			"nasılsın");
	nokiaObj.takozOzelligi();
	nokiaObj.ZilSesi();
	nokiaObj.Oyunlar("2d");
		/*Ogrenci ogrenciNesnesi
		=new Ogrenci();
		
		Ogrenci ogrenciNesnesi2
		=new Ogrenci(3);
		
		Ogrenci ogrenciNesnesi3
		=new Ogrenci("Merhaba");*/
		
		/*Daire daireObj=new Daire();
		System.out.println
		(daireObj.alanHesapla());
		
		daireObj=new Daire(5);
		System.out.println
		(daireObj.alanHesapla());
		
		daireObj=new Daire(4,3.14);
		System.out.println
		(daireObj.alanHesapla());
		
		
		Ogrenci ogrenciObj=new Ogrenci();
		ogrenciObj.getOgrenciNot();
		
		ogrenciObj.setOgrenciNot(290);*/
		
		//Memur memurObj=new Memur();
		//memurObj.sicilNo=100;
		/*System.out.println
		(memurObj.maasHesapla(4, 40, 120));
		

		OgretimUyesi ogrUyeObj=
				new OgretimUyesi();
		System.out.println
		(ogrUyeObj.maasHesapla(5, 30, 120));
		*/
	}
	
	/*private DegiskenTipi degisken;
	public void 
	birMetotKimleriCagirabilir
	(parametreTipi parametre)
	{
		aynıSınıfIcındeBulunanBaskaBirMetot();
		
		degisken.metotları();
		
		parametre.metotları();
		
		BirDigerNesneTipi birDigerNesne=
				new BirDigerNesneTipi();
		birDigerNesne.metotları();
	}*/

}
