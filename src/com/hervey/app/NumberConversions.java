package com.hervey.app;

public class NumberConversions {

	public static int reverseDigits(int incomingInt) {
		// TODO Auto-generated method stub

		int workingInt  = incomingInt;
		int newNum = 0;

		while (true) {
			
			int workingDigit = workingInt%10;
			
			if(newNum==0) {
				newNum=workingDigit;
			}
			else {
				newNum=(newNum*10)+workingDigit;
			}
			
			
			workingInt = workingInt/10;
			
			System.out.println("workingInt this time through loop is: " + workingInt + " and the working Digit is:  " + workingDigit + " and newNum is " +newNum);

			
			
			

			if (Math.abs(workingInt)<=0) {
				break;
			}

		}

		return newNum;
	}

}
