package pg_38;

import java.util.Scanner;

public class Quest_13 {
    /**
      Faça um programa que calcule e mostre a tabuada de um número digitado 
      pelo o usúario.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x, y;
        
        System.out.println("Digite o número da tabuada;");
        x = ler.nextInt();
        for(y = 0; y <= 10; y++){    
            System.out.println("" +x+ " X " +y+ " = " +x*y+ "");
        }     
    }
    
}
