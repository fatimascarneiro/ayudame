package com.github.fatimascarneiro.ayudame.vitrine;

import java.util.List;

public class VitrineDeServicos {

    private int id;

    private List<CategoriaDeServicos> categoriasDeServicos;

    private List<Regiao> regioes;

    private List<PrestadorDeServico> prestadoresDeServico;

    public List<CategoriaDeServicos> getCategoriasDeServicos() {
        return categoriasDeServicos;
    }

    public void setCategoriasDeServicos(List<CategoriaDeServicos> categoriasDeServicos) {
        this.categoriasDeServicos = categoriasDeServicos;
    }

    public List<Regiao> getRegioes() {
        return regioes;
    }

    public void setRegioes(List<Regiao> regioes) {
        this.regioes = regioes;
    }

    public List<PrestadorDeServico> getPrestadoresDeServico() {
        return prestadoresDeServico;
    }

    public void setPrestadoresDeServico(List<PrestadorDeServico> prestadoresDeServico) {
        this.prestadoresDeServico = prestadoresDeServico;
    }
}
