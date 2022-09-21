package EventClass;

/**
 * this is a class for Sporting events, the type of sport and how many spectators show up
 * @author Luca
 *
 */
public class SportsEvent extends Event {
	
	/**
	 * type of sport being played
	 */
	private String sportType = "";
	
	/**
	 * amount of spectators at event
	 */
	private int numOfSpectators = 0;
	
	/**
	 * default Constructor for Sports Event
	 */
	public SportsEvent() {
		super();
		setEventName("");
		setEventCost(1.0);
		setEventIndoorOutdoor('i');
		setSport("Baseball");
		setNumOfSpectators(1);
			
	}
	

	/**
	 * 
	 * @param eventName name of event	
	 * @param eventCost  cost of event in dollars
	 * @param eventIndoorOutdoor whether event takes place indoors or outdoors
	 * @param sport type of sport
	 * @param numOfSpectators numbers of people in attendance
	 */
	public SportsEvent(String eventName, double eventCost, char eventIndoorOutdoor, String sport, int numOfSpectators) {
		super(eventName, eventCost, eventIndoorOutdoor);
		setSport(sportType);
		setNumOfSpectators(numOfSpectators);
			
	}

	/**
	 * getter for type of sport
	 * @return string of sport type
	 */
	public String getSport() {
		return sportType;
	}

	/**
	 * setter for sport type
	 * @param string of sport type
	 */
	public void setSport(String sport) {
		this.sportType = sport;
	}

	/**
	 * getter for number of people spectating
	 * @return number of spectators
	 */
	public int getNumOfSpectators() {
		return numOfSpectators;
	}

	/**
	 * setter for number of spectators
	 * @param numOfSpectators
	 */
	public void setNumOfSpectators(int numOfSpectators) {
		this.numOfSpectators = numOfSpectators;
	}

	/**
	 * to concatenate info when printed and if/else statement to read String indoors/outdoors to correspond to char i/o
	 * 
	 */
	public String toString() {
		String eventInfo = "";
		eventInfo += "Sport Event Name: " + getEventName();
		eventInfo = eventInfo + " Cost: " + eventCost + " Hosted: ";

		if (eventIndoorOutdoor == 'i')
			eventInfo = eventInfo + "indoors ";
		else
			eventInfo = eventInfo + "outdoors ";
		
		eventInfo = eventInfo +  "Sport: " + sportType + " Number of Spectators: " + numOfSpectators;
		return eventInfo;
		
	}
	
}


