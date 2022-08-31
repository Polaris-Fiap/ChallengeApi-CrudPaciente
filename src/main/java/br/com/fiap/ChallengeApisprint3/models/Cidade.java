package br.com.fiap.ChallengeApisprint3.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "T_CLG_CIDADE")
public class Cidade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codCidade;

	private String nomeCidade;

	private String sigla;
	
	@ManyToOne(cascade=CascadeType.PERSIST, fetch = FetchType.EAGER)
	private Estado estado;

	@OneToMany
	private List<Bairro> bairros;

    public Cidade() {}

	public Cidade(int codCidade, String nomeCidade, String sigla) {
		super();
		this.codCidade = codCidade;
		this.nomeCidade = nomeCidade;
		this.sigla = sigla;
	}

	public int getCodCidade() {
		return codCidade;
	}

	public void setCodCidade(int codCidade) {
		this.codCidade = codCidade;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	// @Override
	// public String toString() {
	// 	return "Cidade [codCidade=" + codCidade + ", nomeCidade=" + nomeCidade + ", sigla=" + sigla + ", estado="
	// 			+ estado.getCodEstado() + "]";
	// }

    @Override
    public String toString() {
        return "Cidade [codCidade=" + codCidade + ", nomeCidade=" + nomeCidade + ", sigla=" + sigla;
    }
	
	
}
