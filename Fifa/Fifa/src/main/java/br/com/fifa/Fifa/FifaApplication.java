package br.com.fifa.Fifa;

//import java.sql.Time;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.fifa.Fifa.DAO.AlbumDAO;
import br.com.fifa.Fifa.DAO.CromoDAO;
import br.com.fifa.Fifa.model.Album;
import br.com.fifa.Fifa.model.Cromo;

@SpringBootApplication
public class FifaApplication {

	@Autowired
	AlbumDAO albumDAO;
	@Autowired
	CromoDAO cromoDAO;

	public static void main(String[] args) {
		SpringApplication.run(FifaApplication.class, args);
	}

	@Bean
	public CommandLineRunner initialData(AlbumDAO albumDAO, CromoDAO cromoDAO) {
		return (args) -> {

			Cromo cromo = new Cromo(true, true, "versao A", "Ronaldo", "Brasil");
			Cromo cromo2 = new Cromo(true, true, "versao B", "Gilberto", "Alemanha");
			Cromo cromo3 = new Cromo(false, true, "versao A", "Everton", "Catar");
			Cromo cromo4 = new Cromo(true, false, "versao B", "Luan", "Holanda");
			Cromo cromo5 = new Cromo(true, true, "versao B", "Tiburcio", "EUA");
			Cromo cromo6 = new Cromo(true, true, "versao B", "Jarbas", "França");
			Cromo cromo7 = new Cromo(true, true, "versao A", "julio", "Noruega");
			Cromo cromo8 = new Cromo(true, true, "versao A", "Alan", "Holanda");
			Cromo cromo9 = new Cromo(true, false, "versao B", "reginaldo", "Brasil");
			Cromo cromo10 = new Cromo(false, true, "versao A", "Junior", "Alemanha");
			Album album = new Album("Copa 2014", "Brasil", 2014, null, "Globo");
			Album album2 = new Album("Copa 2022", "Catar", 2022, null, "Jihad News");

			album.addCromo(cromo);
			album.addCromo(cromo2);
			album.addCromo(cromo3);
			album.addCromo(cromo4);
			album.addCromo(cromo5);
			album2.addCromo(cromo6);
			album2.addCromo(cromo7);
			album2.addCromo(cromo8);
			album2.addCromo(cromo9);
			album2.addCromo(cromo10);
			albumDAO.save(album);
			albumDAO.save(album2);

			List<Album> busca = albumDAO.findByNomeContaining("copa");
			System.out.println("1 - Metódo de Consulta");
			System.out.println("-------------------");
			System.out.println("Busca o Album pelo seu nome:");
			for (Album p : busca) {
				System.out.println(p.getNome());
			}
			System.out.println();
			System.out.println("====================================");

			List<Album> busca2 = albumDAO.findByPaisSedeContaining("Brasil");
			System.out.println("2 - Metódo de Consulta");
			System.out.println("-------------------");
			System.out.println("Busca o Album pelo País Sede:");
			for (Album p2 : busca2) {
				System.out.print(p2.getPaisSede());
				System.out.print(" - ");
				System.out.println(p2.getNome());

			}

			List<Album> busca3 = albumDAO.findByAnoGreaterThan(2018);
			System.out.println("3 - Metódo de Consulta");
			System.out.println("-------------------");
			System.out.println("Lista album pelo ano :");
			for (Album p3 : busca3) {
				System.out.print(p3.getAno());
				System.out.print(" - ");
				System.out.print(p3.getPaisSede());

			}
			System.out.println();
			System.out.println("====================================");

			List<Cromo> busca6 = cromoDAO.findBySelecaoContaining("Holanda");
			System.out.println("6 - Metódo de Consulta");
			System.out.println("-------------------");
			System.out.println("Busca a seleção Holandesa:");
			for (Cromo p6 : busca6) {
				System.out.print(p6.getSelecao());
				System.out.print(" - ");
				System.out.println(p6.getNome());

			}
			System.out.println();
			System.out.println("====================================");

		};
	}

}
