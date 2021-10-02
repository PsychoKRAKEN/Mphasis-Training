package org.day3;

public class Assignment3 {
	public static void main(String[] args) {
		cars tataZest = new cars(1002, "TATA ZEST", "Petrol", 1000000);
        luxury tataZest_LX = new luxury(tataZest, "Hitachi 6AC", "JBL 5.1 Surround", 50000);

        tataZest.displayInfo();
        System.out.println("");
        tataZest_LX.displayInfo();
	}
}
