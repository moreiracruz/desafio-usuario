package com.sistema;

import com.sistema.usuario.Gerente;

import java.util.Scanner;

public class SistemaApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao Sistema!");

        // Exemplo de uso
        Gerente gerente = new Gerente("João", "joao@email.com", "1234");
        gerente.realizarLogin();
        gerente.gerarRelatorioFinanceiro();
        gerente.realizarLogoff();

        scanner.close();
    }

}
