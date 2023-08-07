package classes;
public class apartments {
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
	

	public apartments() {}
	public apartments(int number,int whichFloor,int monthlyFee,int numberPerson,String space,int bedroomNumber, int bathroomsNumber, int balconyNumber, String photo,boolean freeInternet,boolean feesIncludeWaterElectricity) {
		this.number=number;
		this.whichFloor=whichFloor;
		this.monthlyFee=monthlyFee;
		this.numberPerson=numberPerson;
		this.space=space;
		this.bedroomNumber=bedroomNumber;
		this.bathroomsNumber=bathroomsNumber;
		this.balconyNumber=balconyNumber;
		this.photo=photo;
		this.freeInternet=freeInternet;
		this.feesIncludeWaterElectricity=feesIncludeWaterElectricity;
	}
	
	public int getNumber() {
		return number;
	}
	public void SetNumber(int newNumber) {
		number = newNumber;
	}
	public int getWhichFloor() {
		return whichFloor;
	}
	public void setWhichFloor(int NewWhichFloor) {
		whichFloor = NewWhichFloor;
	}
	public int GetMonthlyFee() {
		return monthlyFee;
	}
	public void setMonthlyFee(int NewMonthlyFee) {
		monthlyFee = NewMonthlyFee;
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
	public void setSpace(String NewSpace) {
		space = NewSpace;
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
