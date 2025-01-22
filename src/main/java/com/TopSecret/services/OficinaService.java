package com.TopSecret.services;
import com.TopSecret.models.*;

public class OficinaService {

    public Oficina adicionarCarro(Oficina oficina, Carro carro){
        oficina.getListaCarros().add(carro);
        return oficina;
    }
    public Oficina removerCarro(Oficina oficina, Carro carro){
        oficina.getListaCarros().remove(carro);
        return oficina;
    }

    public Oficina adicionarMecanico(Oficina oficina, Mecanico mecanico){
        oficina.getListaMecanicos().add(mecanico);
        return oficina;
    }
    public Oficina removerMecanico(Oficina oficina, Mecanico mecanico){
        oficina.getListaMecanicos().remove(mecanico);
        return oficina;
    }

    public Oficina adicionarCliente(Oficina oficina, Cliente cliente){
        oficina.getListaClientes().add(cliente);
        return oficina;
    }
    public Oficina removerCliente(Oficina oficina, Cliente cliente){
        oficina.getListaClientes().remove(cliente);
        return oficina;
    }

    public Oficina criarProjeto(Oficina oficina, Projeto projeto){
        oficina.getListaProjetos().add(projeto);
        return oficina;
    }
}
