package com.learning.core.day1;

public class TestMedicineInfo {
 public static void main(String[] args) {
	 MedicineInfo[] m = new MedicineInfo[3];
	 m[0]= new Tablet();
	 m[1]= new Syrup();
	 m[2]= new Ointment();
	 
	 for (MedicineInfo medicine :m) {
		 medicine.displayLabel();
	 }
 }
}
