package YirmiYedi;

import java.util.ArrayList;
import java.util.Arrays;

public class Kullanici 
{
	ArrayList<Integer> numaraListesi=
			new ArrayList<Integer>
				(Arrays.asList(1,2,3,4,5));
	
	private String isim;
	private int numara;
	private int yas;
	
	public void setIsim(String isim) {
		if(isim!="")
			this.isim = isim;
		else
			System.out.println("İsim değeri"
					+ " boş girilemez");
	}
	public String getIsim() {
		return isim;
	}
	public ArrayList<Integer> getNumaraListesi() {
		return numaraListesi;
	}
	public void setNumaraListesi(ArrayList<Integer> numaraListesi) {
		this.numaraListesi = numaraListesi;
	}
	

	public int getNumara() {
		return numara;
	}
	public void setNumara(int numara) {
		if(!numaraListesi.contains(numara))
			this.numara = numara;
		else
			System.out.println("Numara "+ numara +" Kayıtlı");
			
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		if(yas>0)
			this.yas = yas;
		else
			System.out.println("Girilen yaş"
					+ " geçersiz");
	}
	
	
	
}
