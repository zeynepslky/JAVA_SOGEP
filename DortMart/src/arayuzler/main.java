package arayuzler;

import cokbicimlilik.Hayvan;

public class main {

	public static void main(String[] args) {
		
		kamyon bmc=new kamyon();
		bmc.hizGoster(80);
		bmc.yolcuKapasitesi(3);
		bmc.yolculukTuru();
		bmc.agirlik("3 ton");
		bmc.motorHacmi("cc");
		bmc.yakitTuru("mazot arada yağ da yakar");
		
		System.out.println();
		ucak boing =new ucak();
		boing.hizGoster(700);
		boing.yolcuKapasitesi(250);
		boing.yolculukTuru();
		boing.kanatAcikligi(15);
		boing.uzunluk(30);
		boing.ucusMenzili(1500);
		
		
		System.out.println();
		gemi cruise=new gemi();
		cruise.hizGoster(120);
		cruise.yolcuKapasitesi(500);
		cruise.yolculukTuru();
		cruise.kamaraSayisi(200);
		cruise.sevkSistemi("motorlu pervaneli");
		cruise.kullanimTuru("trustik");
		
		
		yuruyenUcak yuruyenUcakObj=new yuruyenUcak();
		yuruyenUcakObj.yolDurum();
		
		
		/*Hayvan hayvanObj=new Hayvan();
		Kus kusObj=new Kus();
		Balik balikObj=new Balik();
		Yilan yilanObj=new Yilan();
		
		eylemGerceklestir(hayvanObj);
		eylemGerceklestir(kusObj);
		eylemGerceklestir(balikObj);
		eylemGerceklestir(yilanObj);*/
	}
	

}
