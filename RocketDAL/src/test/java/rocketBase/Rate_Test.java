package rocketBase;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import rocketDomain.RateDomainModel;


public class Rate_Test {

	
	//Test 1
	//Check to see if a known credit score returns a known interest rate
	
	//Test 2
		//Check to see if a RateException is thrown if there are no rates for a given
		//credit score
	
	
	@Test
	public void test1() {
		
		ArrayList <RateDomainModel> r= RateDAL.getAllRates();
			System.out.println("Rate size: "+ r.size());
		assert(r.size()>0);
	}
	
	@Test
	public void test() {
		assert(1==1);
	}
	
}

