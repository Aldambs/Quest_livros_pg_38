package pg_38;

import java.util.Scanner;

public class Quest_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, sub;
        
        System.out.print("Digite o primeiro número:");
        n1 = input.nextInt();
        System.out.print("Digite o segundo número:");
        n2 = input.nextInt();
        
        sub = n1 - n2;
        
        System.out.println("Resultado: " +sub);
    }
    
}
