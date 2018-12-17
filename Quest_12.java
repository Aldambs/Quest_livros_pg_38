package pg_38;

import java.util.Scanner;

public class Quest_12 {
    /**
     * Faça um programa que receba o valor do salário mínimo e o valor do
     * salário do funcionário, calcule e mostre a quantidade salário mínimo
     * ganha esse funcioário.
     */
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       double salario_min, salario_fun, total;
        System.out.println("Informe o salário mínimo:");
        salario_min = ler.nextDouble();
        System.out.println("Informe o salário do funcionário:");
        salario_fun = ler.nextDouble();
        
        total = salario_fun/salario_min;
        System.out.println("A quantidade de salário minimo é:\n" +total);
        
        
    }

}
