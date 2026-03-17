package ex3;

import java.util.HashMap;

public class MainEx3 {

    static HashMap<String, String> telephoneBook = new HashMap<>();

    static void main(String[] args) {

        newRecord("Gino", "00032434");
        newRecord("Antonio", "847354748");

        System.out.println(telephoneBook);

        deleteRecord("Antonio");

        System.out.println(telephoneBook);


    }

    static void newRecord(String name, String phoneNumber) {
        telephoneBook.put(name, phoneNumber);
    }

    static void deleteRecord(String name) {
        telephoneBook.remove(name);
    }
}
