package com.xieba.bootcamp;
public class Pessoa {
    private String nome;
    private String telefone;
    private String documento;
    private Endereco endereco;
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getTelefone(){
        return this.telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getDocumento(){
        return documento;
    }
    public void setDocumento(String documento){
        this.documento = documento;
    }
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", documento='" + documento + '\'' +
                ", endereco=" + endereco +
                '}';
    }
    public Endereco getEndereco(){
        return endereco;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
}
