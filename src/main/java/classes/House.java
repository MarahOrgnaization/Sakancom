package classes;

public class House {
	private int id;
	public Residence residenceObj;
	public apartments apartmentsObj ;
	public owners ownerObj ;
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
	public boolean getAvailabilityStatus() {
		return availabilityStatus;
	}
	public void setAvailabilityStatus(boolean newAvailabilityStatus) {
		availabilityStatus = newAvailabilityStatus;
	}
}
