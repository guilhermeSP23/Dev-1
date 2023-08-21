package br.com.fifa.Fifa.DAO;

import org.springframework.stereotype.Repository;
import br.com.fifa.Fifa.model.Album;

import java.util.List;

@Repository
public interface AlbumDAO extends GenericCrudRepository<Album, Long> {

    List<Album> findByNome(String nome);

    List<Album> findByNomeContaining(String nome);

    List<Album> findByPaisSedeContaining(String paisSede);

    List<Album> findByAnoLessThan(int ano);

    List<Album> findByAnoGreaterThan(int ano);
}
