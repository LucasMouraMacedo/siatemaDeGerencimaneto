/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sisGerencia.DomainModel;

/**
 *
 * @author joice
 */

import java.util.Objects;

public class Funcionario extends PessoaFisica {
    
    private String login;
    
    private String password;
    
    private String funcao;

    
    //Contruct para uso de herança
    public Funcionario(Long id, String nome, String email) {
        super(id, nome, email);
    }
    
    public Funcionario(String login, String funcao, Long id, String nome, String email) {
        super(id, nome, email);
        this.login = login;
        this.funcao = funcao;
    }

    
    //Getters e Setters
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return password;
    }

    public void setSenha(String password) {
        this.password = password;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    
    
    //HashCode para proteção da conta de acesso do funconario
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.password);
       
        return hash;
    } 

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Funcionario other = (Funcionario) obj;
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        return true;
    } 

    
      
}
