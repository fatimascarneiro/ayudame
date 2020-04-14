package com.github.fatimascarneiro.ayudame.vitrine.categoriadeservico;

import java.util.List;

public class CategoriaDeServicosService {

    private String nome;

    private String descricao;

    private CategoriaDeServicosForm form;

    private CategoriaDeServicosDao dao;

    public String getNome() {
        return (nome != null) ? nome : "";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return (descricao != null) ? descricao : "";
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public CategoriaDeServicos cadastraCategoriaDeServico(String nome, String descricao) {
        return  dao.cadastraCategoriaDeServico(nome, descricao);
    }

    public void deletarCategoriaDeServico(int id) {
        dao.deletarCategoriaDeServico(id);
    }

    public List<CategoriaDeServicos> listarCategoriaDeServicoPorNome(String nome) {
        return dao.listarCategoriaDeServicoPorNome(nome);
    }

    public CategoriaDeServicos editarCategoriaDeServico(int categoriaDeServicoKey, String nome, String descricao) {
        return dao.editarCategoriaDeServico(categoriaDeServicoKey, nome, descricao);
    }
}
