package com.TopSecret.services;
import com.TopSecret.models.Projeto;
import com.TopSecret.models.Peca;

public class ProjetoService {
    public Projeto adicionarPeca(Projeto projeto, Peca peca) {
        projeto.getListaPecas().add(peca);
        return projeto;
    }
    public Projeto removerPeca(Projeto projeto, Peca peca) {
        projeto.getListaPecas().remove(peca);
        return projeto;
    }

    public Projeto concluir (Projeto projeto) {
        projeto.setStatus("Concluído");
        return projeto;
    }
}
