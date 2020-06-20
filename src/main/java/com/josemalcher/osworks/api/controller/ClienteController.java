package com.josemalcher.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.josemalcher.osworks.api.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("José Malcher jr.");
		cliente1.setEmail("jose@josemalcher.net");
		cliente1.setTelefone("9199998822");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Maria Joaquina Silva");
		cliente2.setEmail("maria@josemalcher.net");
		cliente2.setTelefone("2222222222");
		
		return Arrays.asList(cliente1, cliente2);
	}
	
	

}
