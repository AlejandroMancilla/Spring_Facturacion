package com.campusland.crudcliente.repositories;

import org.springframework.data.repository.CrudRepository;

import com.campusland.crudcliente.repositories.entities.Cliente;

public interface RepositoryCliente  extends CrudRepository<Cliente,Long>{

    Cliente findByEmail(String email);
    
}
