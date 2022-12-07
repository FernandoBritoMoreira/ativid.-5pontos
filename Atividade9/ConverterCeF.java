package Atividade9;

import java.util.Scanner;

public class ConverterCeF {
    Scanner ler = new Scanner(System.in);
    float  Farenheit,  Celcius;
    int sair;
    int n;
    public void converter(){
        do{
            
            do{
                System.out.println(" \n Deseja converter em que escala?");
                System.out.println("\n\n Digite 1 para converter Celcius (ºC), para Farenheit (ºF) ");
                System.out.println("\n Digite 2 para converter Farenheit (ºF), para Celcius (ºC)  ");
                System.out.println("\n Digite 3, para sair");
                n=ler.nextInt();
                
                switch(n){

                    case 1:
                        System.out.println("\n Vamos converter Celcius (ºC), para Farenheit (ºF)\n\n");
                        System.out.println(" \n Digite a temperatura em Celcius (ºC):");
                        Celcius=ler.nextFloat();
                        Farenheit=(float) (Celcius*1.8+32);
                        System.out.println(" \n Conversão de Celcius (ºC), para Farenheit (ºF): " +Farenheit);
                        sair=1; 
                        break;

                    case 2:
                        System.out.println("\n Vamos converter Farenheit (ºF), para Celcius (ºC) \n\n");
                        System.out.println(" \n Digite a temperatura em Farenheit (ºF):");
                        Farenheit=ler.nextFloat();
                        Celcius=(float) ((Farenheit-32)/1.8);
                        System.out.println(" \n Conversão de Farenheit (ºF), para Celcius (ºC),: " +Celcius);
                        sair=1;
                        break;
                    
                    case 3:
                        sair=2;
                        break;
                                
                    default:
                        System.out.println(" \n Opção inválida!\n Digite somente as opções presentes.");
                        sair=1;
                        break;

                     } 
            }while(n!=3);
        }while(sair==1);
    }
}
