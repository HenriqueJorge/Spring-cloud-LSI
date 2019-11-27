package br.com.cesed.lsi.cartao.cartao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cesed.lsi.cartao.cartao.model.Cartao;
import br.com.cesed.lsi.cartao.cartao.repository.CartaoRepository;

@Service
public class CartaoService {
	
	@Autowired
	private CartaoRepository cartaoRepository;
	
	public void createCartao(Cartao cartao) {
		cartaoRepository.save(cartao);
	}
	
	public Cartao readCartao(int id) {
		return cartaoRepository.findById(id).get();
	}
	
	public List<Cartao> readAllCartao(){
		return cartaoRepository.findAll();
	}
	
	public void updateCartao(Cartao cartao) {
		cartaoRepository.save(cartao);
	}
	
	public void deleteCartao(int id) {
		cartaoRepository.deleteById(id);
	}

}
