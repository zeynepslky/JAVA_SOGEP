package ondukuzsubat;

public class Matematik 
{

	static final double TAU=Math.PI*2;
	final static double gondenRateRaw=1.618;
	final static double gondenRateRaw2=(Math.sqrt(5.0)+1.0)/2;
	static boolean GoldenRate
		(double number1,double number2) 
	{	
		double value=Math.max(number1, number2);
		double goldenrate=
				(number1+number2)/value;
		
		double goldenRateIlkDort
		=Math.round(goldenrate*1000)/1000.0;
		
		if(goldenRateIlkDort==gondenRateRaw)
			return true;
		else 
			return false;
	}
}
