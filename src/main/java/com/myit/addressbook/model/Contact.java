package com.myit.addressbook.model;

public class Contact implements Comparable<Contact> {
    private Integer id;
    private String firstName;
    private String lastName;
    private String telephone;
    private String email;

    public Contact() {
    }

    public Contact(String firstName, String lastName, String telephone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephone = telephone;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override  //must be consistent with equals
    public int compareTo(Contact o) {
        return (this.getFirstName() + this.getLastName() + this.getTelephone()).compareTo(o.getFirstName() + o.getLastName() + o.getTelephone());
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Contact)) {
            return false;
        }
        Contact that = (Contact) o;
        return (this.getFirstName().equals(that.getFirstName())) && (this.getLastName().equals(that.getLastName())) && (this.getTelephone().equals(that.getTelephone()));
    }

    @Override
    public int hashCode() {
        return (this.getFirstName() + this.getLastName() + this.getTelephone()).hashCode();
    }
}