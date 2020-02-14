package com.example.api.ApiTinnova.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.ApiTinnova.Model.Votos;
import com.example.api.ApiTinnova.Repository.VotosRepository;

@Service
public class VotosService {
	
	@Autowired
	private VotosRepository vr;
	
	@Autowired
	private Votos v;
	
	public double votosValidos(){
		return vr.VotosValidos();
	}
	
	public double votosNulos() {
		return vr.Votosnulos();
	}
	
	public double VotosBrancos() {
		return vr.Votosbrancos();
		
	}
}
