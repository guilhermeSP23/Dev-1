package br.com.fifa.Fifa.DAO;

import br.com.fifa.Fifa.model.Cromo;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface CromoDAO extends GenericCrudRepository<Cromo, Long> {

    List<Cromo> findByNome(String nome);

    List<Cromo> findByNomeContaining(String nome);

    List<Cromo> findByRaroContaining(Boolean raro);

    List<Cromo> findBySelecaoContaining(String selecao);
}
