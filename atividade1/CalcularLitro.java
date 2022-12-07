package atividade1;
import java.util.Scanner;

public class CalcularLitro {
  

    public static void calcular(){ 
        Scanner ler = new Scanner(System.in);
        float tempoGasto, velocidadeMedia, distancia, quantidadeLitros;
        System.out.println("\n Olá! Vamos calcular os litros gastos na sua viagem!\n");
        System.out.println(" Para isso vamos precisar que você informe algumas informações");
        System.out.println("\n\n Qual foi o tempo gasto do destino inicial, até o destino final?");
        tempoGasto = ler.nextFloat();
        System.out.println("\n Qual foi a velocidade média, até o destino fianl?");
        velocidadeMedia = ler.nextFloat();
        distancia = tempoGasto*velocidadeMedia;
        quantidadeLitros = distancia/12;
        System.out.println("\n A quantidade de litros de combustível gasto na viagem, foi: "+ quantidadeLitros +" Litros\n\n");
    }
}