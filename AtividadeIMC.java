package com.trabalho;

import java.util.Scanner;

public class AtividadeIMC {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double peso = 0;
        double altura = 0;
        double imc = 0;

        System.out.print("Informe a altura (em metros): ");
        altura = scan.nextDouble();

        System.out.print("Informe o peso (em kg): ");

        imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: "+imc);
    
        if (imc < 18.5) {
            System.out.println("Interpretação: Abaixo do peso");

        } else if (imc < 25) {
             System.out.println("Interpretação: Peso normal");

        } else if (imc < 30) {
             System.out.println("Interpretação: Sobrepeso");

        } else {
             System.out.println("Interpretação: Obesidade");
        }
    }
}
