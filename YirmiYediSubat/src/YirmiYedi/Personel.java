package YirmiYedi;

public class Personel {
	int sicilNo;
	String adiSoyadi;
	protected int hamMaas=3000;
	protected double brutMaas, vergi;
	protected int saatlikMesaiUcreti=90;
	double vergiOrani=0.18;
	Personel() {
		System.out.println("Personel Sınıfı "
				+ "Yapılandırıcısı");
	}
	
	double maasHesapla(double katsayi,
			int mesaiSaati)
	{
		brutMaas=(hamMaas*katsayi)+
				(mesaiSaati*saatlikMesaiUcreti);
		vergi=brutMaas*vergiOrani;
		return brutMaas-vergi;
	}
}
