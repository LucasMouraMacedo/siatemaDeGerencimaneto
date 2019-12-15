/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sisGerencia.DAO;

/**
 *
 * @author joice
 */
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


	
