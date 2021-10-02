package org.day4;

public class Student extends School{
	private String sname;
    private int rollno;
    private int classNo;
    private String dob;

    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public int getClassNo() {
        return classNo;
    }
    public void setClassNo(int classNo) {
        this.classNo = classNo;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getSchoolName() {
        return super.schoolName;
    }
    public void setSchoolName(String schoolName) {
        super.schoolName = schoolName;
    }
    public String getSchoolLocation() {
        return super.schoolLocation;
    }
    public void setSchoolLocation(String schoolLocation) {
        super.schoolLocation = schoolLocation;
    }
    public String getSchoolBoard() {
        return super.schoolBoard;
    }
    public void setSchoolBoard(String schoolBoard) {
        super.schoolBoard = schoolBoard;
    }

}
