package pg_38;

import java.util.Scanner;

public class Quest_14 {
    /**
     * Faça um programa que receba o ano de nascimento de uma pessoa e o ano atual
     * calcule e mostre:
     * a) a idade dessa pessoa em ano;
     * b) a idade dessa pessoa em meses;
     * c) a idade dessa pessoa em dias;
     * d) a idade dessa pessoa em semana;
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int ano, ano_nasc, ano_atual, mes, dia, idade, semana;
        
        System.out.println("Informe o ano atual:");
        ano_atual = ler.nextInt();
        System.out.println("Informe o ano em que nasceu:");
        ano_nasc = ler.nextInt();
        
        ano = ano_atual - ano_nasc;
        mes = ano * 12;
        dia = ano * 365;
        semana = ano * 52;
        
        System.out.println("A idade dessa pessoa em ano é:\n" +ano);
        System.out.println("A idade dessa pessoa em mês é:\n" +mes);
        System.out.println("A idade dessa pessoa em dia é:\n" +dia);
        System.out.println("A idade dessa pessoa em semana é:\n" +semana);
    }
    
}
