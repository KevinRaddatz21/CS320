//Kevin Raddatz
//CS320 
//Milestone one
package contact; 
import java.util.ArrayList; //Using ArrayList util to make things easier

public class ContactService{
	
		
	public String contactID; 
	private ArrayList<Contact> ContactList = new ArrayList<Contact>(); //Creates an arrayList of Contact Objects 
	private Contact newContact;
	
	public void newContact(String contactID, String firstName, String lastName, String phoneNumber, String Address){//Updating attributes for a new contact object 
		newContact = null; 
		newContact.setContactID(contactID); //Setting Attributes to newContact object
		newContact.setFirstName(firstName);
		newContact.setLastName(lastName);
		newContact.setPhoneNumber(phoneNumber);
		newContact.setContactAddress(Address);		
		ContactList.add(newContact); //Adding newContact to data structure	
	}
	public void updateFirstName(String contactID, String newFirstName){ //These Methods will allow the user to update Object Attributes in the data structure
		if(ContactList.contains(contactID)){
			Contact contact = ContactList.get(ContactList.indexOf(contactID)); 
			contact.setFirstName(newFirstName); 
		}
	}
	public void updateLastName(String contactID, String newLastName){
			if(ContactList.contains(contactID)){
				Contact contact = ContactList.get(ContactList.indexOf(contactID)); 
				contact.setLastName(newLastName); 
			}
	}
	public void updatePhoneNumber(String contactID, String newNumber){
			if(ContactList.contains(contactID)){
				Contact contact = ContactList.get(ContactList.indexOf(contactID)); 
				contact.setPhoneNumber(newNumber); 
			}
	}
	public void updateAddress(String contactID, String newAddress){
		if(ContactList.contains(contactID)){
			Contact contact = ContactList.get(ContactList.indexOf(contactID)); 
			contact.setContactAddress(newAddress); 
		}
}
	public void removeContact(String contactID) {
		if(ContactList.contains(contactID) == true) {
			ContactList.remove(ContactList.indexOf(contactID)); 
		}
			
		}
	}