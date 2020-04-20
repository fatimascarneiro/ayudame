package com.github.fatimascarneiro.ayudame.vitrine.publicacao;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PublicacaoDao {

//TODO FICARÁ ASSIM ATÉ EU IMPLEMENTAR O BANCO DE DADOS
    private final List<Publicacao> dbPublicacoes;

    private Publicacao publicacao;

    public PublicacaoDao() {
        dbPublicacoes = new ArrayList<>();
    }

    public Publicacao adicionarPublicacao(String nomeEmpresa, String descricao, String telefone, String endereco) {
        publicacao = new Publicacao();

        publicacao.setNomeEmpresa(nomeEmpresa);
        publicacao.setDescricao(descricao);
        publicacao.setTelefone(telefone);
        publicacao.setEndereco(endereco);

        dbPublicacoes.add(publicacao);
        return publicacao;
    }

    public List<Publicacao> listarPublicacoes() {
        return dbPublicacoes;
    }
    
}
