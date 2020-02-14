package com.example.api.ApiTinnova.Repository;

import org.springframework.stereotype.Repository;

import com.example.api.ApiTinnova.Model.Votos;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface VotosRepository extends CrudRepository<Votos, String> {

	public double VotosValidos();
	public double Votosbrancos();
	public double Votosnulos();
	
}