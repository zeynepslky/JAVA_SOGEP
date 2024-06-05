package ondukuzsubat;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) 
	{
		
		
		double sonuc;
		sonuc=Math.pow(2, 3);
		System.out.println(sonuc);
		
		sonuc=Math.sqrt(16);
		System.out.println(sonuc);
		
		
		sonuc=Math.abs(-5);
		System.out.println(sonuc);
		
		sonuc=Math.ceil(2.56);
		System.out.println(sonuc);
		
		sonuc=Math.floor(2.56);
		System.out.println(sonuc);
		
		sonuc=Math.max(5, 3);
		System.out.println(sonuc);
		
		
		sonuc=Math.min(5, 3);
		System.out.println(sonuc);
		
		
		sonuc=Math.round(1.618145*1000)/1000.0;
		System.out.println(sonuc);
		
		//sonuc=Math.random();
		sonuc=Math.random()*100;
		//int sonuc2=(int)Math.round(sonuc);
		//int sonuc2=(int)Math.ceil(sonuc);
		//int sonuc2=(int)Math.floor(sonuc);
		int sonuc2=(int)sonuc;
		System.out.println(sonuc2);
		
		System.out.println(Math.PI);
		System.out.println(Math.E);
		System.out.println(Math.TAU);
		System.out.println(Matematik.TAU);
		System.out.println(Matematik.gondenRateRaw2);
		System.out.println(Matematik.
				GoldenRate(21, 13));
		/*Calisanlar<Integer> isci
				=new Calisanlar<>();
		isci.ad="Hüseyin";
		isci.Soyad="Bodur";
		isci.maas=4000;
		
		Calisanlar<Double> muhendis
		=new Calisanlar<>();
		muhendis.ad="Hüseyin";
		muhendis.Soyad="Bodur";
		muhendis.maas=8000.8;
		
		
		Ogrenciler<Integer> notlar
				=new Ogrenciler<>();
		notlar.listeyeEkle(34);
		notlar.listeyeEkle(100);
		notlar.listeyeEkle(90);
		
		Ogrenciler<String> ogrenciAdlari
				=new Ogrenciler<>();
		ogrenciAdlari.listeyeEkle("hüseyin");
		ogrenciAdlari.listeyeEkle("hasan");
		ogrenciAdlari.listeyeEkle("ayşe");
		*/
		
		
		/*main mainNesne=new main();
		double toplamTutar=
				mainNesne.kdvliUrunFiyatiBul("Mobilya",
						100);
		System.out.println(toplamTutar);
*/
		/*List genericDegil=new ArrayList();
		genericDegil.add("merhaba");
		genericDegil.add(2);
		genericDegil.add(false);
		
		String sonuc;
		for(int i=0; i<genericDegil.size(); i++)
			sonuc=(String)genericDegil.get(i);
		
		List<Integer> generic=new ArrayList();
		generic.add("merhaba");
		generic.add(5);*/
		
	}
	
	double kdvliUrunFiyatiBul(String urunTuru, 
			double urunFiyati) 
	{
		double kdvOrani,kdvTutar,toplamTutar;
		
		if(urunTuru.equals("Mobilya"))
		{
			kdvOrani=0.08;
			kdvTutar=urunFiyati*kdvOrani;
			toplamTutar=urunFiyati+kdvTutar;
		}
		
		else if(urunTuru.equals("Beyaz Eşya"))
		{
			kdvOrani=0.18;
			kdvTutar=urunFiyati*kdvOrani;
			toplamTutar=urunFiyati+kdvTutar;
		}
		
		else if(urunTuru.equals("Gıda"))
		{
			kdvOrani=0.2;
			kdvTutar=urunFiyati*kdvOrani;
			toplamTutar=urunFiyati+kdvTutar;
		}
		
		else
		{
			kdvOrani=0.12;
			kdvTutar=urunFiyati*kdvOrani;
			toplamTutar=urunFiyati+kdvTutar;
		}
		
		return toplamTutar;
	}

	
	double kdvliUrunFiyatiBul2(String urunTuru, 
			double urunFiyati) 
	{
		double kdvOrani;		
		if(urunTuru.equals("Mobilya"))
			kdvOrani=0.08;			
		else if(urunTuru.equals("Beyaz Eşya"))
			kdvOrani=0.18;		
		else if(urunTuru.equals("Gıda"))
			kdvOrani=0.2;	
		else
			kdvOrani=0.12;
		return urunFiyati+(urunFiyati*kdvOrani);
	}
}
