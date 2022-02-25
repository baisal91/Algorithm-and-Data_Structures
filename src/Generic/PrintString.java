package Generic;

import Generic.Generic;

public class PrintString {

    public static void main(String[] args) {
        Generic<String> gen = new Generic<>("Hello World");
        Generic <Integer> gen1 = new Generic<>(25);
        Generic <Double> gen2 = new Generic<>(25.90);
        gen.printGen();
        gen1.printGen();
        gen2.printGen();
    }
}
