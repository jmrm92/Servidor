package com.master.servidor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.master.servidor.dao.LibrosDao;
import com.master.servidor.model.Libro;

@Service
public class LibrosServiceImpl implements LibrosService {

    @Autowired
    LibrosDao dao;

    @Override
    public List<Libro> libros() {
        return dao.findAll();
    }

    @Override
    public Libro buscarLibro(String isbn) {
        return dao.findById(isbn).orElse(null);
    }

    @Override
    public void altaLibro(Libro libro) {
        dao.save(libro);
    }

    @Override
    public void actualizarLibro(Libro libro) {
        dao.save(libro);
    }

    @Override
    public List<Libro> eliminarLibro(String isbn) {
        dao.deleteById(isbn);
        return dao.findAll();
    }
    
}
