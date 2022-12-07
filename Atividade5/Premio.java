package Atividade5;
import java.lang.ref.Cleaner;
import java.util.Scanner;

public class Premio {
    
    public void premiacao(){
        int numero, n=2;
        float gastou;
        Scanner ler = new Scanner(System.in);
        System.out.println("\n Quanto o cliente gastou:");
        gastou = ler.nextFloat();

        if(gastou>=100){
            
            do{
                System.out.println(" \n Pede o cliente para escolher um numéro ente 1 e 9:");
                numero = ler.nextInt();
                switch(numero){
                
                    case 1:
                    System.out.println("\n Ganhou um Carro");
                    n=2;
                    break;

                    case 2:
                    System.out.println("\n Ganhou uma Bicicleta");
                    n=2;
                    break;

                    case 3:
                    System.out.println("\n Ganhou uma Moto");
                    n=2;
                    break;
                    
                    case 4:
                    System.out.println("\n Ganhou uma Bola");
                    n=2;
                    break;

                    case 5:
                    System.out.println("\n Ganhou uma Panela");
                    n=2;
                    break;

                    case 6:
                    System.out.println("\n Ganhou um Videogame");
                    n=2;
                    break;

                    case 7:
                    System.out.println("\n Ganhou uma Tv");
                    n=2;
                    break;

                    case 8:
                    System.out.println("\n Ganhou um Computador");
                    n=2;
                    break;

                    case 9:
                    System.out.println("\n Ganhou um Celular");
                    n=2;
                    break;
                    
                    default:
                    System.out.println("\n Numéro escolido inválido!");
                    n=1;
                    break;
                }
                
            }while(n==1);
        }else{
            System.out.println("\n Infelimente o valor é abaixo de R$ 100,00, para poder concorrer premiações!\n\n");
        }
    }
}
