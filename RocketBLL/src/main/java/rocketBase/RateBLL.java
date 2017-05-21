package rocketBase;

import exceptions.RateException;
import rocketData.LoanRequest;
import rocketDomain.RateDomainModel;
import java.util.ArrayList;
import java.util.stream.Collectors;

import org.apache.poi.ss.formula.functions.*;
import org.apache.poi.ss.formula.functions.FinanceLib;


import exceptions.RateException;
import rocketDomain.RateDomainModel;

public class RateBLL {

	private static RateDAL _RateDAL = new RateDAL();
	
	public static double getRate(int GivenCreditScore) throws RateException 
	{
	
		double dInterestRate = 0;
		ArrayList<RateDomainModel> rates = RateDAL.getAllRates();
		for(RateDomainModel rte : rates)
		{
			if(rte.getiMinCreditScore() <= GivenCreditScore)
			{
				dInterestRate = rte.getdInterestRate();
			}
		}
		if (dInterestRate == 0)
		{
			RateDomainModel RateModel = new RateDomainModel();
			RateModel.setiMinCreditScore(GivenCreditScore);
			throw new RateException(RateModel);
		}
		return dInterestRate;
		
		
		
		
		}
		


	
	//TODO - RocketBLL RateBLL.getPayment 
	//		how to use:
	//		https://poi.apache.org/apidocs/org/apache/poi/ss/formula/functions/FinanceLib.html
	
	public static double getPayment(double r, double n, double p, double f, boolean t)
	{		
		return FinanceLib.pmt(r, n, p, f, t);
	}
}
