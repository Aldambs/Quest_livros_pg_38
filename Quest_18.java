package pg_38;

import java.util.Scanner;

public class Quest_18 {
   /**
     * Faça um programa que receba uma temperatura em grau celcius,calcule e 
     * mostre temperatura em Fahrenheit: F = 180*(C+32)/100;
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double C, F;

        System.out.println("Informe a temperatura em grau celsius:");
        C = input.nextDouble();

        F = ((180 * C) + 32)/100;

        System.out.println("A temperatura é:\n" + F);
    }
    
}
