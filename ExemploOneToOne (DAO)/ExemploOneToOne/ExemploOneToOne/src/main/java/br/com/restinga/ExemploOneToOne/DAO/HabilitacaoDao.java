package br.com.restinga.ExemploOneToOne.DAO;


import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Repository;
import br.com.restinga.ExemploOneToOne.model.Habilitacao;
import br.com.restinga.ExemploOneToOne.repository.GenericCrudRepository;

@Repository
public interface HabilitacaoDao extends GenericCrudRepository<Habilitacao, Long> {
    
    List<Habilitacao> findByValidade(LocalDate validade);
    List<Habilitacao> findByNumero(String numero);

}
