package ex3;

import java.util.HashMap;
import java.util.Set;

public class MainEx3 {

    static HashMap<String, String> telephoneBook = new HashMap<>();

    static void main(String[] args) {

        newRecord("Gino", "00032434");
        newRecord("Antonio", "847354748");

        System.out.println(telephoneBook);

        deleteRecord("Antonio");

        System.out.println(telephoneBook);

        System.out.println(searchByNumber("00032434"));
        System.out.println(searchByName("Gino"));
        print();


    }

    static void newRecord(String name, String phoneNumber) {
        telephoneBook.put(name, phoneNumber);
    }

    static void deleteRecord(String name) {
        telephoneBook.remove(name);
    }

    static String searchByNumber(String phoneNumber) {
        if (telephoneBook.containsValue(phoneNumber)) {
            Set<String> names = telephoneBook.keySet();
            for (String name : names) {
                if (phoneNumber.equals(telephoneBook.get(name))) return name;

            }
        } else {
            System.out.println("Numero non trovato");
            return "Numero non trovato";
        }

        return "Numero non trovato";
    }

    public static String searchByName(String name) {
        return telephoneBook.get(name);
    }

    public static void print() {
        System.out.println(telephoneBook);
    }

}
