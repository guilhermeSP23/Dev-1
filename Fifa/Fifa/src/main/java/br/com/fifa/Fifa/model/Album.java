package br.com.fifa.Fifa.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String paisSede;
    private int ano;
    private List<String> selecoes = new ArrayList<String>();
    private String capa;
    private int cromos;
    private int cromosEspeciais;
    private int cromosExtras;
    @OneToMany(targetEntity = Cromo.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Cromo> cromo = new ArrayList<Cromo>();

    public Album() {

    }

    public Album(String nome, String paisSede, int ano, List<String> selecoes, String capa) {
        this.nome = nome;
        this.paisSede = paisSede;
        this.ano = ano;
        this.selecoes = selecoes;
        this.capa = capa;

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

    public String getPaisSede() {
        return paisSede;
    }

    public void setPaisSede(String paisSede) {
        this.paisSede = paisSede;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public List<String> getSelecoes() {
        return selecoes;
    }

    public void setSelecoes(List<String> selecoes) {
        this.selecoes = selecoes;
    }

    public String getCapa() {
        return capa;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }

    public int getCromos() {
        return cromos;
    }

    public void setCromos(int cromos) {
        this.cromos = cromos;
    }

    public int getCromosEspeciais() {
        return cromosEspeciais;
    }

    public void setCromosEspeciais(int cromosEspeciais) {
        this.cromosEspeciais = cromosEspeciais;
    }

    public int getCromosExtras() {
        return cromosExtras;
    }

    public void setCromosExtras(int cromosExtras) {
        this.cromosExtras = cromosExtras;
    }

    public List<Cromo> getCromo() {
        return cromo;
    }

    public void setCromo(List<Cromo> cromo) {
        this.cromo = cromo;
    }

    public void addCromo(Cromo cromo) {
        cromo.setAlbum(this);
        this.cromo.add(cromo);
    }

}