package week1.day1;

public class Bike {
	public void applyBreak() {
		System.out.println("AppliedBreak for car" );
	}
public void soundHorn() {
	System.out.println("SoundHorn for bike");
}
	
	public static void main(String[] args) {
		Car obj= new Car();
		obj.applyBreak();
		obj.soundhorn();
		Bike obj1 = new Bike();
		obj1.applyBreak();
		obj1.soundHorn();
		
				

	}

}
