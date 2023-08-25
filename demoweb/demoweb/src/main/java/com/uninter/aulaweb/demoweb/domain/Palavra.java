package com.uninter.aulaweb.demoweb.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@SuppressWarnings("serial")
@Entity
@Table(name = "PALAVRAS")
public class Palavra extends AbstractEntity<Long> {
	
	@NotBlank(message = "Palavra é obrigatória.")
	@Size(min=2, max = 60, message = "A palavra deve conter no mínimo {min}  caracteres.")
	@Column(name="nome",nullable=false,unique=true,length=60)
	private String nome;
	
	@NotBlank(message = "O significado é obrigatório.")
	@Size(max = 60, message = "O nome do usuario deve conter no máximo 60 caracteres.")
	@Column(name="significado",nullable=false,unique=true,length=300)
	private String significado;
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSignificado() {
		return significado;
	}
	public void setSignificado(String significado) {
		this.significado = significado;
	}
	
	

}
