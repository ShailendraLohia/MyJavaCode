package ArrayPractice;

import java.math.BigDecimal;
import java.util.Date;

public class BigDecimalPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BigDecimal dec = new BigDecimal(0.0);
		BigDecimal dec1 = new BigDecimal(2.0);
		dec= dec1;
		
		System.out.println(dec);
		double dou = 1.0;
		//dec = dec + dou;
		
		Date date = new Date();
		
		String s = "2.2";
		double d = Double.parseDouble(s);
		System.out.println(d);

	}

}

