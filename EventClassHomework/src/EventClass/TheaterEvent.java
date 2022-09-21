package EventClass;

/**this class is for theater events, how long they will be and if it is a musical or not
 * 
 * @author Luca
 *
 */
public class TheaterEvent extends Event {
	
	/**
	 * the length of each play in minutes
	 */
	private int playLength = 1;
	
	/**
	 * if it or is not a musical play
	 */
	private boolean isMusical = true;
	
	/**
	 * default Constructor for TheaterEvent
	 */
	public TheaterEvent() {
		super();
		setEventName("");
		setEventCost(1.0);
		setEventIndoorOutdoor('i');
		setPlayLength(1);
		setMusical(true);
		
	}
	
	/**
	 * Constructor for TheaterEvent
	 */
	public TheaterEvent(String eventName, double eventCost, char eventIndoorOutdoor, int playLength, boolean isMusical) {
		super(eventName, eventCost, eventIndoorOutdoor);		
		setPlayLength(playLength);
		setMusical(isMusical);
	}
	
	/**
	 * to concatenate info when printed and if/else statement to read String indoors/outdoors to correspond to char i/o
	 * and if it is/is not a musical
	 */
	public String toString() { //use get event name and parent variable can stay private
		String eventInfo = "";
		eventInfo += "Theatre Event Name: " + getEventName();
		eventInfo = eventInfo + " Cost: " + eventCost  + " " + " Length: " + playLength + " Hosted: ";

		if (eventIndoorOutdoor == 'i')
			eventInfo = eventInfo + "indoors ";
		else
			eventInfo = eventInfo + "outdoors ";
		
		eventInfo = eventInfo + " Is it a Musical: ";
		
		if (isMusical == true)
			eventInfo = eventInfo + "This is a musical";
		else
			eventInfo = eventInfo + "This is not a musical";
		return eventInfo;
		
	}
	
	/**
	 * getter for length of play in hours
	 * @return int length
	 */
	public int getPlayLength() {
		return playLength;
	}

	/**
	 * setter for length of play in hours
	 * @param playLength
	 */
	public void setPlayLength(int playLength) {
		this.playLength = playLength;
	}

	/**
	 * boolean value true: is a musical, false: is not
	 * @return true-is musical, false-is not
	 */
	public boolean isMusical() {
		return isMusical;
	}

	/**
	 * setter for event type is/is not a musical
	 * @param isMusical
	 */
	public void setMusical(boolean isMusical) {
		this.isMusical = isMusical;
	}


	

}
