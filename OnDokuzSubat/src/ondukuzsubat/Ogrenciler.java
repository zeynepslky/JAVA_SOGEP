package ondukuzsubat;

import java.util.ArrayList;
import java.util.List;

public class Ogrenciler<T> {

	ArrayList<T> liste=
			new ArrayList<>();
		
	void listeyeEkle(T eklenecekVeri) 
	{
		liste.add(eklenecekVeri);
	}
		
	ArrayList<T> listeyiGetir() 
	{
		return liste;
	}
	
	
}
