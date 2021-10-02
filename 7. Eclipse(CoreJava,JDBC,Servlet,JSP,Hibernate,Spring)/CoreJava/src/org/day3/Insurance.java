package org.day3;

public class Insurance {
	
	int insNumber;
    String insType;
    int premium;
    public Insurance(int insNumber, String insType, int premium) {
        this.insNumber = insNumber;
        this.insType = insType;
        this.premium = premium;
    }
    @Override
    public String toString() {
        return "Insurance Number: " + insNumber + "\nInsurance Type: " + insType + "\nInsurance Premium: " + premium+"\n";
    }

    Insurance(){

    }

}
