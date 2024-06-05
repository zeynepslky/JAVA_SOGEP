package yirmialti;

public class Daire {

	double pi,yaricap;
	
	Daire() {
		pi=3;
		yaricap=1;
	}
	
	
	Daire(double yaricap) 
	{
		this.yaricap=yaricap;
		pi=3;
	}
	
	Daire(double yaricap, double pi)
	{
		this.yaricap=yaricap;
		this.pi=pi;
	}
	
	Double alanHesapla() {
		return pi*yaricap*yaricap;
	}
	
	
}
