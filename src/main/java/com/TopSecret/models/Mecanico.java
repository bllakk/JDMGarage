package com.TopSecret.models;
import java.util.List;
import java.util.ArrayList;

public class Mecanico {
    String id;
    String nome;
    String especialidade;
    int tempoExperiencia;
    List<Projeto> listaProjetos = new ArrayList<Projeto>();

    public Mecanico(String id, String nome, String especialidade, int tempoExperiencia) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
        this.tempoExperiencia = tempoExperiencia;
    }

    public String getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public int getTempoExperiencia() {
        return tempoExperiencia;
    }
    public List<Projeto> getListaProjetos() {
        return listaProjetos;
    }
}
