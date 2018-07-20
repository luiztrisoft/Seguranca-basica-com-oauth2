package com.example.oauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.oauth.model.Cliente;

public interface Clientes extends JpaRepository<Cliente, Long>{

}
