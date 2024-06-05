package personelProje;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
	
		baglanti baglantiObj=new baglanti();
		/*int sonuc=baglantiObj.personelEkle("456456456", 
				(short)234,
				"Hasan Bodur", "11.33.1990", 
				true, "muhendis", false);
		
		 sonuc=baglantiObj.personelEkle("456456456", 
				(short)234,
				"Hasan Bodur", "11.33.1990", 
				true, "muhendis", false);
		if(sonuc==1)
			System.out.println("Kayıt eklendi.");
		else
			System.out.println("Hata oluştu.");
		*/
		
		/*int sonuc=baglantiObj.
				personelSil("456456456");
		if(sonuc>0)
			System.out.println("Silinen Kayıt Sayısı: "+sonuc);
		else
			System.out.println("Kayıt silinmedi.");
		*/
		
		
		int sonuc=baglantiObj.personelGuncelle("12345678", 
				(short)12345,
				"Hasan Yılmaz", "11.33.2200", 
				true, "isci", false);
		if(sonuc>0)
			System.out.println("Kayıt Güncellendi. ");
		else
			System.out.println("Kayıt Güncellenmedi.");
		
		
		
		ArrayList<String>okunanlar=
				baglantiObj.personelOku();
		baglantiObj.baglantiyiKapat();
		
		for(int i=0; i<okunanlar.size(); i++)
			System.out.println(okunanlar.get(i));
	}

}
