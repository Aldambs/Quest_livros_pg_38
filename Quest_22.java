package pg_38;

import java.util.Scanner;

public class Quest_22 {
   /**
     * Faça um programa que receba o número de lados de um poligono convexo, 
     * calcule e mostre o número de diagonais desse poligono, onde n é o número 
     * de lados do poligono. sabe - se que ND = N(N-3)/2.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        float n, nd; 
        System.out.println("Digite o números de lados:");
        n = ler.nextFloat();
        nd = n*(n-3)/2;
        System.out.println("O número de diagonais é:\n" +nd);
    }
    
}
