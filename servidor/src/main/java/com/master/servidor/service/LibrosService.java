package com.master.servidor.service;

import java.util.List;

import com.master.servidor.model.Libro;

public interface LibrosService {    
    List<Libro> libros();
    Libro buscarLibro (String isbn);
    void altaLibro (Libro libro);
    void actualizarLibro (Libro libro);
    List<Libro> eliminarLibro (String isbn);
}
