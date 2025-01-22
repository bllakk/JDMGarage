package com.TopSecret.models;
import java.util.List;
import java.util.ArrayList;

public class Oficina {
    private String id;
    private String nome;
    private String endereco;
    private List<Mecanico> listaMecanicos = new ArrayList<Mecanico>();
    private List<Projeto> listaProjetos = new ArrayList<Projeto>();
    private List<Cliente> listaClientes = new ArrayList<Cliente>();
    private List<Carro> listaCarros = new ArrayList<Carro>();

    public Oficina(String id, String nome, String endereco) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public List<Mecanico> getListaMecanicos() {
        return listaMecanicos;
    }
    public List<Projeto> getListaProjetos() {
        return listaProjetos;
    }
    public List<Cliente> getListaClientes() {
        return listaClientes;
    }
    public List<Carro> getListaCarros() {
        return listaCarros;
    }
}
