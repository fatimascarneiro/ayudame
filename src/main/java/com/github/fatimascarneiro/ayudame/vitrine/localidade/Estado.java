package com.github.fatimascarneiro.ayudame.vitrine.localidade;

public enum Estado {

    ACRE("AC", "Acre", Regiao.NORTE),
    ALAGOAS("AL", "Alagoas", Regiao.NORDESTE),
    AMAPA("AP", "Amapá", Regiao.NORTE),
    AMAZONAS("AM", "Amazonas", Regiao.NORTE),
    BAHIA("BA", "Bahia", Regiao.NORDESTE),
    CEARA("CE", "Ceará", Regiao.NORDESTE),
    DISTRITO_FEDERAL("DF", "Distrito Federal", Regiao.CENTRO_OESTE),
    ESPIRITO_SANTO ("ES", "Espírito Santo", Regiao.SUDESTE),
    GOIAS("GO", "Goiás", Regiao.CENTRO_OESTE),
    MARANHAO("MA", "Maranhão", Regiao.NORDESTE),
    MATO_GROSSO("MT", "Mato Grosso", Regiao.CENTRO_OESTE),
    MATO_GROSSO_DO_SUL("MS", "Mato Grosso do Sul", Regiao.CENTRO_OESTE),
    MINAS_GERAIS("MG", "Minas Gerais", Regiao.SUDESTE),
    PARA("PA", "Pará", Regiao.NORTE),
    PARAIBA("PB", "Paraíba", Regiao.NORDESTE),
    PARANA("PR", "Paraná", Regiao.SUL),
    PERNAMBUCO("PE", "Pernambuco", Regiao.NORDESTE),
    RIO_DE_JANEIRO("RJ", "Rio de Janeiro", Regiao.SUDESTE),
    RIO_GRANDE_DO_NORTE("RN", "Rio Grande do Norte", Regiao.NORDESTE),
    RIO_GRANDE_DO_SUL("RS", "Rio Grande do Sul", Regiao.SUL),
    RONDONIA("RO", "Rondônia", Regiao.NORTE),
    RORAIMA("RR", "Roraima", Regiao.NORTE),
    SANTA_CATARINA("SC", "Santa Catarina", Regiao.SUL),
    SAO_PAULO("SP", "São Paulo", Regiao.SUDESTE),
    SERGIPE("SE", "Sergipe", Regiao.NORDESTE),
    TOCANTINS("TO", "Tocantins", Regiao.NORDESTE);

    private String sigla;

    private String nome;

    private Regiao regiao;

    Estado(String sigla, String nome, Regiao regiao) {
        this.sigla = sigla;
        this.nome = nome;
        this.regiao = regiao;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Regiao getRegiao() {
        return regiao;
    }

    public void setRegiao(Regiao regiao) {
        this.regiao = regiao;
    }
}
