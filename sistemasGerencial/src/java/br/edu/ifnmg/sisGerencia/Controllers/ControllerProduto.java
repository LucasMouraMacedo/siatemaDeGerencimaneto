/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sisGerencia.Controllers;

import br.edu.ifnmg.sisGerencia.DAO.ProdutoDAO;
import br.edu.ifnmg.sisGerencia.DomainModel.Produto;

/**
 *
 * @author joice
 */
public class ControllerProduto {
    
    private Produto produto;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    /*public String novo(){ 
        this.Produto = new Produto();
        return "novo";
    }*/
    public void salvar(){
                ProdutoDAO dao = new ProdutoDAO();
                dao.Salvar(produto);
        }
    
    
}