package bikeproject;

public class Bike implements BikeParts{

	private String handleBars, frame, tyres, seatType;
	private int NumGears;
	
	public Bike(){	
		// Конструктор пуст, так как MAKE теперь берется из интерфейса
	}//end constructor
	
	public Bike(String handleBars, String frame, String tyres, String seatType, int numGears) {
		this.handleBars = handleBars;
		this.frame = frame;
		this.tyres = tyres;
		this.seatType = seatType;
		this.NumGears = numGears;
	}//end constructor

	@Override
	public void printDescription()
	{
		System.out.println("\n" + MAKE + "\n" 
				          + "This bike has " + this.handleBars + " handlebars on a " 
				          + this.frame + " frame with " + this.NumGears + " gears."  
				          + "\nIt has a " + this.seatType + " seat with " + this.tyres + " tyres.");
	}//end method printDescription

}//end class Bike