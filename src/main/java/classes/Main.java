package classes;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.*;
public class Main {
	static Scanner myInput = new Scanner(System.in);
	protected static ArrayList<House> arrayHouses = new ArrayList<House>();
	protected static ArrayList<House> advertisedHouses = new ArrayList<House>();
	protected static ArrayList<User> users = new ArrayList<User>();
	private static ArrayList<Tenant> tenantList = new ArrayList<Tenant>();
	private static ArrayList <IdAndTennant> idAndTennantlist = new ArrayList<IdAndTennant>();

	private static int counterId=0; 
	private static String userType = "none" ;
	static String username;
	static int counter=0;
	
	private static final Logger logger = Logger.getLogger(Main .class.getName());
	private static final String ADMIN = "admin";
	private static final String OWNER = "owner";
	private static final String TENANT = "tenant";
	private static final String  PAYATTENTIONMASS = "Please, pay attention !!! Enter the letter Y=Yes or N=No only";
	private static final String  HOUSEINF = "The house information is:";
	private static final String  ENTRYERROR =  "You did not enter one of the available symbols";
	private static final String  HOUSEID = "The ID of the house is: ";
	
	private static final String  ELEVATOR ="\n13-Is elevator service available : ";
	private static final String  CARPARK = " \n12-Is there a private car park for the building : ";
	private static final String  INTERNET = " \n11-Is there free internet service : ";
	private static final String  ELEANDWAT =" \n10-Do the fees include electricity and water : ";
	private static final String  HOWFEES = "9-How much are the monthly fees : ";
	private static final String  HOWSPACE = " \n8-How space is the room : ";
	private static final String  HOWPEOPLE = " \n7-How many people can the apartment accommodate : ";
	private static final String  WHATFLOOR =" \n6-What floor is the apartment on : ";
	private static final String  NUMAPPARTMENT = "5-the number of the apartment : ";
	private static final String  HOWAPARTMENTS = " \n4-How many apartments per floor : ";
	private static final String  NUMFLOORS = "\n3-the number of floors of the building : ";
	private static final String  LOCATION = " \n2-the location of the Residence : ";
	private static final String  RESNAME = "1-name of Residence : ";
	
	public static void main(String[] args) {
		 
		 fullTenantList();
		 
		 do {
			 logger.log(Level.INFO, "Enter your username please");
		 username = myInput.next();
		 logger.log(Level.INFO,"Enter your password please");
		String pass = myInput.next();
		String type = login(username,pass);
		menuType(type);
		}
		 while (!username.equals("exit"));
	 }
 
	 public static String login(String userName , String pass){
		 
		 User firstUser= new User("marah", "123",ADMIN);
		 User secondtUser= new User("bayan", "333", OWNER);
		 User thirdUser= new User("ahmad", "133", OWNER);
		 User fourthUser= new User("khalid", "993", TENANT);
		 User fifthUser= new User("mayar", "122", TENANT);
		 User sixthUser= new User("osama", "222", TENANT);
		 
		 users.add(firstUser);
		 users.add(secondtUser);
		 users.add(thirdUser);
		 users.add(fourthUser);
		 users.add(fifthUser);
		 users.add(sixthUser);
		 
		for (int i=0 ; i <users.size();i++) {
			
			if (users.get(i).getUserName().equals(userName) && users.get(i).getPass().equals(pass)) {
				
			if (users.get(i).getType().equals(ADMIN)) {
				setUserType(ADMIN);
		}
			else if (users.get(i).getType().equals(OWNER)) {
				setUserType(OWNER);
		}
			else if (users.get(i).getType().equals(TENANT)) {
				setUserType(TENANT);
		}
			else {
				setUserType("none");
			}
		
			}
		}
	
	return getUserType();
	 }
	 
	 public static void setUserType(String type) {
			userType = type;
		}	
	 public static String getUserType() {
			return userType;
		}
	 
	 public static House enterInformation() {
		 Residence residenceObj=new Residence();
		 	Apartments apartmentsObj =new Apartments() ;
		 	Owners ownerOne = new Owners();
		 	ownerOne.setName(username);
			counterId=counterId+1;
			logger.log(Level.INFO,"The name of the building in which the apartment is located ?");
			residenceObj.setName(myInput.next());

			logger.log(Level.INFO,"What is the location of the Residence in which the apartment is located ?");
			residenceObj.setLocation(myInput.next()); 
			
			logger.log(Level.INFO,"What is the number of floors of the building ?");
			residenceObj.setNumberFloors(myInput.nextInt());
			
			logger.log(Level.INFO,"How many apartments per floor?");
			residenceObj.setNumberApartmentsFloor(myInput.nextInt());
			
			logger.log(Level.INFO,"Enter the number of the apartment ?");
			apartmentsObj.setNumber(myInput.nextInt());
			
			logger.log(Level.INFO,"What floor is the apartment on ?");
			apartmentsObj.setWhichFloor(myInput.nextInt());

			logger.log(Level.INFO,"How many people can the apartment accommodate ?");
			apartmentsObj.setNumberPerson(myInput.nextInt());

			logger.log(Level.INFO,"How space is the room ?");
			apartmentsObj.setSpace(myInput.next());
			
			logger.log(Level.INFO,"How much are the monthly fees ?");
			apartmentsObj.setWhichFloor(myInput.nextInt());
			
			logger.log(Level.INFO,"The number of bedrooms is :");
			apartmentsObj.setBedroomNumber(myInput.nextInt());
			
			logger.log(Level.INFO,"The number of bathrooms is :");
			apartmentsObj.setBathroomsNumber(myInput.nextInt());
			
			logger.log(Level.INFO,"The number of balcony is :");
			apartmentsObj.setBalconyNumber(myInput.nextInt());
			
			logger.log(Level.INFO,"Do the fees include electricity and water ? (y or n)");
			String s = myInput.next();
			boolean b=true ;
			if(s.equals("y") || s.equals("Y")) { b=true;}
			else if(s.equals("n") || s.equals("N")) { b=false;}
			apartmentsObj.setFeesIncludeWaterElectricity(b);

			logger.log(Level.INFO,"Is there free internet service ? (y or n)");
			s = myInput.next();
			if(s.equals("y") || s.equals("Y")) { b=true;}
			else if(s.equals("n") || s.equals("N")) { b=false;}
			else { logger.log(Level.INFO,PAYATTENTIONMASS); }
			apartmentsObj.setFreeInternet(b);
			
			logger.log(Level.INFO,"Is there a private car park for the building? (y or n)");
			s = myInput.next();
			if(s.equals("y") || s.equals("Y")) { b=true;}
			else if(s.equals("n") || s.equals("N")) { b=false;}
			else { logger.log(Level.INFO,PAYATTENTIONMASS); }
			residenceObj.setAvailableParking(b);
			
			logger.log(Level.INFO,"Is elevator service available? (y or n)");
			s = myInput.next();
			if(s.equals("y") || s.equals("Y")) { b=true;}
			else if(s.equals("n") || s.equals("N")) { b=false;}
			else {logger.log(Level.INFO,PAYATTENTIONMASS); }
			residenceObj.setElevatorAvailable(b);	
			
			logger.log(Level.INFO,"Enter your phone number to contact : ");
			ownerOne.setPhoneNumber(myInput.next());
			
			logger.log(Level.INFO,"Enter a picture of the apartment");
			apartmentsObj.setPhoto(myInput.next());
			
			 House houseOne=new House(counterId,residenceObj,apartmentsObj,ownerOne,true);
		 	return houseOne;
	 }
	 
	 
	 public static void menuType(String type)  {
		 int in;
		 if(type.equals(OWNER)) {
			 do { 
				 logger.log(Level.INFO," ((( owner menu ))) : ");
				 logger.log(Level.INFO,"1-add House\n2-Modify information\n3-show House\n4-control panel\n5-Exit");
			  in = myInput.nextInt();
				 switch(in) {
				 case 1:
					 House houseOne = enterInformation();
						addHouse(houseOne,OWNER);
					 break;
				 case 2:
		
					 logger.log(Level.INFO,"What is the house ID that you want to change to?");
						int houseId = myInput.nextInt();
						
						logger.log(Level.INFO,"What information do you want to modify?");
						logger.log(Level.INFO,"1-name of Residence \n2-the location of the Residence \n3-the number of floors of the building \n4-How many apartments per floor");
						logger.log(Level.INFO,"5-the number of the apartment \n6-What floor is the apartment on \n7-How many people can the apartment accommodate \n8-How space is the room");
						logger.log(Level.INFO,"9-How much are the monthly fees \n10-Do the fees include electricity and water \n11-Is there free internet service \n12-Is there a private car park for the building \n13-Is elevator service available \n14-picture of the apartment");
						
						int num = myInput.nextInt();
						logger.log(Level.INFO,"Enter the new value");
						String newValue =  myInput.next();
						modifyInformation(houseId,num,newValue);			 
						break;
				 case 3:
					 showHouse();
					 break;
				 case 4:
					 controlPanel(username);
					 break; 
				 case 5:
					 
					 break; 
				 default: 
					 logger.log(Level.INFO,ENTRYERROR);
					    break;
				 }
				 
			}
			 while(in!=5);
			  
		}
		 else if (type.equals(ADMIN)) {
			 do { 
				 logger.log(Level.INFO," ((( admin menu ))) : ");
				 logger.log(Level.INFO,"1-accept and reject\n2-show advertised houses\n3-add at advertised houses\n4-Watching reservations via the system\n5-Exit");
				 in = myInput.nextInt();
					 switch(in) {
					 case 1:
						String acc; 
							 for(int i=0;i<arrayHouses.size();i++) {
								 logger.log(Level.INFO,HOUSEID );
								 logger.log(Level.INFO,"{0}",arrayHouses.get(i).getId() );
								 logger.log(Level.INFO,HOUSEINF);
								 logger.log(Level.INFO,RESNAME );
								 logger.log( Level.INFO,arrayHouses.get(i).getResidenceObj().getName());
								 logger.log(Level.INFO,LOCATION );
								 logger.log(Level.INFO, arrayHouses.get(i).getResidenceObj().getLocation() );
							 	 logger.log(Level.INFO,NUMFLOORS);
								 logger.log(Level.INFO,"{0}",arrayHouses.get(i).getResidenceObj().getNumberFloors());
								 logger.log(Level.INFO,HOWAPARTMENTS);
								 logger.log( Level.INFO,"{0}",arrayHouses.get(i).getResidenceObj().getNumberApartmentsFloor());
								 logger.log(Level.INFO,NUMAPPARTMENT);
								 logger.log(Level.INFO,"{0}",arrayHouses.get(i).getApartmentsObj().getNumber());
								 logger.log(Level.INFO,WHATFLOOR);
								 logger.log(Level.INFO,"{0}",arrayHouses.get(i).getApartmentsObj().getWhichFloor());
								 logger.log(Level.INFO,HOWPEOPLE);
								 logger.log(Level.INFO,"{0}",arrayHouses.get(i).getApartmentsObj().getNumberPerson());
								 logger.log(Level.INFO,HOWSPACE);
								 logger.log(Level.INFO,arrayHouses.get(i).getApartmentsObj().getSpace());
								 logger.log(Level.INFO,HOWFEES);
								 logger.log(Level.INFO,"{0}",arrayHouses.get(i).getApartmentsObj().getMonthlyFee());
								 logger.log(Level.INFO,ELEANDWAT);
								 logger.log(Level.INFO,"{0}",arrayHouses.get(i).getApartmentsObj().getFeesIncludeWaterElectricity());
								 logger.log(Level.INFO,INTERNET);
								 logger.log(Level.INFO,"{0}",arrayHouses.get(i).getApartmentsObj().getFreeInternet());
								 logger.log(Level.INFO, CARPARK);
								 logger.log(Level.INFO,"{0}",arrayHouses.get(i).getResidenceObj().getAvailableParking());
								 logger.log(Level.INFO,ELEVATOR);
								 logger.log(Level.INFO,"{0}", arrayHouses.get(i).getResidenceObj().getElevatorAvailable());
									
								 logger.log(Level.INFO,"Enter y if you accept to add this house and n if you reject : ");
									acc = myInput.next();
									acceptAndReject(acc,arrayHouses.get(i));
							 } 
						 
						 break; 
					 case 2:
						 showAdvertisedHouses();
						 break; 
					 case 3:
						 House houseOne = enterInformation();
							addHouse(houseOne,ADMIN);
						 break; 
					 case 4:
						 watchingReservations();
						 break; 	 
					 case 5:
						 
						 break; 
					 default: 
						 logger.log(Level.INFO,ENTRYERROR);
						    break;
						 
					 } 
			 }	
			 while(in!=5);
		 }
		 else if (type.equals(TENANT)) {
			 do { 
				 logger.log(Level.INFO," ((( tenants menu ))) : ");
				 logger.log(Level.INFO,"1-view the available housing \n2- view pictures of housing and other information\n3-control panel\n4-book accommodation\n5-AddFurniture\n6- Show Furniture \n7-see the neighbours \n8- Exit");
				 in = myInput.nextInt();
					 switch(in) {
					 case 1:
						 viewAvailableHousing();
						 break; 
					 case 2:
						 viewPicturesAndInformation();
						 break; 
					 case 3:
						 menu();
						 int num =myInput.nextInt();
						 switch(num) {
						 case 1: 
							 showTenant(username);
							 break;
						 case 2:
							 showOwnerInformation(username);
							 break;		
						 case 3:
							 payment(username);
							 break;
						 default: 
							 logger.log(Level.INFO,ENTRYERROR);
							    break;
						 }; 
						  break;
					
						 case 4:
							 logger.log(Level.INFO,"enter id hous to booked");

								for(int i=0 ; i< advertisedHouses.size() ; i++) {
									 if(advertisedHouses.get(i).getAvailabilityStatus() ) {
										 logger.log(Level.INFO,"{0}", advertisedHouses.get(i).getId());
										 logger.log(Level.INFO,	" || ");
							  
									 }}
								Scanner input2 = new Scanner(System.in);
							 	int id = input2.nextInt();

							 	bookAccommodation(id,username);
						 break;
						 case 5:
							 Scanner inp = new Scanner(System.in);

							 logger.log(Level.INFO,"Enter your Furniture to add  please");
								String	furniture = inp.next();
								addFurniture(furniture,username);
							 break;
							 
						 case 6 :
							 showFurniture(username);
							 break;
						 case 7 :
							 seeNeighbours(username);
							 break;
						 case 8:
							 break;
						 default: 
							 logger.log(Level.INFO,ENTRYERROR);
							    break;
					  }; 
					
			 } while(in!=8);
		 }
	 }

		public static boolean addHouse(House houseOne,String type) {
			if(type.equals(OWNER)) {
				arrayHouses.add(houseOne);
			}
			else if(type.equals(ADMIN)) {
				advertisedHouses.add(houseOne);
			}
			
			logger.log(Level.INFO,"*******House has been added successfully*******");
			return true;
		}

		public static boolean modifyInformation(int houseId , int num , String newValue) {
			House houseOne = new House();
			houseOne=arrayHouses.get(houseId-1);

			switch (num) { 
			case 1:
				houseOne.getResidenceObj().setName(newValue);
				break;
			case 2:
				houseOne.getResidenceObj().setLocation(newValue);
				break;
			case 3:
				houseOne.getResidenceObj().setNumberFloors(Integer.parseInt(newValue));
				break;
			case 4:
				houseOne.getResidenceObj().setNumberApartmentsFloor(Integer.parseInt(newValue));
				break;
			case 5:
				houseOne.getApartmentsObj().setNumber(Integer.parseInt(newValue));
				break;
			case 6:
				houseOne.getApartmentsObj().setWhichFloor(Integer.parseInt(newValue));
				break;
			case 7:
				houseOne.getApartmentsObj().setNumberPerson(Integer.parseInt(newValue));
				break;
			case 8:
				houseOne.getApartmentsObj().setSpace(newValue);
				break;
			case 9:
				houseOne.getApartmentsObj().setWhichFloor(Integer.parseInt(newValue));
				break;
			case 10:
				houseOne.getApartmentsObj().setFeesIncludeWaterElectricity(Boolean.parseBoolean(newValue));
				break;
			case 11:
				houseOne.getApartmentsObj().setFreeInternet(Boolean.parseBoolean(newValue));
				break;
			case 12:
				houseOne.getResidenceObj().setAvailableParking(Boolean.parseBoolean(newValue));
				break;
			case 13:
				houseOne.getResidenceObj().setElevatorAvailable(Boolean.parseBoolean(newValue));
				break;
			case 14:
				houseOne.getApartmentsObj().setPhoto(newValue);
				break;
			 default: 
				 logger.log(Level.INFO,ENTRYERROR);
				    break;
			}
		
			arrayHouses.set(houseId-1,houseOne);
			logger.log(Level.INFO,"Modify information successfully");
			return true;		
		}
		
		public static boolean showHouse() {
			for(int i=0;i<arrayHouses.size();i++) {
				logger.log(Level.INFO,HOUSEID );
				logger.log(Level.INFO,"{0}",arrayHouses.get(i).getId() );
				logger.log(Level.INFO,HOUSEINF);
				logger.log(Level.INFO,RESNAME );
				logger.log(Level.INFO,arrayHouses.get(i).getResidenceObj().getName());
				logger.log(Level.INFO,LOCATION );
				logger.log(Level.INFO,arrayHouses.get(i).getResidenceObj().getLocation());
				logger.log(Level.INFO,NUMFLOORS);
				logger.log(Level.INFO,"{0}",arrayHouses.get(i).getResidenceObj().getNumberFloors());
				logger.log(Level.INFO,HOWAPARTMENTS);
				logger.log(Level.INFO,"{0}",arrayHouses.get(i).getResidenceObj().getNumberApartmentsFloor());
				logger.log(Level.INFO,NUMAPPARTMENT);
				logger.log(Level.INFO,"{0}",arrayHouses.get(i).getApartmentsObj().getNumber());
				logger.log(Level.INFO,WHATFLOOR);
				logger.log(Level.INFO,"{0}",arrayHouses.get(i).getApartmentsObj().getWhichFloor());
				logger.log(Level.INFO,HOWPEOPLE);
				logger.log(Level.INFO,"{0}",arrayHouses.get(i).getApartmentsObj().getNumberPerson());
				logger.log(Level.INFO,HOWSPACE);
				logger.log(Level.INFO,arrayHouses.get(i).getApartmentsObj().getSpace());
				logger.log(Level.INFO,HOWFEES);
				logger.log(Level.INFO,"{0}",arrayHouses.get(i).getApartmentsObj().getMonthlyFee());
				logger.log(Level.INFO,ELEANDWAT);
				logger.log(Level.INFO,"{0}",arrayHouses.get(i).getApartmentsObj().getFeesIncludeWaterElectricity());
				logger.log(Level.INFO,INTERNET);
				logger.log(Level.INFO,"{0}",arrayHouses.get(i).getApartmentsObj().getFreeInternet());
				logger.log(Level.INFO,CARPARK);
				logger.log(Level.INFO,"{0}",arrayHouses.get(i).getResidenceObj().getAvailableParking());
				logger.log(Level.INFO,ELEVATOR);
				logger.log(Level.INFO,"{0}",arrayHouses.get(i).getResidenceObj().getElevatorAvailable());
			}
			logger.log(Level.INFO,"***The array is empty***");
			return true;
		}
		
		
		public static boolean  controlPanel(String userName) {
			for(int i=0;i<advertisedHouses.size();i++) {
				if(userName.equals(advertisedHouses.get(i).getOwnerObj().getName())) {
					logger.log(Level.INFO,HOUSEID);
					logger.log(Level.INFO,"{0}",advertisedHouses.get(i).getId() );
					logger.log(Level.INFO,"Architecture name : " );
					logger.log(Level.INFO,advertisedHouses.get(i).getResidenceObj().getName() );
					logger.log(Level.INFO,"The apartment is located on the floor : " );
					logger.log(Level.INFO,"{0}",advertisedHouses.get(i).getResidenceObj().getNumberFloors() );
					logger.log(Level.INFO,"This apartment is located on the floor:");
					logger.log(Level.INFO,"{0}",advertisedHouses.get(i).getApartmentsObj().getWhichFloor());
					logger.log(Level.INFO,"It contains a number of bedrooms:");
					logger.log(Level.INFO,"{0}",advertisedHouses.get(i).getApartmentsObj().getBedroomNumber());
					logger.log(Level.INFO,"Number of bathrooms:");
					logger.log(Level.INFO,"{0}",advertisedHouses.get(i).getApartmentsObj().getBathroomsNumber());
					logger.log(Level.INFO,"balcony number:");
					logger.log(Level.INFO,"{0}",advertisedHouses.get(i).getApartmentsObj().getBalconyNumber());
					logger.log(Level.INFO,"The tenants are:");
				for(int k =0 ; k<getIdAndTennantlist().size() ; k++) {
					if(getIdAndTennantlist().get(k).gethousingId() == advertisedHouses.get(i).getId()) {
						logger.log(Level.INFO,getIdAndTennantlist().get(k).getTenants());
						for(int h=0 ; h<getTenantList().size() ; h++ ) {
							if(getTenantList().get(h).getName().equals(getIdAndTennantlist().get(k).getTenants())) {
								logger.log(Level.INFO,"\t");
								logger.log(Level.INFO,getTenantList().get(h).getPhone());
							}
						}
					}
				}
				}
			}
			return true;
			
		}

		
		public static Boolean acceptAndReject(String s ,House housing){
			
			if(s.equals("y")) {advertisedHouses.add(housing); 
			arrayHouses.remove (housing); 
			logger.log(Level.INFO,"*********done successfully********* ");
			return true;
			}
			else if(s.equals("n")) {arrayHouses.remove (housing);
			logger.log(Level.INFO,"*********Not added*********");
			return false;
			}
			else {
				logger.log(Level.INFO,"Enter true value !!!");
			}
			logger.log(Level.INFO,"*********Not added*********");
			return false;
			}

		public static boolean showAdvertisedHouses() {
			for(int i=0;i<advertisedHouses.size();i++) {
				logger.log(Level.INFO,HOUSEINF);
				logger.log(Level.INFO,RESNAME );
				logger.log(Level.INFO,advertisedHouses.get(i).getResidenceObj().getName());
				logger.log(Level.INFO,LOCATION );
				logger.log(Level.INFO,advertisedHouses.get(i).getResidenceObj().getLocation()); 
				logger.log(Level.INFO,NUMFLOORS);
				logger.log(Level.INFO,"{0}",advertisedHouses.get(i).getResidenceObj().getNumberFloors());
				logger.log(Level.INFO,HOWAPARTMENTS);
				logger.log(Level.INFO,"{0}",advertisedHouses.get(i).getResidenceObj().getNumberApartmentsFloor());
				logger.log(Level.INFO,NUMAPPARTMENT);
				logger.log(Level.INFO,"{0}",advertisedHouses.get(i).getApartmentsObj().getNumber());
				logger.log(Level.INFO,WHATFLOOR);
				logger.log(Level.INFO,"{0}",advertisedHouses.get(i).getApartmentsObj().getWhichFloor());
				logger.log(Level.INFO,HOWPEOPLE);
				logger.log(Level.INFO,"{0}",advertisedHouses.get(i).getApartmentsObj().getNumberPerson());
				logger.log(Level.INFO,HOWSPACE);
				logger.log(Level.INFO,advertisedHouses.get(i).getApartmentsObj().getSpace());
				logger.log(Level.INFO,HOWFEES);
				logger.log(Level.INFO,"{0}",advertisedHouses.get(i).getApartmentsObj().getMonthlyFee());
				logger.log(Level.INFO,ELEANDWAT);
				logger.log(Level.INFO,"{0}",advertisedHouses.get(i).getApartmentsObj().getFeesIncludeWaterElectricity());
				logger.log(Level.INFO,INTERNET);
				logger.log(Level.INFO,"{0}",advertisedHouses.get(i).getApartmentsObj().getFreeInternet());
				logger.log(Level.INFO,CARPARK);
				logger.log(Level.INFO,"{0}",advertisedHouses.get(i).getResidenceObj().getAvailableParking());
				logger.log(Level.INFO,ELEVATOR);
				logger.log(Level.INFO,"{0}",advertisedHouses.get(i).getResidenceObj().getElevatorAvailable());
			}
			logger.log(Level.INFO,"***The array is empty***");
			return true;
		}
		
		
		public static boolean watchingReservations() {
			for(int i=0 ; i<getIdAndTennantlist().size() ; i++) {
				
				logger.log(Level.INFO, "housing Id is : ");
				logger.log(Level.INFO,"{0}",getIdAndTennantlist().get(i).gethousingId());
				logger.log(Level.INFO, "Who is the tenant : ");
				logger.log(Level.INFO,"{0}",getIdAndTennantlist().get(i).getTenants());
			}
			
			return true;
			
		}
		public static boolean viewAvailableHousing(){
			if(advertisedHouses.isEmpty()) {logger.log(Level.INFO,"***There are no homes available***"); return false;}
			logger.log(Level.INFO,"The available housing : ");
			for(int i=0;i<advertisedHouses.size();i++) {
				 if(advertisedHouses.get(i).getAvailabilityStatus()) {
					logger.log(Level.INFO,"name of Residence : " );
					logger.log(Level.INFO,"{0}",advertisedHouses.get(i).getResidenceObj().getName());
					logger.log(Level.INFO," \nthe location of the Residence : " );
					logger.log(Level.INFO,"{0}",advertisedHouses.get(i).getResidenceObj().getLocation() );
					logger.log(Level.INFO,"the number of the apartment : ");
					logger.log(Level.INFO,"{0}",advertisedHouses.get(i).getApartmentsObj().getNumber());
				 } 
			 }
			
			 return true;
		}
		
		public static boolean viewPicturesAndInformation(){
			for(int i=0;i<advertisedHouses.size();i++) {
				 if(advertisedHouses.get(i).getAvailabilityStatus()) {
					 logger.log(Level.INFO,HOUSEINF);
					 logger.log(Level.INFO,RESNAME );
					 logger.log(Level.INFO,advertisedHouses.get(i).getResidenceObj().getName());
					 logger.log(Level.INFO,LOCATION );
					 logger.log(Level.INFO,advertisedHouses.get(i).getResidenceObj().getLocation() );
					 logger.log(Level.INFO,NUMFLOORS);
					 logger.log(Level.INFO,"{0}",advertisedHouses.get(i).getResidenceObj().getNumberFloors());
					 logger.log(Level.INFO,HOWAPARTMENTS);
					 logger.log(Level.INFO,"{0}",advertisedHouses.get(i).getResidenceObj().getNumberApartmentsFloor());
					 logger.log(Level.INFO,NUMAPPARTMENT);
					 logger.log(Level.INFO,"{0}",advertisedHouses.get(i).getApartmentsObj().getNumber());
					 logger.log(Level.INFO,WHATFLOOR);
					 logger.log(Level.INFO,"{0}",advertisedHouses.get(i).getApartmentsObj().getWhichFloor());
					 logger.log(Level.INFO,HOWPEOPLE);
					 logger.log(Level.INFO,"{0}",advertisedHouses.get(i).getApartmentsObj().getNumberPerson());
					 logger.log(Level.INFO,HOWSPACE);
					 logger.log(Level.INFO,advertisedHouses.get(i).getApartmentsObj().getSpace());
					 logger.log(Level.INFO,HOWFEES);
					 logger.log(Level.INFO,"{0}",advertisedHouses.get(i).getApartmentsObj().getMonthlyFee());
					 logger.log(Level.INFO,ELEANDWAT);
					 logger.log(Level.INFO,"{0}",advertisedHouses.get(i).getApartmentsObj().getFeesIncludeWaterElectricity());
					 logger.log(Level.INFO,INTERNET);
					 logger.log(Level.INFO,"{0}",advertisedHouses.get(i).getApartmentsObj().getFreeInternet());
					 logger.log(Level.INFO,CARPARK);
					 logger.log(Level.INFO,"{0}",advertisedHouses.get(i).getResidenceObj().getAvailableParking());
					 logger.log(Level.INFO,ELEVATOR);
					 logger.log(Level.INFO,"{0}",advertisedHouses.get(i).getResidenceObj().getElevatorAvailable());
					 logger.log(Level.INFO,"14-Image link for the apartment");
							 logger.log(Level.INFO,advertisedHouses.get(i).getApartmentsObj().getPhoto());
					 logger.log(Level.INFO,"** This house is available **");
				 }
			 }
			return true;
		}
		
		public static void fullTenantList() {
			Tenant tenant1=new Tenant("mayar","0569902837",19,"enj",true,"12-4-2023");
			Tenant tenant2=new Tenant("osama","0569834654",19,"enj",true,"12-4-2023");
			getTenantList().add(tenant1);
			getTenantList().add(tenant2);
			
		
		}
		
		public static Boolean addFurniture(String furniture , String tenantName){
			 for ( int i=0; i <getTenantList().size(); i++ ) {
				 if (tenantName.equals(getTenantList().get(i).getName())){
					 getTenantList().get(i).setFurniture(furniture);
					 logger.log(Level.INFO,"done");
					 return true;
				 }
			 }
			 return false;
		 }
		public static boolean showTenant(String name){
			 for ( int i=0; i <getTenantList().size(); i++ ) {
			if(getTenantList().get(i).getName().equals(name)){
				logger.log(Level.INFO," the tenat information is : ");
				logger.log(Level.INFO,"Name : " );
				logger.log(Level.INFO,getTenantList().get(i).getName());
				logger.log(Level.INFO,"phone : " );
				logger.log(Level.INFO,getTenantList().get(i).getPhone());
				logger.log(Level.INFO,"Age : " );
				logger.log(Level.INFO,"{0}",getTenantList().get(i).getAge());
				logger.log(Level.INFO,"major : " );
				logger.log(Level.INFO,getTenantList().get(i).getMajor());
				logger.log(Level.INFO,"he is a student  : " );
				logger.log(Level.INFO,"{0}",getTenantList().get(i).getIsStudent());
				logger.log(Level.INFO,"furniture : " );
				logger.log(Level.INFO,getTenantList().get(i).getFurniture());

			}
			 }
			return true;
		}
		public  static boolean seeNeighbours(String username2) {
			for ( int i=0; i <getTenantList().size(); i++ ) {
				 if (username2.equals(getTenantList().get(i).getName())){
					 if(getTenantList().get(i).getIsStudent()) {
						 logger.log(Level.INFO,"your neighbours : ");
							for ( int j=0; j<getTenantList().size(); j++ ) {
								if( i!=j ){
									 if(getTenantList().get(j).getIsStudent()) {
										 logger.log(Level.INFO, getTenantList().get(j).getName());
										 logger.log(Level.INFO,"major :" );
										 logger.log(Level.INFO,getTenantList().get(j).getMajor());
										 logger.log(Level.INFO,  "phone :" );
										 logger.log(Level.INFO,getTenantList().get(j).getPhone());
									 }
										}
							
										}
							return true;
					 }
				 }
				}
			return false ;
		}


		public  static boolean showFurniture(String username2) {
			 for ( int i=0; i <getTenantList().size(); i++ ) {
				 if (username2.equals(getTenantList().get(i).getName())){
					 logger.log(Level.INFO,"furniture : " );
					 logger.log(Level.INFO,getTenantList().get(i).getFurniture());
					 return true;
				 }
			 }
			return false;
			}
		public static void payment(String name){
			int fee;
			 for ( int i=0; i <getIdAndTennantlist().size(); i++ ){
				 if(getIdAndTennantlist().get(i).getTenants().equals(name) ) {
						fee= advertisedHouses.get(i).getApartmentsObj().getMonthlyFee();
						
						logger.log(Level.INFO,"fee: " );
						logger.log(Level.INFO,"{0}",fee);	
						logger.log(Level.INFO,"do you want to pay , Enter the letter Y=Yes or N=No only");	
			 String aa=myInput.next();
			 paymentt(aa,name);
				 }
					}
			
		}
		
		public static boolean paymentt(String aa,String name){
			switch(aa) {
			 case "y":
				 logger.log(Level.INFO,"fees payed successfully \npayred date : ");
				 for (int j=0; j<getTenantList().size();j++ ) {
					 if (getTenantList().get(j).getName().equals(name)) {
						 logger.log(Level.INFO,getTenantList().get(j).getPayDate());
					 }
				 }
				 break;
			 case "n":
				 logger.log(Level.INFO,"please pay soon ");
				 break;
			 default: 
				 logger.log(Level.INFO,ENTRYERROR);
				    break; 
			 }
			return true;
		}
		public static void menu() {
			logger.log(Level.INFO," Choose one of these options : ");
			logger.log(Level.INFO," 1- Tenant Information ");
			logger.log(Level.INFO," 2- Informations about Owner and how to Contact ");
			logger.log(Level.INFO," 3- the Rent and when to pay  ");
}	
		public static boolean showOwnerInformation(String username) {
			int iDHouse =0;
			for(int i=0 ; i< getIdAndTennantlist().size() ; i++) {
				 if(getIdAndTennantlist().get(i).getTenants().equals(username) ) {
					 iDHouse=getIdAndTennantlist().get(i).gethousingId();
				 }
			}
			for (int i=0 ; i<advertisedHouses.size() ; i++){
			if (advertisedHouses.get(i).getId()==iDHouse) {

				logger.log(Level.INFO," Owner name is  : " );
				logger.log(Level.INFO,advertisedHouses.get(i).getOwnerObj().getName());
				logger.log(Level.INFO," Owner phone number is  : " );
				logger.log(Level.INFO,advertisedHouses.get(i).getOwnerObj().getPhoneNumber());
			}
			} 
			return true;
		}
	
		public static boolean bookAccommodation(int id,String n) {
			 boolean flagRet=false;
			for(int i=0 ; i< advertisedHouses.size() ; i++) {
				 if(advertisedHouses.get(i).getId() == id ) {	
					 if(advertisedHouses.get(i).getAvailabilityStatus() ) {
						 counter=counter+1;
						  flagRet=true;	 
						  IdAndTennant t = new IdAndTennant(id,n);
						  getIdAndTennantlist().add(t);
						  logger.log(Level.INFO,"The house has been booked");						
						  if(advertisedHouses.get(i).getApartmentsObj().getNumberPerson() == counter) {
							  advertisedHouses.get(i).setAvailabilityStatus(false);
							  
						  }
						  
					  }
					  else	{
						  flagRet=false;
						  logger.log(Level.INFO,"This house is Non available"); }

					  }
					 }
			return flagRet;
								 
				}

		public static ArrayList<Tenant> getTenantList() {
			return tenantList;
		}

		public static void setTenantList(ArrayList<Tenant> tenantList) {
			Main.tenantList = tenantList;
		}

		public static ArrayList <IdAndTennant> getIdAndTennantlist() {
			return idAndTennantlist;
		}

		public static void setIdAndTennantlist(ArrayList <IdAndTennant> idAndTennantlist) {
			Main.idAndTennantlist = idAndTennantlist;
		}
		
		
		
}
