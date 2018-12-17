package pg_38;

import java.util.Scanner;

public class Quest_10 {
    /**
     * Faça um programa que calcule e mostre a area de um quadrado.
     * sabe - se que: A = lado * lado
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double lado1, lado2, A;
        
        System.out.println("Digite o 1° lado:");
        lado1 = ler.nextDouble();
        System.out.println("Digite o 2° lado:");
        lado2 = ler.nextDouble();
        
        A = lado1 * lado2;
        System.out.println("A area do quadrado é:\n" +A);
    }
    
}
