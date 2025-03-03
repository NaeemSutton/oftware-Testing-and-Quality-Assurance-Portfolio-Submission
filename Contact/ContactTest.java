package com.contactservice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {

    @Test
    public void testCreateValidContactForUser() {
        Contact contact = new Contact("A001", "Alex", "Johnson", "9876543210", "123 User Lane");
        assertEquals("Alex", contact.getFirstName());
        assertEquals("Johnson", contact.getLastName());
        assertEquals("9876543210", contact.getPhone());
        assertEquals("123 User Lane", contact.getAddress());
    }

    @Test
    public void testInvalidContactCreationWithNullValues() {
        assertThrows(IllegalArgumentException.class, 
            () -> new Contact(null, "Alex", "Johnson", "9876543210", "123 User Lane"), 
            "Expected IllegalArgumentException for null contactId"
        );

        assertThrows(IllegalArgumentException.class, 
            () -> new Contact("A0012345678", "Alex", "Johnson", "9876543210", "123 User Lane"), 
            "Expected IllegalArgumentException for contactId longer than 10 characters"
        );
    }


    @Test
    public void testUpdatingContactFieldsThrowsExceptions() {
        Contact contact = new Contact("A001", "Alex", "Johnson", "9876543210", "123 User Lane");
        assertThrows(IllegalArgumentException.class, () -> contact.setFirstName(null));
        assertThrows(IllegalArgumentException.class, () -> contact.setPhone("1234")); // Invalid phone number
    }
}
