package br.com.fiap.ChallengeApisprint3.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "T_CLG_ENDERECO")
public class Endereco implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private int cep;
	
	private String nomeRua;

	private int numeroRua;

	private String complemento;

	//Relacao de muitos para um de endereco para Bairro
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn()
	private Bairro bairro;

	public Endereco() {

	}

	public Endereco(int cep, String nomeRua, int numeroRua, String complemento, Bairro bairro) {
		super();
		this.cep = cep;
		this.nomeRua = nomeRua;
		this.numeroRua = numeroRua;
		this.complemento = complemento;
		this.bairro = bairro;
	}
	
	public int getCep() {
		return cep;
	}
	
	public void setCep(int cep) {
		this.cep = cep;
	}
	
	public String getNomeRua() {
		return nomeRua;
	}
	
	public void setNomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}
	
	public int getNumeroRua() {
		return numeroRua;
	}
	
	public void setNumeroRua(int numeroRua) {
		this.numeroRua = numeroRua;
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}

	@Override
	public String toString() {
		return "Endereco [cep=" + cep + ", complementob " + complemento + "nomeRua" + nomeRua + ", numeroRua=" + numeroRua + ", bairro=" + "]";
	}

}
