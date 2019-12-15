
package br.edu.ifnmg.sisGerencia.DomainModel;

/**
 *
 * @author joice
 */
   
//Classe criada para a separação dos tipos de fornecedor, onde fornecedor por de ser
public class TipoFornecedor extends Fornecedor {

     

        private String tipoFornecedor;

        TipoFornecedor(String tipoFornecedor) {
            this.tipoFornecedor = tipoFornecedor;
        }

        public String getTipoFornecedor() {
            return tipoFornecedor;
        }


}

   
