package br.com.restinga.ExemploOneToOne.model;

import java.time.LocalDate;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Habilitacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 20, unique = true)
    private String numero;
    @Temporal(TemporalType.DATE)
    private LocalDate validade;
    @Column(nullable = false, length = 200)
    private String categoria;
    @OneToOne(cascade = CascadeType.ALL, optional = true,targetEntity = Pessoa.class,fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name ="pessoa_id")
    private Pessoa pessoa;

    public Habilitacao(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Habilitacao(){

    }
    
    public Habilitacao(String numero, LocalDate validade, String categoria) {
        this.numero = numero;
        this.validade = validade;
        this.categoria = categoria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

     public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

}
