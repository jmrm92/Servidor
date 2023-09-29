package com.master.servidor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.master.servidor.model.Libro;
import com.master.servidor.service.LibrosService;

@RestController
public class LibrosController {

    @Autowired
    LibrosService service;

    @GetMapping (value = "libro/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Libro buscarLibro(@PathVariable String isbn) {
        return service.buscarLibro(isbn);
    }

    @GetMapping (value = "libros", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Libro> libros() {
        return service.libros();
    }

    @PostMapping (value = "libro", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void agregarLibro(@RequestBody Libro libro) {
        service.altaLibro(libro);
    }

    @DeleteMapping (value = "libro/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void eliminarLibro(@PathVariable String isbn) {
        service.eliminarLibro(isbn);
    }

    @PutMapping (value = "libro", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void actualizarLibro(@RequestBody Libro libro) {
        service.actualizarLibro(libro);
    }
}
