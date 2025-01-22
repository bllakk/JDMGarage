package com.TopSecret.models;

public class Peca {
    private String nome;
    private String tipo;
    private double preco;

    public Peca(String nome, String tipo, double preco) {
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }
    public String getTipo() {
        return tipo;
    }
    public double getPreco() {
        return preco;
    }
}
