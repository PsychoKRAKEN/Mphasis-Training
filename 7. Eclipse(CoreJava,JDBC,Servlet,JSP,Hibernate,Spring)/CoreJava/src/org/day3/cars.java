package org.day3;
import java.lang.*;
import java.util.*;

public class cars {
	int modelNo;
    String carName, carType;
    protected String carClass = "Non-Luxury";
    int carPrice;

    public cars(int modelNo, String carName, String carType, int carPrice) {
        this.modelNo = modelNo;
        this.carName = carName;
        this.carType = carType;
        this.carPrice = carPrice;
    }

    public cars() {}

    public void displayInfo() {
        System.out.println("Car Model: " + modelNo);
        System.out.println("Car Name: " + carName);
        System.out.println("Car Type: " + carType);
        System.out.println("Car Price: " + carPrice);
        System.out.println("Car Class: " + carClass);
    }
}
