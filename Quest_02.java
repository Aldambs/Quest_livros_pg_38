package pg_38;

import java.util.Scanner;

public class Quest_02 {
    
    public static void main (String[] args){
        
        Scanner ler = new Scanner(System.in);
        byte n1, n2, n3;
        double mult;
        
        System.out.println("Digite o primeiro número:");
        n1 = ler.nextByte();
        System.out.println("Digite o segundo número:");
        n2 = ler.nextByte();
        System.out.println("Digite o Terceiro número:");
        n3 = ler.nextByte();
        
        mult = n1*n2*n3;
        
        System.out.println("Resultado:" +mult);
    }
    
}
