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
		/*
		pessoa.endereco = "Rua Jardim Das Oliveiras, 417, Casa, Centro";
		System.out.println(pessoa);
		System.out.println(pessoa.nome);
		System.out.println(pessoa.telefone);
		System.out.println(pessoa.documento);
		System.out.println(pessoa.endereco);
		*/

		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua Roberto Carlos");
		endereco.setComplemento("Casa");
		endereco.setNumero("100");
		endereco.setBairro("Centro");
		endereco.setCidade("Rio de Janeiro");
		endereco.setCep("26000000");

		pessoa.setEndereco(endereco);

		System.out.println(pessoa.toString());
		/*
		System.out.println("pessoa.nome: "+ pessoa.getNome());
		System.out.println("pessoa.telefone: "+ pessoa.getTelefone());
		System.out.println("pessoa.doc: "+ pessoa.getDocumento());
		*/
		System.out.println("pessoa.end: "+ pessoa.getEndereco());
		/*
		System.out.println("pessoa.logra: "+ endereco.getLogradouro());
		System.out.println("pessoa.logra: "+ pessoa.endereco.getLogradouro());
		System.out.println("pessoa.comp: "+ endereco.getComplemento());
		System.out.println("pessoa.num: "+ endereco.getNumero());
		System.out.println("pessoa.bai: "+ endereco.getBairro());
		System.out.println("pessoa.cid: "+ endereco.getCidade());
		System.out.println("pessoa.cep: "+ endereco.getCep());
		*/
	}
}
