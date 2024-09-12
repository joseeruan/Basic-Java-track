package edu.jose.set.search;

import java.util.HashSet;
import java.util.Set;

public class ContactBook {
    private Set<Contact> contactSet;

    public ContactBook() {
        this.contactSet = new HashSet<>();
    }

    public void addContact(String name, int phoneNumber) {
        Contact contact = new Contact(name, phoneNumber);
        contactSet.add(contact);
    }

    public Set<Contact> searchContactsByName(String name) {
        Set<Contact> auxContactSet = new HashSet<>();

        if(!this.contactSet.isEmpty()) {
            for(Contact contact : this.contactSet) {
                if(contact.getName().startsWith(name)) {
                    auxContactSet.add(contact);
                }
            }
            return auxContactSet;
        }
        else {
            throw new RuntimeException("This set is empty.");
        }
    }

    public void updatePhoneNumber(String name, int phoneNumber) {
        if(!contactSet.isEmpty()) {
            for(Contact contact: contactSet) {
                if(contact.getName().equalsIgnoreCase(name)) {
                    contact.setPhoneNumber(phoneNumber);
                }
            }
        }
    }

    public void showContacts() {
        if (!contactSet.isEmpty()) {
            System.out.println(contactSet);
        }
        else {
            System.out.println("This set is empty.");
        }
    }

    public static void main(String[] args) {
        ContactBook contactbook = new ContactBook();

        contactbook.addContact("Jose", 100);
        contactbook.addContact("Lionel", 100242323);
        contactbook.addContact("Lionel", 10092325);
        contactbook.addContact("Maria", 12121);
        contactbook.addContact("Maria Fernandes", 2323232);

        contactbook.showContacts();

        System.out.println(contactbook.searchContactsByName("Lionel") + "\n");

        contactbook.updatePhoneNumber("Lionel", 1000000);
        contactbook.showContacts();
    }
}
