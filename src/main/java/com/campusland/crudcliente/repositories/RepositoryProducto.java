package com.campusland.crudcliente.repositories;

import org.springframework.data.repository.CrudRepository;

import com.campusland.crudcliente.repositories.entities.Producto;

public interface RepositoryProducto extends CrudRepository<Producto, Long> {
    
}
