package com.campusland.crudcliente.repositories;

import org.springframework.data.repository.CrudRepository;

import com.campusland.crudcliente.repositories.entities.Factura;

public interface RepositoryFactura extends CrudRepository<Factura, Long> {
    
}
