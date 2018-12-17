package pg_38;

import java.util.Scanner;

public class Quest_19 {
    /**
     * Sabe - se que para iluminar de maneira correta os cômodos de uma casa, para
     * cada m^2, deve-se usar 18 w de potência. Faça um programa que receba as 
     * duas dimensões de um cômodo em metros, calcule e mostre a sua área em 
     * metros^2 e a potência de iluminação que deverea ser utilizada.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float A, D1, D2,PQ, LADO1, LADO2, LD3, LD4;
        
        System.out.println("Informe o primeiro lado:");
        LADO1 = input.nextFloat();
        System.out.println("Informe o segundo lado:");
        LADO2 = input.nextFloat();
        System.out.println("Informe o terceiro lado:");
        LD3 = input.nextFloat();
        System.out.println("Informe o quarto lado:");
        LD4 = input.nextFloat();
        
        D1 = LADO1 * LADO2;
        D2 = LD3 * LD4;
        A = D1 + D2;
        PQ = A * 18;
        
        System.out.println("A área dos cômodos é:\n" +A);
        System.out.println("A potência de iluminação é:\n" +PQ);
    }
    
}
