package se.jensen.daniela.tarningsspel;

import java.util.Random;

public class tarningen { // skapar en class till själva tärningen
    public static void main(String[] args) {
        Random random = new Random();//random behövs för tärningspelet, den slumpar fram tal.
        int roll = random.nextInt(1,7);//slumpar talen mellan 1-6
    }
}
