package org.day3;
import java.lang.*;
import java.util.*;

public class luxury extends cars{
	String acDetails;
    String stereoDetails;
    int extraPay;

    public luxury(cars cars, String acDetails, String stereoDetails, int extraPay) {
        super(cars.modelNo, cars.carName, cars.carType, cars.carPrice);
        this.acDetails = acDetails;
        this.stereoDetails = stereoDetails;
        super.carPrice += extraPay;
        super.carClass = "Luxury Car";
    }

    public void displayInfo() {

        super.displayInfo();
        System.out.println("AC Details: " + acDetails);
        System.out.println("Stereo Details: " + stereoDetails);

    }

}
