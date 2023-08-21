package br.com.restinga.ExemploOneToOne.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.restinga.ExemploOneToOne.model.Pessoa;
import br.com.restinga.ExemploOneToOne.repository.GenericCrudRepository;

@Repository
public interface PersonDAO extends GenericCrudRepository<Pessoa, Long> {

    List<Pessoa> findByNome(String nome);
    List<Pessoa> findByCpf(String cpf);
    
    
    
}
