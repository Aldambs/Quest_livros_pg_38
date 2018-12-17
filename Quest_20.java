package pg_38;

import java.util.Scanner;

public class Quest_20 {
    /**
     * Faça um programa que receba a medida do ângulo formado por uma escada 
     * apoiada no chão e a distância que a escada está da parede. calcule e
     * mostre a medida da escada para que se possa alcançar a ponta da escada 
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double ang, esc, alt, rad;
        
        System.out.println("Entre com o ângulo:");
        ang = input.nextDouble();
        System.out.println("Entre com a altura:");
        alt = input.nextDouble();
        rad = ang * (3.14/180);
        esc = alt / rad;
        
        System.out.println("A medida escalar é:\n" +esc);
    }
    
}
