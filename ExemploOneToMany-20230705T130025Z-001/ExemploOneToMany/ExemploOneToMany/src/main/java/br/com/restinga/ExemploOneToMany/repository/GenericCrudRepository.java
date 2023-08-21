package br.com.restinga.ExemploOneToMany.repository;

import java.util.Optional;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import br.com.restinga.ExemploOneToMany.model.Departamento;
import br.com.restinga.ExemploOneToMany.model.Empresa;

@NoRepositoryBean
public interface GenericCrudRepository<Type, ID> extends Repository<Type, ID> {

    public <S extends Type> S save(Departamento departamento);

    public <S extends Type> S save(Empresa empresa);

    public <S extends Type> Iterable<S> saveAll(Iterable<S> iterable);

    public Optional<Type> findById(ID id);

    public boolean existsById(ID id);

    public Iterable<Type> findAll();

    public Iterable<Type> findAllById(Iterable<ID> iterable);

    public long count();

    public void deleteById(ID id);

    public void delete(Type t);

    public void deleteAll(Iterable<? extends Type> iterable);

    public void deleteAll();

}