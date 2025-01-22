package com.TopSecret.models;

public class Usuario {
    private String id;
    private String username;
    private String senha;
    private String tipoUsuario;

    public Usuario(String id, String username, String senha, String tipoUsuario) {
        this.id = id;
        this.username = username;
        this.senha = senha;
        this.tipoUsuario = tipoUsuario;
    }

    public String getId() {
        return id;
    }
    public String getUsername() {
        return username;
    }
    public String getSenha() {
        return senha;
    }
    public String getTipoUsuario() {
        return tipoUsuario;
    }
}
