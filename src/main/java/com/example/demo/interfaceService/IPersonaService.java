package com.example.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Persona;

public interface IPersonaService {
	
	public List<Persona>listarPersona();
	public Optional<Persona>listarId(int id);
	public int save(Persona p);
	public void delete(int id);
	
}
