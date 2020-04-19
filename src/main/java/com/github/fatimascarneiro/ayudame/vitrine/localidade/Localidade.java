package com.github.fatimascarneiro.ayudame.vitrine.localidade;

import com.github.fatimascarneiro.ayudame.vitrine.localidade.Estado;

public class Localidade {

    private int id;

    private String cidade;

    private Estado estado;

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
