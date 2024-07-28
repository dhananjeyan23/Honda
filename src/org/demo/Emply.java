package org.demo;

public class Emply {
	String ename1="padma";
	String ename2="sdjey";
	String ename3="jey";

	//create the 1st method empName
	private void empName1() {
	System.out.println("employeename : "+ename1);
	}
	private void empName2() {
		System.out.println("employeename : "+ename2);
		}
	private void empName3() {
		System.out.println("employeename : "+ename3);
		}
	//create the main method 
	public static void main(String[] args) {
	//classname objrefname = new classname()
		Emply ei1 = new Emply();
		ei1.empName1();
		ei1.empName2();
		ei1.empName3();
	

}
}