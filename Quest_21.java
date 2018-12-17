package pg_38;

import java.util.Scanner;

public class Quest_21 {

    /**
     * Faça um programa que receba o número de horas trabalhadas, o valor do
     * salário mínimo e o número de horas extras trabalhadas. Calcule e mostre o
     * salário a receber seguindo as regras a seguir: a) a hora trabalhada vale
     * 1/8 do salário mínimo. b) a hora extra vale 1/4 do salário mínimo. c) o
     * salário bruto equivalente ao número de horas trabalhadas multiplicadas
     * pelo valor da hora trabalhadas. d) a quantia a receber pelas horas extras
     * equivale ao número de horas trabalhadas multiplicadado pelo valor na hora
     * extra; e) o salário a receber equivale ao salário bruto mais a quantia a
     * receber pelas horas extras
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double sm, sb, h_trab, h_ext, ht, he, qh, sal;

        System.out.println("Digite o salário mínimo:");
        sm = ler.nextDouble();
        System.out.println("Digite as horas trabalhadas:");
        h_trab = ler.nextDouble();
        System.out.println("Digite as horas extras:");
        h_ext = ler.nextDouble();

        ht = sm / 8;
        he = sm / 4;
        sb = h_trab * ht;
        qh = he * h_ext;
        sal = sb + qh;

        System.out.println("A hora trabalhada é:\n" +ht);
        System.out.println("A hora extra é:\n" +he);
        System.out.println("O salário bruto é:\n" +sb);
        System.out.println("A quantidade de horas extras é:\n" +qh);
        System.out.println("O salário será de:\n" +sal);

    }

}
