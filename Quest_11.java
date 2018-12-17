package pg_38;

import java.util.Scanner;

public class Quest_11 {
    /**
     * Faça um programa que calcule e mostre a area de um losango:
     * A = (diagonal_maior * diagonal_menor)/2;
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double diag_maior, diag_menor, A;
        
        System.out.println("Informe a diagonal maior:");
        diag_maior = ler.nextDouble();
        System.out.println("Informe a diagonal menor:");
        diag_menor = ler.nextDouble();
        
        A = (diag_maior * diag_menor)/2;
        
        System.out.println("A area do losango é:\n" +A);
    }
    
}
