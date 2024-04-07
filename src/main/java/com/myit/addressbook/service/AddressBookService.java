package com.myit.addressbook.service;

import com.myit.addressbook.model.Contact;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class AddressBookService {
    private List<Contact> contacts;

    public AddressBookService() {
        contacts = Arrays.asList(
                new Contact("John", "Doe", "1234567890", "john@example.com"),
                new Contact("Jane", "Smith", "0987654321", "jane@example.com")
        );
    }

    // Add logic to retrieve contacts from the database or any other data source
    // For simplicity, we'll create a sample list of contacts
    public List<Contact> getContacts() {
        return this.contacts;
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    // Implement updateContact, deleteContact methods
}

