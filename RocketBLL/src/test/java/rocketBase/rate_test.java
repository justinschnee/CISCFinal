	package rocketBase;

	import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

	import exceptions.RateException;
import rocketDomain.RateDomainModel;

	public class rate_test {
	// TODO - RocketBLL rate_test
	// Check to see if a known credit score returns a known interest rate

	// TODO - RocketBLL rate_test
	// Check to see if a RateException is thrown if there are no rates for a
	// given
	// credit score

		
		@Test 
		public void RateTest2() throws RateException {
			RateBLL.getRate(400);
		}
		
// GetPaymentTest
		@Test
		public void GetPaymentTest() throws RateException{
			assertEquals(RateBLL.getPayment(0.04/12, 360, 300000, 0, false)*-1,1432.25,0.01);
	}
		
	}