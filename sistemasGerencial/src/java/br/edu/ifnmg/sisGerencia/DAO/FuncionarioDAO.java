
package br.edu.ifnmg.sisGerencia.DAO;

import br.edu.ifnmg.sisGerencia.DomainModel.Funcionario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author joice
 */
public class FuncionarioDAO {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
   
    private static final long serialVersionUID = 1L;
	
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
	
}	

