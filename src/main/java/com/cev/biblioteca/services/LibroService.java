package com.cev.biblioteca.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cev.biblioteca.entities.Libro;
import com.cev.biblioteca.repositories.LibroRepository;

@Service
public class LibroService {
	@Autowired
	private LibroRepository libroRepository;

	public List<Libro> getLibros(){
		return libroRepository.findAll();
	}
	
	public void postLibro(Libro libro) {
		libroRepository.save(libro);
	}
	
	//Devuelve el libro cuyo ISBN recibe como parámetro:
	/*
	public Optional<Libro> getLibro(String isbn) {
		//<<IMPLEMENTAR>>
	}
	*/
	
	//Devuelve los libros de un autor cuyo NIF recibe como parámetro:
	/*
	public List<Libro> getLibrosAutor(String nif){
		//<<IMPLEMENTAR>>
	}
	*/
	
	//Devuelve los libros que tengan más de n páginas que recibe como parámetro:
	/*
	public List<Libro> getLibrosPaginas (int n){
		//<<IMPLEMENTAR>>
	}
	*/
}
