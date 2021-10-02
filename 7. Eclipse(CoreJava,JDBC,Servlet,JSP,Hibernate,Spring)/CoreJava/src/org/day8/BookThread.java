package org.day8;

public class BookThread extends Thread {

	private Counter ticketCounter;
	private String passengerName;
	private int noOfTicketToBook;

	public BookThread(Counter ticketCounter,String passengerName, int noOfSeatsToBook) {
		this.ticketCounter = ticketCounter;
		this.passengerName = passengerName;
		this.noOfTicketToBook = noOfSeatsToBook;
	}
	
	public void run() {
		
		ticketCounter.bookTicket(passengerName, noOfTicketToBook);
		
	}
}