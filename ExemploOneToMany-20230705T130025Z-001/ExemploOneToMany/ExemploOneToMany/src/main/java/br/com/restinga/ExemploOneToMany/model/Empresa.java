package br.com.restinga.ExemploOneToMany.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 200, nullable = false)
    private String nome;
    @Column(length = 14, nullable = false)
    private String cnpj;
    @Column(length = 200, nullable = false)
    private String nomeFantasia;
    private Departamento departamento;

    @OneToMany(targetEntity = Departamento.class, fetch = FetchType.EAGER, mappedBy = "empresa", cascade = CascadeType.ALL)
    private List<Departamento> departamentos = new ArrayList<Departamento>();

    public Empresa() {

    }

    public Empresa(String nome, String cnpj, String nomeFantasia) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;

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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

}
