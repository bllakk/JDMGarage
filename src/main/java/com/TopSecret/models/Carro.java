package com.TopSecret.models;

public class Carro {
    private String id;
    private String modelo;
    private String marca;
    private int ano;
    private Cliente cliente;

    public Carro(String id, String modelo, String marca, int ano, Cliente cliente) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cliente = cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public String getId() {
        return id;
    }
    public String getModelo() {
        return modelo;
    }
    public String getMarca() {
        return marca;
    }
    public int getAno() {
        return ano;
    }
    public Cliente getCliente() {
        return cliente;
    }
}
