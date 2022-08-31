package br.com.fiap.ChallengeApisprint3.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private  String nomeGenero; 

	public Genero() {
    	
    }
	
	public Genero(long id, String nomeGenero) {
		super();
		this.id = id;
		this.nomeGenero = nomeGenero;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public String getNomeGenero() {
		return nomeGenero;
	}


	public void setNomeGenero(String nomeGenero) {
		this.nomeGenero = nomeGenero;
	}
	
	@Override
	public String toString() {
		return "Genero [id=" + id + ", nomeGenero=" + nomeGenero + "]";
	}

}
