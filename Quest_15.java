package pg_38;

import java.util.Scanner;

public class Quest_15 {

    /**
     * João recebeu seu salario e precisa pagar duas contas que estão atrasadas.
     * como as contas estão atrasadas, João terá de pagar multa de 2% sobre cada
     * conta. Faça um programa que calcule e mostre quanto restará do salário do
     * João.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float sal, conta1, conta2, v1, v2, total, resta;

        System.out.println("Entre com valor do salário:");
        sal = ler.nextFloat();     
        System.out.println("Entre com valor da 1° conta:");
        conta1 = ler.nextFloat();
        System.out.println("Entre com valor da 2° conta:");
        conta2 = ler.nextFloat();
        
        v1 = conta1 + (2/100);
        v2 = conta2 + (2/100);
        total = v1 + v2;
        resta = sal - total;
        
        System.out.println("Restante do salário é:\n" +resta);
    }

}
