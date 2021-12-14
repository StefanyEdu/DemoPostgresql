package com.example.db.coracoesDeLila.resouces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.db.coracoesDeLila.models.Cartas;
import com.example.db.coracoesDeLila.repository.CartasRepository;

@RestController
@RequestMapping(value = "/api")
public class DeleteCartas {

	@Autowired
	CartasRepository cartasRepository;

	@DeleteMapping("/Cartas")
	public void deleteCartas(@RequestBody Cartas cartas) {
		cartasRepository.delete(cartas);
	}

}
