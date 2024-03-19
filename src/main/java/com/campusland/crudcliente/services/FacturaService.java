package com.campusland.crudcliente.services;

import java.util.List;

import com.campusland.crudcliente.repositories.entities.Factura;

public interface FacturaService {
    
    Factura save(Factura factura);

    Factura findById(Long id);

    List<Factura> findAll();

    Factura delete(Long id);
}
