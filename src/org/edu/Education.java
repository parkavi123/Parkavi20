package org.edu;

public class Education extends Medicine{
	public void ug() {
		System.out.println("BE");
	}
	public void pg() {
		System.out.println("ME");
	}
	public static void main(String[] args) { 
	Education obj = new Education();
	obj.ug();
	obj.pg();
	
	obj.bsc();
	obj.bed();
	obj.ba();
	obj.bba();
	
	obj.be();
	obj.btech();
	
	obj.physiyo();
	obj.dental();
	obj.mbbs();
	
	}

}
