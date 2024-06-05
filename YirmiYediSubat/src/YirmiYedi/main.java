package YirmiYedi;

public class main {

	public static void main(String[] args) {
		
		OgretimUyesi uyeObj=new OgretimUyesi();
		uyeObj.adiSoyadi="Hasan Yılmaz";
		uyeObj.sicilNo=1234;
		
		
		System.out.println(uyeObj.sicilNo+ " numaralı "
				+ "personel "
				+ uyeObj.adiSoyadi+" nın maaşı:"+
				uyeObj.maasHesapla(2, 10)+
				" TL dir.");
		uyeObj.dersIsleri();
		
		System.out.println();
		Memur memurObj=new Memur();
		System.out.println(memurObj.maasHesapla(4, 40));
		/*Kullanici kullanici1=new Kullanici();
		kullanici1.setIsim("Hüseyin Bodur");
		
		kullanici1.setNumara(4);
		kullanici1.setYas(20);
		System.out.println();
		
		System.out.println("Kullanıcının Adı:"+
				kullanici1.getIsim());
		
		System.out.println("Kullanıcının Yaşı:"+
				kullanici1.getYas());
		
		System.out.println("Kullanıcının Numarası:"+
				kullanici1.getNumara());*/

	}

}
