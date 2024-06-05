package yirmialti;

public class Ogrenci 
{

	private int ogrenciNot;
		
	public int getOgrenciNot() {
		return ogrenciNot;
	}

	public void setOgrenciNot(int ogrenciNot) {
		if(ogrenciNot>100)
			ogrenciNot=100;
		else if(ogrenciNot<0)
			ogrenciNot=0;
		
		this.ogrenciNot = ogrenciNot;
	}

	Ogrenci () {
			
	}
	 

}
