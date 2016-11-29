package br.com.fiap.service.impl;

import javax.jws.WebService;

import br.com.fiap.service.CompraService;

@WebService(endpointInterface = "br.com.fiap.service.CompraService")
public class CompraServiceImpl implements CompraService {

	@Override
	public String confirmar(int idCompra, String username, long total) {
		String log = String.format("ID Compra #%d para o usuario %s totalizando %d", idCompra, username, total);
		System.out.println(log);
		return log;
	}

	@Override
	public String isCreditoAprovado(String cpf, double valor, double renda) {
		if(valor < renda)
			return "Credito Aprovado.";
		
		return "Credito Rejeitado.";
	}


}
