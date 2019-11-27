package br.com.cesed.lsi.cliente.cliente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cesed.lsi.cliente.cliente.model.Cliente;
import br.com.cesed.lsi.cliente.cliente.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;

	public void createCliente(Cliente c) {
		clienteRepository.save(c);
	}
	
	public Cliente readCliente(String cpf) {
	    return	clienteRepository.findById(cpf).get();
	}
	
	public List<Cliente> readAllCliente(){
		return clienteRepository.findAll();
	}
	
	public void updateCliente(Cliente cliente) {
		clienteRepository.save(cliente);
	}
	
	public void deleteCliente(String cpf) {
		clienteRepository.deleteById(cpf);
	}
}
