package com.github.fatimascarneiro.ayudame.vitrine;

import com.github.fatimascarneiro.ayudame.vitrine.categoriadeservico.CategoriaDeServicos;
import com.github.fatimascarneiro.ayudame.vitrine.prestadordeservico.PrestadorDeServico;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class VitrineDeServicosServiceTest {

    @InjectMocks
    VitrineDeServicosService service;

    @Mock
    VitrineDeServicosDao dao;

    List<PrestadorDeServico> prestadoresDeServicos;

    CategoriaDeServicos categoriaDeServicos;

    String nome;

    @Test
    public void listarPrestadoresPorNome() {
        dadoUmNome();
        quandoListarPrestadoresPorNome();
        deveRetornarListaDePrestadoresDeServicosComNomeFiltrado();
    }

    private void deveRetornarListaDePrestadoresDeServicosComNomeFiltrado() {
        when(dao.listarPrestadorDeServicoPorNome(nome)).thenReturn(prestadoresDeServicos);
    }

    private void quandoListarPrestadoresPorNome() {
        service.listarPrestadoresPorNome(nome);
    }

    private void dadoUmNome() {
        nome = "Maria";
    }

}