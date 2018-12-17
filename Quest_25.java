package pg_38;

import java.util.Scanner;

public class Quest_25 {
    /**
     * Faça um programa que receba a uma hora (uma variavel para hora e outra
     * para minutos), calcule e mostre:
     * a) a hora digitada convertida em minutis;
     * b) o total dos minutos, ou seja, os minutos digitados mais a conversão anterior;
     * c) o total dos minutos convertido em segundo.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        float h, m, conver, totalm, con_s;
        
        System.out.println("Informe a hora a ser convertida:");
        h = ler.nextFloat();
        System.out.println("Informe os minutos a ser convertido:");
        m = ler.nextFloat();
        
        conver = h * 60;
        totalm = conver + m;
        con_s = totalm * 60;
        
        System.out.println("A hora convertida em minutos é: " +conver);
        System.out.println("Total de minutos é: " +totalm);
        System.out.println("O total dos minutos convertido é: " +con_s);
        
    }
    
}
