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
import java.util.regex.*;

public class PessoaFisica extends Pessoa {
   
   private String cpf;
    
   
   //Função necessária para estruturar o numero do cpf
   private final Pattern regex_cpf = 
            Pattern.compile("\\d{3}\\.?\\d{3}\\.?\\d{3}\\-?\\d{2}");

    public PessoaFisica(Long id, String nome, String email) {
        super(id, nome, email);
    }

  //Getter de cpf onde as linhas e numeros são retornados no modelo
    public String getCpf() {
        return  cpf.substring(0, 3)+"."+
                cpf.substring(3, 6)+"."+
                cpf.substring(6, 9)+"-"+
                cpf.substring(9, 11);
    }

    //O setter valida o cpf e retorna caso o mesmo nao possa ser usado
    public void setCpf(String cpf) throws ErroValidacaoException {
        Matcher m = regex_cpf.matcher(cpf);
        if(m.matches())
            this.cpf = cpf.replace(".", "").replace("-", "");
        else
            throw new ErroValidacaoException("CPF Inválido!");
    }
    
    
    
}
