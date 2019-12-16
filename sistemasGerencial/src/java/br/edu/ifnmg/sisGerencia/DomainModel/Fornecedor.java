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
public class Fornecedor extends PessoaJuridica {
    
    
    
    private String tipoFornecedor;

    public Fornecedor(Long id, String nome, String email) {
        super(id, nome, email);
    }

    public String getTipoFornecedor() {
        return tipoFornecedor;
    }

    public void setTipoFornecedor(String tipoFornecedor) {
        this.tipoFornecedor = tipoFornecedor;
    }
            
            
    
}
