package com.github.fatimascarneiro.ayudame.vitrine;

import com.github.fatimascarneiro.ayudame.vitrine.publicacao.Publicacao;

import java.util.List;

public class VitrineDeServicosService {

    private VitrineDeServicosDao dao;

    private List<Publicacao> publicacoes;

    public List<Publicacao> getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(List<Publicacao> publicacoes) {
        this.publicacoes = publicacoes;
    }

    public List<Publicacao> listarPublicacoes() {
        return dao.listarPublicacoes();
    }
}
