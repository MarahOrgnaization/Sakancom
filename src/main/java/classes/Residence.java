package classes;

public class Residence {
	private String name;
	private String location ;
	private int numberFloors ;
	private int numberApartmentsFloor;
	private boolean availableParking;
	private boolean elevatorAvailable;
	
	public Residence() {};
	
	public Residence(String name,String location,int numberFloors,int numberApartmentsFloor,boolean availableParking,boolean elevatorAvailable) {
		this.name=name;
		this.location=location;
		this.numberFloors=numberFloors;
		this.numberApartmentsFloor=numberApartmentsFloor;
		this.availableParking=availableParking;
		this.elevatorAvailable=elevatorAvailable;
	}
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		name = newName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String newLocation) {
		location = newLocation;
	}
	public int getNumberFloors() {
		return numberFloors;
	}
	public void setNumberFloors(int newNumberFloors) {
		numberFloors = newNumberFloors;
	}
	public int getNumberApartmentsFloor() {
		return numberApartmentsFloor;
	}
	public void setNumberApartmentsFloor(int newNumberApartmentsFloor) {
		numberApartmentsFloor = newNumberApartmentsFloor;
	}
	public boolean getAvailableParking() {
		return availableParking;
	}
	public void setAvailableParking(boolean newAvailableParking) {
		availableParking = newAvailableParking;
	}
	public boolean getElevatorAvailable() {
		return elevatorAvailable;
	}
	public void setElevatorAvailable(boolean newElevatorAvailable) {
		elevatorAvailable = newElevatorAvailable;
	}
}
