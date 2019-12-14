/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.ArqSoft.DomainModel;

import java.util.regex.Pattern;
import java.util.regex.*;

import java.util.InputMismatchException;

/**
 *
 * @author joice
 */
public class PessoaJuridica extends Pessoa {
    
    private String cnpj;
            
    private final Pattern regex_cnpj = 
            Pattern.compile("\\d{2}\\.?\\d{3}\\.?\\d{3}\\\\?\\d{4}\\-?\\d{2}");

    public PessoaJuridica(Long id, String nome, String email) {
        super(id, nome, email);
    }
    
    public String getCnpj() {
        return  cnpj.substring(0, 2)+"."+
                cnpj.substring(2, 5)+"."+
                cnpj.substring(8, 12)+"-"+
                cnpj.substring(12, 14);
    }

    //O setter valida o cpf e retorna caso o mesmo nao possa ser usado
    public void setCnpj(String cpf) throws ErroValidacaoException {
        Matcher m = regex_cnpj.matcher(cpf);
        if(m.matches())
            this.cnpj = cpf.replace(".", "").replace("\\", "").replace("-", "");
        else
            throw new ErroValidacaoException("CNPJ Inválido!");
    
    }

    public PessoaJuridica(String cnpj, Long id, String nome, String email) {
        super(id, nome, email);
        this.cnpj = cnpj;
    }
    
    
}
