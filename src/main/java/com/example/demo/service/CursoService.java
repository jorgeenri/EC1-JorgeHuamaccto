package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Curso;


public interface CursoService{
	
	void guardar(Curso curso);
	void actualizar(Curso curso);
	void eliminar(Integer id);
	List<Curso> listar();
	Curso obtener(Integer id);
	

}
