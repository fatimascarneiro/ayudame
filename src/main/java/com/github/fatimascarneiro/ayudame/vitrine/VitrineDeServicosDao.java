package com.github.fatimascarneiro.ayudame.vitrine;

import com.github.fatimascarneiro.ayudame.vitrine.categoriadeservico.CategoriaDeServicos;
import com.github.fatimascarneiro.ayudame.vitrine.localidade.Localidade;
import com.github.fatimascarneiro.ayudame.vitrine.prestadordeservico.PrestadorDeServico;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VitrineDeServicosDao  {

     private List<PrestadorDeServico> dbPrestadoresDeServicos;

     private List<Localidade> local;


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


     public List<PrestadorDeServico> listarPrestadorDeServicoPorNome(String nome) {
        return dbPrestadoresDeServicos.stream()
                .filter(prestadorDeServico -> prestadorDeServico.getNome().equals(nome))
                .collect(Collectors.toList());
    }
}
