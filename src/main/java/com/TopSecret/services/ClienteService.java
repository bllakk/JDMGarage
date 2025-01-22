package com.TopSecret.services;
import com.TopSecret.models.Cliente;
import com.TopSecret.models.Carro;
import com.TopSecret.models.Projeto;

public class ClienteService {

    public Cliente adicionarCarro(Cliente cliente, Carro carro){
        cliente.getListaCarros().add(carro);
        return cliente;
    }
    public Cliente removerCarro(Cliente cliente, Carro carro){
        cliente.getListaCarros().remove(carro);
        return cliente;
    }

    public Cliente solicitarProjeto(Cliente cliente, Projeto projeto){
        cliente.getListaProjetos().add(projeto);
        return cliente;
    }
}
