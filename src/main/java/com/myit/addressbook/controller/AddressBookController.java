package com.myit.addressbook.controller;

import com.myit.addressbook.model.Contact;
import com.myit.addressbook.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AddressBookController {
    @Autowired
    private AddressBookService addressBookService;

    @GetMapping("/")
    public String showAddressBook(Model model) {
        List<Contact> contacts = addressBookService.getContacts();
        model.addAttribute("contacts", contacts);
        return "addressbook";
    }
}