package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Curso;
import com.example.demo.repository.CursoRepository;

@Service
public class CursoServiceImp implements CursoService {
	
	
	//inyectar
	
	@Autowired
	private CursoRepository repositorio;
	
///metodos
	@Override
	public void guardar(Curso curso) {
		// TODO Auto-generated method stub
		repositorio.save(curso);

	}

	@Override
	public void actualizar(Curso curso) {
		// TODO Auto-generated method stub
		repositorio.saveAndFlush(curso);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);

	}

	@Override
	public List<Curso> listar() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Curso obtener(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).orElse(null);
	}

}
