package Atividade8;
import java.util.Scanner;

public class CalculoEsfera {
    float pi = (float) 3.141, raio, V;
    Scanner ler =new Scanner(System.in);
    public void calculoRaio(){

        System.out.println("\n Calculando o volume da esfera!\n\n");
        System.out.println("\n Digite o raio da esfera:");
        raio=ler.nextFloat();

        while(raio<=0){
            System.out.println("\n O valor digitado do raio deve ser maior do que 0, por favor digite novamente:");
            raio=ler.nextFloat();
        }

        V=4*pi*(raio*raio*raio)/3;
        System.out.println("\n O volume da esfera é: "+V);

    }

}
