/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sisGerencia.DAO;

<<<<<<< HEAD
<<<<<<< HEAD
import br.edu.ifnmg.ArqSoft.Connection.ConnectionFactory;
import br.edu.ifnmg.sisGerencia.DomainModel.Fornecedor;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

=======
>>>>>>> parent of f5eea02... Telas de Funcionario,Cliente,Fornecedor e Produto
=======
>>>>>>> parent of f5eea02... Telas de Funcionario,Cliente,Fornecedor e Produto
/**
 *
 * @author joice
 */
<<<<<<< HEAD
<<<<<<< HEAD
public class FornecedorDAO{
    
    public boolean Salvar(Fornecedor fornecedor){
        try {
            Connection conexao = ConnectionFactory.getConexao();
            PreparedStatement ps = conexao.prepareCall("INSERT INTO `fornecedor` (`nome`) VALUES (?)");
            ps.setString(1, fornecedor.getNome());
            ps.execute();
            ConnectionFactory.fecharConexao();
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    
    public boolean Apagar(Fornecedor obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public Fornecedor Abrir(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public List<Fornecedor> Buscar(Fornecedor obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
}
=======
=======
>>>>>>> parent of f5eea02... Telas de Funcionario,Cliente,Fornecedor e Produto
import br.edu.ifnmg.sisGerencia.DomainModel.Fornecedor;
import br.edu.ifnmg.sisGerencia.DomainModel.PessoaJuridica;
import br.edu.ifnmg.sisGerencia.DomainModel.Pessoa;

/*
public class FornecedorDAO {
    
    private static final long serialVersionUID = 1L;
	
    private EntityManager manager;

	
	public Fornecedor salvar(Fornecedor fornecedor) {
		return manager.merge(fornecedor);	
	}
	
	public void excluir(Fornecedor fornecedor) {
		try {
			fornecedor = porId(fornecedor.getId());
			manager.remove(fornecedor);
			manager.flush();

		} catch (Exception e) {
			throw new NegocioException("ITEM NÃO PODE SER EXCLUÍDO");
		}
	}

	public Fornecedor porId(Long id) {
		return manager.find(Fornecedor.class, id);	
	}


	public List<Fornecedor> listAll() {
		return manager.createNativeQuery("SELECT * FROM Fornecedor", Fornecedor.class).getResultList();
	}



	public Fornecedor verificaCNPJ(String cnpj) {

		Query query = manager.createNativeQuery(
				"SELECT id, cel, cnpj, cpf, tipoFornecedor , cep , nomeFantasia ,  contato, email, nome, observacao, tel, bairro, cidade, complemento, endereco, estado, numero " +
						" FROM fornecedor where cnpj = :bindCnpj",
				Fornecedor.class);
		query.setParameter("bindCnpj", cnpj);

		Fornecedor fornecedor = null;



		try {
			return (Fornecedor) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}



	}

	public Fornecedor verificaCPF(String cpf) {

		Query query = manager.createNativeQuery(
				"SELECT id, cel, cnpj, cpf, tipoFornecedor ,  cep , nomeFantasia ,  contato, email, nome, observacao, tel, bairro, cidade, complemento, endereco, estado, numero " +
						" FROM fornecedor where cpf = :bindCpf",
				Fornecedor.class);
		query.setParameter("bindCpf", cpf);

		Fornecedor fornecedor = null;



		try {
			return (Fornecedor) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}



	}

	public Fornecedor verificaNomeFornecedor(String nome) {
		
		Query query = manager.createNativeQuery(
				"SELECT id, cel, cnpj, cpf , tipoFornecedor, cep , nomeFantasia ,  contato, email, nome, observacao, tel, bairro, cidade, complemento, endereco, estado, numero " +
						" FROM Fornecedor where nome = :bindnome",
				Fornecedor.class);
		query.setParameter("bindnome", nome);

		Fornecedor user = null;
		
		try {
			return (Fornecedor) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}	
	}
}*/


	
<<<<<<< HEAD
>>>>>>> parent of f5eea02... Telas de Funcionario,Cliente,Fornecedor e Produto
=======
>>>>>>> parent of f5eea02... Telas de Funcionario,Cliente,Fornecedor e Produto
