package besmart;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.System.Logger;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		DersYonetimi dersYonetimObj=new
				DersYonetimi();
		
		int sinifMevcudu=25;
		int eklenecekOgrenci=20;
		int cikacakOgrenciSayisi=20;
		
		try {
			
		dersYonetimObj.minimumOgrenciSayisiKontrol
		(sinifMevcudu, cikacakOgrenciSayisi);
			
		dersYonetimObj.maksimumOgrenciSayisiKontrol
		(sinifMevcudu, eklenecekOgrenci);
		
		}
		catch(maksimumOgrenciSayisi | 
				minimumOgrenciSayisi e) 
		{
			System.out.println(e.toString());
		}
		
		
		
		
		//Hata yönetimi
		
		//çalışma zamanı istisnası
		try {
		int sayilar[]= {1,2,3,4};
		for(int i=0; i<10; i++)
			System.out.println(sayilar[i]);
		}
		catch
		(ArrayIndexOutOfBoundsException
				diziTasmaHatasi)
		{
			System.out.println
			(diziTasmaHatasi.toString());
		}
		catch(ArithmeticException e) 
		{
			System.out.println
			(e.toString());
		}
		
		Scanner giris=new Scanner(System.in);	
		int bolum=0;
		int bolen=0;
		System.out.print("Bölümü girin:");
		bolum=giris.nextInt();
		
		System.out.print("Böleni girin:");
		bolen=giris.nextInt();
		
		try {
		System.out.println(bolum/bolen);}
		catch(ArithmeticException e) 
		{
			System.out.println
			(e.toString());
		}
		
		File dosya=new File("deneme.txt");
		FileWriter yazmaObj=null;
		try {
			
			yazmaObj=
					new FileWriter(dosya);
			yazmaObj.write("merhaba dünya");
			//yazmaObj.close();
		} catch (IOException e) 
		{
			System.out.println
			(e.toString());
		}
		
		finally 
		{
			try {
				yazmaObj.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		
		try {
			dosyayaYazdir();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	
	static void dosyayaYazdir()  
			throws IOException
	{
		dosyayaYazdir2();
	}
	
	static void dosyayaYazdir2() 
			throws IOException
	{
		File dosya=new File("deneme.txt");
		FileWriter dosyayaYazObj=new 
				FileWriter(dosya);
		dosyayaYazObj.write("selam naber");
		dosyayaYazObj.close();
	}

}
