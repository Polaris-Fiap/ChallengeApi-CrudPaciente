package br.com.fiap.ChallengeApisprint3.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Paciente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nomePaciente;
	
	private String email;
	
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dtNascimento;
	
	private int cpf;
	
	private int digitoCpf;
	
	private int telefoneDDD;
	
	private int telefone;
	
	private String estadoCivil;
	
	private String profissao;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Genero genero;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Endereco endereco;
	
	public Paciente () {
		
	}

	public Paciente(Long id, String nomePaciente, String email, Date dtNascimento, int cpf, int digitoCpf,
			int telefoneDDD, int telefone, String estadoCivil, String profissao, Genero genero, Endereco endereco) {
		super();
		this.id = id;
		this.nomePaciente = nomePaciente;
		this.email = email;
		this.dtNascimento = dtNascimento;
		this.cpf = cpf;
		this.digitoCpf = digitoCpf;
		this.telefoneDDD = telefoneDDD;
		this.telefone = telefone;
		this.estadoCivil = estadoCivil;
		this.profissao = profissao;
		this.genero = genero;
		this.endereco = endereco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getDigitoCpf() {
		return digitoCpf;
	}

	public void setDigitoCpf(int digitoCpf) {
		this.digitoCpf = digitoCpf;
	}

	public int getTelefoneDDD() {
		return telefoneDDD;
	}

	public void setTelefoneDDD(int telefoneDDD) {
		this.telefoneDDD = telefoneDDD;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Paciente [id=" + id + ", nomePaciente=" + nomePaciente + ", email=" + email + ", dtNascimento="
				+ dtNascimento + ", cpf=" + cpf + ", digitoCpf=" + digitoCpf + ", telefoneDDD=" + telefoneDDD
				+ ", telefone=" + telefone + ", estadoCivil=" + estadoCivil + ", profissao=" + profissao + ", genero="
				+ genero + "]";
	}


//	@Override
//	public String toString() {
//		return "Paciente [id=" + id + ", nomePaciente=" + nomePaciente + ", email=" + email + ", dtNascimento="
//				+ dtNascimento + ", cpf=" + cpf + ", digitoCpf=" + digitoCpf + ", telefoneDDD=" + telefoneDDD
//				+ ", telefone=" + telefone + ", estadoCivil=" + estadoCivil + ", profissao=" + profissao + ", genero="
//				+ genero + ", endereco=" + endereco + "]";
//	}

	
    
}
