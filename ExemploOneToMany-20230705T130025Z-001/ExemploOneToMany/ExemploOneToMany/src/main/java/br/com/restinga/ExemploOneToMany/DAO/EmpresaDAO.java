package br.com.restinga.ExemploOneToMany.DAO;

import org.springframework.stereotype.Repository;

import br.com.restinga.ExemploOneToMany.model.Empresa;
import br.com.restinga.ExemploOneToMany.repository.GenericCrudRepository;

@Repository
public interface EmpresaDAO extends GenericCrudRepository<Empresa, Long> {

}
