package br.com.restinga.ExemploOneToOne;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.restinga.ExemploOneToOne.DAO.HabilitacaoDao;
import br.com.restinga.ExemploOneToOne.DAO.PersonDAO;
import br.com.restinga.ExemploOneToOne.model.Habilitacao;
import br.com.restinga.ExemploOneToOne.model.Pessoa;

@SpringBootApplication
public class ExemploOneToOneApplication {

	@Autowired
	PersonDAO personDAO;

	@Autowired
	HabilitacaoDao habilitacaoDao;

	public static void main(String[] args) {
		SpringApplication.run(ExemploOneToOneApplication.class, args);
	}

	@Bean
	public CommandLineRunner initialData(){
		return (args) -> {

			Pessoa pessoa = new Pessoa("Leon Scott Kennedy", "12345678909");
			Habilitacao habilitacao = new Habilitacao("4", LocalDate.of(2025, 10, 4), "Categoria B");

			habilitacao.setPessoa(pessoa);
			personDAO.save(habilitacao);

			List<Pessoa> busca = personDAO.findByNome("Leon Scott Kennedy");
				System.out.println("-----------------");
				for(Pessoa p: busca){
					System.out.println(p.getNome());
				}
				System.out.println("-----------------");

				List<Pessoa> busca2 = personDAO.findByCpf("12345678909");
				System.out.println("-----------------");
				for(Pessoa p: busca2){
					System.out.println(p.getCpf());
				}
				System.out.println("-----------------");


				List<Habilitacao> busca3 = habilitacaoDao.findByValidade(LocalDate.of(2025, 10, 4));
				System.out.println("-----------------");
				for(Habilitacao p: busca3){
					System.out.println(p.getValidade());
				}
				System.out.println("-----------------");
				List<Habilitacao> busca4 = habilitacaoDao.findByNumero("4");
				System.out.println("-----------------");
				for(Habilitacao p: busca4){
					System.out.println(p.getNumero());
				}
				System.out.println("-----------------");


			

		};


	}

}



