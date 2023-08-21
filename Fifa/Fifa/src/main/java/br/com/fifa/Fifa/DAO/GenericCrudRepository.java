package br.com.fifa.Fifa.DAO;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.util.Optional;

@NoRepositoryBean
public interface GenericCrudRepository<Type, ID> extends Repository<Type, ID> {

    // Método recebe instância da entidade a ser salva e retorna a entidade salva./*

    public <S extends Type> S save(S s);

    // Recebe um iterável contendo as instâncias das entidades a serem salvas e
    // retorna um iterável
    // contendo as entidades salvas.

    public <S extends Type> Iterable<S> saveAll(Iterable<S> iterable);

    // Recebe o ID da entidade a ser buscada e retorna um Optional contendo a
    // entidade, se encontrada.

    public Optional<Type> findById(ID id);

    // Recebe o ID da entidade a ser verificada e retorna um booleano indicando se a
    // entidade existe ou não.

    public boolean existsById(ID id);

    // Retorna um iterável contendo todas as entidades.

    public Iterable<Type> findAll();

    // Recebe um iterável contendo os IDs das entidades a serem buscadas e retorna
    // um iterável contendo as entidades encontradas.

    public Iterable<Type> findAllById(Iterable<ID> iterable);

    // Retorna um long contendo o número total de entidades.

    public long count();

    // Recebe o ID da entidade a ser excluída.

    public void deleteById(ID id);

    // Recebe a instância da entidade a ser excluída.

    public void delete(Type t);

    // Recebe um iterável contendo as instâncias das entidades a serem excluídas.

    public void deleteAll(Iterable<? extends Type> iterable);

    // Método para excluir todas as entidades do tipo especificado.

    public void deleteAll();

}
