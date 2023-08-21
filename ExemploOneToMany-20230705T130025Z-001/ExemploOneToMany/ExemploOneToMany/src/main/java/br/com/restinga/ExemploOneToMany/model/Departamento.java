package br.com.restinga.ExemploOneToMany.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 200, nullable = false)
    private String nome;
    @Column(length = 100, nullable = false)
    private int numeroFuncionario;
    @Column(length = 9, nullable = false)
    private String andar;

    @ManyToOne(targetEntity = Empresa.class, fetch = FetchType.EAGER, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;

    public Departamento() {

    }

    public Departamento(String nome, int numeroFuncionario, String andar, Empresa empresa) {
        this.nome = nome;
        this.numeroFuncionario = numeroFuncionario;
        this.andar = andar;
        this.empresa = empresa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroFuncionario() {
        return numeroFuncionario;
    }

    public void setNumeroFuncionario(int numeroFuncionario) {
        this.numeroFuncionario = numeroFuncionario;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public void addDepartamento(Empresa empresa2) {
    }
}
