package br.com.restinga.ExemploOneToMany.DAO;

import org.springframework.stereotype.Repository;

import br.com.restinga.ExemploOneToMany.model.Departamento;
import br.com.restinga.ExemploOneToMany.repository.GenericCrudRepository;

@Repository
public interface DepartamentoDAO extends GenericCrudRepository<Departamento, Long> {

}
