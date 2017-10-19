package Zad1;

import java.util.Random;
import java.util.TreeSet;

public class RandomNumbers {

    public static void main(String[] args) {

        TreeSet<Integer> radomIntSet = new TreeSet<>();
        Random generator = new Random();
        double sum = 0;
        int count = 0;

        for (int i = 0; i < 8; i++) {

            int x = generator.nextInt(1000);
            if (radomIntSet.contains(x)) {
                i--;
            } else {
                radomIntSet.add(x);
                sum += x;
                count++;
            }
        }

        System.out.println(radomIntSet);
        System.out.println("Najmniejsza liczba to: " + radomIntSet.first());
        System.out.println("Najwieksza liczba to: " + radomIntSet.last());
        System.out.println("Srednia to: " + sum / count);
        System.out.println("Liczby wieksze od sredniej to: ");

        for (Integer num : radomIntSet) {
            if (num > (sum / count)) {
                System.out.print(num + "; ");
            }
        }
    }
}