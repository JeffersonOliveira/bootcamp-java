package com.xieba.bootcamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootcampApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootcampApplication.class, args);

		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Jefferson");
		pessoa.setTelefone("2197666 6545");
		pessoa.setDocumento("RG");

		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua Roberto Carlos");
		endereco.setComplemento("Casa");
		endereco.setNumero("100");
		endereco.setBairro("Centro");
		endereco.setCidade("Rio de Janeiro");
		endereco.setCep("26000000");

		pessoa.setEndereco(endereco);

		System.out.println(pessoa);
		System.out.println("pessoa.end: "+ pessoa.getEndereco());
	}
}
