package br.com.exemploHibernate.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TESTE database table.
 * 
 */
@Entity
public class Teste implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long id;

	private String descricao;

	public Teste() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}