package introductionChallenges;

import java.text.*;
import java.util.*;
import java.util.Scanner;

public class CurrencyFormatter  {

	public static void main(String[] args) {
		
        /* Create custom Locale for India - I used the "IANA Language Subtag Registry" to find India's country code */

		Locale LocaleIndia =new Locale("en", "IN"); 
		Scanner scan = new Scanner(System.in);
		double payment = scan.nextDouble();
		
		NumberFormat US = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat India = NumberFormat.getCurrencyInstance(LocaleIndia);
		NumberFormat China = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat France  = NumberFormat.getCurrencyInstance(Locale.FRANCE);

		//NumberFormat nfI = NumberFormat.getInstance(Locale.ITALY);
		String us = US.format(payment);
		String ind = India.format(payment);
		String chi = China.format(payment);
		String fran = France.format(payment);
		
		System.out.println("US: " + us);
		System.out.println("India: " + ind);
		System.out.println("China: " + chi);
		System.out.println("France: " + fran);

		
		scan.close();
	}

	

}
