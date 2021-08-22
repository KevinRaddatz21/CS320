//Kevin Raddatz
//CS320 
//Milestone one

package contact; 

public class Contact {
	private String contactID; 
	private String firstName; 
	private String lastName; 
	private String phoneNumber;
	private String contactAddress; 


	public Contact(String contactID, String firstName, String lastName, String phoneNumber, String contactAddress){
		if(contactID == null || contactID.length() > 10 ) {
			throw new IllegalArgumentException("Invalid Contact ID"); 	
		}
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name"); 
		}
		if(phoneNumber == null || phoneNumber.length() > 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		if(contactAddress == null || contactAddress.length() > 30) {
			throw new IllegalArgumentException("Invalid Address"); 
		}
	}
	public String getContactID() {
		return contactID; 
	}
	public String getFirstName() {
		return firstName; 
	}
	public String getLastName() {
		return lastName; 
	}
	public String getPhoneNumber(){
		return phoneNumber; 
	}
	public String getContactAddress(){
		return contactAddress; 
	}
	
	public void setContactID(String ID) {
		contactID = ID; 
	}
	public void setFirstName(String fName){
		firstName = fName; 
	}
	public void setLastName(String lName){
		lastName = lName; 
	}
	public void setPhoneNumber(String number){
		phoneNumber = number; 
	}
	public void setContactAddress(String address){
		contactAddress = address; 
	}
		
}