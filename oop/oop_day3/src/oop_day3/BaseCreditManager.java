package oop_day3;

public abstract class BaseCreditManager implements ICreditManager {
	public abstract void Calculate();
	
	public void Save() {
		System.out.println("Kaydedili");
	}
}
