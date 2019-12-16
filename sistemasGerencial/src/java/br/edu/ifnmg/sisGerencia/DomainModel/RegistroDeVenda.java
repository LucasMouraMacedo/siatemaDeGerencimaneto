/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sisGerencia.DomainModel;

import java.io.Serializable;

import javax.persistence.TemporalType;

public class RegistroDeVenda {
    
/**
 *
 * @author joice
 */

public class Venda implements Serializable {

  
    private static final long serialVersionUID = 1L;
   
    private Long id;
       
    private Pessoa cliente;
    
    private Pessoa funcionario;
    
    private Double totalVenda;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
   
    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public Pessoa getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Pessoa funcionario) {
        this.funcionario = funcionario;
    }

    public Double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(Double totalVenda) {
         this.totalVenda = totalVenda;
    }
  
    
}
}