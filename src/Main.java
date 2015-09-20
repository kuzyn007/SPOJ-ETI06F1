/**
 * Autor kodu: Sewery Adamczyk
 * Pochodzenie: http://pl.spoj.com/problems/ETI06F1/
 */

import java.text.NumberFormat;
import java.util.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		Locale bLocale = new Locale.Builder().setLanguage("en").setRegion("US").build();
		Locale.setDefault(bLocale);
		Scanner in = new Scanner(System.in);
		

		double r = in.nextDouble();
		double d = in.nextDouble();
		
		d = d/2;
		double pole = Math.sqrt(Math.pow(r, 2) - Math.pow(d, 2));
		
		pole = 3.141592654 * Math.pow(pole, 2);
		NumberFormat nf = NumberFormat.getInstance(); // get instance
		nf.setMaximumFractionDigits(2); // set decimal places
		String s = nf.format(pole);
		System.out.println(s);

		
		in.close();
	}

}

