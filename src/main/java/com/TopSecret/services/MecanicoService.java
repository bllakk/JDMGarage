package com.TopSecret.services;
import com.TopSecret.models.Projeto;
import com.TopSecret.models.Mecanico;

public class MecanicoService {
    public Mecanico adicionarProjeto(Mecanico mecanico, Projeto projeto){
        mecanico.getListaProjetos().add(projeto);
        return mecanico;
    }
    public Mecanico removerProjeto(Mecanico mecanico, Projeto projeto){
        mecanico.getListaProjetos().remove(projeto);
        return mecanico;
    }
}
