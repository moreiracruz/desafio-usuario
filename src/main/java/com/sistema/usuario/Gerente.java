package com.sistema.usuario;

public class Gerente extends Usuario {

    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha, true); // Gerente é sempre administrador
    }

    public void gerarRelatorioFinanceiro() {
        System.out.println("Relatório financeiro gerado.");
    }

    public void consultarVendas() {
        System.out.println("Vendas consultadas.");
    }

    @Override
    public void realizarLogin() {
        System.out.println("Gerente " + getNome() + " logado.");
    }

    @Override
    public void realizarLogoff() {
        System.out.println("Gerente " + getNome() + " deslogado.");
    }

    @Override
    public void alterarDados(String nome, String email) {
        setNome(nome);
        setEmail(email);
        System.out.println("Dados do gerente atualizados.");
    }

    @Override
    public void alterarSenha(String novaSenha) {
        setSenha(novaSenha);
        System.out.println("Senha do gerente atualizada.");
    }

}
