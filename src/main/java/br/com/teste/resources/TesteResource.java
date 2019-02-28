package br.com.teste.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.teste.services.TesteService;

@RestController
@RequestMapping(value = "/teste")
public class TesteResource {

	@Autowired
	private TesteService testeService;
	
	@RequestMapping( method = RequestMethod.GET)
	public ResponseEntity<String> teste()  {
		return ResponseEntity.ok().body("OK");
	}
}
