package com.company;
import java.util.Scanner;
import java.util.LinkedList;

public class hw2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        LinkedList<String> list = new LinkedList<> ();

        for (String input = scanner.next(); !input.equalsIgnoreCase ("!"); input = scanner.next())
            list.add (input);

        System.out.println (list);

        for (String input = scanner.next(); !input.equalsIgnoreCase ("!"); input = scanner.next()) {
            for (String s : list)
                if (s.equals(input)) {
                    System.out.println ("hit");
                    break;
                }
        }
    }
}
