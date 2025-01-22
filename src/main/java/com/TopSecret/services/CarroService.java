package com.TopSecret.services;
import com.TopSecret.models.Carro;
import com.TopSecret.models.Cliente;

public class CarroService {
    public Carro atualizarCliente(Carro carro, Cliente cliente) {
        carro.setCliente(cliente);
        return carro;
    }
}
