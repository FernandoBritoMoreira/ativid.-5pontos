package atividade3;

import java.util.Scanner;

public class ParImpar {
    public void identificarParImpar(){

        Scanner ler = new Scanner(System.in);
        int numero, calcular;
        System.out.println(" Digite um numéro: ");
        numero = ler.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero+" é par");
        } else {
            System.out.println(numero+" é impar");
        }
        
    }
}
