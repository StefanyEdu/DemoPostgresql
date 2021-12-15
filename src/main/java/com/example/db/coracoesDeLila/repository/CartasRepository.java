package com.example.db.coracoesDeLila.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.db.coracoesDeLila.models.Cartas;

public interface CartasRepository  extends JpaRepository<Cartas , Long>{

	Cartas findById(long id);
}

