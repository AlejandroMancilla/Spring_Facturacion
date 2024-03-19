package com.campusland.crudcliente.services;

import java.util.List;

import com.campusland.crudcliente.repositories.entities.Producto;

public interface ProductoService {
    
    Producto save(Producto producto);

    Producto findById(Long id);

    List<Producto> findAll();

    Producto delete(Long id);
}
