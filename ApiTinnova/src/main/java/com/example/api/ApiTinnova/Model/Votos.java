package com.example.api.ApiTinnova.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_votos")
public class Votos implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private double eleitores;
	private double validos;
	private double brancos;
	private double nulos;
	
	public double getEleitores() {
		return eleitores;
	}
	public void setEleitores(double eleitores) {
		this.eleitores = eleitores;
	}
	public double getValidos() {
		return validos;
	}
	public void setValidos(double validos) {
		this.validos = validos;
	}
	public double getBrancos() {
		return brancos;
	}
	public void setBrancos(double brancos) {
		this.brancos = brancos;
	}
	public double getNulos() {
		return nulos;
	}
	public void setNulos(double nulos) {
		this.nulos = nulos;
	}
}
