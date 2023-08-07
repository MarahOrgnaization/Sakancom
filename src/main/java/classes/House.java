package classes;

public class House {
	private int id;
	private Residence residenceObj;
	private Apartments apartmentsObj ;
	private Owners ownerObj ;
	private boolean availabilityStatus;

	public House() {}
	public House(int id,Residence residenceObj,Apartments apartmentsObj,Owners ownerObj,boolean availabilityStatus) {
		this.id=id;
		this.residenceObj=residenceObj;
		this.apartmentsObj=apartmentsObj;
		this.ownerObj=ownerObj;
		this.availabilityStatus=availabilityStatus;
	}
	public int getId() {
		return id;
	}
	public void setId(int newId) {
		id = newId;
	}
	public Residence getResidenceObj() {
		return residenceObj;
	}
	public void setResidenceObj(Residence newResidenceObj) {
		residenceObj = newResidenceObj;
	}
	public Apartments getApartmentsObj() {
		return apartmentsObj;
	}
	public void setApartmentsObj(Apartments newApartmentsObj) {
		apartmentsObj = newApartmentsObj;
	}
	public Owners getOwnerObj() {
		return ownerObj;
	}
	public void setOwnerObj(Owners newOwnerObj) {
		ownerObj = newOwnerObj;
	}
	public boolean getAvailabilityStatus() {
		return availabilityStatus;
	}
	public void setAvailabilityStatus(boolean newAvailabilityStatus) {
		availabilityStatus = newAvailabilityStatus;
	}
	
	
	
	
}
