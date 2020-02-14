package com.example.api.ApiTinnova.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.ApiTinnova.Repository.FatorialRepository;

@Service
public class FatorialService {
	
	@Autowired
	private FatorialRepository fr;

	
	public double fatorial(double valor) {
		
		if(valor == 1 || valor == 0) {
			return valor;
		}else {
			return fatorial(valor -1) * valor;
		}
	}
}