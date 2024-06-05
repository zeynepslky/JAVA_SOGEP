package arayuzler;

public class gemi extends vasita 
			implements denizyolu
{

	@Override
	void yolculukTuru() {
		System.out.println("Bu araç denizyolunu"
				+ " kullanmaktadır");
		
	}

	@Override
	public void kamaraSayisi(int sayi) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sevkSistemi(String deger) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kullanimTuru(String deger) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int yolDurum() {
	
		return 0;
	}

}
