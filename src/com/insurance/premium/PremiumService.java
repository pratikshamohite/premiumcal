package com.insurance.premium;

public class PremiumService {

	public double calculate( int term, int rate, double sumAssured )
	{
		double premium = (sumAssured * rate)/(term * 100 * 12);
		return premium;	
	}

	public String calculatePremium(int age, int term__of_Insurance, String smokingHabit, String accidentBenefits, double sumAssured)
	{
		final int rate1 = 6;
		final int rate2 = 8;
		double premium = 0.0;
		String res="";
		
		if(age < 18 || age > 50)
		{
			res="Not eligible for Insurance";
			
			
		}
		else
		{
			 if( age >= 18 && age <= 33)
				{
					premium = calculate(term__of_Insurance, rate1, sumAssured);
				}
				else 
				{
					premium = calculate(term__of_Insurance, rate2, sumAssured);
				}
				
				if(smokingHabit.equalsIgnoreCase("yes"))
				{
					premium = premium + (premium * 0.1); 
				}
				if(accidentBenefits.equalsIgnoreCase("yes"))
				{
					premium = premium + (premium * 0.1);
				}
			//	res=Double.toString(premium);
				res  = " Your Premium is" + premium  ;
				System.out.println(res);
				
		}
		
		return res;
	}
	
	
	
	
	
}
