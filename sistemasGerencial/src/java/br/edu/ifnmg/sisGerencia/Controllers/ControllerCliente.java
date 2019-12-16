/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sisGerencia.Controllers;

import br.edu.ifnmg.sisGerencia.DAO.ClienteDAO;
import br.edu.ifnmg.sisGerencia.DomainModel.Cliente;

/**
 *
 * @author lucas
 */
public class ControllerCliente {
    
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    /*public String novo(){ 
        this.cliente = new Cliente();
        return "novo";
    }*/
    public String salvar() throws Exception{
                ClienteDAO dao = new ClienteDAO();
                dao.Salvar(cliente);
            return "salvar";
        }   
    
}
