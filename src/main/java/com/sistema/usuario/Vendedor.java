package com.sistema.usuario;

public class Vendedor extends Usuario {
    private int quantidadeVendas;

    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha, false); // Vendedor não é administrador
    }

    public void realizarVenda() {
        quantidadeVendas++;
        System.out.println("Venda realizada. Total de vendas: " + quantidadeVendas);
    }

    public void consultarVendas() {
        System.out.println("Total de vendas: " + quantidadeVendas);
    }

    @Override
    public void realizarLogin() {
        System.out.println("Vendedor " + getNome() + " logado.");
    }

    @Override
    public void realizarLogoff() {
        System.out.println("Vendedor " + getNome() + " deslogado.");
    }

    @Override
    public void alterarDados(String nome, String email) {
        setNome(nome);
        setEmail(email);
        System.out.println("Dados do vendedor atualizados.");
    }

    @Override
    public void alterarSenha(String novaSenha) {
        setSenha(novaSenha);
        System.out.println("Senha do vendedor atualizada.");
    }

}
