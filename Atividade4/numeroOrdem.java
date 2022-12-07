package Atividade4;
import java.util.Scanner;

public class numeroOrdem {
    Scanner ler = new Scanner(System.in);
    int n1, n2, n3,  n4;
    
    public void ordemNumerica(){

        System.out.println(" Programa para imprimir os numeros digitados aleatorimente pelo usuário em ordem crescente");
        System.out.println(" Digite o primeiro numéro:\n");
        n1 = ler.nextInt();
        System.out.println(" Digite o segundo numéro:\n");
        n2 = ler.nextInt();
        System.out.println(" Digite o terceiro numéro:\n");
        n3 = ler.nextInt();
        System.out.println(" Digite o quarto numéro:\n");
        n4 = ler.nextInt();
        System.out.println("\n Resultado:\n");

        if(n1<=n2&&n2<=n3&&n3<=n4){
            System.out.println(n1+"\n"+n2+"\n"+n3+"\n"+n4);
        }
        if(n1<=n2&&n2<=n4&&n4<=n3){
            System.out.println(n1+"\n"+n2+"\n"+n4+"\n"+n3);
        }
        if(n1<=n3&&n3<=n2&&n2<=n4){
            System.out.println(n1+"\n"+n3+"\n"+n2+"\n"+n4);
        }
         if(n1<=n3&&n3<=n4&&n4<n2){
            System.out.println(n1+"\n"+n3+"\n"+n4+"\n"+n2);
        }
        if(n1<=n4&&n4<=n3&&n3<=n2){
            System.out.println(n1+"\n"+n4+"\n"+n3+"\n"+n2);
        }
        if(n1<=n4&&n4<=n2&&n2<=n3){
            System.out.println(n1+"\n"+n4+"\n"+n2+"\n"+n3);
        }

        if(n2<=n1&&n1<=n3&&n3<=n4){
            System.out.println(n2+"\n"+n1+"\n"+n3+"\n"+n4);
        }
        if(n2<=n1&&n1<=n4&&n4<=n3){
            System.out.println(n2+"\n"+n1+"\n"+n4+"\n"+n3);
        }
        if(n2<=n3&&n3<=n1&&n1<=n4){
            System.out.println(n2+"\n"+n3+"\n"+n1+"\n"+n4);
        }
        if(n2<=n3&&n3<=n4&&n4<=n1){
            System.out.println(n2+"\n"+n3+"\n"+n4+"\n"+n1);
        }
        if(n2<=n4&&n4<=n1&&n1<=n3){
            System.out.println(n2+"\n"+n4+"\n"+n1+"\n"+n3);
        }
        if(n2<=n4&&n4<=n3&&n3<=n1){
            System.out.println(n2+"\n"+n4+"\n"+n3+"\n"+n1);
        }

        if(n3<=n1&&n1<=n2&&n2<=n4){
            System.out.println(n3+"\n"+n1+"\n"+n2+"\n"+n4);
        }
        if(n3<=n1&&n1<=n4&&n4<=n2){
            System.out.println(n3+"\n"+n1+"\n"+n4+"\n"+n2);
        }
        if(n3<=n2&&n2<=n1&&n1<=n4){
            System.out.println(n3+"\n"+n2+"\n"+n1+"\n"+n4);
        }
        if(n3<=n2&&n2<=n4&&n4<=n1){
            System.out.println(n3+"\n"+n2+"\n"+n4+"\n"+n1);
        }
        if(n3<=n4&&n4<=n1&&n1<=n2){
            System.out.println(n3+"\n"+n4+"\n"+n1+"\n"+n2);
        }
        if(n3<=n4&&n4<=n2&&n2<=n1){
            System.out.println(n3+"\n"+n4+"\n"+n2+"\n"+n1);
        }

        if(n4<=n1&&n1<=n2&&n2<=n3){
            System.out.println(n4+"\n"+n1+"\n"+n2+"\n"+n3);
        }
        if(n4<=n1&&n1<=n3&&n3<=n2){
            System.out.println(n4+"\n"+n1+"\n"+n3+"\n"+n2);
        }
        if(n4<=n2&&n2<=n1&&n1<=n3){
            System.out.println(n4+"\n"+n2+"\n"+n1+"\n"+n3);
        }
        if(n4<=n2&&n2<=n3&&n3<=n1){
            System.out.println(n4+"\n"+n2+"\n"+n3+"\n"+n1);
        }
        if(n4<=n3&&n3<=n1&&n1<=n2){
            System.out.println(n4+"\n"+n3+"\n"+n1+"\n"+n2);
        }
        if(n4<=n3&&n3<=n2&&n2<=n1){
            System.out.println(n4+"\n"+n3+"\n"+n2+"\n"+n1);
        }

       
    }
}
