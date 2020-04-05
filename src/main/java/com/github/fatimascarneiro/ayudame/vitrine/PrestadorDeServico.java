package com.github.fatimascarneiro.ayudame.vitrine;

import javax.validation.constraints.NotNull;

public class PrestadorDeServico {

    private int id;

    private String nome;

    private CategoriaDeServicos categoriaDeServicos;

    private Regiao regiao;


    public PrestadorDeServico(String nome, CategoriaDeServicos categoriaDeServicos, Regiao regiao) {
        this.nome = nome;
        this.categoriaDeServicos = categoriaDeServicos;
        this.regiao = regiao;
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

    public Regiao getRegiao() {
        return regiao;
    }

    public void setRegiao(Regiao regiao) {
        this.regiao = regiao;
    }
}
