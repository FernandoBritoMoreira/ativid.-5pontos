package Atividade7;

import java.util.Scanner;

public class Equacao {
    Scanner ler = new Scanner(System.in);
    float a, b, c, x, total, delta, raiz1, raiz2;
    public void calculo(){

        System.out.println("\n Equação segundo grau!");
        System.out.println("\n Digite o valor de A:");
        a = ler.nextFloat();
        System.out.println("\n Digite o valor de B:");
        b = ler.nextFloat();
        System.out.println("\n Digite o valor de C:");
        c = ler.nextFloat();

      
//resolvendo o valor de desta.
        delta = (b*b)-4*a*c;
        System.out.println("\n O valor de delta é: "+delta);
//resolvendo raiz
        if(delta<0){
            System.out.println(" A equação não possui raíses reais");
        }else{
            raiz1 = (float) ((-b+Math.sqrt(delta))/(2*a));
            raiz2 = (float) ((-b-Math.sqrt(delta))/(2*a));

            System.out.println("\n A raíz de 1 x: " +raiz1);
            System.out.println("\n A raíz de 1 x: " +raiz2);
        }
        







    }
}
