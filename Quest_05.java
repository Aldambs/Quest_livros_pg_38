package pg_38;

import java.util.Scanner;

public class Quest_05 {
  
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double prc, novoprc, desc;
        
        System.out.println("Digite o preço do produto:");
        prc = ler.nextDouble();

        desc = prc * 0.10;
        novoprc = prc - desc;

        System.out.println("Novo valor:" +novoprc);
        
    }
    
}
