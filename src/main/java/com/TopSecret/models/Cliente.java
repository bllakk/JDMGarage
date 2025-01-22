package com.TopSecret.models;
import java.util.List;
import java.util.ArrayList;

public class Cliente {
    private String id;
    private String nome;
    private String contato;
    private List<Carro> listaCarros = new ArrayList<Carro>();
    private List<Projeto> listaProjetos = new ArrayList<Projeto>();

    public Cliente(String id, String nome, String contato) {
        this.id = id;
        this.nome = nome;
        this.contato = contato;
    }

    public String getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getContato() {
        return contato;
    }
    public List<Carro> getListaCarros() {
        return listaCarros;
    }
    public List<Projeto> getListaProjetos() {
        return listaProjetos;
    }
}
