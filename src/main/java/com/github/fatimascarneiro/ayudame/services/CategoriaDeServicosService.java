package com.github.fatimascarneiro.ayudame.services;

import com.github.fatimascarneiro.ayudame.vitrine.categoriadeservico.CategoriaDeServicos;
import com.github.fatimascarneiro.ayudame.dao.CategoriaDeServicosDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaDeServicosService {

    private String nome;

    private String descricao;

    private final CategoriaDeServicosDao dao;

    @Autowired
    public CategoriaDeServicosService(CategoriaDeServicosDao dao) {
        this.dao = dao;
    }

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
