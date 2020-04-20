package com.github.fatimascarneiro.ayudame.services;

import com.github.fatimascarneiro.ayudame.forms.PublicacaoForm;
import com.github.fatimascarneiro.ayudame.views.PublicacaoView;
import com.github.fatimascarneiro.ayudame.vitrine.publicacao.Publicacao;
import com.github.fatimascarneiro.ayudame.dao.PublicacaoDao;
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
        return (nomeEmpresa != null) ? nomeEmpresa : "";
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getDescricao() {
        return (descricao != null ) ? descricao : "";
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTelefone() {
        return (telefone != null) ? telefone : "";
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return (endereco != null) ? endereco : "";
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public PublicacaoView adicionarPublicacao(PublicacaoForm form) {
        return dao.adicionarPublicacao(form);
    }

    public List<Publicacao> listarPublicacoes() {
        return dao.listarPublicacoes();
    }
}
