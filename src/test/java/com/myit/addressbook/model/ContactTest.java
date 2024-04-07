package com.myit.addressbook.model;

import com.myit.addressbook.model.Contact;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactTest {

    @Test
    public void testContact() {
        Contact contact = new Contact("John", "Doe", "1234567890", "john@example.com");

        assertEquals("John", contact.getFirstName());
        assertEquals("Doe", contact.getLastName());
        assertEquals("1234567890", contact.getTelephone());
        assertEquals("john@example.com", contact.getEmail());
    }
}