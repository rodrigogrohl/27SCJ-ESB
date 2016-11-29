package br.com.fiap;

import javax.xml.ws.Endpoint;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.fiap.service.impl.CompraServiceImpl;
import br.com.fiap.service.impl.HelloWorldServiceImpl;

@SpringBootApplication
public class EsbSoapApplication implements CommandLineRunner {

	@Value("${service.port}")
	private String servicePort;
	
	public static void main(String[] args) {
		SpringApplication.run(EsbSoapApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String addressBase = "http://localhost:" + servicePort;

		Object helloWorldService = new HelloWorldServiceImpl();
		String addressHelloWorld = addressBase + "/service/hello-world";
		Endpoint.publish(addressHelloWorld , helloWorldService);
		
		
		Object compraServiceImpl = new CompraServiceImpl();
		String addressCompra = addressBase + "/compra";
		Endpoint.publish(addressCompra, compraServiceImpl);
		
	}
	
	
}
