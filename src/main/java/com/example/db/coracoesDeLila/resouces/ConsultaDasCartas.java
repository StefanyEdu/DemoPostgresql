package com.example.db.coracoesDeLila.resouces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.db.coracoesDeLila.models.Cartas;
import com.example.db.coracoesDeLila.repository.CartasRepository;

@RestController
@RequestMapping(value="/api")
public class ConsultaDasCartas {
	
 		@Autowired
		CartasRepository cartasRepository;

@GetMapping("/cartas")
public List<Cartas> listaCartas(){
	return cartasRepository.findAll();
	
}
}
