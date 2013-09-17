package br.com.caelum.agiletickets.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Estabelecimento {

	@Id
	@GeneratedValue
	private Long id;

	private String nome;

	private String endereco;
	
	@OneToMany
	private List<Espetaculo> espetaculos;

	public List<Espetaculo> getEspetaculos() {
		return espetaculos;
	}

	public void setEspetaculos(List<Espetaculo> espetaculos) {
		this.espetaculos = espetaculos;
	}

	private Boolean temEstacionamento = false;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTemEstacionamento(boolean temEstacionamento) {
		this.temEstacionamento = temEstacionamento;
	}

	public boolean isTemEstacionamento() {
		return temEstacionamento != null && temEstacionamento;
	}

}
