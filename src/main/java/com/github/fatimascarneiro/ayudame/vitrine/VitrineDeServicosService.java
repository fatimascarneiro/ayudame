package com.github.fatimascarneiro.ayudame.vitrine;

import com.github.fatimascarneiro.ayudame.VitrineDeServicosDao;

import java.util.List;

public class VitrineDeServicosService {

    private VitrineDeServicosDao dao;

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

    private List<PrestadorDeServico> listarPrestadoresPorCategoriasDeServicos(CategoriaDeServicos categoriaDeServicos) {
        return dao.listarPrestadorDeServicoPelaCategoriaDeServico(categoriaDeServicos);
    }

    private List<PrestadorDeServico> listarPrestadoresPorNome(String nome) {
        return dao.listarPrestadorDeServicoPorNome(nome);
    }

    private List<PrestadorDeServico> listarPrestadoresPorRegiao(Regiao regiao) {
        return dao.listarPrestadorDeServicoPorRegiao(regiao);
    }
}