package com.example.gugau.sampleyoga2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Contact {
    private String mName;

    public Contact(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }


    private static int lastContactId = 0;

    public static ArrayList<Contact> createContactsList(int numContacts) {
        ArrayList<Contact> contacts = new ArrayList<Contact>();

        for (int i = 1; i <= numContacts; i++) {
            contacts.addAll(convert(new String[]{"Small", "Larger"}));
        }

        return contacts;
    }

    private static Collection<? extends Contact> convert(String[] strings) {
        List<Contact> contactList = new ArrayList<>();

        for (String string : strings) {
            Contact c = new Contact(string);
            contactList.add(c);
        }
        return contactList;
    }
}