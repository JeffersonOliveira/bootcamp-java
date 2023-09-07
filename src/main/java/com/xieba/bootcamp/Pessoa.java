package com.xieba.bootcamp;

import lombok.Data;

@Data
public class Pessoa {

    private String nome;
    private String telefone;
    private String documento;
    private Endereco endereco;
}
