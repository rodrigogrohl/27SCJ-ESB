package br.com.fiap.service.impl;

import javax.jws.WebService;

import br.com.fiap.service.HelloWorldService;

@WebService(endpointInterface = "br.com.fiap.service.HelloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService {

	@Override
	public String helloWorld(String name, String credential) {
		return "Hello World from " + name + " [Credential: " + credential +"]";
	}

}
