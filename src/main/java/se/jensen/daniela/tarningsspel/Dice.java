package se.jensen.daniela.tarningsspel;

import java.util.Random;
// denna klassen uppgift är att ta hand om allt som har med tärningen att göra
public class Dice { // skapar en class till själva tärningen
    private Random random; //random behövs för tärningspelet, den slumpar fram tal.

    public Dice() {// skapar en konstruktor
        this.random = new Random();
    }
    public int roll() {
        return random.nextInt(1,7); //slumpar talen mellan 1-6


    }
}


