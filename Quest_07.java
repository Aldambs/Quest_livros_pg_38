package pg_38;

import java.util.Scanner;

public class Quest_07 {
    /*
    Faça um programa que receba o peso de uma pessoa, calcule e mostre:
    a) O novo peso se a pessoa engordar 15% sobre o peso digitado:
    b) O novo peso se a pessoa emargrecer 20% sobre o peso digitado:
    */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe o peso da pessoa: ");
        double peso = ler.nextDouble();
        double engordar = 0, emargrecer = 0;
        
        engordar = peso + (peso * 0.15);
        emargrecer = peso - (peso * 0.20);
        
        System.out.println("O novo peso a engordar = " +engordar);
        System.out.println("O novo peso a emargrecer = " +emargrecer);
        
    }   
}
