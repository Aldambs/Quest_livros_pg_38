package pg_38;

import java.util.Scanner;

public class Quest_24 {
    /**
     * Faça um programa que receba a quantidade de dinheiro em reais que uma
     * pessoa que vai viajar possui. Ela vai passar por vários países e precisa
     * converter seu dinheiro em dólares, marco alemão e libra esterlina.
     * Sabe-se que a cotação do dólar é de R$ 1,80, do marco alemão é de R$ 2,00
     * e da libra esterlina é de R$ 1,57. O programa deve fazer as conversões e
     * mostrá-las.      *
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        double real, dolar, marco, libra;
        
        System.out.println("Informe a quantia que a pessoa possui:");
        real = ler.nextDouble();
        
        dolar = real / 1.80;
        marco = real / 2.00;
        libra = real / 1.57;
        
        System.out.println("O valor em dolar é: " +dolar);
        System.out.println("O valor em marco é: " +marco);
        System.out.println("O valor em librar é: " +libra);
    }

}
