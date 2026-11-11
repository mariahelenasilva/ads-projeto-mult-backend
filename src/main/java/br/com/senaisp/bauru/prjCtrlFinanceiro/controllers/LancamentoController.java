package br.com.senaisp.bauru.prjCtrlFinanceiro.controllers;

//import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import br.com.senaisp.bauru.prjCtrlFinanceiro.services.LancamentoService;

@RestController
@RequestMapping("/lancamentos")
@CrossOrigin(origins = "*")
public class LancamentoController {

	//private final LancamentoService service;
	
//	public LancamentoController(LancamentoService service) {
//		this.service = service;
//	}
	
//	@GetMapping
//	public List<Lancamento> listar() {
//		return service.listar();
//	}
//	
//	@GetMapping("/{id}")
//	public ResponseEntity<Categoria> buscarPorId(@PathVariable Long id) {
//		
//	}
}
