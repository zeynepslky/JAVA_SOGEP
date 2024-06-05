package cokbicimlilik;

import cokbicimlilik.Hayvan;

public class main {

	public static void main(String[] args) {
	
		Hayvan hayvanObj=new Hayvan();
		Kus kusObj=new Kus();
		Balik balikObj=new Balik();
		Yilan yilanObj=new Yilan();
		
		eylemGerceklestir(hayvanObj);
		eylemGerceklestir(kusObj);
		eylemGerceklestir(balikObj);
		eylemGerceklestir(yilanObj);
	}
	
	static void eylemGerceklestir(Hayvan 
			hayvanTipindeParametre)
	{
		
		hayvanTipindeParametre.eylem();
	}

}
