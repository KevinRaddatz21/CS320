package test;
import contact.Contact;
import contact.ContactService;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest extends ContactService{

	@Test
	void testUpdateName() {
		Contact newContact = new Contact("123", "Kevin", "Raddatz", "123456", "Address"); 
		String newFirstName = "Name"; 		
		updateFirstName(newContact.getContactID(), newFirstName );	
	}
	@Test
	void testDeleteContact() {
		Contact newContact = new Contact("123", "Kevin", "Raddatz", "123456", "Address");
		removeContact("123"); 				
	}
	@Test
	void testAddContact() {
		newContact("123", "Kevin", "Raddatz", "123456", "Address");
	}


}
