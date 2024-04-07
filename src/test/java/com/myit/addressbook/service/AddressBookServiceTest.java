package com.myit.addressbook.service;

import com.myit.addressbook.model.Contact;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AddressBookServiceTest {

    private AddressBookService addressBookService;

    @BeforeEach
    public void setUp() {
        addressBookService = new AddressBookService();
    }

    @Test
    public void testAddContact() {
        Contact contact = new Contact("John", "Doe", "1234567890", "john@example.com");
        addressBookService.addContact(contact);

        Assertions.assertEquals(1, addressBookService.getContacts().size());
    }
}
