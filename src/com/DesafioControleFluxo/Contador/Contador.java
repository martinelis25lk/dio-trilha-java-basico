package com.DesafioControleFluxo.Contador;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("digite o primeiro parametro:");
        int parametroUm = terminal.nextInt();
        System.out.println("digite o segundo parametro:");
        int parametroDois = terminal.nextInt();


        try {

            //chamando o metodo contendo a logica de contagem
            // supondo parametros validos

              contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        }

        }
        static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
            //validar se parametroUm é MAIOR que parametroDois e lançar a exceção

            if(parametroUm> parametroDois) {
                throw new ParametrosInvalidosException("parametro um é maior que parametro dois.");
            }
            else {
                int contagem = parametroDois - parametroUm;
                //realizar o for para imprimir os números com base na variável contagem

                for (int i = 1; i <= contagem; i++) {
                    System.out.println(" contagem: " + i);
                }

            }


    }
}
