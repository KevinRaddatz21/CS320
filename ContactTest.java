//Kevin Raddatz
//CS320
//Note: Thank You for linking the Video! It Was a HUGE Help.
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contact.Contact;

class ContactTest {

	@Test
	void testContact() {
		Contact newContact = new Contact("123", "Hello", "World", "7891011", "Address"); 
		assertTrue(newContact.getContactID().equals("123"));
		assertTrue(newContact.getFirstName().equals("Hello"));
		assertTrue(newContact.getLastName().equals("World"));
		assertTrue(newContact.getPhoneNumber().equals("7891011"));
		assertTrue(newContact.getContactAddress().equals("Address"));
	}
	void testContactTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Contact("12345678910", "Is This Too Long?", "Hello World", "012345678910","10 Java Lane Street Road"); 
		});
	}

}