package arayuzler;

public abstract class vasita 
{
	void hizGoster(int hiz)
	{
		System.out.println("Saateki hız:"+
					hiz);
	}
	
	void yolcuKapasitesi(int yolcuSayisi)
	{
		System.out.println("Yolcu Kapasitesi:"+
							yolcuSayisi);
	}
	
	abstract void yolculukTuru();
}
