package com.github.fatimascarneiro.ayudame.vitrine.categoriadeservico;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

import static org.junit.Assert.*;

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

    private void deveRetornarUmaCategoriaDeServico() {
        when(dao.cadastraCategoriaDeServico(nome, descricao)).thenReturn(new CategoriaDeServicos());
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