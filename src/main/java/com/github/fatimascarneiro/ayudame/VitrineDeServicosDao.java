package com.github.fatimascarneiro.ayudame;

import com.github.fatimascarneiro.ayudame.vitrine.CategoriaDeServicos;
import com.github.fatimascarneiro.ayudame.vitrine.PrestadorDeServico;
import com.github.fatimascarneiro.ayudame.vitrine.Regiao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VitrineDeServicosDao  {

     private List<PrestadorDeServico> dbPrestadoresDeServicos;

     private List<Regiao> regioes;


     public VitrineDeServicosDao() {
         dbPrestadoresDeServicos = new ArrayList<>();
     }

     public List<PrestadorDeServico> adicionarPrestadoresDeServicos(PrestadorDeServico prestadorDeServico) {
         dbPrestadoresDeServicos.add(prestadorDeServico);
         return dbPrestadoresDeServicos;
     }

     public void deletarPrestadorDeServicos(int id) {
         dbPrestadoresDeServicos.remove(id);
     }

     public List<PrestadorDeServico> listarPrestadorDeServicoPelaCategoriaDeServico(CategoriaDeServicos categoriaDeServicos) {
         return dbPrestadoresDeServicos.stream()
                .filter(prestadorDeServico -> prestadorDeServico.getCategoriaDeServicos().equals(categoriaDeServicos))
                .collect(Collectors.toList());
     }

    public List<PrestadorDeServico> listarPrestadorDeServicoPorRegiao(Regiao regiao) {
        return dbPrestadoresDeServicos.stream()
                .filter(prestadorDeServico -> prestadorDeServico.getRegiao().equals(regiao))
                .collect(Collectors.toList());
    }

    public List<PrestadorDeServico> listarPrestadorDeServicoPorNome(String nome) {
        return dbPrestadoresDeServicos.stream()
                .filter(prestadorDeServico -> prestadorDeServico.getNome().equals(nome))
                .collect(Collectors.toList());
    }

}
