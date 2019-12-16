/*
    Classe Geral Pessoa
 */
package br.edu.ifnmg.sisGerencia.DomainModel;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


import java.util.regex.*;
<<<<<<< HEAD
=======
import javax.persistence.Transient;
>>>>>>> parent of f5eea02... Telas de Funcionario,Cliente,Fornecedor e Produto

/**
 *
 * @author joice
 */

public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    
   
    private Long id;
    
    private String nome;
    
    private String endereco;
    
    private String email;
    
  
    //Atributos criados para a classe geral pessoa
    //Atributos em comum com todas as entidades
    
    
    public Pessoa(Long id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {  
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   
    
    public String toString() {
        return "br.edu.ifnmg.ArqSoft.DomainModel.Pessoa[ id=" + id + " ]";
    }
    
}
