package com.TopSecret.services;

import com.TopSecret.models.Carro;
import com.TopSecret.models.Cliente;
import com.TopSecret.models.Oficina;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OficinaServiceTest {
    private Cliente Gyan;
    private Oficina TopSecret;
    private Carro SilviaS15;
    private Carro Civic;
    private OficinaService oficinaService;

    @Before
    public void setUp() {
        Gyan = new Cliente("1", "Gyan", "Contato 1");
        TopSecret = new Oficina("1", "TopSecret - Recife", "Endereco 1");
        Civic = new Carro("1", "Civic", "Honda", 1994, Gyan);
        SilviaS15 = new Carro("2", "Silvia S15", "Nissan", 1999, Gyan);
        oficinaService = new OficinaService();
    }

    @Test
    public void testCarros(){
        oficinaService.adicionarCarro(TopSecret, Civic);
        assertTrue(TopSecret.getListaCarros().contains(Civic));
        oficinaService.adicionarCarro(TopSecret, SilviaS15);
        oficinaService.removerCarro(TopSecret, SilviaS15);
        assertFalse(TopSecret.getListaCarros().contains(SilviaS15));
    }

}