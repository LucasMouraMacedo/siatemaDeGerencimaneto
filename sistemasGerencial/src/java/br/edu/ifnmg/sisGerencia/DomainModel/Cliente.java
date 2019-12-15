/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sisGerencia.DomainModel;

/**
 *
 * @author Lucas Moura
 */
public class Cliente extends PessoaFisica{
    
   

    public Cliente(Long id, String nome, String email) {
        super(id, nome, email);
    }
    
}
