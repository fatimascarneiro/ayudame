package com.github.fatimascarneiro.ayudame.vitrine.categoriadeservico;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CategoriaDeServicosDao {

    //TODO propriedade criada enquanto o banco de dados não é implementado
    private List<CategoriaDeServicos> dbCategoriasDeServicos = new ArrayList<>();

    //TODO método criado enquanto o banco de dados não é implementado
    public CategoriaDeServicosDao(List<CategoriaDeServicos> dbCategoriasDeServicos) {
        this.dbCategoriasDeServicos = dbCategoriasDeServicos;
    }

    public CategoriaDeServicosDao() {
    }

    public List<CategoriaDeServicos> getDbCategoriasDeServicos() {
        return dbCategoriasDeServicos;
    }

    public void setDbCategoriasDeServicos(List<CategoriaDeServicos> dbCategoriasDeServicos) {
        this.dbCategoriasDeServicos = dbCategoriasDeServicos;
    }

    //TODO método criado enquanto o banco de dados não é implementado
    public void adicionarCategoriasDeServicos(CategoriaDeServicos categoriaDeServicos) {
        dbCategoriasDeServicos.add(categoriaDeServicos);
    }

    public CategoriaDeServicos cadastraCategoriaDeServico(String nome, String descricao) {
        CategoriaDeServicos categoriaDeServicos = new CategoriaDeServicos(nome, descricao);

        categoriaDeServicos.setNome(nome);
        categoriaDeServicos.setDescricao(descricao);

        adicionarCategoriasDeServicos(categoriaDeServicos);

        return categoriaDeServicos;
    }

    public void deletarCategoriaDeServico(int id) {
        dbCategoriasDeServicos.remove(id);
    }

    public List<CategoriaDeServicos> listarCategoriaDeServicoPorNome(String nome) {
        return dbCategoriasDeServicos.stream()
                .filter(categoriaDeServicos -> categoriaDeServicos.getNome().equals(nome))
                .collect(Collectors.toList());
    }

    public CategoriaDeServicos editarCategoriaDeServico(int categoriaDeServicoKey, String nome, String descricao) {
        CategoriaDeServicos categoriaDeServicosEditavel = dbCategoriasDeServicos.get(categoriaDeServicoKey);

        if (nome != null) {
            categoriaDeServicosEditavel.setNome(nome);
        }

        if (descricao != null) {
            categoriaDeServicosEditavel.setDescricao(descricao);
        }

        return categoriaDeServicosEditavel;
    }
}
