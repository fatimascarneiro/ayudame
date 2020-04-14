package com.github.fatimascarneiro.ayudame.vitrine.prestadordeservico;

import com.github.fatimascarneiro.ayudame.vitrine.categoriadeservico.CategoriaDeServicos;
import com.github.fatimascarneiro.ayudame.vitrine.localidade.Localidade;

public class PrestadorDeServico {

    private int id;

    private String nome;

    private CategoriaDeServicos categoriaDeServicos;

    private Localidade localidade;


    public PrestadorDeServico(String nome, CategoriaDeServicos categoriaDeServicos, Localidade localidade) {
        this.nome = nome;
        this.categoriaDeServicos = categoriaDeServicos;
        this.localidade = localidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CategoriaDeServicos getCategoriaDeServicos() {
        return categoriaDeServicos;
    }

    public void setCategoriaDeServicos(CategoriaDeServicos categoriaDeServicos) {
        this.categoriaDeServicos = categoriaDeServicos;
    }

    public Localidade getLocalidade() {
        return localidade;
    }

    public void setLocalidade(Localidade localidade) {
        this.localidade = localidade;
    }
}
