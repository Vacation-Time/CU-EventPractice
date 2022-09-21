package EventClass;
/**
 * This is a class for "Event" objects, their name, location and cost
 * @author Luca S-G - HW 03: OOP review - I - due 9/12/22
 *
 */
public abstract class Event {  // added 'abstract' as per homework instructions
	
	public static final char INDOORS = 'i';
	public static final char OUTDOORS = 'o';
	
	/**
	 *  to give each name object a name
	 */
	private String eventName;
	
	/**
	 * event price in dollar amount
	 */
	protected double eventCost;
	
	/**
	 * to represent location as either indoor/outdoor with i/o
	 */
	protected char eventIndoorOutdoor;
	
	/**
	 * default constructor with values
	 */
	public Event() {
		setEventName("");
		setEventCost(1);
		setEventIndoorOutdoor('i');
		
	}
	
	// what is this variable for (description)
	/**
	 * event constructor for user input
	 * @param newEventName name of each event
	 * @param newEventCost cost of each event
	 * @param newEventIndoorOutdoor whether even takes place indoor or outdoor
	 */
	public Event(String newEventName, double newEventCost, char newEventIndoorOutdoor) {
		setEventName(newEventName);
		setEventCost(newEventCost);
		setEventIndoorOutdoor(newEventIndoorOutdoor);
	}
	
	/**
	 * to concatenate info when printed and if/else statement to read String indoors/outdoors to correspond to char i/o
	 */
	public String toString() {
		String eventInfo = "";
		eventInfo += "Name: " + eventName;
		eventInfo = eventInfo + " Cost: " + eventCost + " Hosted: ";

		if (eventIndoorOutdoor == 'i')
			eventInfo = eventInfo + "indoors";
		else
			eventInfo = eventInfo + "outdoors";
		return eventInfo;
	}
	
	/**
	 * getter for name of event 'eventName'
	 * @return name of event (String)
	 */
	public String getEventName() {
		return eventName;
	}

	/**
	 * setter for name of event
	 * @param eventName
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	/**
	 * getter for price of event 'eventCost'
	 * @return price for event (double)
	 */
	public double getEventCost() {
		return eventCost;
	}

	/**
	 * setter for price of event
	 * @param eventCost
	 */
	public void setEventCost(double eventCost) {
		this.eventCost = eventCost;
	}

	/**
	 * getter for whether event takes place indoors or outdoors
	 * @return location type as char: 'i' for indoor, 'o' for outdoor (char)
	 */
	public char getEventIndoorOutdoor() {
		return eventIndoorOutdoor;
	}

	/**
	 * setter for whether event takes place indoors or outdoors
	 * @param newEventIndoorOutdoor
	 */
	public void setEventIndoorOutdoor(char newEventIndoorOutdoor) {
		this.eventIndoorOutdoor = newEventIndoorOutdoor;
	}
	

	


}

