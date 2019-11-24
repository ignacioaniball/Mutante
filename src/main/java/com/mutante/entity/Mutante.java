package com.mutante.entity;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Document(collection = "mutante")
@JsonPropertyOrder({"mutanteId", "adn"})
public class Mutante {

	@Id
	@NotNull
	private Long mutanteId;
	
	@NotNull
	private String[] adn;

	public Long getMutanteId() {
		return mutanteId;
	}

	public void setMutanteId(Long mutanteId) {
		this.mutanteId = mutanteId;
	}

	public String[] getAdn() {
		return adn;
	}

	public void setAdn(String[] adn) {
		this.adn = adn;
	}
	
	
}
