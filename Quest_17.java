package pg_38;

import java.util.Scanner;

public class Quest_17 {
    /**
     * Faça um programa que receba o raio,calcule e mostre: 
     * a)O comprimento de uma esfera,sabe-se que que C=2*pi*raio 
     * b)a área de uma esfera,sabe-se que A=pi*raio^2; 
     * c)O volume de uma esfera,sabe-se que v=3/4*pi*raio^3;
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r, c , a, v;
        float pi = 3.14f;
        
        System.out.println("Escreva o valor do raio:");
        r = input.nextDouble();
        
        c = (2 * pi * r);
        a = (pi * Math.pow(r,2));
        v = (((3%4) * pi) * Math.pow(r,3));
        
        System.out.println("O comprimento é:\n" +c);
        System.out.println("A área é:\n" +a);
        System.out.println("O volume é:\n" +v);
        
    }

}
