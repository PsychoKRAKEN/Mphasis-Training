package org.day8;

public class Test {

    public static void main(String[] args) {
        Counter ticketCounter = new Counter();
        BookThread t1 = new BookThread(ticketCounter,"Nishchal",1);
        BookThread t2 = new BookThread(ticketCounter,"Ajay",1);
        BookThread t3 = new BookThread(ticketCounter,"Naman",1);
        
        t1.start();
        t2.start();
        t3.start();
    }
}
 

