<<<<<<< HEAD
<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sisGerencia.DAO;

import br.edu.ifnmg.ArqSoft.Connection.ConnectionFactory;
import br.edu.ifnmg.sisGerencia.DomainModel.Funcionario;
import br.edu.ifnmg.sisGerencia.DomainModel.RepositorioFuncionario;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
=======
=======
>>>>>>> parent of f5eea02... Telas de Funcionario,Cliente,Fornecedor e Produto

package br.edu.ifnmg.sisGerencia.DAO;

import br.edu.ifnmg.sisGerencia.DomainModel.Funcionario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
<<<<<<< HEAD
>>>>>>> parent of f5eea02... Telas de Funcionario,Cliente,Fornecedor e Produto
=======
>>>>>>> parent of f5eea02... Telas de Funcionario,Cliente,Fornecedor e Produto

/**
 *
 * @author joice
 */
<<<<<<< HEAD
<<<<<<< HEAD
public class FuncionarioDAO extends RepositorioFuncionario{


    public boolean Salvar(Funcionario funcionario){
        try {
            Connection conexao = ConnectionFactory.getConexao();
            PreparedStatement ps = conexao.prepareCall("INSERT INTO `funcionario` (`nome`) VALUES (?)");
            ps.setString(1, funcionario.getNome());
            ps.execute();
            ConnectionFactory.fecharConexao();
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean Apagar(Funcionario obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Funcionario Abrir(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    public List<Funcionario> Buscar(Funcionario obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
=======
=======
>>>>>>> parent of f5eea02... Telas de Funcionario,Cliente,Fornecedor e Produto
public class FuncionarioDAO {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
   
  /*  private static final long serialVersionUID = 1L;
	
    private EntityManager manager;

	
	public Funcionario salvar(Funcionario funcionario) {
		return manager.merge(funcionario);	
	}
	
	public void excluir(Funcionario funcionario) {
		try {
			Funcionario = porId(funcionario.getId());
			manager.remove(funcionario);
			manager.flush();

		} catch (Exception e) {
			throw new NegocioException("ITEM NÃO PODE SER EXCLUÍDO");
		}
	}

	public Funcionario porId(Long id) {
		return manager.find(funcionario.class, id);	
	}


	public List<funcionario> listAll() {
		return manager.createNativeQuery("SELECT * FROM funcionario", funcionario.class).getResultList();
	}


	public funcionario verificaCPF(String cpf) {

		Query query = manager.createNativeQuery(
				"SELECT id, cel, cnpj, cpf, tipofuncionario ,  cep , nomeFantasia ,  contato, email, nome, observacao, tel, bairro, cidade, complemento, endereco, estado, numero " +
						" FROM funcionario where cpf = :bindCpf",
				funcionario.class);
		query.setParameter("bindCpf", cpf);

		funcionario funcionario = null;



		try {
			return (funcionario) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}



	}

	public funcionario verificaNomeFuncionario(String nome) {
		
		Query query = manager.createNativeQuery(
				"SELECT id, cel, cnpj, cpf , tipofuncionario, cep , nomeFantasia ,  contato, email, nome, observacao, tel, bairro, cidade, complemento, endereco, estado, numero " +
						" FROM funcionario where nome = :bindnome",
				funcionario.class);
		query.setParameter("bindnome", nome);

		funcionario user = null;
		
		try {
			return (funcionario) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}	
	}
}
*/	
}

<<<<<<< HEAD
>>>>>>> parent of f5eea02... Telas de Funcionario,Cliente,Fornecedor e Produto
=======
>>>>>>> parent of f5eea02... Telas de Funcionario,Cliente,Fornecedor e Produto
