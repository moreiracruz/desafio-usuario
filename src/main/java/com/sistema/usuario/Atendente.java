package com.sistema.usuario;

public class Atendente extends Usuario {
    private double valorEmCaixa;

    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha, false); // Atendente não é administrador
    }

    public void receberPagamento(double valor) {
        valorEmCaixa += valor;
        System.out.println("Pagamento recebido. Valor em caixa: " + valorEmCaixa);
    }

    public void fecharCaixa() {
        System.out.println("Caixa fechado. Valor final: " + valorEmCaixa);
        valorEmCaixa = 0;
    }

    @Override
    public void realizarLogin() {
        System.out.println("Atendente " + getNome() + " logado.");
    }

    @Override
    public void realizarLogoff() {
        System.out.println("Atendente " + getNome() + " deslogado.");
    }

    @Override
    public void alterarDados(String nome, String email) {
        setNome(nome);
        setEmail(email);
        System.out.println("Dados do atendente atualizados.");
    }

    @Override
    public void alterarSenha(String novaSenha) {
        setSenha(novaSenha);
        System.out.println("Senha do atendente atualizada.");
    }

}
