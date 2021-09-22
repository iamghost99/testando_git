/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author Denis
 */
public class CalcJuros {
    public static void main(String[] args) {
        double juros, capital, taxa, periodo;
        
        Scanner Valor = new Scanner(System.in);
        
        System.out.println("Bem vindo a calculadore de juros!!");              
        System.out.print("Digite aqui o capital: ");
        capital = Valor.nextDouble();
        System.out.print("Digite aqui o percentual da taxa: ");
        taxa = Valor.nextDouble();
        System.out.print("Digite aqui o periodo: ");
        periodo = Valor.nextDouble();
        
        juros = (capital * taxa * periodo)/100;
        
        System.out.printf("\t\tO juros do calculo com capital de R$ %f, taxa de %f porcento e"
                + " de %f período é: %f reais", capital, taxa, periodo, juros);
        
    }
    
}
