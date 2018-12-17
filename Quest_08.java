package pg_38;

import java.util.Scanner;

public class Quest_08 {

    /**
     *Faça um programa que reveba o peso de uma pessoa em quilo, calcule e mostre 
     *esse peso em quilograma.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o peso da pessoa: ");
        double peso = ler.nextDouble();
        double grama;
        grama = peso * 1000;
        System.out.println("O peso em grama = " +grama);
    }
    
}
