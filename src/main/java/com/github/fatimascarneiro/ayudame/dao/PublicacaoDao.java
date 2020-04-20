package com.github.fatimascarneiro.ayudame.dao;

import com.github.fatimascarneiro.ayudame.forms.PublicacaoForm;
import com.github.fatimascarneiro.ayudame.views.PublicacaoView;
import com.github.fatimascarneiro.ayudame.vitrine.publicacao.Publicacao;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PublicacaoDao {

//TODO FICARÁ ASSIM ATÉ EU IMPLEMENTAR O BANCO DE DADOS
    private final List<Publicacao> dbPublicacoes;

    private Publicacao publicacao;

    private PublicacaoView publicacaoView;

    public PublicacaoDao() {
        dbPublicacoes = new ArrayList<>();
    }

    public PublicacaoView adicionarPublicacao(PublicacaoForm form) {
        publicacao = new Publicacao();

        publicacao.setNomeEmpresa(form.getNomeEmpresa());
        publicacao.setDescricao(form.getDescricao());
        publicacao.setTelefone(form.getTelefone());
        publicacao.setEndereco(form.getEndereco());

        dbPublicacoes.add(publicacao);

        publicacaoView = new PublicacaoView();

        publicacaoView.setDescricao(publicacao.getDescricao());
        publicacaoView.setEndereco(publicacao.getEndereco());
        publicacaoView.setNomeEmpresa(publicacao.getNomeEmpresa());
        publicacaoView.setTelefone(publicacao.getTelefone());

        return publicacaoView;
    }

    public List<Publicacao> listarPublicacoes() {
        return dbPublicacoes;
    }
    
}
