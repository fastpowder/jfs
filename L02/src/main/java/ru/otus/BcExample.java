package ru.otus;
import java.util.Scanner;

public class BcExample {
    private final String name;

    public BcExample(String name) { this.name = name; }

    public static void main (String[] args) {
        String name = "Vitya Chibrikov";
        BcExample example = new BcExample(name);
        Scanner scan = new Scanner(System.in);
        String DickGiver = scan.nextLine();
        long size = example.getDick();
        System.out.println("The length of " + DickGiver + "'s Dick for " + example.name + " is " + size + " cm");
    }

    public long getDick() {
        int a = 3;
        int b = 2;
        int c = a << b;
        return c + 10;
    }
}