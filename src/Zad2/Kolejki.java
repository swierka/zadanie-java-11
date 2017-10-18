package Zad2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Kolejki {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Queue<Integer> tenNumbersQueue = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj liczbe nr " + (i + 1));
            int x = scanner.nextInt();
            tenNumbersQueue.offer(x);
        }

        int sum = 0;
        while (tenNumbersQueue.peek() != null) {
            sum += tenNumbersQueue.peek();
            System.out.print(tenNumbersQueue.poll() + "+");
        }
        System.out.print("=" + sum);


        //        int sum = 0;
//        for(Integer num: tenNumbersQueue){
//            System.out.print(num+"+");
//            sum += num;
//        }
//        System.out.println("="+sum);
    }
}
