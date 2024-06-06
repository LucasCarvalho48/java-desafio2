package org.example;

import org.excecoes.ParametrosInvalidosException;
import org.servico.CalculoService;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = Integer.parseInt(terminal.nextLine());
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = Integer.parseInt(terminal.nextLine());

        try {
            //chamando o método contendo a lógica de contagem
            CalculoService.contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(exception.getMessage());
        }

    }

}
