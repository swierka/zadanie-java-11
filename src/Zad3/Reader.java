package Zad3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Reader {

    private File file = new File("Liczby.txt");
    private int key;
    private int value;

    public void fileReader(TreeMap<Integer, Integer> myMap) {

        try (
                Scanner scanner = new Scanner(file);
        ) {
            while (scanner.hasNextLine()) {
                int i = scanner.nextInt();
                myMap.put(i, myMap.get(i) == null ? 1 : myMap.get(i) + 1);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku o nazwie " + file);
        }
    }

    public void printMap(Map<Integer, Integer> myMap) {

        for (Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
            key = entry.getKey();
            value = entry.getValue();
            System.out.println(key + " - liczba wystapien: " + value);
        }
    }
}
