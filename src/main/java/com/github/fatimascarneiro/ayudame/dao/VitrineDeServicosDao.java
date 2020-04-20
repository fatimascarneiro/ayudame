package com.github.fatimascarneiro.ayudame.dao;

import com.github.fatimascarneiro.ayudame.vitrine.publicacao.Publicacao;

import java.util.ArrayList;
import java.util.List;

public class VitrineDeServicosDao  {

     private final List<Publicacao> dbPublicacoes;

     public VitrineDeServicosDao() {
         dbPublicacoes = new ArrayList<>();
     }

     public List<Publicacao> adicionarPublicacoes(Publicacao publicacao) {
         dbPublicacoes.add(publicacao);
         return dbPublicacoes;
     }

     public List<Publicacao> listarPublicacoes() {
         return dbPublicacoes;
     }
}
