package com.github.fatimascarneiro.ayudame.vitrine.categoriadeservico;

import java.util.List;
import java.util.stream.Collectors;

public class CategoriaDeServicosDao {

    //TODO propriedade criada enquanto o banco de dados não é implementado
    private List<CategoriaDeServicos> dbCategoriasDeServicos;

    //TODO método criado enquanto o banco de dados não é implementado
    public CategoriaDeServicosDao(List<CategoriaDeServicos> dbCategoriasDeServicos) {
        this.dbCategoriasDeServicos = dbCategoriasDeServicos;
    }

    //TODO método criado enquanto o banco de dados não é implementado
    public List<CategoriaDeServicos> adicionarCategoriasDeServicos(CategoriaDeServicos categoriaDeServicos) {
        dbCategoriasDeServicos.add(categoriaDeServicos);
        return dbCategoriasDeServicos;
    }

    public CategoriaDeServicos cadastraCategoriaDeServico(String nome, String descricao) {
        CategoriaDeServicos categoriaDeServicos = new CategoriaDeServicos();

        categoriaDeServicos.setNome(nome);
        categoriaDeServicos.setDescricao(descricao);

        dbCategoriasDeServicos.add(categoriaDeServicos);

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
