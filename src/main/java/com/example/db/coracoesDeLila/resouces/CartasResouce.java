package com.example.db.coracoesDeLila.resouces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.db.coracoesDeLila.models.Cartas;
import com.example.db.coracoesDeLila.repository.CartasRepository;

@RestController
@RequestMapping(value = "/api")
public class CartasResouce {

	@Autowired
	CartasRepository cartasRepository;

	@RequestMapping(value = "/cadastroCartas", method = RequestMethod.POST)
	public String cadCar(@RequestBody Cartas cartas) {
		cartasRepository.save(cartas);
		return "redirect:/cadastrarEvento";
	}

}
