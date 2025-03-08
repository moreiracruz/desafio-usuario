package com.sistema.usuario;

public abstract class Usuario {
    private String nome;
    private String email;
    private String senha;
    private boolean isAdministrador;

    public Usuario(String nome, String email, String senha, boolean isAdministrador) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.isAdministrador = isAdministrador;
    }

    public abstract void realizarLogin();

    public abstract void realizarLogoff();

    public abstract void alterarDados(String nome, String email);

    public abstract void alterarSenha(String novaSenha);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdministrador() {
        return isAdministrador;
    }

    public void setAdministrador(boolean administrador) {
        isAdministrador = administrador;
    }

}
