package br.com.fiap.ChallengeApisprint3.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "T_CLG_ESTADO")
public class Estado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codEstado;

	private String nomeEstado;

	private String sigla;

	@OneToMany
	private List<Cidade> cidades;

	public Estado () {}
	
	public Estado(int codEstado, String nomeEstado, String sigla) {
		super();
		this.codEstado = codEstado;
		this.nomeEstado = nomeEstado;
		this.sigla = sigla;
	}
	public int getCodEstado() {
		return codEstado;
	}
	public void setEstado(int codEstado) {
		this.codEstado = codEstado;
	}
	public String getNomeEstado() {
		return nomeEstado;
	}
	public void setNomeEstado(String nomeEstado) {
		this.nomeEstado = nomeEstado;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	@Override
	public String toString() {
		return "Estado [estado=" + codEstado + ", nomeEstado=" + nomeEstado + ", sigla=" + sigla + "]";
	}
	
}
