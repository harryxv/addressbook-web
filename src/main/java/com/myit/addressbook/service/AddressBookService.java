package com.myit.addressbook.service;

import com.myit.addressbook.model.Contact;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class AddressBookService {
    private Set<Contact> contacts;

    public AddressBookService() {
        contacts = new HashSet<>();
        contacts.addAll(Arrays.asList(
                new Contact("John", "Doe", "1234567890", "john@example.com"),
                new Contact("Jane", "Smith", "0987654321", "jane@example.com")
        ));
    }

    // Add logic to retrieve contacts from the database or any other data source
    // For simplicity, we'll create a sample list of contacts
    public Set<Contact> getContacts() {
        return this.contacts;
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    // Implement updateContact, deleteContact methods
}

