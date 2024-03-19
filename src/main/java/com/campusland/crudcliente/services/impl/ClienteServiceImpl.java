package com.campusland.crudcliente.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.campusland.crudcliente.repositories.RepositoryCliente;
import com.campusland.crudcliente.repositories.entities.Cliente;
import com.campusland.crudcliente.services.ClienteService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ClienteServiceImpl implements ClienteService {

    private RepositoryCliente repositoryCliente;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
        return (List<Cliente>) repositoryCliente.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente findById(Long id) {
        return repositoryCliente.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Cliente save(Cliente cliente) {
        return repositoryCliente.save(cliente);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        Optional<Cliente> clienteOptinal=repositoryCliente.findById(id);
        if(clienteOptinal.isPresent()){
            repositoryCliente.delete(clienteOptinal.get());
        }       
    }

    @Override
    public Cliente update(Long id, Cliente cliente) {
       Optional<Cliente> clienteCurrentOptional=repositoryCliente.findById(id);

       if(clienteCurrentOptional.isPresent()){
          Cliente clienteCurrent=clienteCurrentOptional.get();
          clienteCurrent.setNombre(cliente.getNombre());
          clienteCurrent.setApellido(cliente.getApellido());
          clienteCurrent.setEmail(cliente.getEmail()); 
          repositoryCliente.save(clienteCurrent);
          return clienteCurrent;         
       }

       return null;
       
       
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente findByEmail(String email) {
        return repositoryCliente.findByEmail(email);
    }

}
