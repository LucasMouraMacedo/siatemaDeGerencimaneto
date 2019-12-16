/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sisGerencia.Controllers;

import br.edu.ifnmg.sisGerencia.DAO.FornecedorDAO;
import br.edu.ifnmg.sisGerencia.DomainModel.Fornecedor;

/**
 *
 * @author joice
 */
public class ControllerFornecedor {
    
    private Fornecedor fornecedor;

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    /*public String novo(){ 
        this.Fornecedor = new Fornecedor();
        return "novo";
    }*/
    public void salvar(){
                FornecedorDAO dao = new FornecedorDAO();
                dao.Salvar(fornecedor);
        }
    
    
}