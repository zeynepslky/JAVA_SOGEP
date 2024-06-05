package YirmiYedi;

public class OgretimUyesi extends Personel 
{
	
	double vergiOrani=0.27;
	OgretimUyesi(){
		
		//super();
		
		System.out.println("Öğretim Üyesi "
				+ "Sınıfı Yapılandırıcısı");
		//vergiOrani=0.27;
		
		//System.out.println(super.vergiOrani);
		//System.out.println(this.vergiOrani);
		
	}
	
	void dersIsleri() {
		System.out.println("Ders işleri burada"
				+ " tanımlanır.");
	}
}
