package classes;

public class House {
	private int id;
	private Residence residenceObj;
	private apartments apartmentsObj ;
	private owners ownerObj ;
	private boolean availabilityStatus;

	public House() {}
	public House(int id,Residence residenceObj,apartments apartmentsObj,owners ownerObj,boolean availabilityStatus) {
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
	public apartments getApartmentsObj() {
		return apartmentsObj;
	}
	public void setApartmentsObj(apartments newApartmentsObj) {
		apartmentsObj = newApartmentsObj;
	}
	public owners getOwnerObj() {
		return ownerObj;
	}
	public void setOwnerObj(owners newOwnerObj) {
		ownerObj = newOwnerObj;
	}
	public boolean getAvailabilityStatus() {
		return availabilityStatus;
	}
	public void setAvailabilityStatus(boolean newAvailabilityStatus) {
		availabilityStatus = newAvailabilityStatus;
	}
	
	
	
	
}
