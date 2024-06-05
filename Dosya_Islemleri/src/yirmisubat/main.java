package yirmisubat;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class main {

	public static void main(String[] args) 
	{	
		main mainNesnesi=new main();
		//System.out.println(mainNesnesi.dosyaVarMi("deneme.txt"));
			
	mainNesnesi.dosyayaYazdir("D:\\mesaj.huseyin","hello world");
	
	mainNesnesi.dosyadanOku("D:\\mesaj.huseyin");
	
	//mainNesnesi.dosyayaYazdir2("deneme.txt","hello world 2");
	
	//mainNesnesi.dosyadanOku2("deneme.txt");
	}
	
	
	
	void dosyadanOku2(String path) 
	{
		if(dosyaVarMi(path))
		{
			try {
			File dosyam=new File(path);
			byte[] gelenByteVeriler=
					new byte[(int)dosyam.length()];
			
			FileInputStream fileInputNesnesi=
					new FileInputStream(path);
			BufferedInputStream bufferInputNesnesi=
					new BufferedInputStream
							(fileInputNesnesi);
			
			bufferInputNesnesi.read(gelenByteVeriler, 
			0,gelenByteVeriler.length);
			
			bufferInputNesnesi.close();
			fileInputNesnesi.close();
			
			String sonuc=new String(gelenByteVeriler,
					StandardCharsets.UTF_8);
			
			System.out.println(sonuc);
			
			}
			catch(IOException e) {}
			
		}
		else
			System.out.println("Dosya yok");
	}
	
	void dosyayaYazdir2(String path,
			String yazdirilacakVeri) 
	{
		
		byte[] verininByteHali=yazdirilacakVeri.getBytes();
		
		try {
		FileOutputStream fileOutputNesnesi=
				new FileOutputStream(path,true);
		BufferedOutputStream bufferNesnesi=
				new BufferedOutputStream(fileOutputNesnesi);
		bufferNesnesi.write(verininByteHali);
		bufferNesnesi.write("\n".getBytes());
		bufferNesnesi.close();
		fileOutputNesnesi.close();
		
		}
		catch(IOException e) {}
		
	}
	
	
	
	
	void dosyadanOku(String path) 
	{
		if(dosyaVarMi(path)) 
		{
			try {
			FileReader okumaNesnesi=new FileReader(path);
			
			BufferedReader bufferNesnesi=
					new BufferedReader(okumaNesnesi);
			
			String satir;
			while((satir=bufferNesnesi.readLine())!=null)
				System.out.println(satir);
			
			bufferNesnesi.close();
			okumaNesnesi.close();
				}
			catch(IOException e) {}
		}
		else
			System.out.println("Dosya Yok.");
	}
	
	
	void dosyayaYazdir(String path,
			String yazdirilacakVeri) 
	{
		try {
		FileWriter dosyayaYazdirObj=
				new FileWriter(path,true);
		dosyayaYazdirObj.write(yazdirilacakVeri
				+"\n");
		dosyayaYazdirObj.close();
		
			}
		catch(IOException e) {}
	}
	
	boolean dosyaVarMi(String path)
	{
		File dosya=new File(path);
		return dosya.exists();
	}
	
	void dosyaOlustur(String path) 
	{
		if(!dosyaVarMi(path))
		{
			File dosya=new File(path);
			try {
				dosya.createNewFile();
			} catch (IOException e) {}		
		}
	}
	
	void dosyayiSil(String path) 
	{
		if(dosyaVarMi(path))
		{
			File dosya=new File(path);
				dosya.delete();	
		}
	}
	
}
