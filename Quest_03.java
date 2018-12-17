package pg_38;

import java.util.Scanner;

public class Quest_03 {
    
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        int n1, n2, div;
        
        System.out.println("Digite o 1º número:");
        n1 = ler.nextInt();
        System.out.println("Digite o 2° número:");
        n2 = ler.nextInt();
        
        div = ( n1 / n2);
        
        System.out.println("RESULTADO:" +div);
    }
}
