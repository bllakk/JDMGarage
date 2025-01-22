package com.TopSecret.models;

public class Admin extends Usuario{
    private int nivelAcesso;

    public Admin(String id, String username, String senha, String tipoUsuario) {
        super(id, username, senha, tipoUsuario);
        this.nivelAcesso = nivelAcesso;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }
}
