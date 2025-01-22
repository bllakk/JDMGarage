package com.TopSecret.services;

import java.util.List;
import java.util.ArrayList;
import com.TopSecret.models.*;
import com.TopSecret.services.ClienteService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProjetoServiceTest {
    private Projeto SilviaDrift;
    private Mecanico Monteiro;
    private Cliente Gyan;
    private Oficina TopSecret;
    private Carro SilviaS15;
    private Peca Peca1;
    private Peca Peca2;
    private ProjetoService projetoService;
    private ClienteService clienteService;
    private OficinaService oficinaService;

    @Before
    public void setUp() {
        Monteiro = new Mecanico("1", "Monteiro", "Contato 1", 5);
        Gyan = new Cliente("1", "Gyan", "Contato 1");
        TopSecret = new Oficina("1", "TopSecret - Recife", "Endereco 1");
        SilviaS15 = new Carro("2", "Silvia S15", "Nissan", 1999, Gyan);
        Peca1 = new Peca("1", "Peca1", 100.0);
        Peca2 = new Peca("2", "Peca2", 200.0);
        SilviaDrift = new Projeto("1", "Silvia Drift", "Projeto de Drift", SilviaS15, Monteiro, Gyan, new ArrayList<Peca>(), "Em andamento");
        projetoService = new ProjetoService();
        clienteService = new ClienteService();
        oficinaService = new OficinaService();
    }

    @Test
    public void testProjeto(){
        clienteService.solicitarProjeto(Gyan, SilviaDrift);
        projetoService.adicionarPeca(SilviaDrift, Peca1);
        assertTrue(SilviaDrift.getListaPecas().contains(Peca1));
        projetoService.adicionarPeca(SilviaDrift, Peca2);
        projetoService.removerPeca(SilviaDrift, Peca2);
        assertFalse(SilviaDrift.getListaPecas().contains(Peca2));
    }
}