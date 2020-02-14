package com.example.api.ApiTinnova.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.api.ApiTinnova.Model.Fatorial;

@Repository
public interface FatorialRepository extends CrudRepository<Fatorial, String>{

	
}
