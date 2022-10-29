package com.company;
import java.util.Scanner;
import java.util.LinkedList;

public class hw3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        LinkedList<Integer> list = new LinkedList<> ();
        while (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            for (int i = 0; i < list.size(); i++)
                if (input == list.get (i)) {
                    list.remove (i);
                    break;
                }
            list.addFirst (input);
        }
        System.out.println (list);
    }
}
