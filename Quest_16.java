package pg_38;

import java.util.Scanner;

public class Quest_16 {
    /**
     * Faça um programa que receba o valor dos catetos de um triângulo.
     * calcule e mostre o valor da hipotenusa.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cat1, cat2, h;
        
        System.out.println("Informe o 1° cateto:");
        cat1 = input.nextDouble();
        System.out.println("Informe o 2° cateto:");
        cat2 = input.nextDouble();
        
        h = Math.pow(cat1,2) + Math.pow(cat2,2); 
        System.out.println("A hipotenusa é:" +h);
    }
    
}
