package org.day4;

public class Assignment2 {
	public static void main(String[] args) {
		Student s1 = new Student();
        s1.setSname("Avinash Sinha");
        s1.setRollno(1);
        s1.setClassNo(12);
        s1.setDob("03-08-1999");
        s1.setSchoolName("DAV");
        s1.setSchoolLocation("T.Nagar");
        s1.setSchoolBoard("CBSE");

        System.out.println(s1.getSname());
        System.out.println(s1.getRollno());
        System.out.println(s1.getClassNo());
        System.out.println(s1.getDob());
        System.out.println(s1.getSchoolName());
        System.out.println(s1.getSchoolLocation());
        System.out.println(s1.getSchoolBoard());
	}
}
