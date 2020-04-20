package com.github.fatimascarneiro.ayudame.vitrine.categoriadeservico;

import com.github.fatimascarneiro.ayudame.dao.CategoriaDeServicosDao;
import com.github.fatimascarneiro.ayudame.services.CategoriaDeServicosService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CategoriaDeServicosServiceTest {

    @InjectMocks
    CategoriaDeServicosService service;

    @Mock
    CategoriaDeServicosDao dao;

    private String nome;

    private String descricao;

    @Test
    public void cadastrarCategoriaDeServico() {
        dadoUmNome();
        dadoUmaDescricao();
        quandoCadastrarUmaCategoriaDeServico();
        deveRetornarUmaCategoriaDeServico();
    }

    @Test
    public void cadastrarCategoriaDeServicoCorreta() {
        dadoUmNome();
        dadoUmaDescricao();
        quandoCadastrarUmaCategoriaDeServico();
        deveRetornarUmaCategoriaDeServicoConformeOCadastro();
    }

    private void deveRetornarUmaCategoriaDeServicoConformeOCadastro() {
        when(dao.cadastraCategoriaDeServico(nome, descricao)).thenReturn(new CategoriaDeServicos(nome, descricao));
        assertEquals("ALIMENTAÇÃO", service.cadastraCategoriaDeServico(nome, descricao).getNome());
    }

    private void deveRetornarUmaCategoriaDeServico() {
        when(dao.cadastraCategoriaDeServico(service.getNome(), service.getDescricao())).thenReturn(new CategoriaDeServicos(nome, descricao));
    }

    private void quandoCadastrarUmaCategoriaDeServico() {
        service.cadastraCategoriaDeServico(nome, descricao);
    }

    private void dadoUmaDescricao() {
        descricao = "Teste para cadastro de categoria de serviços";
    }

    private void dadoUmNome() {
        nome = "ALIMENTAÇÃO";
    }
}