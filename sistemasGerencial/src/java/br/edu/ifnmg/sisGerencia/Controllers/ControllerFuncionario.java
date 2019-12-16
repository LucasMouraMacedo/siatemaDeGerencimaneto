/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sisGerencia.Controllers;

import br.edu.ifnmg.sisGerencia.DAO.FuncionarioDAO;
import br.edu.ifnmg.sisGerencia.DomainModel.Funcionario;

/**
 *
 * @author joice
 */
public class ControllerFuncionario {
    
    private Funcionario funcionario;

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    /*public String novo(){ 
        this.Funcionario = new Funcionario();
        return "novo";
    }*/
    public void salvar(){
                FuncionarioDAO dao = new FuncionarioDAO();
                dao.Salvar(funcionario);
        }
    
    
}