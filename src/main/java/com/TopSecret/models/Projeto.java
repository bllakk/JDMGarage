package com.TopSecret.models;
import java.util.List;
import java.util.ArrayList;

public class Projeto {
    private String id;
    private String nome;
    private String descricao;
    private Carro carro;
    private Mecanico mecanico;
    private Cliente cliente;
    private List<Peca> listaPecas = new ArrayList<Peca>();
    private String status;

    public Projeto(String id, String nome, String descricao, Carro carro, Mecanico mecanico, Cliente cliente, List<Peca> listaPecas, String status) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.carro = carro;
        this.mecanico = mecanico;
        this.cliente = cliente;
        this.listaPecas = listaPecas;
        this.status = status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return this.status;
    }

    public String getId() {
        return this.id;
    }
    public String getNome() {
        return this.nome;
    }
    public String getDescricao() {
        return this.descricao;
    }
    public Carro getCarro() {
        return this.carro;
    }
    public Mecanico getMecanico() {
        return this.mecanico;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    public List<Peca> getListaPecas() {
        return this.listaPecas;
    }

}
