/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sisGerencia.DomainModel;

/**
 *
 * @author Lucas Moura
 */
public class Produto {
     
    private static final long serialVersionUID = 1L;
    
   
    private Long id;
    
    private String descricao;
    
    private String nome;
    
    private Double valorCompra;
    
    private Double valorVenda;
    
    private float qtd;

    
    
    public Produto(Long id, String descricao, String nome, Double valorCompra, Double valorVenda, float qtd) {
        this.id = id;
        this.descricao = descricao;
        this.nome = nome;
        this.valorCompra = valorCompra;
        this.valorVenda = valorVenda;
        this.qtd = qtd;
    }

    public Long getId() {
        return id;
    }

    public boolean equals(Object obj) {
		if(obj instanceof Produto){
			Produto outroProduto = (Produto) obj;
			return this.nome.equals(outroProduto.getNome());
		} else {
			return false;
		}
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(Double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public float getQtd() {
        return qtd;
    }

    public void setQtd(float qtd) {
        this.qtd = qtd;
   
    }
    
    
    
    
}
