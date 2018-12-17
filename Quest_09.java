package pg_38;

import java.util.Scanner;

public class Quest_09 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float base_maior, base_menor, altura, A;
        
        System.out.println("Entre com a base maior:");
        base_maior = ler.nextFloat();
        System.out.println("Entre com a base menor:");
        base_menor = ler.nextFloat();
        System.out.println("Entre com a altura:");
        altura = ler.nextFloat();
        
        A = ((base_maior + base_menor) * altura)/2;
        
        System.out.println("A área do trapézio é:" +A);
    }
    
}
