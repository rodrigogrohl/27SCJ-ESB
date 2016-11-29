package br.com.fiap.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface HelloWorldService {

	@WebMethod(operationName = "helloWorld", action = "https://fiap.com.br/hello-world/helloWorld")
	String helloWorld( @WebParam(header = false, name="name") final String name,
			@WebParam(header = true, name = "credential") final String credential);

}