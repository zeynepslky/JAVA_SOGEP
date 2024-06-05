
public class main {

	public static void main(String[] args) {
		
		// Kullanıcıdan gelen bilgileri kontrol etme
		/*
		boolean gelenCevap = kullaniciAdiSifreKontrol("admin","12345");
		
		if(gelenCevap)
			Session.initialize();
		*/
	
		

		// Dört işlem örnek
		/*
		main mainNesnesi = new main();
		System.out.println(mainNesnesi.dortIslem(3.2,-5,'*'));
		*/

		
		
		//3 ün kuvvetimi kontrol etme 
		/*
		System.out.println(ucunKuvvetiKontrol(45));
		System.out.println(ucunKuvvetiKontrol(59));
		*/
		
		
		//Asal sayı kontrol etme
		
		/*
		System.out.println(asalKontrol(8));
		System.out.println(asalKontrol(11));
		*/
		
		
		
		
		// Asal sayı kontrol özyinelemeli
		/*
		main mainNesnesi = new main();
		System.out.println(mainNesnesi.asalKontrolOzyineleme(13,6));
		*/
		
		
		// Faktöriyel alma
		/*
		main mainNesnesi = new main();
		System.out.println(faktoriyel(6));
		System.out.println(faktoriyelOzyineleme(5));
		*/
		
		
		
		
		// Üs hesaplama
		/*
		int sayi = 5;
		int usDeger = 3;
		int sonuc = 1;
		
		while(usDeger != 0)
		{
			sonuc *= sayi;
			usDeger--;
		}
		System.out.println(sonuc);
		*/
		//main MainNesnesi = new main();

		//System.out.println(MainNesnesi.usHesaplama(5,3));
		
		//System.out.println(MainNesnesi.faktoriyel(4));
		
		
		
		
		
		//ebob ekok bulma
		/*
		int sayi1 = 15, sayi2 = 25;
		int obeb=1, okek;
		
		for (int i = 1; i <= sayi1 && i <= sayi2; i++)
		{
			if(sayi1 % i == 0 && sayi2 % i == 0)
				obeb = i;
		}
		okek = (sayi1 * sayi2)/obeb;
		
		System.out.println(sayi1 + " ve " + sayi2 + " sayılarının en büyük ortak böleni " + obeb);
		System.out.println(sayi1 + " ve " + sayi2 + " sayılarının en küçük ortak katı " + okek);
		*/
		
		
		
		//ebpb ekok rekürsif
		/*
		int sayi1 = 25;
		int sayi2 = 35;
		System.out.println(sayi1 + " ve " + sayi2 + " sayılarının en büyük ortak böleni " + ebobHesapla(sayi1,sayi2));
		System.out.println(sayi1 + " ve " + sayi2 + " sayılarının en küçük ortak katı " + (sayi1*sayi2)/ebobHesapla(sayi1,sayi2));
		*/
		
		
		
		
		// Tek ve çift sayıların toplamı
		
		/*
		int tekToplam = 0, ciftToplam = 0;
		
		for (int i = 1; i <= 100; i++)
		{
			if ( i%2 == 0)
				ciftToplam += i;
			else
				tekToplam +=i;
		}
		System.out.println("Tek sayıların toplamı: " + tekToplam);
		System.out.println("Çift sayıların toplamı: " + ciftToplam);
		*/
		
		/*
		for ( int i = 1; i <= 100; i+=2)
		{
			tekToplam += i;
			ciftToplam += i+1;
		}
		System.out.println("Tek sayıların toplamı: " + tekToplam);
		System.out.println("Çift sayıların toplamı: " + ciftToplam);
		*/

	}
	
	
	static boolean kullaniciAdiSifreKontrol(String kullaniciAdi,String sifre)
	{
		if (kullaniciAdi.equals("admin") && sifre.equals("12345") )
			return true;
		else
			return false;
		
	}
	

	

	
	double dortIslem (double sayi1, double sayi2, char operator)
	{
		double sonuc = 0;
		switch(operator)
		{
		case '+': sonuc = sayi1+sayi2; break;
		case '-': sonuc = sayi1-sayi2; break;
		case '*': sonuc = sayi1*sayi2; break;
		case '/': sonuc = sayi1/sayi2; break;	
		}
		return sonuc;	
	}
	
	
	
	// Üçün kuvvetini kontrol etme
	static boolean ucunKuvvetiKontrol(double sayi)
	{
		if (sayi == 1)
			return true;
		else if (sayi<3)
			return false;
		else
		return ucunKuvvetiKontrol(sayi/3);
	}
	
	
	static boolean asalKontrol(int sayi)
	{
		boolean sonuc = true;
		
		if ( sayi < 2)
			sonuc = false;
		else
			for (int i=2; i < sayi; i++)
			{
				if (sayi % i == 0)
					sonuc = false;
			}
		return sonuc;
	}
	
	//sayi asal , i yarısı
	static boolean asalKontrolOzyineleme(int sayi, int i)
	{
		if ( i == 1 )
			return true;
		else
		{
			if ( sayi % i == 0)
				return false;
			else 
				return asalKontrolOzyineleme(sayi,i-1);
		}
	}
	
	

 	int faktoriyel(int sayi)
	{
		if ( sayi > 1)
			return sayi * faktoriyel(sayi-1);
		else
			return 1;
	}
	
	
	static int faktoriyelOzyineleme(int sayi)
	{
		if ( sayi > 1)
			return sayi * faktoriyelOzyineleme(sayi-1);
		else
			return 1;
	}
	

	

	static int ebobHesapla(int sayi1,int sayi2)
	{
		if(sayi2 == 0)
			return sayi1;
		else
			return ebobHesapla(sayi2,sayi1%sayi2);
	}
	

	int usHesaplama(int sayi, int usDeger)
	{
		if(usDeger == 0 || sayi == 1)
			return 1;
		else
			return sayi*usHesaplama(sayi,usDeger-1);
	}
	
	


}
