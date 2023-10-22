package org.example;

import newpackage.Phone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Phone ph = new Phone();
    ph.addContact("Евгений","75385237235");
    ph.addContact("Евгений","75385875235");
    ph.addContact("Евгений","56778587235");
    ph.addContact("Евгений","25285872335");
    ph.addContact("Евгений","25685872735");
    ph.addContact("Евгений","25385632355");
    ph.addContact("Евгений","25385744235");
    ph.contactsPrint();
    }
}