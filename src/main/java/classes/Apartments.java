package classes;
public class Apartments {
	private int number ;
	private int whichFloor;
	private int monthlyFee;
	private int numberPerson;
	private String space;
	private int bedroomNumber;
	private int bathroomsNumber;
	private int balconyNumber;
	
	private String photo;
	private boolean freeInternet;
	private boolean feesIncludeWaterElectricity;
	

	public Apartments() {}
	public Apartments(Apartments objApartments) {
		this.number=objApartments.getNumber();
		this.whichFloor=objApartments.getWhichFloor();
		this.monthlyFee=objApartments.getMonthlyFee();
		this.numberPerson=objApartments.getNumberPerson();
		this.space=objApartments.getSpace();
		this.bedroomNumber=objApartments.getBedroomNumber();
		this.bathroomsNumber=objApartments.getBathroomsNumber();
		this.balconyNumber=objApartments.getBalconyNumber();
		this.photo=objApartments.getPhoto();
		this.freeInternet=objApartments.getFreeInternet();
		this.feesIncludeWaterElectricity=objApartments.getFeesIncludeWaterElectricity();
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int newNumber) {
		number = newNumber;
	}
	public int getWhichFloor() {
		return whichFloor;
	}
	public void setWhichFloor(int newWhichFloor) {
		whichFloor = newWhichFloor;
	}
	public int getMonthlyFee() {
		return monthlyFee;
	}
	public void setMonthlyFee(int newMonthlyFee) {
		monthlyFee = newMonthlyFee;
	}
	public int getNumberPerson() {
		return numberPerson;
	}
	public void setNumberPerson(int newNumberPerson) {
		numberPerson = newNumberPerson;
	}
	public String getSpace() {
		return space;
	}
	public void setSpace(String newSpace) {
		space = newSpace;
	}
	public int getBedroomNumber() {
		return  bedroomNumber;
	}
	public void setBedroomNumber(int newBedroomNumber) {
		bedroomNumber = newBedroomNumber;
	}
	public int getBathroomsNumber() {
		return bathroomsNumber;
	}
	public void setBathroomsNumber(int newBathroomsNumber) {
		bathroomsNumber = newBathroomsNumber;
	}
	public int getBalconyNumber() {
		return balconyNumber;
	}
	public void setBalconyNumber(int newBalconyNumber) {
		balconyNumber = newBalconyNumber;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String newPhoto) {
		photo = newPhoto;
	}
	public boolean getFreeInternet() {
		return freeInternet;
	}
	public void setFreeInternet(boolean newFreeInternet) {
		freeInternet = newFreeInternet;
	}
	public boolean getFeesIncludeWaterElectricity() {
		return feesIncludeWaterElectricity;
	}
	public void setFeesIncludeWaterElectricity(boolean newFeesIncludeWaterElectricity) {
		feesIncludeWaterElectricity = newFeesIncludeWaterElectricity;
	}
}
