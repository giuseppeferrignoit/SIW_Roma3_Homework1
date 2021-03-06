package it.uniroma3.siw.hw1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Indirizzo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(nullable=false)
	private String via;
	
	@Column(nullable=false)
	private Integer numeroCivico;
	
	@Column(nullable=false)
	private String comune;
	
	@Column(nullable=false)
	private  Integer cap;
	
	@Column(nullable=false)
	private String provincia;

	// Metodi getter e setter
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public Integer getNumeroCivico() {
		return numeroCivico;
	}

	public void setNumeroCivico(Integer numeroCivico) {
		this.numeroCivico = numeroCivico;
	}

	public String getComune() {
		return comune;
	}

	public void setComune(String comune) {
		this.comune = comune;
	}

	public Integer getCap() {
		return cap;
	}

	public void setCap(Integer cap) {
		this.cap = cap;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
}
