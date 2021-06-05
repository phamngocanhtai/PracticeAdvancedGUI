package com.example.practiceadvancedgui.swiperefreshlayout;

import java.util.ArrayList;
import java.util.Random;

public class Contact {

    String name;
    int avatar;

    public Contact(String name, int avatar) {
        this.name = name;
        this.avatar = avatar;
    }

    public static ArrayList<Contact> getMockData() {

        ArrayList<Contact> contacts = new ArrayList<>();

        String [] name = {"Aaa", "Bbb", "Ccc", "Ddd", "Eee", "Fff", "Ggg", "Hhh", "Iii", "Jjj", "Lll", "Kkk"};

        Random random = new Random();

        for(int i = 0; i <name.length; i++)
        {
            contacts.add(new Contact(name[i], random.nextInt(4)));
        }
        return contacts;
    }
}
