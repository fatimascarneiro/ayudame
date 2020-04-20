package com.github.fatimascarneiro.ayudame.vitrine.publicacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicacaoService {

    private final PublicacaoDao dao;

    private String nomeEmpresa;

    private String descricao;

    private String telefone;

    private String endereco;

    @Autowired
    public PublicacaoService(PublicacaoDao dao) {
        this.dao = dao;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Publicacao adicionarPublicacao(String nomeEmpresa, String telefone, String endereco, String descricao) {
        return dao.adicionarPublicacao(nomeEmpresa, telefone, endereco, descricao);
    }

    public List<Publicacao> listarPublicacoes() {
        return dao.listarPublicacoes();
    }
}
