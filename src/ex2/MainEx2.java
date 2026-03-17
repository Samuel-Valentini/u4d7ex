package ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainEx2 {
    static void main(String[] args) {
        List<Integer> test = listOfRandomInteger(10);
        System.out.println(test);

        List<Integer> test2 = addAndReverse(test);
        System.out.println(test2);

        System.out.println("pari:");
        oddOrEvenPrint(test2, true);

        System.out.println("dispari:");
        oddOrEvenPrint(test2, false);


    }

    public static List<Integer> listOfRandomInteger(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add((int) (Math.random() * 101));
        }
        Collections.sort(list);
        return list;
    }

    public static List<Integer> addAndReverse(List<Integer> inputList) {
        List<Integer> newList = new ArrayList<>(inputList);
        for (int i = inputList.size() - 1; i >= 0; i--) {
            newList.add(inputList.get(i));
        }
        return newList;
    }

    public static void oddOrEvenPrint(List<Integer> inputList, boolean even) {
        // scegliamo di considerare i pari e dispari non in base all'indice ma alla posizione
        // effettiva: index 0 equivale alla posizione 1, quindi è dispari.
        if (!even) {
            for (int i = 0; i < inputList.size(); i++) {
                if (i % 2 == 0) {
                    System.out.println(inputList.get(i));
                }
            }
        } else {
            for (int i = 0; i < inputList.size(); i++) {
                if (i % 2 == 1) {
                    System.out.println(inputList.get(i));
                }
            }
        }
    }
}
