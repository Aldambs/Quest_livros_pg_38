package pg_38;

import java.util.Scanner;

public class Quest_23 {
    /**
     * Faça um programa que receba a medida de dois ângulos de um triângulo,
     * calcule e mostre a medida do terceiro ângulo. Sabe-se que a Soma dos
     * ângulos de um triângulo é 180 graus.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        double ang1,ang2, ang3;
        System.out.println("Digite um número do 1° ângulo:");
        ang1 = ler.nextDouble();
        System.out.println("Digite um número do 2° ângulo:");
        ang2 = ler.nextDouble();
        ang3 = (ang1 + ang2) / 180;
        System.out.println("A medida angular é: " +ang3);
    }

}
