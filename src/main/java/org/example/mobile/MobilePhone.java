package org.example.mobile;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    private String myNumber;
    private List<Contact> myContacts = new ArrayList<>();

    public String getMyNumber() {
        return myNumber;
    }

    public List<Contact> getMyContacts() {
        return myContacts;
    }

    public MobilePhone(String myNumber, List<Contact> myContacts) {
        this.myNumber = myNumber;
        this.myContacts = myContacts;
    }

    public boolean addNewContact(Contact contact) {
        if(myContacts.contains(contact)) {
            return false;
        } else {
            myContacts.add(contact);
            return true;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if(myContacts.contains(oldContact)) {
            int index = myContacts.indexOf(oldContact);
            myContacts.set(index, newContact);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeContact(Contact contact) {
        if(myContacts.contains(contact)) {
            myContacts.remove(contact);
            return true;
        } else {
            return false;
        }
    }

    public int findContact(Contact contact) {
        if(myContacts.contains(contact)) {
            int index = myContacts.indexOf(contact);
            return index;
        } else {
            return -1;
        }
    }

    public int findContact(String contact) {
        for(Contact list : myContacts) {
            if(list.getName().equals(contact)){
                return myContacts.indexOf(list);
            }
        }
        return -1;
    }

    public Contact queryContact(String contactName) {
        for(Contact list : myContacts) {
            if(list.getName().equals(contactName)){
                return list;
            }
        }
        return null;
    }

    public void printContact() {
        System.out.println("Contact List:");
        int count = 1;
        for(Contact contact : myContacts) {
            System.out.println(contact + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }
}
