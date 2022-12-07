package Atividade6;

import java.util.Scanner;

public class CalculoSalario {
    Scanner ler = new Scanner(System.in);
    float horaTrabalhada, valorDaHora, percetualDesconto, salarioBruto, TotalDesconto, salarioLiquido;
    public void salarioBrutoF(){
        System.out.println("\n Vamos calcular o seu salário Bruto!");
        System.out.println("\n Digite sua hora trabalhada:");
        horaTrabalhada= ler.nextFloat();
        System.out.println("\n Digite o valor da hora trabalhada:");
        valorDaHora= ler.nextFloat();
        System.out.println("\n Digite o percentual de desconto:");
        percetualDesconto= ler.nextFloat();
        salarioBruto = horaTrabalhada*valorDaHora;
        System.out.println("\n Total Salário Bruto: "+salarioBruto);
        TotalDesconto = (percetualDesconto / 100) / salarioBruto;
        System.out.println("\n Total de Desconto: "+TotalDesconto);
        salarioLiquido = salarioBruto - TotalDesconto;
        System.out.println("\n Total Salário Líquido: "+salarioLiquido);
    }
}
