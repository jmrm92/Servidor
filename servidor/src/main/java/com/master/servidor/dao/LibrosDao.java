package com.master.servidor.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.master.servidor.model.Libro;

public interface LibrosDao extends JpaRepository<Libro, String>{
    
}
