package org.servico;

import org.excecoes.ParametrosInvalidosException;

public class CalculoService {

    public static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        int resultado = parametroDois - parametroUm;
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        for (int i = 0; i < resultado; i++ ) {
                System.out.println("Imprimindo o número " + (i + 1));
        }
    }
}
