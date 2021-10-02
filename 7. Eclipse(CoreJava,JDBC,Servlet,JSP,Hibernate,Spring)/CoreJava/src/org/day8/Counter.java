package org.day8;

public class Counter {

	int availableTicket = 2;

	public synchronized void bookTicket(String pname, int numberOfTicket) {
		if ((availableTicket >= numberOfTicket) && (numberOfTicket > 0)) {
			System.out.println("Hi," + pname + " : " + numberOfTicket+ " Ticket booked Successfully..");
			availableTicket = availableTicket- numberOfTicket;
		} else
			System.out.println("Hi," + pname + " : Ticket Not Available");
	}
}