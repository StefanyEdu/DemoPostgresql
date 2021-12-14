package com.example.db.coracoesDeLila.resouces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.db.coracoesDeLila.models.Cartas;
import com.example.db.coracoesDeLila.repository.CartasRepository;

@RestController
@RequestMapping(value = "/api")
public class AtualizarCartas {

	@Autowired
	CartasRepository cartasRepository;
	
	@PutMapping("/Cartas")
	public Cartas atualizaCartas(@RequestBody Cartas cartas) {
		return cartasRepository.save(cartas);
	}
}
