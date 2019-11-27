package br.com.cesed.lsi.cartao.cartao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cesed.lsi.cartao.cartao.model.Cartao;

@Repository
public interface CartaoRepository extends JpaRepository<Cartao, Integer>{

}
