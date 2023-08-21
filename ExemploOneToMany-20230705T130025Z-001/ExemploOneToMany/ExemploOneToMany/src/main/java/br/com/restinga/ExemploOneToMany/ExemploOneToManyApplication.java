package br.com.restinga.ExemploOneToMany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import br.com.restinga.ExemploOneToMany.DAO.DepartamentoDAO;
import br.com.restinga.ExemploOneToMany.DAO.EmpresaDAO;
import br.com.restinga.ExemploOneToMany.model.Departamento;
import br.com.restinga.ExemploOneToMany.model.Empresa;

@SpringBootApplication
public class ExemploOneToManyApplication {

	@Autowired
	EmpresaDAO empresaDAO;

	@Autowired
	DepartamentoDAO departamentoDAO;

	public static void main(String[] args) {
		SpringApplication.run(ExemploOneToManyApplication.class, args);
	}

	@Bean
	public CommandLineRunner initialData() {
		return (args) -> {
			Empresa empresa = new Empresa("HXD", "12345678909", "MundoTec");
			Departamento departamento = new Departamento("Setor de informatica", 48, "10", empresa);
			Departamento departamento2 = new Departamento("Setor de limpeza", 8, "1", empresa);

			empresa.setDepartamento(departamento);
			departamento.setEmpresa(empresa);
			departamento2.setEmpresa(empresa);
			empresaDAO.save(departamento);

		};
	}
}
