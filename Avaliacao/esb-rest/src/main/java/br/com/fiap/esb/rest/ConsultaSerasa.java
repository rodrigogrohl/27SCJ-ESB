package br.com.fiap.esb.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsultaSerasa {

	@RequestMapping(path = "/nomelimpo", method = RequestMethod.GET)
	public boolean executar(@RequestParam(value = "cpf") String cpf) {

		if (cpf.contains("9"))
			return false;
		return true;
	}

}
