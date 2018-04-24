package edu.handong.csee.java.example.inheritance;

public class Faculty extends Person {
	private int facultyNumber;
	
	Faculty(String name, int facultyNumber){
		super(name);
		this.facultyNumber = facultyNumber;
	}
	
	public void reset(String newName, int newFacultyNumber) {
		super.setName(newName);
		facultyNumber = newFacultyNumber;
	}
	
	public int getFacultyNumber() {
		return facultyNumber;
	}
	
	public void setFacultyNumber(int newFacultyNumber) {
		facultyNumber = newFacultyNumber;
	}
	
	public boolean equals(Faculty otherFaculty){
		return this.hasSameName(otherFaculty) && (this.facultyNumber == otherFaculty.facultyNumber);
	}
	
	@Override
	public void writeOutput(){
		super.writeOutput();
		System.out.println("Faculty Number: " + this.facultyNumber);
	}
}
