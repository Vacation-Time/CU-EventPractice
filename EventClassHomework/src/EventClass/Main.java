package EventClass;

public class Main {

	public static void main(String[] args) {
		
		
		
//		Event event01 = new Event(null, 0, 'o');
//		System.out.println(event01);
//		
//		Event event02 = new Event("Warrior Welcome", 1, 'i');
//		System.out.println(event02);
//		
//		Event event03 = new Event("Corban Graduation", 15000, 'i');
//		System.out.println(event03);
//		
//		Event event04 = new Event("Soccer opener", 1200.52, 'o');
//		System.out.println(event04);
//		
//		double totalCost = 0;
//		totalCost = event01.getEventCost() + event02.getEventCost() + event03.getEventCost() + event04.getEventCost();
//		
//		System.out.println("Total Cost: " + totalCost);
		
		SportsEvent spEvent01 = new SportsEvent();
		System.out.println(spEvent01);
		
		SportsEvent spEvent02 = new SportsEvent("Season Opener", 2800.0, 'i', "Volleyball", 600);	
		System.out.println(spEvent02);
		
		TheaterEvent tEvent01 = new TheaterEvent();
		System.out.println(tEvent01);
		
		TheaterEvent tEvent02 = new TheaterEvent("Annual Showcase", 2800.0, 'i', 120, false);
		System.out.println(tEvent02);
		
		

	}

}

