package com.github.fatimascarneiro.ayudame.forms;

import javax.validation.constraints.Size;

public class PublicacaoForm {

    @Size(max = 20, message = "O nome da empresa precisa ter no máximo 20 caracteres.")
    private String nomeEmpresa;

    @Size(max = 100, message = "A descrição da tua publicação precisa ter no máximo 100 caracteres.")
    private String descricao;

    @Size(max = 10, message = "O telefone precisa ter no máximo 10 caracteres.")
    private String telefone;

    @Size(max = 60, message = "O endereço precisa ter no máximo 60 caracteres.")
    private String endereco;

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
}
