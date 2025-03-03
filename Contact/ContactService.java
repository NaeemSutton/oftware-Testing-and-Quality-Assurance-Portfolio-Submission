package com.contactservice;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private final Map<String, Contact> contactRegistry = new HashMap<>();

    public void addContact(Contact contact) {
        if (contactRegistry.containsKey(contact.getContactId())) {
            throw new IllegalArgumentException("Duplicate contact ID not allowed.");
        }
        contactRegistry.put(contact.getContactId(), contact);
    }

    public void deleteContact(String contactId) {
        if (!contactRegistry.containsKey(contactId)) {
            throw new IllegalArgumentException("Contact ID not found.");
        }
        contactRegistry.remove(contactId);
    }

    public void updateContact(String contactId, String newFirstName, String newLastName, String newPhone, String newAddress) {
        Contact existingContact = contactRegistry.get(contactId);
        if (existingContact == null) {
            throw new IllegalArgumentException("No contact found with the given ID.");
        }

        if (newFirstName != null) {
            existingContact.setFirstName(newFirstName);
        }
        if (newLastName != null) {
            existingContact.setLastName(newLastName);
        }
        if (newPhone != null) {
            existingContact.setPhone(newPhone);
        }
        if (newAddress != null) {
            existingContact.setAddress(newAddress);
        }
    }

    public Contact getContact(String contactId) {
        return contactRegistry.get(contactId);
    }
}
