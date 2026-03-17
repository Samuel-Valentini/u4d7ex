package ex1;

import java.util.*;

public class MainEx1 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStrings;

        while (true) {
            System.out.println("Inserisci un intero positivo che indichi quante parole vuoi inserire, i valori negativi verranno resi positivi");
            try {
                numberOfStrings = Math.abs(Integer.parseInt(scanner.nextLine()));
                break;

            } catch (NumberFormatException e) {
                System.out.println("Numero non riconosciuto, riprova");
            }
        }

        System.out.println("Hai deciso di inserire " + numberOfStrings + " elementi.");
        List<String> arrayOfWords = new ArrayList<>();

        for (int i = 0; i < numberOfStrings; i++) {
            String word;
            while (true) {
                System.out.println("Inserisci la parola numero " + (i + 1) + " :");
                try {
                    word = scanner.nextLine();
                    arrayOfWords.add(word);
                    break;

                } catch (RuntimeException e) {
                    System.out.println("Parola non accettata, riprova");
                }

            }
        }
        System.out.println("Le parole scelte sono: " + arrayOfWords);

        Map<String, Integer> counters = new HashMap<>();

        for (String word : arrayOfWords) {
            counters.put(word, counters.getOrDefault(word, 0) + 1);
        }

        HashSet<String> uniqueWords = new HashSet<>();
        uniqueWords.addAll(arrayOfWords);
        int counterDupl = 0;
        int counterSingl = 0;

        System.out.println("Le parole duplicate sono: ");

        for (String uniqueWord : uniqueWords) {
            if (counters.get(uniqueWord) > 1) {
                System.out.println(uniqueWord + " - numero di ricorrenze: " + counters.get(uniqueWord));
                counterDupl += 1;
            }
        }

        System.out.println("Le parole, senza contare i duplicati, sono " + uniqueWords.size() + ":");
        for (String uniqueWord : uniqueWords) {
            System.out.println(uniqueWord);
        }

        System.out.println("Le parole che compaiono una sola volta sono:");
        for (String uniqueWord : uniqueWords) {
            if (counters.get(uniqueWord) == 1) {
                System.out.println(uniqueWord);
                counterSingl += 1;
            }
        }

        System.out.println("Quindi c'era" + (counterDupl == 1 ? " " : "no ") + counterDupl + (counterDupl == 1 ? " parola che compariva" : "parole che comparivano") + " più di una volta e " + counterSingl + (counterSingl == 1 ? " parola che compariva" : "parole che comparivano") + " solo una volta.");
    }

}



