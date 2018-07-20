package com.example.oauth.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.oauth.model.Cliente;
import com.example.oauth.repository.Clientes;

@RestController
@RequestMapping("/clientes")
public class ClienteResource {
	
	@Autowired
	private Clientes clientes;
	
	@GetMapping
	public List<Cliente> buscarTodos(){
		return clientes.findAll();
	}

}
