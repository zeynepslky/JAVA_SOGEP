package yirmialti;

public abstract class CepTelefonu 
{
	String telefonNumarasi,mesaj;
	
	CepTelefonu() {
		System.out.println("Cep Telefonu "
				+ "Sınıf Yapılandırıcı");
	}
	
	void AramaYapma(String telefonNumarasi)
	{
		this.telefonNumarasi=telefonNumarasi;
		System.out.println
		(telefonNumarasi+" aranıyor.");
	}
	
	void MesajAtma(String telefonNumarasi,
			String mesaj) 
	{
		this.mesaj=mesaj;
		this.telefonNumarasi=telefonNumarasi;
		System.out.println(telefonNumarasi+
				" na gönderilen mesaj:"+mesaj);
	}
	
	
	abstract void ZilSesi();
	abstract void Oyunlar(String oyunTuru);
}
