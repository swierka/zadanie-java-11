package Zad3;

import java.util.TreeMap;


public class Numbers {
    public static void main(String[] args) {

        TreeMap<Integer,Integer> myMap = new TreeMap<>();
        Reader reader = new Reader();
        reader.fileReader(myMap);

        Printer printer = new Printer();
        printer.printMap(myMap);
    }
}
