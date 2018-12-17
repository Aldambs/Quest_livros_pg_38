package pg_38;

import java.util.*;

public class Quest_06 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double salfix, comi, valvend, salfinal;
        
        System.out.println("Entre com o salário fixo:");
        salfix = ler.nextDouble();
        System.out.println("Entre com o valor do produto:");
        valvend = ler.nextDouble();
        
        comi = valvend * 0.4;
        salfinal = salfix + comi;
        
        System.out.println("O valor da comissão é: \n" +comi);
        System.out.println("O salário final é: \n" +salfinal);
    }
    
}
