package br.com.cesed.lsi.cliente.cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cesed.lsi.cliente.cliente.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,String> {

}
