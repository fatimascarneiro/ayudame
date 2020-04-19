package com.github.fatimascarneiro.ayudame.vitrine;

import com.github.fatimascarneiro.ayudame.vitrine.categoriadeservico.CategoriaDeServicos;
import com.github.fatimascarneiro.ayudame.vitrine.localidade.Localidade;
import com.github.fatimascarneiro.ayudame.vitrine.prestadordeservico.PrestadorDeServico;

import java.util.List;

public class VitrineDeServicosService {

    private VitrineDeServicosDao dao;

    private List<CategoriaDeServicos> categoriasDeServicos;

    private List<Localidade> localidades;

    private List<PrestadorDeServico> prestadoresDeServico;

    public List<CategoriaDeServicos> getCategoriasDeServicos() {
        return categoriasDeServicos;
    }

    public void setCategoriasDeServicos(List<CategoriaDeServicos> categoriasDeServicos) {
        this.categoriasDeServicos = categoriasDeServicos;
    }

    public List<PrestadorDeServico> getPrestadoresDeServico() {
        return prestadoresDeServico;
    }

    public void setPrestadoresDeServico(List<PrestadorDeServico> prestadoresDeServico) {
        this.prestadoresDeServico = prestadoresDeServico;
    }

    public List<Localidade> getLocalidades() {
        return localidades;
    }

    public void setLocalidades(List<Localidade> localidades) {
        this.localidades = localidades;
    }

    public List<PrestadorDeServico> listarPrestadoresPorNome(String nome) {
        return dao.listarPrestadorDeServicoPorNome(nome);
    }
}
