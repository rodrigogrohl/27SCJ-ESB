/**
 * 
 */
package br.com.fiap.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @author rm48236
 *
 */
@WebService
public interface CompraService {
	
	@WebMethod(operationName="confirmarCompra", 
			action = "https://fiap.com.br/compra/confirmar")
	String confirmar(@WebParam(name="idCompra") int idCompra,
			@WebParam(name="username") String username,
			@WebParam(name="total") long total );
	
	@WebMethod(operationName="aprovarCredito",
			action = "https://fiap.com.br/compra/aprovarCredito")
	String isCreditoAprovado(@WebParam(name = "cpf") String cpf,
			@WebParam(name = "valor") double valor,
			@WebParam(name = "rendaLiquida") double renda);
	

}
