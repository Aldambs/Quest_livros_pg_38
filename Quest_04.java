package pg_38;

import java.util.Scanner;

public class Quest_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int not1, not2, med;
        
        System.out.println("Informe a 1° nota:");
        not1 = input.nextInt();
        System.out.println("Informe a 2° nota:");
        not2 = input.nextInt();
        
        med = (not1*2 + not2*3)/2+3;
        
        System.out.println("RESULTADO: " +med);
    }
    
}
