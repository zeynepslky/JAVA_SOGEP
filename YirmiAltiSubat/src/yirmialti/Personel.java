package yirmialti;

public class Personel
{

	public int sicilNo;
	
	Personel() 
	{
		System.out.println
		("Personel Sınıf Yapılandırıcı");
	}
	
	double maasHesapla(int katsayi, 
			int mesaiSaati,
			int mesaiUcreti) 
	{
		int brutMaas=katsayi*10000+
				mesaiSaati*mesaiUcreti;
		
		return brutMaas- (brutMaas*0.18);
	}
	
}
