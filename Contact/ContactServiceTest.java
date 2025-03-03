package com.contactservice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {
    private ContactService contactService;

    @BeforeEach
    public void setup() {
        contactService = new ContactService();
    }

    @Test
    public void addingValidContact() {
        Contact contact = new Contact("001", "John", "Doe", "1234567890", "456 Oak Rd");
        contactService.addContact(contact);
        assertEquals(contact, contactService.getContact("001"));
    }

    @Test
    public void deletingContact() {
        Contact contact = new Contact("002", "Jane", "Doe", "9876543210", "789 Pine Ave");
        contactService.addContact(contact);
        contactService.deleteContact("002");
        assertNull(contactService.getContact("002"));
    }

    @Test
    public void updatingContactFields() {
        Contact contact = new Contact("003", "Bob", "Miller", "1112223333", "101 Birch Ln");
        contactService.addContact(contact);
        contactService.updateContact("003", "Bobby", null, "2223334444", null);
        Contact updatedContact = contactService.getContact("003");
        assertEquals("Bobby", updatedContact.getFirstName());
        assertEquals("2223334444", updatedContact.getPhone());
    }

    @Test
    public void invalidContactUpdates() {
        assertThrows(IllegalArgumentException.class, () -> contactService.updateContact("999", "New", "Name", "1234567890", "New Address"));
    }
}

