package com.learning.core.day1;

public interface MedicineInfo {
	void displayLabel();

}
class Tablet implements MedicineInfo{
	public void displayLabel() {
		System.out.println("Store tablet in dry place");
	
	}
}
class Syrup implements MedicineInfo{
	public void displayLabel() {
		System.out.println("Syrup is consumable only on prescription");
	
	}
}
class Ointment implements MedicineInfo{
	public void displayLabel() {
		System.out.println("Ointment is for external use only");
	
	}
}
