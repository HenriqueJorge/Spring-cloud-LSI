package br.com.cesed.lsi.cartao.cartao.controller;

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

import br.com.cesed.lsi.cartao.cartao.model.Cartao;
import br.com.cesed.lsi.cartao.cartao.service.CartaoService;

@Controller
@RequestMapping("/cartao")
public class CartaoController {
	
	@Autowired
	private CartaoService cartaoService;
	
	@PostMapping
	public ResponseEntity<Cartao> createCartao(@RequestBody Cartao cartao){
		cartaoService.createCartao(cartao);
		return new ResponseEntity<Cartao>(HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Cartao> readCartao(@PathVariable(name = "id") int id){
		return new ResponseEntity<Cartao>(cartaoService.readCartao(id),HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Cartao>> readAllCartao(){
		return new ResponseEntity<List<Cartao>>(cartaoService.readAllCartao(),HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Cartao> updateCartao(Cartao cartao){
		cartaoService.updateCartao(cartao);
		return new ResponseEntity<Cartao>(HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Cartao> deleteCartao(@PathVariable(name = "id") int id){
		cartaoService.deleteCartao(id);
		return new ResponseEntity<Cartao>(HttpStatus.OK);
	}

}
