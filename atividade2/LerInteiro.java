package atividade2;

import java.util.Scanner;

public class LerInteiro {
    Scanner ler = new Scanner(System.in);
   int n1, n2;

    public void lerint(){
        System.out.println("\n Digite o primeiro numero inteiro:");
        n1 = ler.nextInt();
        System.out.println("\n Digite o segundo numero inteiro:");
        n2 = ler.nextInt();

        if(n1==n2){
            System.out.println(n1 + " é igual á " + n2);
        } 
        else if (n1!=n2){
            System.out.println(n1+" é diferente de "+n2);
        }

        if (n1>n2){
            System.out.println(n1+" é maior que "+n2);
        }
        else if ( n1<n2){
            System.out.println(n1+" é menor que "+n2);
        }

        if(n1>n2||n1==n2){
            System.out.println(n1+" é maior ou igual á "+n2);
        }
        else if(n1<n2||n1==n2){
            System.out.println(n1+" é menor ou igual á "+n2);
        }

        // um numero inteiro comparado a outro numero inteiro não tem a possibilidade de ser  maior ou igual, menor ou igual, ao mesmo tempo, como exemplo, se 13>10 certamente não tem como 13 ser igual á 10 e maior ao mesmo tempo. então um numero, ele é maior ou igual maior ou igual 
        
    }
}
