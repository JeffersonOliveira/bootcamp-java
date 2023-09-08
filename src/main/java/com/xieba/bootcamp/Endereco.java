package com.xieba.bootcamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Endereco {
    private String logradouro;
    private String complemento;
    private String numero;
    private String bairro;
    private String cidade;
    private String cep;
}
