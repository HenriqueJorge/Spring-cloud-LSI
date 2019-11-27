package br.com.cesed.lsi.cliente.cliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.cesed.lsi.cliente.cliente.model.Cliente;
import br.com.cesed.lsi.cliente.cliente.service.ClienteService;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@PostMapping
	public ResponseEntity<Cliente> createCliente(@RequestBody Cliente cliente){
		Cliente c = new Cliente();
		c.setCpf(cliente.getCpf());
		c.setNome(cliente.getNome());
		c.setEmail(cliente.getEmail());
		c.setTelefone(cliente.getTelefone());
		clienteService.createCliente(c);
		return new ResponseEntity<Cliente>(HttpStatus.CREATED);
	}
	
		@GetMapping("/{cpf}")
	public ResponseEntity<Cliente> readCliente(@PathVariable(name = "cpf") String cpf){
		return new ResponseEntity<Cliente>(clienteService.readCliente(cpf),HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Cliente>> readAllCliente(){
		return new ResponseEntity<List<Cliente>>(clienteService.readAllCliente(),HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Cliente> updateCliente(@RequestBody Cliente cliente){
		clienteService.updateCliente(cliente);
		return new ResponseEntity<Cliente>(HttpStatus.OK);
	}
	
	@DeleteMapping("/{cpf}")
	public ResponseEntity<Cliente> deleteCliente(@PathVariable(name = "cpf") String cpf){
		clienteService.deleteCliente(cpf);
		return new ResponseEntity<Cliente>(HttpStatus.OK);
	}

}
